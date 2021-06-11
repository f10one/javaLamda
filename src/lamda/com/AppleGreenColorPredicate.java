package lamda.com;

import lambda.interFace.ApplePredicate;
import lambda.type.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {
	public boolean test(Apple apple) {
		return apple.getColor().equals("green");
	}
}
