package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

 /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        // Ensure the genre key exists in the map
        if (!map.containsKey(genre)) {
            map.put(genre, new HashSet<>());
        }
        // Add the song to the set of songs for this genre
        map.get(genre).add(songTitle);
    }

	/* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        // Iterate through each entry in the map to find which genre contains the songTitle
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey(); // Return the genre if the song is found
            }
        }
        return null; // Return null if the song is not found in any genre
    }

  
 /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        // Return the set of songs for the specified genre, or an empty set if the genre isn't found
        return map.getOrDefault(genre, new HashSet<>());
    }
}
