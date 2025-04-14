/*
15. Write a Java program to create a class called "MusicLibrary" with a collection of songs
 and methods to add and remove songs, and to play a random song
*/

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {

    private ArrayList<String> songs = new ArrayList<>();



    public void addSong(String song) {
        songs.add(song);

    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void playRandom(){
        try{
            Random rand = new Random();
            System.out.println(songs.get(rand.nextInt(songs.size())));

        }
        catch(Exception e){
            System.out.println("Your playlist is empty");
        }


    }


}
