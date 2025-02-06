package org.example.linearsearch;

import javax.sound.midi.Soundbank;

public class SearchForSpecificWord {

    public static String linearSearch(String[] str , String word){
        for(String sentence : str){
            if(sentence.contains(word)){
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args){

        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java is a programming language.",
                "Linear search is simple and easy to understand.",
                "Searching for specific words in sentences."
        };

        String word = "Java";
        System.out.println(SearchForSpecificWord.linearSearch(sentences , word));

    }
}
