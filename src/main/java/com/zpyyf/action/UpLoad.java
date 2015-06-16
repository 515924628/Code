package com.zpyyf.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.*;

public class UpLoad extends ActionSupport {
	private File file;
	private String fileFileName;
	private String fileContentType;

	@Override
	public String execute() throws Exception {
		File uploadFile = new File("D:\\uploadfile");
		if (!uploadFile.exists()) {
			if (!uploadFile.mkdir()) {
				throw new Exception();
			}
		}

		FileUtils.copyFile(file, new File(uploadFile, fileFileName));
		return SUCCESS;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
}
