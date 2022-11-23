package microcontroller;

public class SixteenBitMC extends Electronic {
	
	private String appointment;
	
	public SixteenBitMC(String appointment, String name, String maker, int power) {
		
		super(name, maker, power);
		
		this.appointment = appointment;
		
	}
	
	public String getAppointment() {
		
		return appointment;
	}
	
	public void setAppointment(String appointment) {
		
		this.appointment = appointment;
	}
	
	@Override
	public String toString() {
		
		return "For" + appointment + "," + name + "," + maker + "," + power + "V";
	}
}
