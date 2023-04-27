package school.vo;

public class Person {
	//abstract : 추상클래스 선언문. new 를 해서 객체생성 불가능하다.
		private String name; //데이터를 보호하기 위해 private
		private String id;
		private String phone;
		//참조변수 값 없으면 null이다.

		public Person() {
//			super(); 첫줄에 아무것도 없으면 부모 생성자 super가 자동으로 들어간다.
		}
		
		public Person(String name, String id, String phone) {
//			super();
			this.name = name;
			this.id = id;
			this.phone = phone;
		}
		
		//capsule:내부를 감추고 꼭 필요한것만 보이기.
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		//Overriding - 상속받은 메서드를 재정의.
		//리턴타입 같고, 접근지정자는 같거나 더 개방적, 이름은 같고, 예외는 같거나 더 하위타입으로.
		
		public String toString() {
			String s = "이름: " + name + " 주민등록번호: " + id
					+ " 전화번호: " + phone;
			return s;
		}
}
