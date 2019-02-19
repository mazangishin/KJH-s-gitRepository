package lotto_project.shop;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Lotto_Shop 
{
	public int lottoShopMoney=10000;
	
	
	public int[] LottoArr = new int[45];
	
	
	public void LottoNum() //로또 당첨 번호 순차 생성
	{
		for (int i = 0; i < LottoArr.length; i++) {
			LottoArr[i]=i+1;
		}
	}
	
	public void LottoRand() //로또 랜덤으로 만들기
	{
		int temp;
		int rand;
		for (int i = 0; i < LottoArr.length; i++) {
			rand=(int)(Math.random()*44+1);//1~45중에 하나를 담아줌
			temp=LottoArr[rand];//임시변수에 랜덤값 담아쥼
			LottoArr[rand]=LottoArr[i];//i번째 애랑 rand랑 바꿔쥼
			LottoArr[i]=temp;//임시변수에 담겨있던 값을 i에 넣어쥼
		}
	}
	
	public void descending()//정렬
	{
		int temp;
				
		for (int i = 0; i < 6; i++) {
			for (int j =i+1; j < 6; j++) {
				if(LottoArr[i]>LottoArr[j])
				{
					temp=LottoArr[i];
					LottoArr[i]=LottoArr[j];
					LottoArr[j]=temp;
				}
			}
		}
	}
	
	
}
