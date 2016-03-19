package st;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class main {
	public tri t;
	@Before
	public void create(){
		t = new tri();
	}
	
	@Test
	public void Test(){
		
		assertEquals("equilateral",t.judgement(1,1,1));
		
		assertEquals("isosceles",t.judgement(1,2,2));
		
		assertEquals("isosceles",t.judgement(2,1,2));
		
		assertEquals("Not a triangle",t.judgement(1,2,3));
		
		assertEquals("scalene",t.judgement(3,4,5));
		
	}
}
