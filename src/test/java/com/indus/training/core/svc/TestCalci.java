package com.indus.training.core.svc;

import com.indus.training.core.domain.CalciInput;
import com.indus.training.core.domain.CalciOutput;
import com.indus.training.core.exception.CalciException;
import com.indus.training.core.impl.Calci;

import junit.framework.TestCase;

/**
 * Provides Test Cases for Calci Class
 */
public class TestCalci extends TestCase {

	private Calci calObj = null;

	protected void setUp() throws Exception {
		calObj = new Calci();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	/**
	 * Test Case for Addition
	 */
	public void testAddition() {

		// 1. Inputs
		CalciInput calInpObj = new CalciInput();
		calInpObj.setParam1(2.0);
		calInpObj.setParam2(3.0);

		// 2. Expected Result
		CalciOutput expCalOutObj = new CalciOutput();
		expCalOutObj.setParam1(2.0);
		expCalOutObj.setParam2(3.0);
		expCalOutObj.setResult(5.0);
		expCalOutObj.setOperation("Addition");

		// 3. Actual Result
		CalciOutput actCalOutObj = null;
		try {
			actCalOutObj = calObj.addition(calInpObj);
		} catch (CalciException e) {
			e.printStackTrace();
		}

		// 4. Assertion
		assertEquals(expCalOutObj, actCalOutObj);
	}

	/**
	 * Test Case for Subtraction
	 */
	public void testSubtract() {

		// 1. Inputs
		CalciInput calInpObj = new CalciInput();
		calInpObj.setParam1(4.0);
		calInpObj.setParam2(3.0);

		// 2. Expected Result
		CalciOutput expCalOutObj = new CalciOutput();
		expCalOutObj.setParam1(4.0);
		expCalOutObj.setParam2(3.0);
		expCalOutObj.setResult(1.0);
		expCalOutObj.setOperation("Subtraction");

		// 3. Actual Result
		CalciOutput actCalOutObj = null;
		try {
			actCalOutObj = calObj.subtract(calInpObj);
		} catch (CalciException e) {
			e.printStackTrace();

		}

		// 4. Assertion
		assertEquals(expCalOutObj, actCalOutObj);
	}

	/**
	 * Test Case for Multiplication
	 */
	public void testMultiply() {

		// 1. Inputs
		CalciInput calInpObj = new CalciInput();
		calInpObj.setParam1(4.0);
		calInpObj.setParam2(3.0);

		// 2. Expected Result
		CalciOutput expCalOutObj = new CalciOutput();
		expCalOutObj.setParam1(4.0);
		expCalOutObj.setParam2(3.0);
		expCalOutObj.setResult(12.0);
		expCalOutObj.setOperation("Multiplication");

		// 3. Actual Result
		CalciOutput actCalOutObj = null;
		try {
			actCalOutObj = calObj.multiply(calInpObj);
		} catch (CalciException e) {
			e.printStackTrace();
		}

		// 4. Assertion
		assertEquals(expCalOutObj, actCalOutObj);
	}

	/**
	 * Test Case for Division
	 */
	public void testDivision() {

		// 1. Inputs
		CalciInput calInpObj = new CalciInput();
		calInpObj.setParam1(4.0);
		calInpObj.setParam2(2.0);

		// 2. Expected Result
		CalciOutput expCalOutObj = new CalciOutput();
		expCalOutObj.setParam1(4.0);
		expCalOutObj.setParam2(2.0);
		expCalOutObj.setResult(2.0);
		expCalOutObj.setOperation("Division");

		// 3. Actual Result
		CalciOutput actCalOutObj = null;
		try {
			actCalOutObj = calObj.division(calInpObj);
		} catch (ArithmeticException | CalciException e) {
			e.printStackTrace();
		}

		// 4. Assertion
		assertEquals(expCalOutObj, actCalOutObj);

	}

}
