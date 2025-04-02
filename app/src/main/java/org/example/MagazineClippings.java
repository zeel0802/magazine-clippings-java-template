package org.example;

import java.util.HashMap;

public class MagazineClippings {

    public static boolean canCreateNote(String note, String[] articles) {
        HashMap<Character, Integer> letterMap = new HashMap<>();

        // Count letters from all articles
        for (String article : articles) {
            for (char c : article.toLowerCase().toCharArray()) {
                if (c == ' ') continue; // Skip spaces
                letterMap.put(c, letterMap.getOrDefault(c, 0) + 1);
            }
        }

        // Check if we can build the note
        for (char c : note.toLowerCase().toCharArray()) {
            if (c == ' ') continue; // Skip spaces
            if (!letterMap.containsKey(c) || letterMap.get(c) == 0) {
                return false;
            }
            letterMap.put(c, letterMap.get(c) - 1);
        }

        return true;
    }
}
