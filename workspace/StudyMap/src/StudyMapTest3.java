import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StudyMapTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> userMap = new HashMap();

		userMap.put("myId", "1234");
		userMap.put("asdf", "1111");
		
		String userIdInput = "myId";
		String userPwdInput = "1234";
		
		if (userMap.get(userIdInput).equals(userPwdInput)) {
			System.out.println("비밀번호가 일치합니다.");
		}
		
		
	}

}