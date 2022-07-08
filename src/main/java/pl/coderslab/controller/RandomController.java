package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @RequestMapping(value = "/show-random", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String showRandom() {
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        return String.format("<h1>Wylosowano liczbę: %d</>", randomInt);
    }

    @RequestMapping(value = "/random/{max:\\d+}", method = RequestMethod.GET, produces = "text/html;charset=utf-8")
    @ResponseBody
    public String randomMax(@PathVariable int max) {
        if (max < 1) return "Nieprawidłowe dane zostały przesłane w adresie strony";

        Random random = new Random();
        int randomNumberSelected = random.nextInt(max);
        return String.format("<h1 style=\"margin: 10px\">" +
                "Podales maksymalny zakres <b style=\"color:red\">%s</b>. " +
                "Maszyna losująca wylosowała Twój szczęśliwy numerek. " +
                "A jest to: <b style=\"color: blue\">%s</b></h1>", max, randomNumberSelected);
    }

    @RequestMapping(value = "/random/{min:\\d+}/{max:\\d+}", method = RequestMethod.GET, produces = "text/html;charset=utf-8")
    @ResponseBody
    public String randomMinMax(@PathVariable int min, @PathVariable int max) {

        Random r = new Random();
        int randomNumber = r.nextInt(max) + min;
        return String.format("<h1>Z przedzialu od %d do %d, wylosowano: % d", min, max, randomNumber);
    }

}


//    @RequestMapping(value = "/random1",method = RequestMethod.GET,produces = "text/html;charset=utf-8")
//    @ResponseBody
//    public String randomMax1(@RequestParam(defaultValue = "10") int max){
//        if(max<1) return "Nieprawidłowe dane zostały przesłane w adresie strony";
//        Random random = new Random();
//        int randomNumberSelected = random.nextInt(max); // to jest zakres randoma [0,max) dodajemy jeden w celu przesuniecia
//        return String.format("<h1 style=\"margin: 10px\">" +
//                "Podales maksymalny zakres <b style=\"color:red\">%s</b>. " +
//                "Maszyna losująca wylosowała Twój szczęśliwy numerek. " +
//                "A jest to: <b style=\"color: blue\">%s</b></h1>",max, randomNumberSelected);
//    }

