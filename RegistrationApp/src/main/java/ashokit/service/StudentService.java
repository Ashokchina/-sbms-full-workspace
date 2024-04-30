package ashokit.service;

import org.springframework.stereotype.Service;

import ashokit.entity.Student;
@Service
public interface StudentService {
	
public boolean saveStudent(Student student);
}
