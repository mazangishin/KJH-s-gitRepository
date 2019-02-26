package exam.test.shoppingMall;

public class ShoppingMallSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
		
		Customer kjh = new Customer("김준혁", 00, 10001);
		Customer kch = new Customer("김충현", 00, 100002);
		Customer pki = new Customer("박강인", 00, 100003);
		Customer pks = new Customer("박기성", 00, 1004);
		Customer pds = new Customer("박대승", 00, 100005);
		Customer sjw = new Customer("송지원", 00, 100006);
		Customer ysh = new Customer("윤승환", 00, 10007);
		Customer lms = new Customer("이명선", 00, 100008);
		Customer jhi = new Customer("장훈일", 00, 10009);
		Customer jms = new Customer("정민성", 00, 100);
		
		ProductStore computerStore = new ProductStore("최고의 컴퓨터", 1000000);
		ProductStore appleStore = new ProductStore("거창 사과", 1000);
		ProductStore phoneStore = new ProductStore("갤럭시", 10000);
		ProductStore snackStore = new ProductStore("다이제", 500);
		
		
		computerStore.buy(kjh);
		computerStore.buy(kch);
		computerStore.buy(pki);
		computerStore.buy(pks);
		computerStore.buy(pds);
		appleStore.buy(sjw);
		appleStore.buy(ysh);
		phoneStore.buy(lms);
		phoneStore.buy(jhi);
		appleStore.buy(jms);
		
		System.out.println(kjh.toString());
		System.out.println(kch.toString());
		System.out.println(pki.toString());
		System.out.println(kjh.toString());
		System.out.println(pks.toString());
		System.out.println(pds.toString());
		System.out.println(sjw.toString());
		System.out.println(ysh.toString());
		System.out.println(lms.toString());
		System.out.println(jhi.toString());
		System.out.println(jms.toString());
		
	}

}
