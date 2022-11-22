package microcontroller;

public class EightBitMC extends Electronic {
	
	private int price;
	
	public EightBitMC(int price, String name, String maker, int power) {
		
		super(name, maker, power);
		
		this.price = price;
	}
	
	public int getPrice() {
		
		return price;
	}
	
	public void setPrice(int price) {
		
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return price + "," + name + "," + maker + "," + power + "V";
	}

}
