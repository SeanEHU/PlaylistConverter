package com.mycompany.playlistmanager;

import java.util.Vector;

public class Playlist implements IPlaylist {

    private String name;
    private Vector<Song> songList = new Vector<Song>(0);

    public Playlist(String nName, Vector<Song> nSongList){
        
        this.name = nName;
        this.songList = nSongList;
        
    }
    
    public Playlist(String nName) {
        
        this.name = nName;
        
    }

    @Override
    public void setName(String nName) {
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

        try{
            this.songList.addElement(nSong);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }

    @Override
    public boolean removeSong(int position) {

        try{
            songList.remove(position);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }

    @Override
    public Vector<Song> getSongList() {

        return this.songList;
    }

    @Override
    public boolean convertSongs() {

        return false;
    }

    
    

}
