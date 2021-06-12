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
public class OthrBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("SOSE")
	public String SOSE;
	
	@JsonProperty("SOSESts")
	public String SOSESts;
	
	
	public String getSOSE() {
		return SOSE;
	}
	public void setSOSE(String sOSE) {
		SOSE = sOSE;
	}
	public String getSOSESts() {
		return SOSESts;
	}
	public void setSOSESts(String sOSESts) {
		SOSESts = sOSESts;
	}
	@Override
	public String toString() {
		return "OthrBean [SOSE=" + SOSE + ", SOSESts=" + SOSESts + "]";
	}
	
	
	
}
