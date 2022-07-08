package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.beans.Cart;
import pl.coderslab.beans.CartItem;
import pl.coderslab.beans.Product;
import pl.coderslab.beans.ProductDao;

import java.util.Random;

@Controller
public class CartController {
    private Cart cart;
    private ProductDao productDao;

    public CartController(Cart cart, ProductDao productDao) {
        this.cart = cart;
        this.productDao = productDao;
    }

    @RequestMapping("/addtocart/{productId}/{quantity}")
    @ResponseBody
    public String addtocart(@PathVariable long productId, @PathVariable int quantity) {
        productDao.getProduct(productId)
                .ifPresent(n -> cart.addToCart(new CartItem(quantity, n)));
        return "addtocart";
    }

    @RequestMapping(path = "/cart", produces = "text/html; charset=utf-8")
    @ResponseBody
    public String cart() {
        return cart.getCartItemList().toString() + "<br>" +
                "W koszyku jest " + cart.getCartItemList().size() + " pozycji.<br>" +
                "W koszyku jest " + cart.getQuantity() + " produktów.<br>" +
                "Wartość koszyka to: " + cart.getCartValue();
    }

}
