package lamda.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lambda.interFace.ApplePredicate;
import lambda.type.Apple;

public class ActionParameter {
	
	List<Apple> _inventory;
	
	public ActionParameter() {
		_inventory = Arrays.asList(
				new Apple(80, "green"),
				new Apple(155, "green"),
				new Apple(120, "red"),
				new Apple((int)Math.random(), "red"),
				new Apple((int)Math.random(), "blue"),
				new Apple((int)Math.random(), "blue"),
				new Apple((int)Math.random(), "yellow"),
				new Apple((int)Math.random(), "yellow")
				);
	}
	
	
	public List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();

		for(Apple apple : inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	
	public List<Apple> getGreeanApples() {
		List<Apple> greenApples = filterApples(_inventory, new AppleGreenColorPredicate());
		
		return greenApples;
	}
	
	public List<Apple> getYellowApples() {
		List<Apple> yellowApples = filterApples(_inventory, new ApplePredicate() {
			@Override
			public boolean test(Apple apple) {
				return apple.getColor().equals("yellow");
			}
		});
		
		return yellowApples;
	}
	
	public List<Apple> getLambda() {
		List<Apple> blueApples = filterApples(_inventory, (Apple apple) -> apple.getColor().equals("blue"));
		
		return blueApples;
	}
}

