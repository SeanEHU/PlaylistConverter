package com.mycompany.playlistmanager;

import java.util.Vector;

public class Playlist implements IPlaylist {

    private String name;
    private Vector<Song> songList;

    public Playlist(String nName, Vector<Song> nSongList){
        
        this.name = nName;
        this.songList = nSongList;
        
    }
    
    public Playlist(String nName) {
        
        this.name = nName;
        
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPlaylistID() {
        //This playlist object isnt platform specific
        return null;
    }

    @Override
    public boolean addSong(Song nSong) {

        try {
        this.songList.add(nSong);
        return true;
        }
        catch(Exception e){
            return false;
        }
        
    }

    @Override
    public boolean removeSong(int position) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Vector<Song> getSongList() {
        // TODO Auto-generated method stub
        return this.songList;
    }

    @Override
    public boolean convertSongs() {
        // TODO Auto-generated method stub
        return false;
    }
    

}
