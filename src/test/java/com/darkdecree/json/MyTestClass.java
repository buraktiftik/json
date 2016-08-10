package com.darkdecree.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.darkdecree.GoEuroTest.json.JSONReader;

public class MyTestClass {
	
	
	
	
	@Test
	public void testBerlinValues0(){
		JSONReader myJSONReader=new JSONReader();
		
		assertEquals(Integer.toString(376217),myJSONReader.readJSON("berlin").get(0)[0]);
		assertEquals("Berlin",myJSONReader.readJSON("berlin").get(0)[1]);
		assertEquals("location",myJSONReader.readJSON("berlin").get(0)[2]);
		assertEquals(Double.toString(52.52437),myJSONReader.readJSON("berlin").get(0)[3]);
		assertEquals(Double.toString(13.41053),myJSONReader.readJSON("berlin").get(0)[4]);
	}
	
	@Test
	public void testBerlinValues7(){
		JSONReader myJSONReader=new JSONReader();
		
		assertEquals(Integer.toString(333977),myJSONReader.readJSON("berlin").get(7)[0]);
		assertEquals("Berlin Ostbahnhof",myJSONReader.readJSON("berlin").get(7)[1]);
		assertEquals("station",myJSONReader.readJSON("berlin").get(7)[2]);
		assertEquals(Double.toString(52.510972),myJSONReader.readJSON("berlin").get(7)[3]);
		assertEquals(Double.toString(13.434567),myJSONReader.readJSON("berlin").get(7)[4]);
	}
	
	
	@Test
	public void testIstanbulValues0(){
		JSONReader myJSONReader=new JSONReader();
		
		assertEquals(Integer.toString(407183),myJSONReader.readJSON("istanbul").get(0)[0]);
		assertEquals("Istanbul",myJSONReader.readJSON("istanbul").get(0)[1]);
		assertEquals("location",myJSONReader.readJSON("istanbul").get(0)[2]);
		assertEquals(Double.toString(41.01384),myJSONReader.readJSON("istanbul").get(0)[3]);
		assertEquals(Double.toString(28.94966),myJSONReader.readJSON("istanbul").get(0)[4]);
	}
	
	
	
	@Test
	public void testIstanbulValues1(){
		JSONReader myJSONReader=new JSONReader();
		
		assertEquals(Integer.toString(314059),myJSONReader.readJSON("istanbul").get(1)[0]);
		assertEquals("Istanbul",myJSONReader.readJSON("istanbul").get(1)[1]);
		assertEquals("airport",myJSONReader.readJSON("istanbul").get(1)[2]);
		assertEquals(Double.toString(40.97667),myJSONReader.readJSON("istanbul").get(1)[3]);
		assertEquals(Double.toString(28.81528),myJSONReader.readJSON("istanbul").get(1)[4]);
	}
	
	
}
