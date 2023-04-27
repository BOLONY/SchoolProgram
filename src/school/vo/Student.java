package school.vo;

public class Student extends Person {
	private int kor;
	private int eng;
	private int mat;
//	private int avg; 평균도 구할때 마다 새로 계산해야 되니 멤버로 해놓으면 안된다.
//	private int total;
	
	//생성자
	public Student() {
		super(); // 부모클래스의 기본 생성자.
	}
	
	public Student(String name, String id, String phone, int kor, int eng, int mat) {
		super(name, id, phone); //타입과 순서만 같으면 된다.
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
		//return; 꼭 어떤 값을 주는게 아니라 값을 준 곳으로 되돌아간다는 의미
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
//		//내꺼는 this, 부모꺼는 super
//		String s = super.toString() + " 국어:"  + kor + " 영어: " + eng+ " 수학: " + mat;
//		return s;
//	} 이건 오버로딩.
	
	//toString() 오버라이딩
	@Override //조금이라도 틀리면 바로 에러내게 해준다.
	public String toString() {
		//내꺼는 this, 부모꺼는 super
		String s = super.toString() + " 국어:"  + kor + " 영어: " + eng+ " 수학: " + mat;
		return s;
		}
}
