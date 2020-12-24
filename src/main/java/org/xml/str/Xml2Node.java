package org.xml.str;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Xml2Node {

	File xmlFile ;
	
	
	
	
	public static void main(String[] args) throws Exception, IOException {
		Xml2Node xyz = new Xml2Node();
		System.out.println("-----------------------------");

		if (xyz.replaceXmlNode("DEEPKEY", "src/main/resources/xmlDump.xml", "updateFrom")) {
			System.out.println("-------Done------");
		}
	}

	private Transformer updateFile(String xmlPath,Document doc) {
		Transformer transformer = null;
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			
			
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer = transformerFactory.newTransformer();
			
			FileWriter writer = new FileWriter(new File(xmlPath));
			StreamResult result = new StreamResult(writer);
			transformer.transform(source, result);
			
		} catch (IOException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transformer;
	}
	
	/**
	 * 
	 * @param nodeName
	 * @param xmlPath
	 * @param content
	 * @return
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws TransformerException
	 * @throws SAXException
	 */
	public boolean replaceXmlNode(String nodeName, String xmlPath, String content)
			throws ParserConfigurationException, IOException, TransformerException, SAXException {

		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setIgnoringComments(true);
		dbFactory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		

		NodeList nodelist = doc.getElementsByTagName(nodeName);
//		doc.getDocumentElement().normalize();
//		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

		if (nodelist.getLength() == 0) {

			// append new node to root node if not found
			NodeList nl = doc.getElementsByTagName("params"); // rootnode --> params 
			Element rootElm = (Element) nl.item(0);
			Element newElement = doc.createElement(nodeName);
			newElement.setTextContent(content);
			rootElm.appendChild(newElement);

			
			updateFile(xmlPath, doc);
			return true;
		}
		
		for (int i = 0; i < nodelist.getLength(); i++) {
			Node choosedNode = nodelist.item(i);
			if (choosedNode != null) {
				if (choosedNode.getNodeType() == Node.ELEMENT_NODE) {
//					Element elem = (Element) choosedNode;
					choosedNode.setTextContent(content);
					System.out.println(choosedNode.getTextContent());
				}

			} else {

				return false;
			}

		}

		updateFile(xmlPath, doc);
		return true;

	}

}
