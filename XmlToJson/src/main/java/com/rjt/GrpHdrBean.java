/**
 * 
 */
package com.rjt;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Rajat
 *
 */
public class GrpHdrBean  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @JsonProperty("MsgId") 
    public String MsgId;
    @JsonProperty("CreDtTm") 
    public String CreDtTm;
    @JsonProperty("NbOfTxs") 
    public String NbOfTxs;
    @JsonProperty("Src") 
    public String Src;
    @JsonProperty("Dest") 
    public String Dest;
    @JsonProperty("GrpStsRsnInf") 
    public Object GrpStsRsnInf;
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	public String getCreDtTm() {
		return CreDtTm;
	}
	public void setCreDtTm(String creDtTm) {
		CreDtTm = creDtTm;
	}
	public String getNbOfTxs() {
		return NbOfTxs;
	}
	public void setNbOfTxs(String nbOfTxs) {
		NbOfTxs = nbOfTxs;
	}
	public String getSrc() {
		return Src;
	}
	public void setSrc(String src) {
		Src = src;
	}
	public String getDest() {
		return Dest;
	}
	public void setDest(String dest) {
		Dest = dest;
	}
	public Object getGrpStsRsnInf() {
		return GrpStsRsnInf;
	}
	public void setGrpStsRsnInf(String grpStsRsnInf) {
		GrpStsRsnInf = grpStsRsnInf;
	}
	@Override
	public String toString() {
		return "GrpHdrBean [MsgId=" + MsgId + ", CreDtTm=" + CreDtTm + ", NbOfTxs=" + NbOfTxs + ", Src=" + Src
				+ ", Dest=" + Dest + ", GrpStsRsnInf=" + GrpStsRsnInf + "]";
	}
	
    
}
