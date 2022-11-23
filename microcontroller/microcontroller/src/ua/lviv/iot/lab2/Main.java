package ua.lviv.iot.lab2;

public class Main {

	public static void main(String[] args) {
		
		microcontroller.EightBitMC microcontroller1 = new microcontroller.EightBitMC(740, "STM8LL", "China", 5);
		microcontroller.SixteenBitMC microcontroller2 = new microcontroller.SixteenBitMC(" real-time system", "MCS-96", "Intel", 6);
		microcontroller.ThirtyTwoBitMC microcontroller3 = new microcontroller.ThirtyTwoBitMC(" mobile devices", "AVR32", "Atmel", 8);
		
		System.out.println(microcontroller1);
		System.out.println(microcontroller2);
		System.out.println(microcontroller3);
	}

}
