package com.orgjsontest;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	   public static void main(String args[]) {
	    	
		   String data = "";
			try {
				data = FileUtils.readFileToString(new File("0077VENREGREQ31052021013_01062021161902.xml"), "UTF-8");
				JSONObject json = XML.toJSONObject(data);
				String jsonString = json.toString(4);
				System.out.println(jsonString);
			
	            ObjectMapper om = new ObjectMapper();
	          //  Root root = om.readValue(new File("test-json.json"), Root.class);
	            Root root =om.readValue(jsonString,  Root.class);
	           // System.out.println(root);
	            System.out.println(root.getVendorRegResponse().getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().size());
	            System.out.println(root.getVendorRegResponse().getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(0));
	            System.out.println("=========");
	           System.out.println(root.getVendorRegResponse().getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(0).getStsRsnInf());
	           if(root.getVendorRegResponse().getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(0).getCstmrSts().equalsIgnoreCase("RJCT")) {
	        	   StsRsnInf ob1 = om.convertValue(root.getVendorRegResponse().getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(1129).getStsRsnInf(),StsRsnInf.class);
		           System.out.println(ob1.getRsn().getCd());
		           System.out.println("========="); 
	           }
	         
	            //System.out.println(oStsRsnInf.keySet());
	           // Set<Rsn> keys = oStsRsnInf.keySet();
	           // System.out.println("========="+keys);
	         // printing the elements of LinkedHashMap
//	            for (Rsn key : keys) {
//	                System.out.println(key.cd);
//	            }
//	            
	           //1100
	           //one by one 
	           
	           //data base 
	           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
