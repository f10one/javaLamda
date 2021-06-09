package lamda.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;

import lambda.type.Apple;

public class processData {
	List<Apple> _inventory;
	
	public processData() {
		_inventory = Arrays.asList(
				new Apple(80, "green"),
				new Apple(155, "green"),
				new Apple(120, "red")
				);	
	}
	
	public List<Apple> filterGreenApples() {
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple : _inventory) {
			if("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	public List<Apple> filterHeavyApples() {
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple : _inventory) {
			if(apple.getWeight() > 150 ) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	
	public List<Apple> filterApples(Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple : _inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;		
	}
	
	boolean isGreeanApple(Apple apple) {return "green".equals(apple.getColor());}
	boolean isHeavyApple(Apple apple) { return apple.getWeight() > 150; }
	
	public List<Apple> filterLambda() {
		List<Apple> greenApples = filterApples((Apple apple) -> "green".equals(apple.getColor()));
		
		return greenApples;
	}
	
	public void streamRun() {
		List<Apple> greenApples = _inventory
				.stream()
				.parallel()
				.filter((Apple a) -> a.getColor().equals("green"))
				.collect(toList());
	}
	
}
