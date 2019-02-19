package exam.test;

class Product 
{
	String name = "";
	int price;		// 제품의 가격 300
	int bonusPoint;		// 제품구매 시 제공하는 보너스점수  200

	Product(){
		this(300);
	}
	
	Product(int price) {   // 300
		this(price, price + 10);
	}

	Product(int price, int bonusPoint) {  // 300, 310
		super();
		this.price = price;
		this.bonusPoint =(int)(price/10.0);
	}
	
	int getPrice() {
		
		return price;
	}
	
	
	
	
}