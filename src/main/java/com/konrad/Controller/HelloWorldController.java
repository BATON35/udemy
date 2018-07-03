package com.konrad.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
//@RequestMapping("/example")
public class HelloWorldController {

    @RequestMapping("/form")
    public String showForm() {
        return "helloWorld-form";
    }

    @PostMapping("/processForm")
    public String showStudentName() {
        return "form";
    }

    @RequestMapping("/")
    public String sayHello() {
        return "hello";
    }

    @RequestMapping("/processFormVer1")
    public String gender(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");
        String genderFromName;
        if (theName.endsWith("a")) {
            genderFromName = "Women";
        } else {
            genderFromName = "Men - ";
        }
        model.addAttribute("gender", genderFromName);
        return "form";
    }

    @RequestMapping("/processFormVer2")
    public String genderVer1(@RequestParam(name = "studentName", defaultValue = " no data") String theName, Model model) {
        String genderFromName;
        if (theName.endsWith("a")) {
            genderFromName = "Women";
        } else {
            genderFromName = "Men - ";
        }
        model.addAttribute("gender", genderFromName + theName);
        model.addAttribute("name", theName);
        System.out.println(theName);
        return "form";
    }
}
