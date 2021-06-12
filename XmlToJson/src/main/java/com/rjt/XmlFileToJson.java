package com.rjt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
public class XmlFileToJson
{
    public static void main(String[] args)
    {
        String data = "";
        try
        {
            
            // Read the student.xml
            data = FileUtils.readFileToString(new File("C:\\Users\\Rajat\\Downloads\\test.xml"), "UTF-8");
            
            // Create a new XmlMapper to read XML tags
            XmlMapper xmlMapper = new XmlMapper();
            
            VendorRegResponse oVendorRegResponse2 = xmlMapper.readValue(data, VendorRegResponse.class);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(oVendorRegResponse2);
            System.out.println("===start===");
            System.out.println(json);
            System.out.println("===end===");
            
            
            //Reading the XML
            JsonNode jsonNode = xmlMapper.readTree(data.getBytes());
            
            //Create a new ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            
            String value = objectMapper.writeValueAsString(jsonNode);;
            //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
           // objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            System.out.println("*** Converting XML to JSON ***");
            System.out.println(value);
//            GsonBuilder gsonBuilder = new GsonBuilder();
//			Gson gson = gsonBuilder.create();
//			 VendorRegResponse oVendorRegResponse=gson.fromJson(value, VendorRegResponse.class);
            /////////////////////////////////////////////////
            ObjectMapper objectMapper2 = new ObjectMapper();
            
            VendorRegResponse oVendorRegResponse=objectMapper2.readValue(value, VendorRegResponse.class);
            System.out.println(oVendorRegResponse);
            System.out.println("*** CstmrDtls***");
            System.out.println(oVendorRegResponse.getCstmrDtls());
            System.out.println("*** GrpHdr***");
            System.out.println(oVendorRegResponse.getCstmrDtls().getGrpHdr());
            System.out.println("*** CstmrInf***");
            System.out.println(oVendorRegResponse.getCstmrDtls().getCstmrInf());
            System.out.println("*** CstmrInf===>CstmrTxInf ***");
            System.out.println(oVendorRegResponse.getCstmrDtls().getCstmrInf().getCstmrTxInf());
            System.out.println("*** CstmrInf===>CstmrTxInf===>Cstmr ***");
            System.out.println(oVendorRegResponse.getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr());
            System.out.println("\"*** CstmrInf===>CstmrTxInf===>Cstmr ***\" Size:->"+oVendorRegResponse.getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().toString());
            System.out.println("*** CstmrInf===>CstmrTxInf===>Cstmr==>Prtry ***");
//            System.out.println(oVendorRegResponse.getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(0).getPrtry());
//            System.out.println("*** CstmrInf===>CstmrTxInf===>Cstmr==>CstmrAcct ***");
//            System.out.println(oVendorRegResponse.getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(0).getCstmrAcct());
//            System.out.println("*** CstmrInf===>CstmrTxInf===>Cstmr==>CstmrAcct==>AcctId ***");
//            System.out.println(oVendorRegResponse.getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(0).getCstmrAcct().getAcctId());
//            System.out.println("*** CstmrInf===>CstmrTxInf===>Cstmr==>CstmrAcct==>AcctId==>Othr ***");
//            System.out.println(oVendorRegResponse.getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(0).getCstmrAcct().getAcctId().getOthr());
//            System.out.println("*** CstmrInf===>CstmrTxInf===>Cstmr==>CstmrAgt ***");
//            System.out.println(oVendorRegResponse.getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(0).getCstmrAgt());
//            System.out.println("*** CstmrInf===>CstmrTxInf===>Cstmr==>CstmrAgt==>FinInstnId ***");
//            System.out.println(oVendorRegResponse.getCstmrDtls().getCstmrInf().getCstmrTxInf().getCstmr().get(0).getCstmrAgt().getFinInstnId());

        } catch (JsonParseException e)
        {
            e.printStackTrace();
        } catch (JsonMappingException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}