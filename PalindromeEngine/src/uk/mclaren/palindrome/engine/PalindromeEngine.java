package uk.mclaren.palindrome.engine;

import java.util.ArrayList;

import uk.mclaren.palindrome.bean.PalindromeBean;

public class PalindromeEngine {
	
	private static final int MAX_NUM_PALYNDROMES = 3;
	
	private ArrayList<PalindromeBean> palyndromeAlreadyFound;
	private int numPalMax;
	
	public PalindromeEngine(){
		super();
		palyndromeAlreadyFound = new ArrayList<PalindromeBean>();
		numPalMax = MAX_NUM_PALYNDROMES;
	}
	
	public PalindromeEngine(int _numPalMax){
		super();
		palyndromeAlreadyFound = new ArrayList<PalindromeBean>();
		numPalMax = _numPalMax;
	}
	
	
	/**
	 * Processing input string finding palyndromes
	 * @param inputData
	 */
	
	public int processPalyndrome(String inputData){
		int numFounds = 0;
		
		for(int data=inputData.length(); (data >=2 && numFounds<=numPalMax); data--){
			numFounds = processPalyndromeSubStr(inputData,data,numFounds);
		}
		
		palyndromeAlreadyFound.clear();
		return numFounds;
	}
	
	/**
	 * Processing input string for finding unique palyndromes of "size" length
	 * @param inputData string case of study
	 * @param size size of the palyndromes
	 * @param numFounds number of palyndromes previously found
	 * @return number of palyndromes founds after processing
	 */
	
	
	public int processPalyndromeSubStr(String inputData, int size, int numFounds){
		int newFounds = 0;
		
		if (numFounds < 3){
			if ((size >= 2) && (size <= inputData.length())){
					
					boolean DONE = false;
					String subdata = inputData.substring(0,size); //get the first substring
					int pos = 0;
					
					do{						
						if (isPalyndrome(subdata)){ //is a palyndrome?
							if (!palyndromeAlreadyFound.contains(new PalindromeBean(subdata))){ //has this palyndrome  been found before? 
																								//is it part of another palyndrome?
								if (((newFounds+1)+numFounds) <= numPalMax){ //are there three palyndromes found previously?
									System.out.println("Text: " + subdata + ", Index: " + pos + ", Length: " + size);
									newFounds++;
									palyndromeAlreadyFound.add(new PalindromeBean(subdata));
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
	 * Evaluate if input String is a Palyndrome or not.
	 * @param inputData
	 * @return
	 */
	
	public boolean isPalyndrome(String inputData){
		boolean res = false;
		inputData = inputData.toLowerCase().replaceAll("\\W","");
		res = (inputData.equals(new StringBuffer(inputData).reverse().toString()));
		return res;
	}
	
	/**
	 * Clear all the structures
	 */
	
	public void clear(){
		numPalMax = MAX_NUM_PALYNDROMES;
		palyndromeAlreadyFound.clear();
	}
	
	/**
	 * Get Max number of palyndromes that the program will be able to found
	 * @return
	 */
	public int getNumPalMax() {
		return numPalMax;
	}
	
	/**
	 * Set Max number of palyndromes that the program will be able to found
	 * @return
	 */

	public void setNumPalMax(int numPalMax) {
		this.numPalMax = numPalMax;
	}

}
