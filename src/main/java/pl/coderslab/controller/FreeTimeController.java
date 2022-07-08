package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class FreeTimeController {

    @RequestMapping(value = "/time", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String isTimeFree() {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();

        DayOfWeek day = ld.getDayOfWeek();

        if (day.equals(DayOfWeek.SATURDAY) || day.equals(DayOfWeek.SUNDAY)) {
            return "<h1>Wolne</h1>";
        } else if (lt.isBefore(LocalTime.of(9, 00)) || lt.isAfter(LocalTime.of(17, 00))) {
            return "<h1>Po pracy</h1>";
        } else {
            return "<h1>Pracuje, nie dzwon</h1>";
        }

    }
}
