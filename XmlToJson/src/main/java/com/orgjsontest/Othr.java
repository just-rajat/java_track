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
public class Othr {
	@JsonProperty("SOSESts") 
    public int sOSESts;
    @JsonProperty("SOSE") 
    public String sOSE;
}
