package lotto_project.player;

public class Player 
{
	public String playerName="";
	public int player_Money=1000;
	
	public int[] lotArr= new int[45];
	
	public String[] selectLotNumViewArr= new String[45];
	
	public String[] lotArrOk= new String[6];
	
	public int menual_count=0;//수동 구매 카운트
	public boolean is_number_Ok=true;//유효한 번호
	
	public int okCount=0;//당첨 카운트
	public String player_Get_money_text="";
	
	public void lotArrOkAwake() {//로또당첨 여부 글자 배열
		for (int i = 0; i < lotArrOk.length; i++) {
			lotArrOk[i]="";
		}
	}
	
	public void golGet() {
		if(okCount>=1)
		{
			player_Money+= ((500*okCount)*okCount);
			player_Get_money_text=(((500*okCount)*okCount)+"Gold를 얻었습니다.");
			
		}else {
			player_Get_money_text="";
		}
		okCount=0;//당첨 카운트 초기화
	}
	
	public void lotNum() {//로또 맨듬
		for (int i = 0; i < lotArr.length; i++) {
			lotArr[i]=i+1;
		}
	}
	
	public void selectLotNumViewArr_awake() {
		for (int i = 0; i < lotArr.length; i++) {
			selectLotNumViewArr[i]=Integer.toString(i+1);
		}
	}
	
	public void ResetlotNum() {//로또숫자를 모두 0으로 초기화
		for (int i = 0; i < lotArr.length; i++) {
			lotArr[i]=0;
		}
	}
	
	public void FindSelectnum(int num) {//같은 숫자를 찾아서 지워쥰다
		selectLotNumViewArr[num-1]="선택";
	}
	
	public void lottoMake()//로또 섞음
	{
		int temp;
		int rand;
		for (int i = 0; i < lotArr.length; i++) {
			rand=(int)(Math.random()*44+1);//1~45중에 하나를 담아줌
			temp=lotArr[rand];//임시변수에 랜덤값 담아쥼
			lotArr[rand]=lotArr[i];//i번째 애랑 rand랑 바꿔쥼
			lotArr[i]=temp;//임시변수에 담겨있던 값을 i에 넣어쥼
		}
		
	}
	
	public void descending()//정렬
	{
		int temp;
		
		for (int i = 0; i < 6; i++) {
			for (int j =i+1; j < 6; j++) {
				if(lotArr[i]>lotArr[j])
				{
					temp=lotArr[i];
					lotArr[i]=lotArr[j];
					lotArr[j]=temp;
				}
			}
		}
	}

}
