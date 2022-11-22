package microcontroller;

public class ThirtyTwoBitMC extends Electronic {
	
	private String device;
	
	public ThirtyTwoBitMC(String device, String name, String maker, int power) {
		
		super(name, maker, power);
		
		this.device = device;
	}
	
	public String getDevice() {
		
		return device;
	}
	
	public void setDevice(String device) {
		
		this.device = device;
	}
	
	@Override
	public String toString() {
		
		return "For" + device + "," + name + "," + maker + "." + power + "V";
	}

}
