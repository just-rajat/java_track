/**
 * 
 */
package com.orgjsontest;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Rajat
 *
 */
@Data
public class Cstmr {
	@JsonProperty("CstmrAcct")
	public CstmrAcct cstmrAcct;
	@JsonProperty("Prtry")
	public Prtry prtry;
	@JsonProperty("PFMSId")
	public String pFMSId;
	@JsonProperty("CstmrAgt")
	public CstmrAgt cstmrAgt;
	@JsonProperty("CstmrSts")
	public String cstmrSts;
	 @JsonProperty("StsRsnInf") 
	 public Object stsRsnInf;
}
