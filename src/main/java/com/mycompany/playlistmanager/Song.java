package com.mycompany.playlistmanager;

public class Song implements ISong {

    private String title; //The Songs Title i.e. "Caramelldansen"
    private String artist;  //The Aritist the specific song is credited to i.e. "Caramell"
    private String album; //(non essential) The Album the specific song is from i.e. "Supergott (Speedy Mixes)"
    private int trackNum; //(non essential) The position of this song on its album i.e. 1
    private int length; //(non essential) The Length of the track in seconds i.e. "175"

    public Song(String nTitle, String nArtist, int nTrackNum, String nAlbum, int nLength){

        this.title = nTitle;
        this.artist = nArtist;
        this.album = nAlbum;
        this.trackNum = nTrackNum;
        this.length = nLength;

    }

    public Song(String nTitle, String nArtist){
        this.title = nTitle;
        this.artist = nArtist;
        this.album = null;
        this.trackNum = -1;
        this.length = -1;
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
