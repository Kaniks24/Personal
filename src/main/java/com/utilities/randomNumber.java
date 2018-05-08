package com.utilities;

import java.util.Random;

public class randomNumber {
	public int gen() {
		Random r = new Random(System.currentTimeMillis());
		return 100000 + r.nextInt(200000);
	}

}
