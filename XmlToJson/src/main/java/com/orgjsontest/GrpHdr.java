/**
 * 
 */
package com.orgjsontest;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Rajat
 *
 */
@Data
public class GrpHdr {
	@JsonProperty("Dest")
	public String dest;
	@JsonProperty("Src")
	public String src;
	@JsonProperty("CreDtTm")
	public Date creDtTm;
	@JsonProperty("GrpStsRsnInf")
	public String grpStsRsnInf;
	@JsonProperty("NbOfTxs")
	public int nbOfTxs;
	@JsonProperty("MsgId")
	public String msgId;
}
