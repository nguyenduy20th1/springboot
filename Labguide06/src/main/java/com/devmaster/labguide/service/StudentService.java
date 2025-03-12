package com.devmaster.labguide.service;

import com.devmaster.labguide.dto.StudentDTO;
import com.devmaster.labguide.entity.Student;
import com.devmaster.labguide.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //lấy ra danh sách
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<StudentDTO> findById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setName(student.getName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setAge(student.getAge());

        return Optional.of(studentDTO);
    }

    public Boolean save(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setAge(studentDTO.getAge());

        try {
            studentRepository.save(student);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    //sửa
    public Student updateStudentById(Long id, StudentDTO updateStudent) {
        return studentRepository.findById(id).map(student -> {
            student.setName((updateStudent.getName()));
            student.setEmail(updateStudent.getEmail());
            student.setAge(updateStudent.getAge());
            return studentRepository.save(student);
        }).orElseThrow(() -> new IllegalArgumentException(("Invalid student ID: " + id)));
    }
    public void  deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
