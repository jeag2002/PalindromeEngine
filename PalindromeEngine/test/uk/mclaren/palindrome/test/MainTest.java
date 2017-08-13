package uk.mclaren.palindrome.test;

import org.junit.Test;

import uk.mclaren.palindrome.Main;

import static org.junit.Assert.assertEquals;

public class MainTest {
	
	private Main main;
	
	public MainTest(){
		main = new Main();	
	}
	
	@Test
	public void inputParameterTest(){
		try{
			String data[] = {};
			int response = main.processInputData(data);
			assertEquals("main_1", 0, response);
			
			String data_1[] = {"a"};
			response = main.processInputData(data_1);
			assertEquals("main_1", 0, response);
			
			String data_2[] = {"sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop"};
			response = main.processInputData(data_2);
			assertEquals("main_1", 0, response);
			
			
		}catch(Exception e){
		}
		
		
	}
	
	

}
