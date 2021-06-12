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
public class VendorRegResponse {
	public String xmlns;
    @JsonProperty("CstmrDtls") 
    public CstmrDtls cstmrDtls;
}
