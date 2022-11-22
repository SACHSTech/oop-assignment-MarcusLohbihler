import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
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

    Artist ImagineDragons = new Artist("Imagine Dragons", true, 56287587);
    Artist Ashnikko = new Artist("Ashnikko", true, 5491308);
    user Marcus = new user("Marcus", "MarcusLohbihlergaming@gmail.com", true, likedSongs, likedAlbums, likedPlaylists,
        likedSingles, 0);
    song enemy = new song("Enemy", ImagineDragons, users);
    song daisy = new song("Daisy", Ashnikko, users);
    playlist myPlaylist = new playlist("myPlaylist", Marcus, users, playlist);
    myPlaylist.addSong(enemy);
    myPlaylist.addSong(daisy);
    System.out.println(myPlaylist.getPlaylist());
    daisy.getArtist();
  }
}
