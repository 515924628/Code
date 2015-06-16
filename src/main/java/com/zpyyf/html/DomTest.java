package com.zpyyf.html;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DomTest {
	public static void main(String[] args) throws IOException {
		Document document = DocumentHelper.createDocument();
		Element html = document.addElement("html");
		html.addElement("head")
				.addElement("title")
				.setText("dom4j");
		html.addElement("body")
				.addElement("h3")
				.setText("Hello World!");
		XMLWriter out = new XMLWriter(new FileWriter(new File("d:\\a.html")));
		out.write(document);
		out.close();


	}
}
