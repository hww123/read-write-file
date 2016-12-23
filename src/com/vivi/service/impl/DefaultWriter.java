package com.vivi.service.impl;

import java.util.List;

import com.vivi.service.FileParse;
import com.vivi.service.Parser;
import com.vivi.service.Writer;

public class DefaultWriter implements Writer {
	
	private Parser parser = new DefaultParser();

	@Override
	public void writer(List<FileParse> fileParses, String path) {
		parser.write(fileParses, path);
	}

}
