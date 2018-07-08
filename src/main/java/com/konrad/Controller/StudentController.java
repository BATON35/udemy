package com.konrad.Controller;

import com.konrad.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showStudent(@ModelAttribute("student")Student student) {
//        Student myStudent = new Student();
//        model.addAttribute("student", myStudent);
        return "studentForm";
    }
    @RequestMapping("/processForm")
    public String processForm (@ModelAttribute("student") Student student){
        return "studentConfirmation";
    }
}
