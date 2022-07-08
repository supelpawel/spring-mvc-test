package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

        @GetMapping("/hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "text/html;charset=utf-8")
    @ResponseBody
    public String hello() {
        return "<h1>Hello from Response Body</h1>";
    }
//
//    @RequestMapping(value = "/json/hello", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
//    @ResponseBody
//    public String helloJson() {
//        return "{\"option\":\"Hello from JSON\"}";
//    }
//
//    @RequestMapping(value = "/html/hello", method = RequestMethod.GET)
//    public String helloHtml() {
////        return "hello.jsp";
//        return "/hello.jsp";
//    }
//
//    @RequestMapping(value = "/hello/{firstName}/{lastName}", method = RequestMethod.GET, produces = "text/html;charset=utf-8")
//    @ResponseBody
//    public String helloFromParams(@PathVariable String firstName, @PathVariable String lastName) {
//        return String.format("Hello %s %s", firstName, lastName);
//    }
//
//    @PostMapping(value = "/form", produces = "text/html;charset=utf-8")
//    @ResponseBody
//    public LocalDate showDate(@RequestParam String paramDate) {
//        LocalDate ld = LocalDate.parse(paramDate);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyy");
//
//        return ld;
//    }
//
//    @RequestMapping(value = "/homeView", method = RequestMethod.GET)
//    public String homeView(Model model){
//        String color = "black";
//        String bgColor = "white";
////        LocalTime now = LocalTime.now();
//        LocalTime now = LocalTime.of(23,44);
//        if(now.isAfter(LocalTime.of(20,0)) || now.isBefore(LocalTime.of(8,0))){
//            color = "white";
//            bgColor = "black";
//        }
//
//        model.addAttribute("color",color);
//        model.addAttribute("bgColor",bgColor);
//        model.addAttribute("localTimeValue",now);
//        return "home";
//    }
}


