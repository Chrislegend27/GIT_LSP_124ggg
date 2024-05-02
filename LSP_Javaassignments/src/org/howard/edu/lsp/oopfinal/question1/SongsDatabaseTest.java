package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import org.junit.jupiter.api.*;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @BeforeEach
    public void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
    }
    
    @Test
    @DisplayName("Test case for adding a song")
    public void testAddSong() {
        db.addSong("Rap", "Gin and Juice");
        assertTrue(db.getSongs("Rap").contains("Gin and Juice"), "Song should be added to the Rap genre");
    }
    
    @Test
    @DisplayName("Test case for retrieving songs by genre")
    public void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"), "Rap songs should contain 'Savage'");
        assertNotNull(rapSongs, "The set of songs should not be null");
    }
    
    @Test
    @DisplayName("Test case for getting the genre of a song")
    public void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"), "The genre of 'Savage' should be Rap");
        assertNull(db.getGenreOfSong("Nonexistent Song"), "Should return null for non-existing songs");
    }

    @Test
    @DisplayName("Test case for adding a new genre")
    public void testAddNewGenre() {
        db.addSong("Rock", "Stairway to Heaven");
        assertTrue(db.getSongs("Rock").contains("Stairway to Heaven"), "Song should be added to the Rock genre");
    }

    @Test
    @DisplayName("Test case for empty genre")
    public void testEmptyGenre() {
        assertTrue(db.getSongs("Pop").isEmpty(), "Pop genre should be empty");
    }

}
