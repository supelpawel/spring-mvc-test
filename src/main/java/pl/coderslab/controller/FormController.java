package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/first")
public class FormController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String formAction() {
        return "form.jsp";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
    @ResponseBody
    public String formRequest(@RequestParam String paramName, @RequestParam String paramDate) {
        LocalDate date = LocalDate.parse(paramDate, DateTimeFormatter.ofPattern("yyy-MM-dd"));
        return String.format("Przeslane dane: %s i %s", paramName, date);
    }

}


