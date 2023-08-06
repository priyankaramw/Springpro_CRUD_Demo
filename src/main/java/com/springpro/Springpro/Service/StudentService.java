package com.springpro.Springpro.Service;

import com.springpro.Springpro.Entity.Student;
import com.springpro.Springpro.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    // to insert single record.
    public Student saveDetails(Student student) {
        return studentRepo.save(student);
    }

    // to insert list.
    public List<Student> saveListDetails(List<Student> students) {
        return studentRepo.saveAll(students);
    }

    // to read all.
    public List<Student> getAllDetails() {
        return studentRepo.findAll();
    }

    // for getting details by id.
    public Student getStudentDetailsById(int id) {
        return studentRepo.findById(id).orElse(null);
    }

    // for update.
    public Student updateDetails(Student student) {
        Student updateStudent = studentRepo.findById(student.getId()).orElse(null);
        if (updateStudent != null) {
            updateStudent.setMark(student.getMark());
            updateStudent.setName(student.getName());
            studentRepo.save(updateStudent);
            return updateStudent;
        }
        return null;
    }

    // delete
    public String deleteStudent(int id) {
        if (studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            return "Deleted";
        }
        return "Invalid delete request.";
    }
}
