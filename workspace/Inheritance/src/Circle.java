/* 포함관계 (Composite)
	= 가진다.
	상속관계: ~ 은 ~ 이다 (~ is a ~)
	포함관계: ~ 은 ~ 을 가지고 있다 (~ has a ~)
	
	1. 원은 도형이다.			O
	2. 점은 원이다.			X 
	3. 원은 도형을 가지고 있다.	X
	4. 원은 점을 가지고 있다.		O
*/
public class Circle {

//	int x = 0;
//	int y = 0;
//	
	Point point = new Point();	// 원점
	int r = 0;	// 반지름
	
	
	
}
