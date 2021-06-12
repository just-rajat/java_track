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
public class FinInstnId {
	@JsonProperty("BBNm") 
    public String bBNm;
    @JsonProperty("BBAN") 
    public String bBAN;
    @JsonProperty("AcctSts") 
    public String acctSts;
    @JsonProperty("BICFI") 
    public String bICFI;
    @JsonProperty("BrnchId") 
    public String brnchId;
}
