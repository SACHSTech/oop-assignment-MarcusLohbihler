import java.util.ArrayList;
import org.hamcrest.Condition.Step;
import java.io.*;
import java.io.BufferedReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    int uiReader;
    int searchReader;
    String itemName;
    ArrayList<song> playlistArr = new ArrayList<song>();
    ArrayList<song> queueList = new ArrayList<song>();
    ArrayList<user> users = new ArrayList<user>();
    ArrayList<song> likedSongs = new ArrayList<song>();
    ArrayList<album> likedAlbums = new ArrayList<album>();
    ArrayList<playlist> likedPlaylists = new ArrayList<playlist>();
    ArrayList<single> likedSingles = new ArrayList<single>();
    ArrayList<song> playlist = new ArrayList<song>();
    Artist theArtist = new Artist("theName", false, 0);
    user theOwner = new user("theName", "theEmail", false, likedSongs, likedAlbums, likedPlaylists, likedSingles, 0);
    queueList.add(new song("theName", theArtist, users));
    users.add(new user("theUserName", "theEmail", false, likedSongs, likedAlbums, likedPlaylists, likedSingles, 0));
    likedSongs.add(new song("theName", theArtist, users));
    likedAlbums.add(new album("theName", 0, theArtist, users));
    likedPlaylists.add(new playlist("theName", theOwner, users, playlist));
    likedSingles.add(new single("theName", users, theArtist, 1));

    System.out.println("Welcome to Spotify, Where would you like to go?");
    System.out.println("1: Recommended, 2: Search, 3: Your Library");
    uiReader = Integer.parseInt(key.readLine());
    if (uiReader == 1) {
      System.out.println("Here are your daily recommendations:");
    } else if (uiReader == 2) {
      System.out.println("What would you like to search for?");
      System.out.println("1: Song, 2: Artist, 3: Album, 4: Playlist");
      searchReader = Integer.parseInt(key.readLine());
      if (searchReader == 1) {
        System.out.println("What is the song's name?");
        itemName = key.readLine();
        System.out.println("Results for songs named " + itemName + ":");
      } else if (searchReader == 2) {
        System.out.println("What is the Artist's name?");
        itemName = key.readLine();
        System.out.println("Results for artists named " + itemName + ":");
      } else if (searchReader == 3) {
        System.out.println("What is the name of the album?");
        itemName = key.readLine();
        System.out.println("Results for albums named " + itemName + ":");
      } else if (searchReader == 4) {
        System.out.println("What is the name of the playlist?");
        itemName = key.readLine();
        System.out.println("Results for playlists named " + itemName + ":");
      }
    } else if (uiReader == 3) {
      System.out.println("Here is your library:");
    } else {
      System.out.println("Invalid input, please select again");
      System.out.println("1: Recommended, 2: Search, 3: Your Favourites");
      uiReader = Integer.parseInt(key.readLine());
    }

    Artist ImagineDragons = new Artist("Imagine Dragons", true, 56287587);
    Artist Ashnikko = new Artist("Ashnikko", true, 5491308);
    user Marcus = new user("Marcus", "MarcusLohbihlergaming@gmail.com", true, likedSongs, likedAlbums, likedPlaylists,
        likedSingles, 0);
    song enemy = new song("Enemy", ImagineDragons, users);
    song daisy = new song("Daisy", Ashnikko, users);
    playlist myPlaylist = new playlist("myPlaylist", Marcus, users, playlist);
    // myPlaylist.addSong(enemy);
    // myPlaylist.addSong(daisy);
    // System.out.println(myPlaylist.getPlaylist());
    // daisy.getArtist();

  }
}
