/**
 * 
 */
package com.rjt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Rajat
 *
 */
public class CstmrTxInfBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("Cstmr") 
	public Object Cstmr;

	
	

	public Object getCstmr() {
		return Cstmr;
	}




	public void setCstmr(Object cstmr) {
		Cstmr = cstmr;
	}




	@Override
	public String toString() {
		return "CstmrTxInfBean [Cstmr=" + Cstmr + "]";
	}

	
	
}
