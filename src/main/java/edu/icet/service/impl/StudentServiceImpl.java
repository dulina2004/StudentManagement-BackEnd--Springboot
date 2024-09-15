package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student searchStudentById(Integer id) {
        return studentRepository.findByid(id);
    }

    @Override
    public void deletestudentbyid(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updatestudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
