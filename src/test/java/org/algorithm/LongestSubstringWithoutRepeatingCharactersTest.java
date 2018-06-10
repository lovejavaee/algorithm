package org.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters target;

    @BeforeEach
    void init() {
        target = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void lengthOfLongestSubstring_3() {
        String testString = "abcabcbb";
        int result = target.lengthOfLongestSubstring(testString);
        Assertions.assertEquals(3, result);

    }

    @Test
    void lengthOfLongestSubstring_1() {
        String testString = "bbbbb";
        int result = target.lengthOfLongestSubstring(testString);
        Assertions.assertEquals(1, result);

    }

    @Test
    void lengthOfLongestSubstring_7() {
        String testString = "abcdefgabceg";
        int result = target.lengthOfLongestSubstring(testString);
        Assertions.assertEquals(7, result);

    }

}