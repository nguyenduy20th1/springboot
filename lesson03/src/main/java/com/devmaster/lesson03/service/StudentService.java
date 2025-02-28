package com.devmaster.lesson03.service;

import com.devmaster.lesson03.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Service class: StudentService
 * <p>Lớp dịch vụ thực hiện chức năng thao tác với List Object Student</p>
 * @author Duy
 * Version 1.0
 */

@Service
public class StudentService {
    List<Student> students = new ArrayList<>();

    public StudentService() {
        students.addAll(
                Arrays.asList(
                        new Student(1L, "Devmaster Academy", "None", "Số 25 Phố Vũ Ngọc Phan", "0373544163", "hiamduy2003@gmail.com"),
                        new Student(2L, "Devmaster Academy2", "None", "Số 26 Phố Vũ Ngọc Phan", "0373544163", "hiamduy2003@gmail.com")
                )
        );
    }

    // Lấy toàn bộ danh sách
    public List<Student> getStudents() {
        return students;
    }

    // Lấy theo id
    public Student getStudent(Long id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }

    // Thêm mới
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    // Cập nhật thông tin sinh viên
    public Student updateStudent(Long id, Student student) {
        Student check = getStudent(id);
        if (check == null) {
            return null;
        }
        students.forEach(s -> {
            if (s.getId().equals(id)) {
                s.setName(student.getName());
                s.setGender(student.getGender());
                s.setAddress(student.getAddress());
                s.setPhone(student.getPhone());
                s.setEmail(student.getEmail());
            }
        });
        return student;
    }

    public boolean deleteStudent(Long id) {
        Student student = getStudent(id);
        return students.remove(student);
    }
}
