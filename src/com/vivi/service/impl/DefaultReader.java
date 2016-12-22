package com.vivi.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.vivi.service.Counter;
import com.vivi.service.FileParse;
import com.vivi.service.Reader;
import com.vivi.service.Result;
import com.vivi.service.Parser;

/**
 * @author huangwenwei
 *
 */
public class DefaultReader implements Reader {
	
	private Counter counter = new DefaultCounter();
	
	private Parser parser = new DefaultParser();
	
	private Result result = new DefaultResult();
	
	public void setCounter(Counter counter) {
		this.counter = counter;
	}

	@Override
	public Result read(String path) {
		read(new File(path));
		return result;
	}

	private void read(File file) {
		File[] files = file.listFiles();	
		for (File sub : files) {
			if (sub.exists() && sub.isDirectory()) {
				read(sub);
			} else {
				addFileParse(sub.getName(), counter.count(parser.parse(sub)));
			}
		}
	}

	private void addFileParse(String fileName, Map<String, Integer> counts) {
		counts.keySet().stream().forEach(t -> {
			FileParse fileParse = new FileParse();
			fileParse.setFileName(fileName);
			fileParse.setKeyWord(t);
			fileParse.setCount(counts.get(t));
			result.addFileParse(fileParse);
		});
	}
	
}
