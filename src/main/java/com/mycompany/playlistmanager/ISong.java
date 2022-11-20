package com.mycompany.playlistmanager;

public abstract interface ISong {
    
    public String getTitle();
    public String getArtist();
    public int getLength();
    public String getAlbum();
    public int getTrackNum();
    public boolean convertSong();

}
