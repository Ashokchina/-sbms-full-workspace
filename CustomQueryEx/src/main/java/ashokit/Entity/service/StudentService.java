package ashokit.Entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ashokit.Entity.Student;
import ashokit.Repo.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public void insertStudent(String firstName, String lastName) {
        Student student = new Student();
        student.setFirstName("lakavath");
        student.setLastName("Ashok");
        studentRepository.save(student);
    }
}
