package uk.mclaren.palyndrome.test;

import org.junit.Test;

import uk.mclaren.palindrome.engine.PalindromeEngine;

import static org.junit.Assert.assertEquals;

public class PalyndromeEngineTest {
	
	private PalindromeEngine pE;
	
	public PalyndromeEngineTest(){
		pE = new PalindromeEngine();
	}
	
	@Test
	public void isPalyndromeTest(){
		try{
			boolean isPalyndrome = pE.isPalyndrome("ab");
			assertEquals("is palyndrome \"ab\"", false, isPalyndrome);
			
			isPalyndrome = pE.isPalyndrome("abA");
			assertEquals("is palyndrome \"abA\"", true, isPalyndrome);
			
			isPalyndrome = pE.isPalyndrome("aba");
			assertEquals("is palyndrome \"aba\"", true, isPalyndrome);
			
			isPalyndrome = pE.isPalyndrome("ab22a");
			assertEquals("is palyndrome \"ab22a\"", false, isPalyndrome);
			
			isPalyndrome = pE.isPalyndrome("ab a");
			assertEquals("is palyndrome \"ab a\"", true, isPalyndrome);
			
			isPalyndrome = pE.isPalyndrome("aba22");
			assertEquals("is palyndrome \"aba22\"", false, isPalyndrome);
			
		}catch(Exception e){
		}
	}
	
	@Test
	public void findPalyndromesOfXSize(){
		try{
			
			int palyndromesFound = pE.processPalyndromeSubStr("aabbcc", 2, 0); 
			assertEquals("pal founds \"aabbcc\" size 2", 3, palyndromesFound);
			pE.clear();
			
			palyndromesFound = pE.processPalyndromeSubStr("aabbcc", 3, 0); 
			assertEquals("pal founds \"aabbcc\" size 3", 0, palyndromesFound);
			pE.clear();
			
			palyndromesFound = pE.processPalyndromeSubStr("abbabc", 4, 0); 
			assertEquals("pal founds \"abbabc\" size 1", 1, palyndromesFound);
			pE.clear();
			
			palyndromesFound = pE.processPalyndromeSubStr("aabbaaccddcc", 6, 0); 
			assertEquals("pal founds \"aabbaaccddcc\" size 1", 2, palyndromesFound);
			pE.clear();
			
			palyndromesFound = pE.processPalyndromeSubStr("aabbaaccddcc", 4, 0); 
			assertEquals("pal founds \"aabbaaccddcc\" size 1", 2, palyndromesFound);
			pE.clear();
			
		}catch(Exception e){
			
		}
	}
	
	@Test
	public void findPalyndromesOfAnySize(){
		try{
			int palyndromeFound = pE.processPalyndrome("aabbcc");
			assertEquals("pal founds \"aabbcc\" size 2", 3, palyndromeFound);
			
			palyndromeFound = pE.processPalyndrome("abbabc"); 
			assertEquals("pal founds \"abbabc\" size 1", 2, palyndromeFound);
			
			palyndromeFound = pE.processPalyndrome("aabbaaccddcc"); 
			assertEquals("pal founds \"aabbaaccddcc\" size 1", 2, palyndromeFound);
			pE.clear();
			
		}catch(Exception e){
			
		}
	}

}
