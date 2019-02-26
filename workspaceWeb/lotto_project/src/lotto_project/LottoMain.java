package lotto_project;
//패키지 임포트
import lotto_project.shop.Lotto_Shop;
import lotto_project.item.Item;

import java.util.Scanner;

import lotto_project.GameManager.GameManager;
import lotto_project.player.Player;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		GameManager gamemanager = new GameManager();
		Player player = new Player();
		Lotto_Shop lotto_shop = new Lotto_Shop();
		
		String main_string;//스캔받을 주메뉴 string
		String sub_string;//스캔받을  서브 string
		int Lot_Select_num;//수동으로 고를 로또번호 int
		sub_string="";
		int game_count=5;//게임 카운트
		
		
		gamemanager.is_MainGame_Screen();
		System.out.println("플레이어 이름 입력후 Enter");
		main_string=scan.nextLine();
		player.playerName=main_string;
		
		
		
		
		
		
		
		
		if(main_string!=null)
		{
			gamemanager.is_Cls();
			
		}
		
		gamemanager.lotto_shop_screen(lotto_shop,player);//메인화면
		System.out.println("동작 번호를 선택하세요:");
		
		player.selectLotNumViewArr_awake();//수동 로또넘버 초기화 해줌
		
		main_string=scan.nextLine();
		
		while (game_count>0) {
			switch (main_string) {
			
			case "1":
				gamemanager.is_Cls();
				gamemanager.lotto_shop_screen(lotto_shop,player);//메인화면
				sub_string="";
				
				
				
				System.out.println("1)자동선택  2)수동선택");
				sub_string=scan.nextLine();
				if(sub_string.equals("1"))//자동구매
				{
					player.ResetlotNum();
					player.lotNum();//플레이어의 순차적인 로또숫자 생성 1~45
					player.lottoMake();//로또번호 섞기
					player.descending();//로또번호 정렬
					player.player_Money-=500;//500원 차감
					lotto_shop.lottoShopMoney+=500;//상점 500원 상승
					gamemanager.is_Cls();//화면 지우기
					gamemanager.buy_lotto_screen(lotto_shop,player);//로또구매화면
					System.out.println("동작 번호를 선택하세요:");
					main_string=scan.nextLine();
					
				}else if(sub_string.equals("2"))//수동구매
				{
					player.ResetlotNum();
					for (int i = 0; i < 6; i++) {
						player.is_number_Ok=true;
						gamemanager.is_Cls();
						gamemanager.MenualBuy_lotto_screen(lotto_shop, player);//로또구매화면
						System.out.println((player.menual_count+1)+" 번째 번호를 입력하세요 :");
						Lot_Select_num=scan.nextInt();
						
						
							for (int k = 0 ; k < player.menual_count; k++) {//중복 검사
								if(player.lotArr[k]==Lot_Select_num)
								{
									player.is_number_Ok=false;
								}
							}
							
						if(Lot_Select_num>=46)//45이하의 숫자를 골라라
						{
							System.out.println("45이하의 숫자를 골라주세요");
							i--;
							
						}else if (player.is_number_Ok==false) {
							System.out.println("중복 숫자입력");
							i--;
							
						}else {
							player.lotArr[player.menual_count]=Lot_Select_num;
							player.menual_count+=1;//숫자 고르기 카운트 1상승
							player.FindSelectnum(Lot_Select_num);
							player.is_number_Ok=true;
						}
						
					}
					
					
				}else {//잘못입력
					System.out.println("잘못입력하셨습니다");
					break;
				}
				
				
				
			case "2":
				
				gamemanager.is_Cls();//화면정리
				player.descending();//로또번호 정렬
				lotto_shop.LottoNum();//로또 상점의 순차적인 로또숫자 생성1~45
				gamemanager.lotto_shop_screen(lotto_shop,player);//메인화면
				System.out.println("추첨을 시작합니다. 아무키나 입력후 Enter");
				sub_string=scan.nextLine();
				lotto_shop.LottoRand();//로또상점 로또 랜덤 출력
				lotto_shop.descending();//정렬
				player.lotArrOkAwake();//당첨여부 리셋
				//--------로또 숫자 당첨 여부---------------------
				for (int j = 0; j < 6; j++) {//로또 배열만큼 돌아라
					for (int j2 = 0; j2 < 6; j2++) {
						if(lotto_shop.LottoArr[j]==player.lotArr[j2]) {//플레이어 로또 배열에 하나씩 대조함 만약 같따면?
							player.lotArrOk[j2]="당첨";//당첨 스트링 담아쥼
							player.okCount+=1;
							System.out.println(player.okCount);
						}
						if(lotto_shop.LottoArr[j]!=player.lotArr[j2]&&player.lotArrOk[j2]!="당첨")
						{
							player.lotArrOk[j2]="꽝!";//꽝 스트링 담아쥼
						}
					}
				}
				player.golGet();
				
				gamemanager.is_Cls();
				
				gamemanager.get_lotto_screen(lotto_shop,player);//메인화면
				System.out.println("동작 번호를 선택하세요:");
				main_string=scan.nextLine();
				break;

			default:
				break;
			}
			
		}
		//gamemanager.lotto_shop_screen(lotto_shop,player);
	}

}
