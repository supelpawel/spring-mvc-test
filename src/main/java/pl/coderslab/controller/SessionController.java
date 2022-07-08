package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
@SessionAttributes("loginStart")
public class SessionController {

    @RequestMapping("/loginStart")
    @ResponseBody
    public String loginStart(Model model, HttpSession sess) {
        String now = (String) sess.getAttribute("loginStart");

        if (now == null) {
            now = LocalDateTime.now().toString();
            model.addAttribute("loginStart", now);
        }
        return now;

    }

}
