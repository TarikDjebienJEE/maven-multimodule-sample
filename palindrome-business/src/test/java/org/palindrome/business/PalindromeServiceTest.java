package org.palindrome.business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.palindrome.business.impl.PalindromeServiceImpl;

/**
 * Test du service qui supporte 
 * la détection de palindromes dans un texte.
 * @author eric
 */
public class PalindromeServiceTest {

	private String urlPathToFileWithPalindrome ; 
	private String urlPathToFileWithoutPalindrome ; 
	private String urlPathToUnexistingFile ; 
	private IPalindromeService palindromeService; 

	/**
	 * initialisation des attributs necessaire pour les tests
	 */
	@Before
	public void setUp(){
		//A modifier

		//urlPathToFileWithPalindrome = "C:/Users/H76271/Documents/NetBeansProjects/QLPalyndrome/test/file/fileWithPalindrome" ;
		//urlPathToFileWithoutPalindrome = "C:/Users/H76271/Documents/NetBeansProjects/QLPalyndrome/test/file/fileWithoutPalindrome" ;

		urlPathToFileWithPalindrome ="/Users/tarik/Desktop/fileWithPalindrome.txt";
		urlPathToFileWithoutPalindrome ="/Users/tarik/Desktop/fileWithoutPalindrome.txt";

		urlPathToUnexistingFile = "a/bad/url/path";

		palindromeService = new PalindromeServiceImpl();
	}    

	/**
	 * Test du service de détection 
	 * de palindromes dans un texte : 
	 * On verifie que la methode renvoit bien true 
	 * pour un fichier qui contient une palindrome de lettres
	 */
	@Test
	public void testFileContainsPalindromeWord(){

		boolean result = palindromeService.containsPalindrome(urlPathToFileWithPalindrome);
		Assert.assertTrue(result);
	}

	/**
	 * Test du service de détection 
	 * de palindromes dans un texte : 
	 * On verifie que la methode renvoit bien false 
	 * pour un fichier qui ne contient pas de palindrome de lettres
	 */
	@Test
	public void testFileNotContainPalindromeWord(){
		boolean result = palindromeService.containsPalindrome(urlPathToFileWithoutPalindrome);
		Assert.assertFalse(result);
	}    

	/**
	 * Test du service de détection 
	 * de palindromes dans un texte : 
	 * On verifie que la methode renvoit bien false 
	 * pour un fichier qui n'existe pas donc 
	 * qui ne contient pas de palindrome de lettres
	 */
	@Test
	public void testUnexistingFileNotContainPalindromeWord(){
		boolean result = palindromeService.containsPalindrome(urlPathToUnexistingFile);
		Assert.assertFalse(result);
	}        

}
