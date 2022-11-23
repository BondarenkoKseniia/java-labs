package manager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import microcontroller.*;

public class Manager {
	
	private Map<String, List<Electronic>> shopMap = new HashMap<>();

	public void addGoods(List<Electronic> goods) {
		goods.forEach(good -> {
			String name = good.getName();
			var existingGoods = shopMap.get(name);
			if (existingGoods == null) {
				existingGoods = new LinkedList<Electronic>();
				shopMap.put(name, existingGoods);
			}
			existingGoods.add(good);
		});
	}

	public ArrayList<Electronic> findGoodsByMaker(Maker maker) {
		ArrayList<Electronic> goodsSameMaker = new ArrayList<Electronic>();
		for (List<Electronic> goods : shopMap.values()) {
			for (Electronic good : goods) {
				if (good.getMaker().equals(maker)) {
					goodsSameMaker.add(good);
				}
			}
		}
		return goodsSameMaker;
	}
	
	public void  sortByPowerAscending(List<Electronic> goods){
		goods.sort(ascendingsortByPower);
	}


	
	public static Comparator<Electronic> ascendingsortByPower = new Comparator<Electronic>() {
		public int compare(Electronic good1, Electronic good2) {
			int GoodPower1 = good1.getPower();
			int GoodPower2 = good2.getPower();

			return GoodPower1 - GoodPower2;
		}
	};
	
	public void  sortByPowerDescending(List<Electronic> goods){
		goods.sort(descendingsortByPower);
	}
	
	public static Comparator<Electronic> descendingsortByPower = new Comparator<Electronic>() {
		public int compare(Electronic good1, Electronic good2) {
			int GoodPower1 = good1.getPower();
			int GoodPower2 = good2.getPower();

			return GoodPower2 - GoodPower1;
		}
	};

	
	public void  sortByNameAscending(List<Electronic> goods){
		goods.sort(ascendingsortByName);
	}
	
	public static Comparator<Electronic> ascendingsortByName = new Comparator<Electronic>() {
		public int compare(Electronic good1, Electronic good2) {
			String GoodName1 = good1.getName().toUpperCase();
			String GoodName2 = good2.getName().toUpperCase();

			return GoodName1.compareTo(GoodName2);
		}
	};
	
	public void  sortByNameDescending(List<Electronic> goods){
		goods.sort(descendingsortByName);
	}

	public static Comparator<Electronic> descendingsortByName = new Comparator<Electronic>() {
		public int compare(Electronic good1, Electronic good2) {
			String GoodName1 = good1.getName().toUpperCase();
			String GoodName2 = good2.getName().toUpperCase();

			return GoodName2.compareTo(GoodName1);
		}
	};

}
