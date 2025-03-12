package com.devmaster.labguide.controller;


import com.devmaster.labguide.dto.StudentDTO;
import com.devmaster.labguide.entity.Student;
import com.devmaster.labguide.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public String getStudent(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students/student-list";
    }
    @GetMapping("/add-new")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "students/student-add";
    }
    @GetMapping("/edit/{id}")
    public String ShowFormForStudent(@PathVariable(value = "id") Long id, Model model) {
        StudentDTO student = studentService.findById(id).orElseThrow(() -> new IllegalArgumentException(("Invalid student ID: " + id)));
        model.addAttribute("student", student);
        return "students/student-edit";
    }
    @PostMapping
    public String saveStudent(@ModelAttribute("student") StudentDTO student) {
        studentService.save(student);
        return "redirect:/students";
    }
    @PostMapping ("/update/{id}")
    public String updateStudent(@PathVariable(value = "id") Long id,@ModelAttribute("student") StudentDTO student) {
        studentService.updateStudentById(id, student);
        return "redirect:/students";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
