package com.pe3;

public class ToRemoveVowelsInWords {
    public String[] RemoveVowelsInwords( String[] places){
        if(places.length != '\0') {
            for (int i = 0; i < places.length; i++) {
                places[i] = places[i].replaceAll("[aeiou]", "");
            }
            return places;
        }
        return null;
    }

    public static void main(String[] args){
        ToRemoveVowelsInWords toRemoveVowelsInWords = new ToRemoveVowelsInWords();
        String[] input = {"India","United States","Germany","Egypt","czechoslovakia"};
        String[] output = toRemoveVowelsInWords.RemoveVowelsInwords(input);
        for(int i=0;i<5;i++) {
            System.out.print(output[i]+"\n");
        }
    }
}
