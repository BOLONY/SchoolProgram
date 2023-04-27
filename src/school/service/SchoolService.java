package school.service;

import java.util.ArrayList;

import school.dao.SchoolDao;
import school.vo.Student;

public class SchoolService {
	SchoolDao dao = new SchoolDao();
	
	public void inputStudent(Student s) {
		dao.insert(s);
	}
	
	public ArrayList<Student> getList() {
		ArrayList<Student> studentList = dao.getList();
		return studentList;
	}
	
	public boolean deleteStudent(String id) {
		boolean result = dao.delete(id);
		return result;
	}

}
