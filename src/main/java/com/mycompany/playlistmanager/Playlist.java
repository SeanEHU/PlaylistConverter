package com.mycompany.playlistmanager;

import scala.collection.immutable.Vector;

public class Playlist implements IPlaylist {

    private String name;
    private Vector<Song> songList;

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
    public boolean addSong(Song newSong) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeSong(int position) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Vector<String> getSongList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean convertSongs() {
        // TODO Auto-generated method stub
        return false;
    }
    


}
