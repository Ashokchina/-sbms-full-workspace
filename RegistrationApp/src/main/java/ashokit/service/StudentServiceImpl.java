package ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.entity.Student;
import ashokit.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
private StudentRepository studentRepo;
	@Override
	public boolean saveStudent(Student student) {
		studentRepo.save(student) ;
		return true;
	}

}
