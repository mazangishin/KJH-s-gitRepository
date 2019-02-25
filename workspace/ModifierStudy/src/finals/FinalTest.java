package finals;

public final class FinalTest {

	final int MAX_SIZE = 10;
	
	/* final */ int getMaxSize() { // final이 적힌 매서드는 오버라이딩이 안됨
		final int LV = MAX_SIZE;
		String str = "";
		
		
		return MAX_SIZE;
	}
	
	
}
