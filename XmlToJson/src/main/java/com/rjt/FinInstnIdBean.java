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
public class FinInstnIdBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("BBNm") 
	public String BBNm;
	
	@JsonProperty("BBAN") 
	public String BBAN;
	
	@JsonProperty("AcctSts") 
	public String AcctSts;
	
	@JsonProperty("BICFI") 
	public String BICFI;
	
	@JsonProperty("BrnchId") 
	public String BrnchId;

	public String getBBNm() {
		return BBNm;
	}

	public void setBBNm(String bBNm) {
		BBNm = bBNm;
	}

	public String getBBAN() {
		return BBAN;
	}

	public void setBBAN(String bBAN) {
		BBAN = bBAN;
	}

	public String getAcctSts() {
		return AcctSts;
	}

	public void setAcctSts(String acctSts) {
		AcctSts = acctSts;
	}

	public String getBICFI() {
		return BICFI;
	}

	public void setBICFI(String bICFI) {
		BICFI = bICFI;
	}

	public String getBrnchId() {
		return BrnchId;
	}

	public void setBrnchId(String brnchId) {
		BrnchId = brnchId;
	}

	@Override
	public String toString() {
		return "FinInstnIdBean [BBNm=" + BBNm + ", BBAN=" + BBAN + ", AcctSts=" + AcctSts + ", BICFI=" + BICFI
				+ ", BrnchId=" + BrnchId + "]";
	}
	
		
	
}
