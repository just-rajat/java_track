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
public class CstmrDtls {
	@JsonProperty("GrpHdr") 
    public GrpHdr grpHdr;
    @JsonProperty("CstmrInf") 
    public CstmrInf cstmrInf;
}
