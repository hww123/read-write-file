package com.vivi.service;

import java.io.File;
import java.util.List;

/**
 * @author huangwenwei
 *
 */
public interface Parser {
	
	String parse(File file);

	void write(List<FileParse> fileParses, String path);
}
