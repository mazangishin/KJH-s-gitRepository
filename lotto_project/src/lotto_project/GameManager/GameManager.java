package lotto_project.GameManager;

import lotto_project.shop.Lotto_Shop;
import lotto_project.item.Item;
import lotto_project.GameManager.GameManager;
import lotto_project.player.Player;

public class GameManager 
	{

		public void is_Cls()//화면 지우기 
		{
			for (int i = 0; i < 70; i++) 
			{
				System.out.println("");
			}
		}
	
		
		public void is_MainGame_Screen()//기본화면 
		{
			
				System.out.println("  ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤                 ");
				System.out.println( " ▤     ■■■■■■■■■■■■■■■■■■■■■■■■■■■■      ▤                  " 	);
				System.out.println( " ▤     ■□■■■■■□□□■■□□□□□■□□□□□■□□□■      ▤                  " 	);
				System.out.println( " ▤     ■□■■■■□■■■□■■■□■■■■■□■■□■■■□      ▤                    ");
				System.out.println( " ▤     ■□■■■■□■■■□■■■□■■■■■□■■□■■■□      ▤                    " );
				System.out.println( " ▤     ■□■■■■□■■■□■■■□■■■■■□■■□■■■□      ▤                      ");
				System.out.println( " ▤     ■□□□□■■□□□■■■■□■■■■■□■■■□□□■      ▤                      " );
				System.out.println( " ▤     ■■■■■■■■■■■■■■■■■■■■■■■■■■■■      ▤                      " );
				System.out.println( " ▤  ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▒ ▤                  " );
				System.out.println( "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ");
				System.out.println( "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  " );
				System.out.println( "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   " );
				System.out.println( "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   " );
				System.out.println( "▒▒▒▒▒▒▒▒▒▒▒계속하려면 아무키나 누르세요 ▒▒▒▒▒▒▒▒▒▒▒▒   " );
				System.out.println( "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   " );
				System.out.println( "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  " );
				System.out.println( "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  " );
				System.out.println( "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  " );
				
				
			
		}
		
		public void autoCount(int num) {
			int count=0;
			
			if(count<num)
			{
				count+=1;
				if(count>=num)
				{
					count=0;
				}
			}
		}
		
		public void lotto_shop_screen(Lotto_Shop shop, Player player) {
			
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" );
			System.out.println( " ▤※※※※※※※ 로또 상점에 어서 오세요※※※※※※※※  ▤        ");    
			System.out.println( " ▤ 1)로또 구매  2)로또 추첨        상점소지금:"+shop.lottoShopMoney    +"원");
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤           " );
			System.out.println( " ▤           □□□□□                                                                                   " );
			System.out.println( " ▤     □■□▒▒▒▒▒□                                                                               " );
			System.out.println( " ▤    □▒■▒▒▒▒▒▒□                          ----------      " );
			System.out.println( " ▤  □▒▒□□ □□□□ □                           |   ②      |     " );
			System.out.println( " ▤  □▒□ □   |   | □           |  ⑭ ⑥ ⑪ ③ |      " );
			System.out.println( " ▤  □□    □      -    □           |①⑨ ⑬⑤⑮    |           " );
			System.out.println( " ▤           □■■■■                                        ---------                           " );
			System.out.println( " ▤          □  ■■■□                                          ▤▤▤▤                                     " );
			System.out.println( " ▤         □ □■■ □ □                                       ▤▤▤▤                                 " );
			System.out.println( " ▤           □□□□□                                       ▤▤▤▤▤▤▤                                    " );
			System.out.println( " ▤            □□ □□                                        ▤▤▤▤▤▤▤                                 " );
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤   " );
			System.out.println( " ▤  플레이어 이름:"+player.playerName +"     "+"플레이어 소지금"+player.player_Money );
			System.out.println( " ▤  ");
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" );
			
			
		}
		
		public void buy_lotto_screen(Lotto_Shop shop, Player player) {
			
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" );
			System.out.println( " ▤※※※※※※※ 로또 상점에 어서 오세요※※※※※※※※  ▤        ");    
			System.out.println( " ▤ 1)로또 구매  2)로또 추첨        상점소지금:"+shop.lottoShopMoney    +"원");
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤           " );
			System.out.println( " ▤           □□□□□                      |-----------------------------   " );
			System.out.println( " ▤     □■□▒▒▒▒▒□            |    나의 로또 번호                                                                                " );
			System.out.println( " ▤    □▒■▒▒▒▒▒▒□         |"+player.lotArr[0]+" "+player.lotArr[1]+" "+player.lotArr[2]+" "+player.lotArr[3]+" "+player.lotArr[4]+" "+player.lotArr[5]+"		  "+"");
			System.out.println( " ▤  □▒▒□□ □□□□ □           |                                   " );
			System.out.println( " ▤  □▒□ □   |   |  □    |-----------------------------       " );
			System.out.println( " ▤  □□    □       -   □                   " );
			System.out.println( " ▤           □■■■■                                                                 " );
			System.out.println( " ▤          □  ■■■□                                                                       " );
			System.out.println( " ▤         □ □■■ □ □                                                                     " );
			System.out.println( " ▤           □□□□□                                                                        " );
			System.out.println( " ▤            □□ □□                                                                     " );
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤   " );
			System.out.println( " ▤  플레이어 이름:"+player.playerName +"     "+"플레이어 소지금 :"+player.player_Money );
			System.out.println( " ▤  ");
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" );
			
			
		
		}
	
	
		
	
		public void get_lotto_screen(Lotto_Shop shop, Player player) {
			
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" );
			System.out.println( " ▤※※※※※※※ 로또 상점에 어서 오세요※※※※※※※※  ▤        ");    
			System.out.println( " ▤ 1)로또 구매  2)로또 추첨        상점소지금:"+shop.lottoShopMoney    +"원");
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤           " );
			System.out.println( " ▤           □□□□□                          ------------------ " );
			System.out.println( " ▤     □■□▒▒▒▒▒□               |    나의 로또 번호                                                         " );
			System.out.println( " ▤    □▒■▒▒▒▒▒▒□            |"+player.lotArr[0]+"  "+player.lotArr[1]+"  "+player.lotArr[2]+"  "+player.lotArr[3]+"  "+player.lotArr[4]+"  "+player.lotArr[5]+"     "+"  ");
			System.out.println( " ▤  □▒▒□□ □□□□ □              |"+player.lotArrOk[0]+" "+player.lotArrOk[1]+" "+player.lotArrOk[2]+" "+player.lotArrOk[3]+" "+player.lotArrOk[4]+" "+player.lotArrOk[5]   );
			System.out.println( " ▤  □▒□ □   |   | □      |-------------------        " );
			System.out.println( " ▤  □□    □       ▽        □                   " );
			System.out.println( " ▤           □■■■■                             " +   player.player_Get_money_text     );
			System.out.println( " ▤          □  ■■■□                          -----------------                                                 " );
			System.out.println( " ▤         □ □■■ □ □                    |   당첨번호                                                     " );
			System.out.println( " ▤           □□□□□                        |"+shop.LottoArr[0]+" "+shop.LottoArr[1]+" "+shop.LottoArr[2]+" "+shop.LottoArr[3]+" "+shop.LottoArr[4]+" "+shop.LottoArr[5]+" " );
			System.out.println( " ▤            □□ □□                         |                                          " );
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤   " );
			System.out.println( " ▤  플레이어 이름:"+player.playerName +"     "+"플레이어 소지금: "+player.player_Money );
			System.out.println( " ▤  ");
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" );
			
			
		}
		
		
		
		
		public void MenualBuy_lotto_screen(Lotto_Shop shop, Player player) {
			
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" );
			System.out.println( " ▤※※※※※※※ 로또 상점에 어서 오세요※※※※※※※※  ▤        ");    
			System.out.println( " ▤ 1)로또 구매  2)로또 추첨        상점소지금:"+shop.lottoShopMoney    +"원");
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤           " );
			System.out.println( " ▤         										 " );
			System.out.println( " ▤   ----------------------------------------- " );
			System.out.println( " ▤|"+player.selectLotNumViewArr[0]+"   "+player.selectLotNumViewArr[1]+"   "+player.selectLotNumViewArr[2]+"   "+player.selectLotNumViewArr[3]+"    "+player.selectLotNumViewArr[4]+"    "+player.selectLotNumViewArr[5]+"   "+player.selectLotNumViewArr[6]+"    "+player.selectLotNumViewArr[7]+"   "+player.selectLotNumViewArr[8]+"   "+player.selectLotNumViewArr[9]);
			System.out.println( " ▤|"+player.selectLotNumViewArr[10]+"  "+player.selectLotNumViewArr[11]+"  "+player.selectLotNumViewArr[12]+"  "+player.selectLotNumViewArr[13]+"   "+player.selectLotNumViewArr[14]+"  "+player.selectLotNumViewArr[15]+"  "+player.selectLotNumViewArr[16]+"   "+player.selectLotNumViewArr[17]+"  "+player.selectLotNumViewArr[18]+"   "+player.selectLotNumViewArr[19]);
			System.out.println( " ▤|"+player.selectLotNumViewArr[20]+"  "+player.selectLotNumViewArr[21]+"  "+player.selectLotNumViewArr[22]+"  "+player.selectLotNumViewArr[23]+"   "+player.selectLotNumViewArr[24]+"  "+player.selectLotNumViewArr[25]+"  "+player.selectLotNumViewArr[26]+"   "+player.selectLotNumViewArr[27]+"  "+player.selectLotNumViewArr[28]+"   "+player.selectLotNumViewArr[29]);
			System.out.println( " ▤|"+player.selectLotNumViewArr[30]+"  "+player.selectLotNumViewArr[31]+"  "+player.selectLotNumViewArr[32]+"  "+player.selectLotNumViewArr[33]+"   "+player.selectLotNumViewArr[34]+"  "+player.selectLotNumViewArr[35]+"  "+player.selectLotNumViewArr[36]+"   "+player.selectLotNumViewArr[37]+"  "+player.selectLotNumViewArr[38]+"   "+player.selectLotNumViewArr[39]);
			System.out.println( " ▤|"+player.selectLotNumViewArr[40]+"  "+player.selectLotNumViewArr[41]+"  "+player.selectLotNumViewArr[42]+"  "+player.selectLotNumViewArr[43]+"   "+player.selectLotNumViewArr[44]+"  ");
			System.out.println( " ▤ ----------------------------------------- 	   " );
			System.out.println( " ▤   	현재 선택한 번호 : "+player.lotArr[0]+" ,"+player.lotArr[1]+" ,"+player.lotArr[2]+" ,"+player.lotArr[3]+" ,"+player.lotArr[4]+" ,"+player.lotArr[5]);
			System.out.println( " ▤   -----------------------------------------   " );
			System.out.println( " ▤       																   " );
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤   " );
			System.out.println( " ▤  플레이어 이름:"+player.playerName +"     "+"플레이어 소지금 :"+player.player_Money );
			System.out.println( " ▤ ");
			System.out.println( " ▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" );
			
			
		
		}
	
	
	
	
	
	
}
