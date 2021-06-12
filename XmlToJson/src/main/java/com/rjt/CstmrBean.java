/**
 * 
 */
package com.rjt;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Rajat
 *
 */
@JsonDeserialize
public class CstmrBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Prtry") 
	public PrtryBean Prtry;
    
	@JsonProperty("CstmrSts") 
	public String CstmrSts;
	
	@JsonProperty("CtsRsnInf") 
	public String CtsRsnInf;
	
	@JsonProperty("StsRsnInf") 
	public StsRsnInf StsRsnInf;
	
	@JsonProperty("PFMSId") 
	public String PFMSId;
	
	@JsonProperty("CstmrAcct") 
	public CstmrAcctBean CstmrAcct;
	
	@JsonProperty("CstmrAgt")
	public CstmrAgtBean CstmrAgt;

	public PrtryBean getPrtry() {
		return Prtry;
	}

	public void setPrtry(PrtryBean prtry) {
		Prtry = prtry;
	}

	public String getCstmrSts() {
		return CstmrSts;
	}

	public void setCstmrSts(String cstmrSts) {
		CstmrSts = cstmrSts;
	}

	public String getCtsRsnInf() {
		return CtsRsnInf;
	}

	public void setCtsRsnInf(String ctsRsnInf) {
		CtsRsnInf = ctsRsnInf;
	}

	

	public StsRsnInf getStsRsnInf() {
		return StsRsnInf;
	}

	public void setStsRsnInf(StsRsnInf stsRsnInf) {
		StsRsnInf = stsRsnInf;
	}

	public String getPFMSId() {
		return PFMSId;
	}

	public void setPFMSId(String pFMSId) {
		PFMSId = pFMSId;
	}

	public CstmrAcctBean getCstmrAcct() {
		return CstmrAcct;
	}

	public void setCstmrAcct(CstmrAcctBean cstmrAcct) {
		CstmrAcct = cstmrAcct;
	}

	public CstmrAgtBean getCstmrAgt() {
		return CstmrAgt;
	}

	public void setCstmrAgt(CstmrAgtBean cstmrAgt) {
		CstmrAgt = cstmrAgt;
	}

	@Override
	public String toString() {
		return "CstmrBean [Prtry=" + Prtry + ", CstmrSts=" + CstmrSts + ", CtsRsnInf=" + CtsRsnInf + ", StsRsnInf="
				+ StsRsnInf + ", PFMSId=" + PFMSId + ", CstmrAcct=" + CstmrAcct + ", CstmrAgt=" + CstmrAgt + "]";
	}

	
	
	
		

}
