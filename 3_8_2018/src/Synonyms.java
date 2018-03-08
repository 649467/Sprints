
/* Created by InteliJ Idea

 *User: Nicholas Gaultney
 *Date: 3/8/2018
 *Time: 10:52 AM
 *Contact: nmgaultney@gmail.com
 */

import java.util.HashMap;
import java.util.Map;

public class Synonyms {
    Map<String, String> synonyms = new HashMap<>();

    public Synonyms(){
        synonyms.put("Letter", "Character");
        synonyms.put("Hello", "Hi");
        synonyms.put("Goodbye", "Bye");
    }

    public String thesaurus(String word){
        if(synonyms.containsKey(word)) {
            return synonyms.get(word);
        } else {
            throw new NullPointerException();
        }

    }

}
