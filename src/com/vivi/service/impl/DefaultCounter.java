package com.vivi.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.vivi.service.Counter;

/**
 * @author huangwenwei
 *
 */
public class DefaultCounter implements Counter {

	@Override
	public Map<String, Integer> count(String str) {
		Map<String, Integer> result = new HashMap<>();
		Arrays.stream(str.split(" ")).forEach(t -> {
			Integer n = result.get(t);
			if (n == null) {
				result.put(t, 1);
			} else {
				result.put(t, ++n);
			}
		});
		return result;
	}

}
