package product.test;

abstract class Tv {

	protected boolean power = false;
	protected int channel = 0;
	protected int volume = 0;
	
	abstract void power();
	abstract void channelUp();
	abstract void channelDown();
	abstract void volumeUp();
	abstract void volumeDown();
	
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return "Tv [power=" + power + ", channel=" + channel + ", volume=" + volume + "]";
	}
	
	
}
