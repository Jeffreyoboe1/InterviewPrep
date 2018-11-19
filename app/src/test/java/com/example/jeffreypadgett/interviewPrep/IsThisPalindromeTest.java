package com.example.jeffreypadgett.interviewPrep;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsThisPalindromeTest {

    @Test
    public void isPalindrome() {

        String palindrome = "abcdcba";

        assertTrue( IsThisPalindrome.isPalindrome(palindrome));


    }

    @Test
    public void isPalindromeWithSpaces() {

        String spaces = " ... ... ... ";

        assertTrue(IsThisPalindrome.isPalindrome(spaces));
    }

    @Test
    public void isNotPalindrome() {


        String notPalindrome = "well You know, we can't all be winners.";

        assertFalse( IsThisPalindrome.isPalindrome(notPalindrome));

    }

    @Test
    public void nullPalindrome() {

        String nothing = null;

        assertTrue(IsThisPalindrome.isPalindrome(nothing));
    }
}