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

public class CstmrDtlsBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("GrpHdr") 
	public GrpHdrBean GrpHdr;
	
	@JsonProperty("CstmrInf") 
	public CstmrInfBean CstmrInf;

	public GrpHdrBean getGrpHdr() {
		return GrpHdr;
	}

	public void setGrpHdr(GrpHdrBean grpHdr) {
		GrpHdr = grpHdr;
	}
	
	

	public CstmrInfBean getCstmrInf() {
		return CstmrInf;
	}

	public void setCstmrInf(CstmrInfBean cstmrInf) {
		CstmrInf = cstmrInf;
	}

	@Override
	public String toString() {
		return "CstmrDtlsBean [GrpHdr=" + GrpHdr + "]";
	}

}
