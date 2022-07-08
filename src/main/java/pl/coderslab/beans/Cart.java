package pl.coderslab.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
    private List<CartItem> cartItems;

    public List<CartItem> getCartItemList() {
        return cartItems;
    }

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public int getQuantity() {
        return cartItems.stream().mapToInt(CartItem::getQuantity).sum();
    }

    public double getCartValue() {
        return cartItems.stream().mapToDouble(n -> n.getProduct().getPrice() * n.getQuantity()).sum();
    }

    public void addToCart(CartItem cartItem) {
        Optional<CartItem> itemFromCart =
                cartItems.stream().filter(n -> n.getProduct().getId() == cartItem.getProduct().getId()).findFirst();

        if (itemFromCart.isPresent()) {
            cartItems.add(new CartItem(cartItem.getQuantity() + itemFromCart.get().getQuantity(), cartItem.getProduct()));
            cartItems.remove(itemFromCart.get());
        } else {
            cartItems.add(cartItem);
        }
    }

}
