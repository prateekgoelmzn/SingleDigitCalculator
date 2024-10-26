package com.pg.demo;

import com.pg.demo.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	Calculator calculator;

	@Test
	void shouldCalculateExpectedValue1() {
		Assertions.assertEquals(2,calculator.calculate("1+2-1*2/2%5"));
	}

	@Test
	void shouldCalculateExpectedValue2() {
		Assertions.assertEquals(81,calculator.calculate("9+9+9+9+9+9+9+9+9"));
	}

}
