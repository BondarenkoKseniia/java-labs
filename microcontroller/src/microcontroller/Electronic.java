package microcontroller;

public class Electronic {
	
	protected String name;
	protected String maker;
	protected int power;
	
	public Electronic(String name, String maker, int power) {
		
		this.name = name;
		this.maker = maker;
		this.power = power;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getMaker() {
		
		return maker;
	}
	
	public void setMaker(String maker) {
		
		this.maker = maker;
	}
	
	public int getPower() {
		
		return power;
	}
	
	public void setPower(int power) {
		
		this.power = power;
	}

}
