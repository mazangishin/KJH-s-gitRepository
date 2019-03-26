package com.tg.edu;

public class ScoreDto {

	private int kor;
	private int eng;
	
	public ScoreDto() {
		super();
	}

	public ScoreDto(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "ScoreDto [kor=" + kor + ", eng=" + eng + "]";
	}
}
