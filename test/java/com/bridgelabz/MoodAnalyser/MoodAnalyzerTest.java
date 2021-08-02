package com.bridgelabz.MoodAnalyser;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

public class MoodAnalyzerTest {
    @SuppressWarnings("deprecation")
    @Test
    public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalisysException {
        MoodAnalyser m = new MoodAnalyser();
        String mood = m.analyseMood("SAD");
        Assert.assertEquals("SAD", mood);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void givenMessage_whenHappy_shouldReturnHappy() throws MoodAnalisysException {
        MoodAnalyser m = new MoodAnalyser();
        String mood = m.analyseMood("HAPPY");
        Assert.assertEquals("HAPPY", mood);

    }

    @SuppressWarnings("deprecation")
    @Test
    public void givenMessage_whenNul_shouldReturnhppy() throws MoodAnalisysException {
        MoodAnalyser m = new MoodAnalyser();
        String mood = null;
        try {
            ExpectedException e = ExpectedException.none();
            e.expect(MoodAnalisysException.class);
            mood = m.analyseMood(mood);
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalisysException e) {
            e.printStackTrace();
        }
    }

}
