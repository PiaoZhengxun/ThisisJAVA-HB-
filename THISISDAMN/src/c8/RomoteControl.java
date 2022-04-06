package c8;

public interface RomoteControl {
	
	public int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);

}
