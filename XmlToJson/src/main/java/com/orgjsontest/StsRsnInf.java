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
public class StsRsnInf {
	@JsonProperty("Rsn") 
    public Rsn rsn;
}
