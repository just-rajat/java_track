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
public class Rsn {
	@JsonProperty("Cd")
	public String cd;
	
	@JsonProperty("AddtlInf")
	public String AddtlInf;
}
