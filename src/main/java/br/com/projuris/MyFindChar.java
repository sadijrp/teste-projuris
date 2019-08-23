
package br.com.projuris;


public class MyFindChar implements FindCharacter {

    public MyFindChar() {};

    public char findChar(String word){

        String tmpWord = new String(word);

        while(tmpWord.length() > 0){

            String firstCharacter = tmpWord.substring(0,1);
            int initialLength = tmpWord.length();

            tmpWord = tmpWord.replace(firstCharacter, "");

            if(tmpWord.length() == initialLength - 1)
                return firstCharacter.charAt(0);

        }
        return ' ';
    }
}
