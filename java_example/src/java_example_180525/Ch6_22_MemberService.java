package java_example_180525;

public class Ch6_22_MemberService {
	private String id;
	private String pwd;
	
	boolean login(String id, String pwd) {
		this.id=id;
		this.pwd=pwd;
		
		if(id.equals("yourid")&&pwd.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	void logout() {
		System.out.println(this.id+"님 로그아웃 되었습니다.");
	}
}
