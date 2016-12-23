package com.vivi.demo;

import com.vivi.service.Reader;
import com.vivi.service.Result;
import com.vivi.service.Writer;
import com.vivi.service.impl.DefaultReader;
import com.vivi.service.impl.DefaultWriter;

public class Demo {
	
	public static void main(String[] args) {
		Reader reader = new DefaultReader();
		Result result = reader.read("/Users/huangwenwei/vivi_project/file_test_demo");
		result.getFileParses().forEach(t -> {
			System.out.println(t);
		});
		Writer writer = new DefaultWriter();
		writer.writer(result.getFileParses(), "/Users/huangwenwei/vivi_project/file_test_demo/result.txt");
	}

}
