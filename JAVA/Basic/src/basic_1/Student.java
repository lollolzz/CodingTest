package basic_1;

public class Student {
	
	private String name;
	private String no;
	
	// 생성자 // 멤버변수 name, no를 받아 초기화 한다 
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	

	
	
	

}
