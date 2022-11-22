package microcontroller;

public class Electronic {
	
	protected String name;
	protected Maker maker;
	protected int power;
	
	public Electronic(String name, Maker maker, int power) {
		
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
	
	public Maker getMaker() {
		
		return maker;
	}
	
	public void setMaker(Maker maker) {
		
		this.maker = maker;
	}
	
	public int getPower() {
		
		return power;
	}
	
	public void setPower(int power) {
		
		this.power = power;
	}

}
