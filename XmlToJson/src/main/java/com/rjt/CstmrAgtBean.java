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
public class CstmrAgtBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("FinInstnId") 
	public FinInstnIdBean FinInstnId;

	public FinInstnIdBean getFinInstnId() {
		return FinInstnId;
	}

	public void setFinInstnId(FinInstnIdBean finInstnId) {
		FinInstnId = finInstnId;
	}

	@Override
	public String toString() {
		return "CstmrAgtBean [FinInstnId=" + FinInstnId + "]";
	}


}
