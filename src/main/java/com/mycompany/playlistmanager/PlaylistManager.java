/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.playlistmanager;

/**
 *
 <h1>Playlist Converter</h1>
 * 
 * <p>The playlist converter is used to convert Playlists from one 
 * streaming serice, to another. For example, taking a playliust from
 * Spotify and exporting it to Apple Music</p>
 * 
 * <p>This project is still a prototpe and does not have this functionality yet.
 * Currently it can manage an abstract playlist file, that will later be used as a intermediary</p>
 * 
 * @author Sean Johnson
 * @link https://github.com/SomeGuyEatingPie/PlaylistConverter
 */
public class PlaylistManager {

    static PlaylistJFrame g;

    public static void main(String[] args) {
        g = new PlaylistJFrame();
        g.setVisible(true);
    }

}
