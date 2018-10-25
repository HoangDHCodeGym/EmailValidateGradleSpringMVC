package com.codegym.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.regex.Pattern;

@Controller
@RequestMapping("/")
public class InnerController {
    private static final String EMAIL_REGEX = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
    private Pattern pattern = Pattern.compile(EMAIL_REGEX);

    @GetMapping
    public String emailInputForm() {
        return "index";
    }

    @PostMapping(params = "email")
    public ModelAndView emailConfirm(String email) {
        String message = validate(email) ? "success" : "failed";
        ModelAndView model = new ModelAndView("emailConfirmation","message", message);
        return model;
    }

    private boolean validate(String regex) {
        return pattern.matches(EMAIL_REGEX, regex);
    }
}
