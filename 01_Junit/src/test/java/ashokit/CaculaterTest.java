package ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ashokit.bean.Caculator;

public class CaculaterTest {
	@Test
public void addTest() {
	Caculator c = new Caculator();
	int result = c.add(20, 40);
	
	assertEquals(60, result);
}
}
