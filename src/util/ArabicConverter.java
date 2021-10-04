
package util;

import java.util.LinkedList;
import java.util.List;


public class ArabicConverter {
    public ArabicConverter(){
        
    }
    
    public   String  ArabicConverterAction(String text){
        if(text == null)return "";
        List<Character> charSet =  new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            charSet.add(text.charAt(i));
        }
        Resources.loadArabicCharMap();
        StringBuilder outString = new StringBuilder();
        for (Character character : charSet) {
            outString.append(Resources.ArabicCharMap.get(character));
        }
        
        return outString.toString();
    }
}
