/**
 * 
 */
package com.rjt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.*;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Rajat
 *
 */
public class ConvertXML {

	public static String xml = "<?xml version=\"1.0\" ?><root><test       attribute=\"text1\">javatpoint</test><test attribute=\"text2\">JTP</test></root>";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String data = "";
		try {
			  data = FileUtils.readFileToString(new File("C:\\Users\\Rajat\\Downloads\\test.xml"), "UTF-8");
			JSONObject json = XML.toJSONObject(data);
			String jsonString = json.toString(4);
			System.out.println(jsonString);
			//Create a new ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            VendorRegResponse oVendorRegResponse=objectMapper.readValue(jsonString, VendorRegResponse.class);
            System.out.println(oVendorRegResponse);
		} catch (JSONException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}