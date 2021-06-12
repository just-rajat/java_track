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
public class CstmrAcctBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("AcctId")
	public AcctIdBean AcctId;

	public AcctIdBean getAcctId() {
		return AcctId;
	}

	public void setAcctId(AcctIdBean acctId) {
		AcctId = acctId;
	}

	@Override
	public String toString() {
		return "CstmrAcctBean [AcctId=" + AcctId + "]";
	}


}
