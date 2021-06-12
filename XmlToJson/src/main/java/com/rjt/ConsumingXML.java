/**
 * 
 */
package com.rjt;

import java.io.FileInputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * @author Rajat
 *
 */
public class ConsumingXML {

	public static void main(String arr[]) {
		try {
			XMLInputFactory f = XMLInputFactory.newInstance();
			XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream("C:\\Users\\Rajat\\Downloads\\test.xml"));

			XmlMapper mapper = new XmlMapper();
			//sr.next(); // to point to <root>
			//sr.next(); // to point to root-element under root
			VendorRegResponse employee = mapper.readValue(sr, VendorRegResponse.class);
			sr.close();
			System.out.println(employee);
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			}
}
