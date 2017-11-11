package org.palindrome.business.impl;

import java.util.Map;

import org.palindrome.business.IPalindromeService;

import wordcount.service.IWordCount;
import wordcount.service.impl.WordCountBrut;


/**
 * Implementation du service de recherche d'un palindrome dans un texte
 * @author tarik
 *
 */
public class PalindromeServiceImpl implements IPalindromeService {

	/* (non-Javadoc)
	 * @see org.palindrome.business.IPalindromeService#containsPalindrome(java.lang.String)
	 */
	public boolean containsPalindrome(String textPathFile){
		IWordCount wc = new WordCountBrut(textPathFile);
		Map<String, Integer> allWords = wc.countAllWordInText();
		for(String word : allWords.keySet()){
			if(isPalindrome(word)){
				return true;
			}
		}
		return false;
	}

	private String getMirror(String word){
		return org.apache.commons.lang.StringUtils.reverse(word);
	}
	private boolean isPalindrome(String word) {
		return word.equals(getMirror(word));
	}
}
