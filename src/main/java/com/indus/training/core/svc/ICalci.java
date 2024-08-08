package com.indus.training.core.svc;

import com.indus.training.core.domain.CalciInput;
import com.indus.training.core.domain.CalciOutput;
import com.indus.training.core.exception.CalciException;

/**
 * Interface for basic arithmetic operations
 */
public interface ICalci {

	/**
	 * Performs addition of the parameters in the provided CalciInput object.
	 *
	 * @param calInpObj the input object containing the parameters for the addition
	 * @return the result of the addition as a CalciOutput object
	 */
	public CalciOutput addition(CalciInput calInpObj) throws CalciException;

	/**
	 * Performs subtraction of the parameters in the provided CalciInput object.
	 *
	 * @param calInpObj the input object containing the parameters for the
	 *                  subtraction
	 * @return the result of the subtraction as a CalciOutput object
	 */
	public CalciOutput subtract(CalciInput calInpObj) throws CalciException;

	/**
	 * Performs multiplication of the parameters in the provided CalciInput object.
	 *
	 * @param calInpObj the input object containing the parameters for the
	 *                  multiplication
	 * @return the result of the multiplication as a CalciOutput object
	 */
	public CalciOutput multiply(CalciInput calInpObj) throws CalciException;

	/**
	 * Performs division of the parameters in the provided CalciInput object.
	 *
	 * @param calInpObj the input object containing the parameters for the division
	 * @return the result of the division as a CalciOutput object
	 */
	public CalciOutput division(CalciInput calInpObj) throws CalciException;
}
