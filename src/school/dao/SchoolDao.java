package school.dao;

import java.util.ArrayList;

import school.vo.Student;

public class SchoolDao {
	ArrayList<Student> list = new ArrayList<>();
	
	public void insert(Student s) {
		list.add(s);
	}
	
	public ArrayList<Student> getList() {
		return list;
	}
	
	//for(DrawObject obj : list)
	public boolean delete(String id) {
//		for(Student i : list) {//�տ������� �Ѹ� ��
		for(int i = 0; i < list.size(); i++) {
			//Person Ŭ������ getId��.
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
				return true;
				//���� �й��� ã���� ������ ����
			}
		}
		return false;
		//��ã���� false ����
	}//delete()
	
	public ArrayList<Student> search(String name) {
		ArrayList<Student> result = new ArrayList<Student>();
		
		for(Student s: list) {
			if(s.getName().contains(name)) {
				result.add(s);
			}
		}
		return result;
	}// ArrayList<Student> search
	

}//class SchoolDao
