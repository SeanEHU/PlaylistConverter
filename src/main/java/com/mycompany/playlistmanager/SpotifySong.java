package com.mycompany.playlistmanager;

public class SpotifySong extends Song {

    private String spotifySongID;

    public SpotifySong(String nTitle, String nArtist, int nTrackNum, String nAlbum, int nLength, String nSpotifySongID) {
        super(nTitle, nArtist, nTrackNum, nAlbum, nLength);
        this.spotifySongID = nSpotifySongID;
    }

    
    public String getSongID(){

    return spotifySongID;
    }
    
}
