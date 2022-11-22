package ua.lviv.iot.lab2;

import java.util.ArrayList;
import java.util.List;

import manager.Manager;
import microcontroller.*;

public class Main {

	public static void main(String[] args) {
		
		microcontroller.EightBitMC microcontroller1 = new microcontroller.EightBitMC(740, "STM8LL", Maker.China, 5);
		microcontroller.EightBitMC microcontroller4 = new microcontroller.EightBitMC(1550, "MCS51", Maker.Intel, 4);
		microcontroller.SixteenBitMC microcontroller2 = new microcontroller.SixteenBitMC(" real-time system", "MCS96", Maker.Intel, 6);
		microcontroller.ThirtyTwoBitMC microcontroller3 = new microcontroller.ThirtyTwoBitMC(" mobile devices", "AVR32", Maker.Atmel, 8);
		
		Manager manager = new Manager();
		
		ArrayList<Electronic> goods = new ArrayList<Electronic>();
		goods.add(microcontroller1);
		goods.add(microcontroller2);
		goods.add(microcontroller3);
		goods.add(microcontroller4);
		System.out.println("Available goods: \n" + goods);
		
		System.out.println("\nGoods sorted by ascending power: \n ");
		manager.addGoods(goods);
		manager.sortByPowerAscending(goods);
		System.out.println(goods);

		System.out.println("\nGoods sorted by descending power: \n ");
		manager.sortByPowerDescending(goods);
		System.out.println(goods);

		System.out.println("\nGoods sorted by ascending name of product: \n ");
		manager.sortByNameAscending(goods);
		System.out.println(goods);

		System.out.println("\nGoods sorted by descending name of product: \n ");
		manager.sortByNameDescending(goods);
		System.out.println(goods);
		
		List<Electronic> goodsSameMaker = manager.findGoodsByMaker(Maker.Intel);
		System.out.println("\nGoods for a certain maker category:\n" + goodsSameMaker);
		
	}

}
