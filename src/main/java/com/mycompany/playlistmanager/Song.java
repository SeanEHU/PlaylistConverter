package com.mycompany.playlistmanager;

public class Song implements ISong {

    private String title;
    private String artist;
    private int trackNum;
    private String album;
    private int length;

    public Song(String nTitle, String nArtist, int nTrackNum, String nAlbum, int nLength){

        this.title = nTitle;
        this.artist = nArtist;
        this.trackNum = nTrackNum;
        this.album = nAlbum;
        this.length = nLength;

    }


    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return this.title;
    }

    @Override
    public String getArtist() {
        // TODO Auto-generated method stub
        return this.artist;
    }

    @Override
    public int getLength() {
        // TODO Auto-generated method stub
        return this.length;
    }

    @Override
    public String getAlbum() {
        // TODO Auto-generated method stub
        return this.album;
    }

    @Override
    public int getTrackNum() {
        // TODO Auto-generated method stub
        return this.trackNum;
    }

}
