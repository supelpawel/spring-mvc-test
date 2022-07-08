package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping(value = "/hello/{firstName}/{lastName}",
            method = RequestMethod.GET, produces = "text/html;charset=utf-8")
    @ResponseBody
    public String hello(@PathVariable String firstName, @PathVariable String lastName) {
        return "Hello + " + firstName + " " + lastName;
    }

    @RequestMapping("/helloView")
    public String helloView(Model model) {
        String color = "black";
        String backgroundColor = "white";

        LocalTime now = LocalTime.now();

        if (now.getHour() < 8 || now.getHour() > 19) {
            color = "white";
            backgroundColor = "black";
        }

        model.addAttribute(color, color);
        model.addAttribute(backgroundColor, backgroundColor);

        return "home";
    }


}
