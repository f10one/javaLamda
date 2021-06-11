package lamda.com;

import lambda.type.Apple;

public class functionInterface {

	public static void main(String[] args) {
		processData pd = new processData();
		
		for(Apple apple : pd.streamRun()) {
			System.out.println("Color is " + apple.getColor() + " and weight is " + apple.getWeight());
		}
		
		System.out.println("======================================");
		
		ActionParameter ap = new ActionParameter();
		for(Apple apple : ap.getGreeanApples()) {
			System.out.println("Color is " + apple.getColor() + " and weight is " + apple.getWeight());
		}
		
		System.out.println("======================================");
		
		for(Apple apple : ap.getYellowApples()) {
			System.out.println("Color is " + apple.getColor() + " and weight is " + apple.getWeight());
		}
		
		
	}
}
