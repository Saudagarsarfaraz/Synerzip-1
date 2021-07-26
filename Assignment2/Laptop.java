package assignment;

public class Laptop {
    double height;
    double width;
    double screenSize;
    int maxBrightnessLevel;
    int brightnessLevel;
    boolean power;
	public Laptop(double height, double width, double screenSize) {
		super();
		this.height = height;
		this.width = width;
		this.screenSize = screenSize;
	}
	
	public String bootOS(int os) {
		switch (os) {
		case 1:return "windows";
		case 2:return "linux";
		case 3:return "ubuntu";
		default:return "windows";
		}
	}
	
	public void powerOn() {
		this.power = true;
	}
	
	public void powerOff() {
		this.power = false;
	}
	
	public int increaseBrightness() {
		if(maxBrightnessLevel > brightnessLevel) brightnessLevel++;
		return brightnessLevel;
	}
	
	public int decreaseBrightness() {
		if(0<brightnessLevel) brightnessLevel--;
		return brightnessLevel;
	}

}
