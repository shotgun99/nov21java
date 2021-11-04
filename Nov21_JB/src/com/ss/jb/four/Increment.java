package com.ss.jb.four;

public interface Increment {

	public Integer increment(Integer value);

	default Integer doubIncrement(Integer value) {
		return value + 2;
	}
}
