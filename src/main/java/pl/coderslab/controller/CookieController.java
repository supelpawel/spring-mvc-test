package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
public class CookieController {

    @RequestMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    public String setCookies(HttpServletResponse httpServletResponse, @PathVariable String value1, @PathVariable String value2) {
        Cookie c1 = new Cookie("cookie1", value1);
        Cookie c2 = new Cookie("cookie2", value2);
        c1.setPath("/");
        c2.setPath("/");

        httpServletResponse.addCookie(c1);
        httpServletResponse.addCookie(c2);

        return "Cookies added";
    }

    @RequestMapping("getcookies")
    @ResponseBody
    public String getCookies(@CookieValue(required = false, name = "cookie1") String cookie1Value,
                             HttpServletRequest httpServletRequest) {
        Cookie c2 = WebUtils.getCookie(httpServletRequest, "c2");

        return "cookie1: " + cookie1Value + ", cookie2: "
                + Optional.ofNullable(c2).map(Cookie::getValue).orElse(null);
    }

}
