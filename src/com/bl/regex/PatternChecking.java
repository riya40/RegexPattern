package com.bl.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternChecking {

    public void firstname(){
        Pattern pattern = Pattern.compile("^[A-Za-z]{3,6}$");
        Matcher matcher = pattern.matcher("Priya");
        if (matcher.find())
            System.out.println("Pattern matched");
        else
            System.out.println("Pattern not matched");
    }


    public static void main(String[] args) {
        PatternChecking patternChecking = new PatternChecking();
        patternChecking.firstname();
       

    }
}
