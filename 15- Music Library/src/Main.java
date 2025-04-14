/*
15. Write a Java program to create a class called "MusicLibrary" with a collection of songs
 and methods to add and remove songs, and to play a random song
*/

public class Main {
    public static void main(String[] args) {

        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addSong("changes");
        musicLibrary.addSong("mirror");
        musicLibrary.addSong("lose yourself");
        musicLibrary.addSong("till i die");
        musicLibrary.addSong("till i collapse");
        musicLibrary.addSong("dumb dum and dumber");

        musicLibrary.removeSong("dumb dum and dumber");

        musicLibrary.playRandom();

    }
}