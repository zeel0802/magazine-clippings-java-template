package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCanCreateNote() {
        String note = "abc";
        String[] articles = {"a", "b", "c"};
        assertTrue(MagazineClippings.canCreateNote(note, articles));

        String note2 = "The bird is red!";
        String[] articles2 = {
            "I write a lot.",
            "To and fro.",
            "Here be deadly dragons!"
        };
        assertTrue(MagazineClippings.canCreateNote(note2, articles2));

        String note3 = "nope!";
        String[] articles3 = {"abc"};
        assertFalse(MagazineClippings.canCreateNote(note3, articles3));
    }
}
// This is a test class for the MagazineClippings class.