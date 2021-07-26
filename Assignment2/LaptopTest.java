package assignment;

public class LaptopTest {
    public static void main(String[] args) {
		Laptop lap = new Laptop(10, 7.5, 9);
		lap.powerOn();
		lap.bootOS(1);
		lap.increaseBrightness();
		lap.decreaseBrightness();
	}
}
