package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzer {
    /**
     *
     * @param string
     * @return String
     * This gives the mood
     */
    public String analyseMood(String string) throws MoodAnalisysException  {
        try {
            if (string.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalisysException("please enter proper message");
        }
    }

}
