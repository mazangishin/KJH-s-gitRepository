/*	멤버 변수
	클래스 내에 포함되어 있는 모든 변수들을 총칭하는 용어
	지역 변수는 제외
	
	멤버 메서드
	클래스 내에 포함되어 있는 모든 메서드들을 총칭하는 용어
 */
public class NoteBook {

	static String brand = "LG";
	int price = 0;
	int hardDisk = 0;
	int memory = 0;

//	brand="LG"; 오류남 what??
//	price=0;
//	hardDisk=0;
//	memory=0;

	NoteBook() {

	}

	// brand 변수를 포함해야하나?
	NoteBook(int price, int hardDisk, int memory) {
//		this.brand = brand;
		this.price = price;
		this.hardDisk = hardDisk;
		this.memory = memory;
	}

	void info() {
		System.out.println("제조사\t" + brand); 
		System.out.println("가격\t" + price);
		System.out.println("용량\t" + hardDisk + "GB");
		System.out.println("메모리\t" + memory + "G");

	}

}
