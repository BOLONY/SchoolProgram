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
//		for(Student i : list) {//앞에서부터 한명씩 비교
		for(int i = 0; i < list.size(); i++) {
			//Person 클래스의 getId다.
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
				return true;
				//같은 학번을 찾으면 삭제후 리턴
			}
		}
		return false;
		//못찾으면 false 리턴
	}//delete()

}//class SchoolDao
