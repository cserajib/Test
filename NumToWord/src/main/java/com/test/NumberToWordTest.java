package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class NumberToWordTest {
	
	@Test
	public void checkForThousand() {
		NumberToWord toWord = new NumberToWord();
		assertEquals("Nine Thousand Seven Hundred Seventy Eight", toWord.convert(9778));
	}
	
	@Test
	public void checkForLakh() {
		NumberToWord toWord = new NumberToWord();
		assertEquals("Seven Lakh Fifty Nine Thousand Seven Hundred Seventy Eight", toWord.convert(759778));
	}
	
	@Test
	public void checkForCrore() {
		NumberToWord toWord = new NumberToWord();
		assertEquals("Nine Crore Seventy Seven Lakh Fifty Nine Thousand Seven Hundred Seventy Eight", toWord.convert(97759778));
	}

}
