package uk.mclaren.palindrome.test;

import org.junit.Test;

import uk.mclaren.palindrome.engine.PalindromeEngine;

import static org.junit.Assert.assertEquals;

public class PalindromeEngineTest {
	
	private PalindromeEngine pE;
	
	public PalindromeEngineTest(){
		pE = new PalindromeEngine();
	}
	
	@Test
	public void isPalindromeTest(){
		try{
			boolean isPalindrome = pE.isPalindrome("ab");
			assertEquals("is palindrome \"ab\"", false, isPalindrome);
			
			isPalindrome = pE.isPalindrome("abA");
			assertEquals("is palindrome \"abA\"", true, isPalindrome);
			
			isPalindrome = pE.isPalindrome("aba");
			assertEquals("is palindrome \"aba\"", true, isPalindrome);
			
			isPalindrome = pE.isPalindrome("ab22a");
			assertEquals("is palindrome \"ab22a\"", false, isPalindrome);
			
			isPalindrome = pE.isPalindrome("ab a");
			assertEquals("is palindrome \"ab a\"", true, isPalindrome);
			
			isPalindrome = pE.isPalindrome("aba22");
			assertEquals("is palindrome \"aba22\"", false, isPalindrome);
			
		}catch(Exception e){
		}
	}
	
	@Test
	public void findPalindromesOfXSize(){
		try{
			
			int palindromesFound = pE.processPalindromeSubStr("aabbcc", 2, 0); 
			assertEquals("pal founds \"aabbcc\" size 2", 3, palindromesFound);
			pE.clear();
			
			palindromesFound = pE.processPalindromeSubStr("aabbcc", 3, 0); 
			assertEquals("pal founds \"aabbcc\" size 3", 0, palindromesFound);
			pE.clear();
			
			palindromesFound = pE.processPalindromeSubStr("abbabc", 4, 0); 
			assertEquals("pal founds \"abbabc\" size 1", 1, palindromesFound);
			pE.clear();
			
			palindromesFound = pE.processPalindromeSubStr("aabbaaccddcc", 6, 0); 
			assertEquals("pal founds \"aabbaaccddcc\" size 1", 2, palindromesFound);
			pE.clear();
			
			palindromesFound = pE.processPalindromeSubStr("aabbaaccddcc", 4, 0); 
			assertEquals("pal founds \"aabbaaccddcc\" size 1", 2, palindromesFound);
			pE.clear();
			
		}catch(Exception e){
			
		}
	}
	
	@Test
	public void findPalindromesOfAnySize(){
		try{
			int palindromeFound = pE.processPalindrome("aabbcc");
			assertEquals("pal founds \"aabbcc\" size 2", 3, palindromeFound);
			
			palindromeFound = pE.processPalindrome("abbabc"); 
			assertEquals("pal founds \"abbabc\" size 1", 2, palindromeFound);
			
			palindromeFound = pE.processPalindrome("aabbaaccddcc"); 
			assertEquals("pal founds \"aabbaaccddcc\" size 1", 2, palindromeFound);
			pE.clear();
			
		}catch(Exception e){
			
		}
	}

}
