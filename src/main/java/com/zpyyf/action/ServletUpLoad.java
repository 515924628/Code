package com.zpyyf.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ServletUpLoad extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		InputStream in = req.getInputStream();
		File f = new File("d:\\uploadfile\\a.txt");
		FileOutputStream fos = new FileOutputStream(f);
		byte[] b = new byte[1024];
		int n;
		while ((n = in.read(b)) != -1) {
			fos.write(b,0,n);
		}
		fos.close();
		in.close();
	}
}
