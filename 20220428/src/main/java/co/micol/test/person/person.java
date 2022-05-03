package co.micol.test.person;

public class person {
	String ssn;
	String name;
	String address;
	
	// 기본 생성자로 필드 초기화 x
	public person() {};
	
	// 매개변수 받아 필드 초기화
	public person(String ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	// get set 메소드
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
