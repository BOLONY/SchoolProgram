package school.vo;

public class Person {
	//abstract : �߻�Ŭ���� ����. new �� �ؼ� ��ü���� �Ұ����ϴ�.
		private String name; //�����͸� ��ȣ�ϱ� ���� private
		private String id;
		private String phone;
		//�������� �� ������ null�̴�.

		public Person() {
//			super(); ù�ٿ� �ƹ��͵� ������ �θ� ������ super�� �ڵ����� ����.
		}
		
		public Person(String name, String id, String phone) {
//			super();
			this.name = name;
			this.id = id;
			this.phone = phone;
		}
		
		//capsule:���θ� ���߰� �� �ʿ��Ѱ͸� ���̱�.
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
		
		//Overriding - ��ӹ��� �޼��带 ������.
		//����Ÿ�� ����, ���������ڴ� ���ų� �� ������, �̸��� ����, ���ܴ� ���ų� �� ����Ÿ������.
		
		public String toString() {
			String s = "�̸�: " + name + " �ֹε�Ϲ�ȣ: " + id
					+ " ��ȭ��ȣ: " + phone;
			return s;
		}
}
