package school.ui;

import java.util.ArrayList;
import java.util.Scanner;

import school.service.SchoolService;

import school.vo.Student;


public class SchoolUI {
	Scanner keyin = new Scanner(System.in);
	SchoolService service = new SchoolService();
	String choice;
	
	//다른 클래스에서 불러내서 이용할꺼라 public
	public SchoolUI() {
		while (true) {
			mainMenu();
			choice = keyin.next();
			switch(choice) {
				case "1": input(); break;
				case "2": list(); break;
				case "3": search(); break;
				case "4": delete(); break;
				case "0": exit(); return; //return은 메인 메서드로 돌아간다.(프로그램 종료)
				default:
					System.out.println("선택 오류");
					keyin.nextLine();
			}//switch
		}//while
	}//SchoolUI()
	
	//현재 이 생성자 안에서 쓸거라 private써도 된다.
	//어차피 패키지 달라서 다른애들이 못부르니 안써도 그만.
	void mainMenu() {
		//메인메뉴 출력
		System.out.println();
		System.out.println("[ 학생 성적 관리 ]");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 전체 목록 출력");
		System.out.println("3. 검색");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택> ");
	}//mainMenu()
	
	void input() {
		System.out.println("[1. 학생 성적 입력]");
		String name, id, phone;
		int k, e, m;
		
		System.out.print("이름:");
		name = keyin.next();
		System.out.print("학번:");
		id = keyin.next();
		System.out.print("전화:");
		phone = keyin.next();
		System.out.print("국어점수:");
		k = keyin.nextInt();
		System.out.print("영어점수:");
		e = keyin.nextInt();
		System.out.print("수학점수:");
		m = keyin.nextInt();
		
		Student s = new Student(name, id, phone, k, e, m);
		service.inputStudent(s);
		System.out.println ("저장되었습니다.");
	}
	
	void list() {
		ArrayList<Student> studentList = service.getList();
		System.out.println(studentList);
	}
	void search() {
		
	}
	void delete() {
		String code = keyin.next();
		service.deleteStudent(code);
		System.out.println("삭제합니다.");
	}
	void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
}//class SchoolUI

//method 호출 parameter, return 값
//moethod 를 부르면서 처리하는거
//return 
