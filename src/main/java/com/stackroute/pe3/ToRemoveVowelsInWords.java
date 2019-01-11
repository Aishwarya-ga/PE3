/*Write a program to set up an array of places, Loop round and remove the vowels.
* Display the new words in console
* Input:
*        India
*        United States
*        Germany
*        Egypt
*        czechoslovakia
*Output:
*        Place Name without Vowels:0 Ind
*        Place Name without Vowels:1 Untd Stts
*        Place Name without Vowels:2 Grmny
*        Place Name without Vowels:3 Egypt
*        Place Name without Vowels:4 czchslvk
*/
package com.stackroute.pe3;

public class ToRemoveVowelsInWords {
    /*
    to remove vowels in words
     */
    public String[] RemoveVowelsInwords( String[] places){
        if(places.length != '\0') {
            for (int i = 0; i < places.length; i++) {
                places[i] = places[i].replaceAll("[aeiou]", "");
            }
            return places;
        }
        return null;
    }
}
