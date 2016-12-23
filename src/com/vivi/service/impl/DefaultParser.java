package com.vivi.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.vivi.service.FileParse;
import com.vivi.service.Parser;

public class DefaultParser implements Parser {

	@Override
	public String parse(File file) {
		BufferedReader br = null;
		StringBuffer sb = null;
		try {
			br = new BufferedReader(new FileReader(file));
			sb = new StringBuffer();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}

	@Override
	public void write(List<FileParse> fileParses, String path) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(path));
			for (FileParse fileParse : fileParses) {
				bw.write(fileParse.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
