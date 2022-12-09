package com.mycompany.playlistmanager;

/**
 * A thread for processing a single string into a Song object
 * @author Sean Johnson
 */
public class SongReadTask implements Runnable {

    private String songData;
    private Song builtSong;


    public SongReadTask(String nSongData) {

        this.songData = nSongData;

    }

    public void run() {

        String nTitle;
        String nArtist;
        String nAlbum;
        int nTrack;
        int nLength;

        String[] songArray = songData.split(",");

        nTitle = songArray[0];
        nArtist = songArray[1];
        nAlbum = songArray[2];
        try {
            nTrack = Integer.parseInt(songArray[3]);
        }
        catch (Exception e) {
            nTrack = -1;
        }
        try{
            nLength = Integer.parseInt(songArray[4]);
        }
        catch(Exception e){
            nLength = -1;
        }

        this.builtSong = new Song(nTitle,nArtist,nAlbum,nTrack,nLength);

    }

    public Song getSong() {
        return this.builtSong;
    }
    
}
