package school.vo;

public class Student extends Person {
	private int kor;
	private int eng;
	private int mat;
//	private int avg; ��յ� ���Ҷ� ���� ���� ����ؾ� �Ǵ� ����� �س����� �ȵȴ�.
//	private int total;
	
	//������
	public Student() {
		super(); // �θ�Ŭ������ �⺻ ������.
	}
	
	public Student(String name, String id, String phone, int kor, int eng, int mat) {
		super(name, id, phone); //Ÿ�԰� ������ ������ �ȴ�.
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		//this.name = name;
		//setName(name);
		
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		//return; �� � ���� �ִ°� �ƴ϶� ���� �� ������ �ǵ��ư��ٴ� �ǹ�
	}
	public int getTotal() {
		int t = this.kor + this.eng + this.mat;
		return t;
	}
	
	public double getAverage() {
		double avg = this.getTotal() / 3.0;
		return avg;
	}
	
	public String getGrade() {
		if(getAverage() >= 90) {
			return "A";
		}
		else if (getAverage()>=80) {
			return "B";
		}
		else if (getAverage()>=70) {
			return "C";
		}
		else if (getAverage()>=60) {
			return "D";
		}
		else {
			return "F";
		}
	}// getGrade
	
//	public String toString(int a) {
//		//������ this, �θ𲨴� super
//		String s = super.toString() + " ����:"  + kor + " ����: " + eng+ " ����: " + mat;
//		return s;
//	} �̰� �����ε�.
	
	//toString() �������̵�
	@Override //�����̶� Ʋ���� �ٷ� �������� ���ش�.
	public String toString() {
		//������ this, �θ𲨴� super
		String s = super.toString() + " ����:"  + kor + " ����: " + eng+ " ����: " + mat;
		return s;
		}
}
