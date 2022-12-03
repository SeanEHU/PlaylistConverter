package com.mycompany.playlistmanager;

import java.util.Vector;

public abstract interface IPlaylist {

    public void setName(String nName);
    public String getName();
    public String getPlaylistID();
    public boolean addSong(Song newSong);
    public boolean removeSong(int position);
    public Vector<Song> getSongList();
    public boolean convertSongs();
    
}
