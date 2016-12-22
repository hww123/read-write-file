package com.vivi.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.vivi.service.FileParse;
import com.vivi.service.Result;

public class DefaultResult implements Result {
	
	private List<FileParse> fileParses = new ArrayList<>();
	

	@Override
	public List<FileParse> getFileParses() {
		return this.fileParses;
	}

	@Override
	public FileParse addFileParse(FileParse fileParse) {
		fileParses.add(fileParse);
		return fileParse;
	}

}
