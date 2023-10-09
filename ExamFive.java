package Exam;

import org.testng.annotations.Test;

public class ExamFive {
	@Test(groups ={"smoke"})
	public void testCase1() {
		System.out.println("smoke test1");
		
	}
	@Test(groups ={"smoke","regression"})
	public void testCase2() {
		System.out.println("smoke test2");
	}
	@Test(groups ={"login"})
	public void testCase3(){
		System.out.println("smoke test3");
	}
}
