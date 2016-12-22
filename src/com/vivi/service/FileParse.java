package com.vivi.service;

public class FileParse {

	String fileName;
	String keyWord;
	Integer count;
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	
	public Integer getCount() {
		return count;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String getKeyWord() {
		return keyWord;
	}
	
	@Override
	public String toString() {
		return "{ fileName: " + this.getFileName() + 
				", keyWord: " + this.getKeyWord() + 
				", count: " + this.getCount() +  
		"}";
	}
}
