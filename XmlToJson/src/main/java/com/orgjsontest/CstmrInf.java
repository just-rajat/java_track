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
public class CstmrInf {
	@JsonProperty("CstmrTxInf")
	public CstmrTxInf cstmrTxInf;
	@JsonProperty("CstmrInfId")
	public String cstmrInfId;
	@JsonProperty("CstmrInfDt")
	public String cstmrInfDt;
}
