package school.ui;

import java.util.ArrayList;
import java.util.Scanner;

import school.service.SchoolService;

import school.vo.Student;


public class SchoolUI {
	Scanner keyin = new Scanner(System.in);
	SchoolService service = new SchoolService();
	String choice;
	
	//�ٸ� Ŭ�������� �ҷ����� �̿��Ҳ��� public
	public SchoolUI() {
		while (true) {
			mainMenu();
			choice = keyin.next();
			switch(choice) {
				case "1": input(); break;
				case "2": list(); break;
				case "3": search(); break;
				case "4": delete(); break;
				case "0": exit(); return; //return�� ���� �޼���� ���ư���.(���α׷� ����)
				default:
					System.out.println("���� ����");
					keyin.nextLine();
			}//switch
		}//while
	}//SchoolUI()
	
	//���� �� ������ �ȿ��� ���Ŷ� private�ᵵ �ȴ�.
	//������ ��Ű�� �޶� �ٸ��ֵ��� ���θ��� �Ƚᵵ �׸�.
	void mainMenu() {
		//���θ޴� ���
		System.out.println();
		System.out.println("[ �л� ���� ���� ]");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. ��ü ��� ���");
		System.out.println("3. �˻�");
		System.out.println("4. ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("����> ");
	}//mainMenu()
	
	void input() {
		System.out.println("[1. �л� ���� �Է�]");
		String name, id, phone;
		int k, e, m;
		
		System.out.print("�̸�:");
		name = keyin.next();
		System.out.print("�й�:");
		id = keyin.next();
		System.out.print("��ȭ:");
		phone = keyin.next();
		System.out.print("��������:");
		k = keyin.nextInt();
		System.out.print("��������:");
		e = keyin.nextInt();
		System.out.print("��������:");
		m = keyin.nextInt();
		
		Student s = new Student(name, id, phone, k, e, m);
		service.inputStudent(s);
		System.out.println ("����Ǿ����ϴ�.");
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
		System.out.println("�����մϴ�.");
	}
	void exit() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
}//class SchoolUI

//method ȣ�� parameter, return ��
//moethod �� �θ��鼭 ó���ϴ°�
//return 
