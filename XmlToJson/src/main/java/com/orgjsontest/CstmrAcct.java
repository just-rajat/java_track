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
public class CstmrAcct {
	@JsonProperty("AcctId")
	public AcctId acctId;
}
