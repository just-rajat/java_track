/**
 * 
 */
package com.rjt;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Rajat
 *
 */
public class Rsn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Cd")
	public String Cd;

	public String getCd() {
		return Cd;
	}

	public void setCd(String cd) {
		Cd = cd;
	}

	@Override
	public String toString() {
		return "Rsn [Cd=" + Cd + "]";
	}
	
	

}
