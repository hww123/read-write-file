package com.vivi.service;

import java.util.List;

/**
 * @author huangwenwei
 *
 */
public interface Result {
	
	List<FileParse> getFileParses();

	FileParse addFileParse(FileParse fileParse);
	
}
