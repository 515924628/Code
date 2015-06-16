package com.zpyyf.html;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;


public class JsoupTest {
	public static void main(String[] args) throws IOException {
		String dom = FileUtils.readFileToString(new File("C:\\Users\\Administrator\\Desktop\\2.txt"));
		System.out.println(dom);
		System.out.println("-----------------------------------------");
		Document document = Jsoup.parse(dom);
//		for (Element element : document.select("td")) {
//			element.attr("class", "td1");
//		}

		System.out.println(document.outerHtml());
		System.out.println("-----------------------------------------");
		System.out.println(document.toString());
	}
}
