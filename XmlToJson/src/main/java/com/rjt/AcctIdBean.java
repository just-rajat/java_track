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
public class AcctIdBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Othr")
	public OthrBean Othr;

	public OthrBean getOthr() {
		return Othr;
	}

	public void setOthr(OthrBean othr) {
		Othr = othr;
	}

	@Override
	public String toString() {
		return "AcctIdBean [Othr=" + Othr + "]";
	}


}
