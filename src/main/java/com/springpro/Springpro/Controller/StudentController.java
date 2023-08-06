package com.springpro.Springpro.Controller;

import com.springpro.Springpro.Entity.Student;
import com.springpro.Springpro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin  //@CrossOrigin("http://localhost:5173/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // to insert.
    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student) {
        return studentService.saveDetails(student);
    }

    // to insert as a list.
    @PostMapping("/addStudentList")
    public List<Student> postDetails(@RequestBody List<Student> students) {
        return studentService.saveListDetails(students);
    }

    // to read all.
    @GetMapping("/getAllStudents")
    public List<Student> getDetails() {
        return studentService.getAllDetails();
    }

    // to get by id.
    @GetMapping("/getStudentById/{id}")
    public Student fetchDetailsById(@PathVariable int id) {
        return studentService.getStudentDetailsById(id);
    }

    // for update.
    @PutMapping("/updateStudent")
    public Student updateStudentDetails(@RequestBody Student student) {
        return studentService.updateDetails(student);
    }

    // delete
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }

}
