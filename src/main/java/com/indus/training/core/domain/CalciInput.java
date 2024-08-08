package com.indus.training.core.domain;

import java.util.Objects;

/**
 * Represents the CalciInput
 */
public class CalciInput {

	private double param1;
	private double param2;

	/**
	 * Gets the first parameter
	 * 
	 * @return the first parameter
	 */
	public double getParam1() {
		return param1;
	}

	/**
	 * Sets the first parameter
	 * 
	 * @param param1 the first parameter to set
	 */
	public void setParam1(double param1) {
		this.param1 = param1;
	}

	/**
	 * Gets the second parameter
	 * 
	 * @return the second parameter
	 */
	public double getParam2() {
		return param2;
	}

	/**
	 * Sets the second parameter
	 * 
	 * @param param2 the second parameter to set
	 */
	public void setParam2(double param2) {
		this.param2 = param2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(param1, param2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalciInput other = (CalciInput) obj;
		return Double.doubleToLongBits(param1) == Double.doubleToLongBits(other.param1)
				&& Double.doubleToLongBits(param2) == Double.doubleToLongBits(other.param2);
	}

	
}
