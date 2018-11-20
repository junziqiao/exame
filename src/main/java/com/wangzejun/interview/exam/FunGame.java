package com.wangzejun.interview.exam;

/**
 * Hello world!
 *
 */
public class FunGame {

	private static final String threeContent = "Buzz";

	private static final String fourContent = "Fizz";

	private static final String fourThreeContent = "BuzzFizz";


	public  void sampOutput() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(fourThreeContent);
			} else if (i % 3 == 0) {
				System.out.println(threeContent);
			} else if (i % 5 == 0) {
				System.out.println(fourContent);
			} else {
				System.out.println(i);
			}
		}
	}

	public  void countByRule(Rule rule) {
		for (int i = 1; i <= 100; i++) {
			boolean resultFlag1 = false;
			boolean resultFlag2 = false;
			if (rule.isOkDiviseNums()) {
				for (int j = 0; j < rule.getDiviseNums().length; j++) {
					resultFlag1 = i % (rule.getDiviseNums()[j]) == 0;
					if (!resultFlag1) {
						break;
					}
				}
			}

			if (rule.isOkContainNums()) {
				for (int k = 0; k < rule.getContainNums().length; k++) {
					resultFlag2 = (i + "").contains(rule.getContainNums()[k]);
					if (!resultFlag1) {
						break;
					}
				}
			}

			if (resultFlag1 || resultFlag2) {
				System.out.println(rule.getResult());
			}else{
				System.out.println(i);
			}

		}
	}

}
