package com.pk.champ.vo;

public class ChampVo {

	private int championNumber;
	private String championImage;
	private String championName;
	private String championNick;
	private String position;
	private int hp;
	private int mp;
	private int ad;
	private int ap;
	
	public ChampVo() {
		super();
	}
	public ChampVo(int championNumber, String championImage, String championName, String championNick, String position,
			int hp, int mp, int ad, int ap) {
		super();
		this.championNumber = championNumber;
		this.championImage = championImage;
		this.championName = championName;
		this.championNick = championNick;
		this.position = position;
		this.hp = hp;
		this.mp = mp;
		this.ad = ad;
		this.ap = ap;
	}
	public int getChampionNumber() {
		return championNumber;
	}
	public void setChampionNumber(int championNumber) {
		this.championNumber = championNumber;
	}
	public String getChampionImage() {
		return championImage;
	}
	public void setChampionImage(String championImage) {
		this.championImage = championImage;
	}
	public String getChampionName() {
		return championName;
	}
	public void setChampionName(String championName) {
		this.championName = championName;
	}
	public String getChampionNick() {
		return championNick;
	}
	public void setChampionNick(String championNick) {
		this.championNick = championNick;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getAd() {
		return ad;
	}
	public void setAd(int ad) {
		this.ad = ad;
	}
	public int getAp() {
		return ap;
	}
	public void setAp(int ap) {
		this.ap = ap;
	}
	
	@Override
	public String toString() {
		return "ChampVo [championNumber=" + championNumber + ", championImage=" 
				+ championImage + ", championName="	+ championName 
				+ ", championNick=" + championNick + ", position=" 
				+ position + ", hp=" + hp + ", mp=" + mp + ", ad=" + ad 
				+ ", ap=" + ap + "]";
	}
	
	
	
}
