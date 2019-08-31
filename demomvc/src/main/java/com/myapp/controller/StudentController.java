package com.myapp.controller;

import com.myapp.entity.Student;
import com.myapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "student";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public ModelAndView createStudent() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");
        modelAndView.addObject("studentFromServer", new Student());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("studentFromServer") Student student){
        if(!student.getName().isEmpty()){
            studentService.createStudent(student);
            return "redirect:/student/get";
        }
        return "redirect:/student/get";
    }
}
