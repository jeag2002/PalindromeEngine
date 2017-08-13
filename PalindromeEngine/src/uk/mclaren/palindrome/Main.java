package uk.mclaren.palindrome;

import uk.mclaren.palindrome.engine.PalindromeEngine;

public class Main {
	
	private PalindromeEngine pEngine;

	public Main(){
		super();
		pEngine = new PalindromeEngine();
	}
	
	
	/**
	 * 
	 * @param data
	 * @return Processing OK or Exception
	 */
	
	public int processInputData(String[] data){
		int res = 0;
		
		if (data.length == 0){
			System.out.println("WARN - Process expects one parameter!");
			System.out.println("[1] -- input char string for analysis");
		}else if (data.length >= 1){
			String inputData = data[0];
			if (inputData.length() >= 2){
				pEngine.processPalindrome(inputData);
			}else{
				System.out.println("WARN - data (" + inputData + ") have less of minimum size");
			}
		}
		
		return res;
	}
	
	/**
	 * MAIN Process. Console Palyndrome analysis
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Main main = new Main();
		int halt = 0;
		System.out.println("**************** PALYNDROME ANALYSIS [INI] *********** ");
		halt = main.processInputData(args);
		System.out.println("**************** PALYNDROME ANALYSIS [END] *********** ");
		System.exit(halt);
	
	}

}
