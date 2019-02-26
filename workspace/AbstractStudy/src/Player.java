
public abstract class Player {

	private int pos = 0;
	private int lastPos = 0;
	private String name = "";
	
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getLastPos() {
		return lastPos;
	}
	public void setLastPos(int lastPos) {
		this.lastPos = lastPos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Player [pos=" + pos + ", lastPos=" + lastPos + ", name=" + name + "]";
	}
	
	abstract void play (int pos);
	abstract void stop ();
	
}
