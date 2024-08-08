package com.indus.training.core.domain;

import java.util.Objects;

/**
 * Represents the Output of Calci class
 */
public class CalciOutput {

	private Double param1;
	private Double param2;
	private Double result;
	private String operation;

	/**
	 * Gets the first parameter
	 * 
	 * @return the first parameter
	 */
	public Double getParam1() {
		return param1;
	}

	/**
	 * Sets the first parameter
	 * 
	 * @param param1 the first parameter to set
	 */
	public void setParam1(Double param1) {
		this.param1 = param1;
	}

	/**
	 * Gets the second parameter
	 * 
	 * @return the second parameter
	 */
	public Double getParam2() {
		return param2;
	}

	/**
	 * Sets the second parameter
	 * 
	 * @param param2 the second parameter to set
	 */
	public void setParam2(Double param2) {
		this.param2 = param2;
	}

	/**
	 * Gets the result
	 * 
	 * @return the result
	 */
	public Double getResult() {
		return result;
	}

	/**
	 * Sets the result of the calculation
	 * 
	 * @param result the result to set
	 */
	public void setResult(Double result) {
		this.result = result;
	}

	/**
	 * Gets the type of operation
	 * 
	 * @return the operation performed
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * Sets the type of operation
	 * 
	 * @param operation the operation type to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(operation, param1, param2, result);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalciOutput other = (CalciOutput) obj;
		return Objects.equals(operation, other.operation) && Objects.equals(param1, other.param1)
				&& Objects.equals(param2, other.param2) && Objects.equals(result, other.result);
	}

}
