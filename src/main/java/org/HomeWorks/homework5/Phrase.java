package org.HomeWorks.homework5;

public class Phrase {
    public static void main(String[] args) {
        String[] str = {"Ana ", "are ", "mere"};
        String phrase="";
        for (String word:str) {
            phrase=phrase+word;
        }
        System.out.println(phrase);
    }
}
