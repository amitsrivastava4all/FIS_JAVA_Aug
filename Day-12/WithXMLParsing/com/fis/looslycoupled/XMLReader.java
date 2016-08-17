package com.fis.looslycoupled;



import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReader {

	
	public static ClassDTO readXML() throws ParserConfigurationException, SAXException, IOException{
	ClassDTO classDTO = null;
	// Step - 1 Specify the XML File Path
	File inputFile = new File("src/classes.xml");
	// Step - 2 Create the XML Parser Factory Object
	DocumentBuilderFactory factory =
			DocumentBuilderFactory.newInstance();
	// Step -3 DocumentBuilder class is used to parse the XML File
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("class");
	         for (int temp = 0; temp < nList.getLength(); temp++) {

	     		Node nNode = nList.item(temp);

	     		//System.out.println("\nCurrent Element :" + nNode.getNodeName());

	     		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

	     			Element eElement = (Element) nNode;
	     			classDTO = new ClassDTO();
	     			classDTO.setClassName(eElement.getElementsByTagName("name").item(0).getTextContent());
	     			classDTO.setMethodName(eElement.getElementsByTagName("method").item(0).getTextContent());
	     			//System.out.println("ClassDTO is "+classDTO);

	     		}
	     	}
	         return classDTO;
}
public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	XMLReader.readXML();
}
}
