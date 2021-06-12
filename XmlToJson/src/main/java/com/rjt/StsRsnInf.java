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
public class StsRsnInf implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Rsn")
	public Rsn Rsn;

	public Rsn getRsn() {
		return Rsn;
	}

	public void setRsn(Rsn rsn) {
		Rsn = rsn;
	}

	@Override
	public String toString() {
		return "StsRsnInf [Rsn=" + Rsn + "]";
	}
	
	

}
