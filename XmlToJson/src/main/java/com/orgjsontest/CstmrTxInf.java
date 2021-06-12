/**
 * 
 */
package com.orgjsontest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Rajat
 *
 */
@Data
public class CstmrTxInf {
	@JsonProperty("Cstmr") 
    public List<Cstmr> cstmr;
}
