package com.wangzejun.interview.exam;

import org.junit.Test;

/**
 * FunGameTest<br>
 * @author wangzejun
 *
 */
public class FunGameTest {

	/**
	 * sampleOutPut<br>
	 */
	@Test
	public void sampleOutPut() {
		FunGame funGame = new FunGame();
		funGame.sampOutput();
	}

	/**
	 * A number is Fizz if it is divisible by 3 or if it has a 3 in it<br>
	 */

	@Test
	public void countByRule1() {
		Rule rule = new Rule();
		rule.setDiviseNums(new int[] { 3 });
		rule.setContainNums(new String[] { "3" });
		rule.setResult("Fizz");
		FunGame funGame = new FunGame();
		funGame.countByRule(rule);
	}

	/**
	 * A number is Buzz if it is divisible by 5 or if it has a 5 in it<br>
	 */
	@Test
	public void countByRule2() {
		Rule rule = new Rule();
		rule.setDiviseNums(new int[] { 5 });
		rule.setContainNums(new String[] { "5" });
		rule.setResult("Buzz");
		FunGame funGame = new FunGame();
		funGame.countByRule(rule);
	}

	/**
	 * A number is Fizz Buzz if it is divisible by<br>
	 * 3 or 5 or if it has a 3 or 5 in it
	 */
	@Test
	public void countByRule3() {
		Rule rule = new Rule();
		rule.setDiviseNums(new int[] { 3,5 });
		rule.setContainNums(new String[] { "3","5" });
		rule.setResult("FizzBuzz");
		FunGame funGame = new FunGame();
		funGame.countByRule(rule);
	}

}
