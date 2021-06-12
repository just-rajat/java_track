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
public class CstmrAgt {
	@JsonProperty("FinInstnId") 
    public FinInstnId finInstnId;
}
