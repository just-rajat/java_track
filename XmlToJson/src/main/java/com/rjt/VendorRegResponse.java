/**
 * 
 */
package com.rjt;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * @author Rajat
 *
 */
public class VendorRegResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	@JsonProperty("CstmrDtls") 
    public CstmrDtlsBean CstmrDtls;
	
	public CstmrDtlsBean getCstmrDtls() {
		return CstmrDtls;
	}
	public void setCstmrDtls(CstmrDtlsBean cstmrDtls) {
		CstmrDtls = cstmrDtls;
	}
	@Override
	public String toString() {
		return "VendorRegResponse [CstmrDtls=" + CstmrDtls + "]";
	}

}
