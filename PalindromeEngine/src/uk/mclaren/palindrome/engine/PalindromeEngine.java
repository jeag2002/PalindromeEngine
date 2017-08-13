package uk.mclaren.palindrome.engine;

import java.util.ArrayList;

import uk.mclaren.palindrome.bean.PalindromeBean;

public class PalindromeEngine {
	
	private static final int MAX_NUM_PALiNDROMES = 3;
	
	private ArrayList<PalindromeBean> palindromeAlreadyFound;
	private int numPalMax;
	
	public PalindromeEngine(){
		super();
		palindromeAlreadyFound = new ArrayList<PalindromeBean>();
		numPalMax = MAX_NUM_PALiNDROMES;
	}
	
	public PalindromeEngine(int _numPalMax){
		super();
		palindromeAlreadyFound = new ArrayList<PalindromeBean>();
		numPalMax = _numPalMax;
	}
	
	
	/**
	 * Processing input string finding palindromes
	 * @param inputData
	 */
	
	public int processPalindrome(String inputData){
		int numFounds = 0;
		
		for(int data=inputData.length(); (data >=2 && numFounds<=numPalMax); data--){
			numFounds = processPalindromeSubStr(inputData,data,numFounds);
		}
		
		palindromeAlreadyFound.clear();
		return numFounds;
	}
	
	/**
	 * Processing input string for finding unique palindromes of "size" length
	 * @param inputData string case of study
	 * @param size size of the palindromes
	 * @param numFounds number of palindromes previously found
	 * @return number of palindromes founds after processing
	 */
	
	
	public int processPalindromeSubStr(String inputData, int size, int numFounds){
		int newFounds = 0;
		
		if (numFounds < 3){
			if ((size >= 2) && (size <= inputData.length())){
					
					boolean DONE = false;
					String subdata = inputData.substring(0,size); //get the first substring
					int pos = 0;
					
					do{						
						if (isPalindrome(subdata)){ //is a palindrome?
							if (!palindromeAlreadyFound.contains(new PalindromeBean(subdata))){ //has this palindrome  been found before? 
																								//is it part of another palindrome?
								if (((newFounds+1)+numFounds) <= numPalMax){ //are there three palindromes found previously?
									System.out.println("Text: " + subdata + ", Index: " + pos + ", Length: " + size);
									newFounds++;
									palindromeAlreadyFound.add(new PalindromeBean(subdata));
								}
							}
						}
						
						//shift the string one position to the left
						inputData = inputData.substring(1);
						pos++;
						
						//is the result inputData bigger or equal size than 
						if (inputData.length() >= size){
							subdata = inputData.substring(0, size);
						}else{
							DONE = true;
						}
					
					}while(!DONE);
					
				numFounds = numFounds + newFounds;				
			}
		}
		
		return numFounds;
	}

	/**
	 * Evaluate if input String is a Palindrome or not.
	 * @param inputData
	 * @return
	 */
	
	public boolean isPalindrome(String inputData){
		boolean res = false;
		inputData = inputData.toLowerCase().replaceAll("\\W","");
		res = (inputData.equals(new StringBuffer(inputData).reverse().toString()));
		return res;
	}
	
	/**
	 * Clear all the structures
	 */
	
	public void clear(){
		numPalMax = MAX_NUM_PALiNDROMES;
		palindromeAlreadyFound.clear();
	}
	
	/**
	 * Get Max number of palindromes that the program will be able to found
	 * @return
	 */
	public int getNumPalMax() {
		return numPalMax;
	}
	
	/**
	 * Set Max number of palindromes that the program will be able to found
	 * @return
	 */

	public void setNumPalMax(int numPalMax) {
		this.numPalMax = numPalMax;
	}

}
