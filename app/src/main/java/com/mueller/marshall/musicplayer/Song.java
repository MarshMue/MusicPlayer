package com.mueller.marshall.musicplayer;

/**
 * Created by marshallmueller on 10/10/15.
 * Class song is used to describe audio files used for songs
 */
public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist) {
        id = songID;
        title = songTitle;
        artist = songArtist;
    }

    public long getId() {return id;}
    public String getTitle() {return title;}
    public String getArtist() {return artist;}
}
