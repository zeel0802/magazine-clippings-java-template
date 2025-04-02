package org.example;

public class App {

    public static void main(String[] args) {
        String note = "The bird is red!";
        String[] articles = {
            "I write a lot.",
            "To and fro.",
            "Here be deadly dragons!"
        };

        boolean result = MagazineClippings.canCreateNote(note, articles);
        System.out.println("Can we create the note? " + result);
    }
}
