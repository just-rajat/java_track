/**
 * 
 */
package com.rjt;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Rajat
 *
 */
public class CstmrInfBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("CstmrInfId") 
	public String CstmrInfId;
	
	@JsonProperty("CstmrInfDt") 
	public Date CstmrInfDt;
	
	@JsonProperty("CstmrTxInf") 
	public CstmrTxInfBean CstmrTxInf;

	public String getCstmrInfId() {
		return CstmrInfId;
	}

	public void setCstmrInfId(String cstmrInfId) {
		CstmrInfId = cstmrInfId;
	}

	public Date getCstmrInfDt() {
		return CstmrInfDt;
	}

	public void setCstmrInfDt(Date cstmrInfDt) {
		CstmrInfDt = cstmrInfDt;
	}

	public CstmrTxInfBean getCstmrTxInf() {
		return CstmrTxInf;
	}

	public void setCstmrTxInf(CstmrTxInfBean cstmrTxInf) {
		CstmrTxInf = cstmrTxInf;
	}

	@Override
	public String toString() {
		return "CstmrInfBean [CstmrInfId=" + CstmrInfId + ", CstmrInfDt=" + CstmrInfDt + ", CstmrTxInf=" + CstmrTxInf
				+ "]";
	}
	
	
	
}
