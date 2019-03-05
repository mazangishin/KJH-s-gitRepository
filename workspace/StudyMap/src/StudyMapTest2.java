import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StudyMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> nameMap = new HashMap();
		// 키와 밸류
		nameMap.put("능력자", "박강인");
		nameMap.put("운동맨", "정민성");
		nameMap.put("사장님", "장훈일");

		Scanner scan = new Scanner(System.in);
		String nickname = "";

		System.out.println("별명을 입력하세요");
		nickname = scan.nextLine().trim();
		if (nameMap.containsKey(nickname) == false) {
			System.out.println("존재하지 않는 별명입니다.");
		} else {
			System.out.println("이름 : " + nameMap.get(nickname));
		}

//      while(true) {
//         System.out.print("별명을 입력하세요");
//         nickname = scan.nextLine().trim();
//         System.out.println();
		
//         if(!nameMap.containsKey(nickname)) {
//            System.out.println("다시 입력해주세요");
//            continue;
		
//         }else {
//            System.out.println("별명: " + nickname);
//            System.out.println("이름: " + nameMap.get(nickname));
//            break;
//            }
//         }
//         
//      }

	}

}