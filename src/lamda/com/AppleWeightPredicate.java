package lamda.com;

import lambda.interFace.ApplePredicate;
import lambda.type.Apple;

public class AppleWeightPredicate implements ApplePredicate {
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}
}
