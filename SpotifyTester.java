import java.util.ArrayList;

public class SpotifyTester{
  public void tester(){
    ArrayList<user> users = new ArrayList<user>();
    ArrayList<song> likedSongs = new ArrayList<song>();
    ArrayList<album> likedAlbums = new ArrayList<album>();
    ArrayList<playlist> likedPlaylists = new ArrayList<playlist>();
    ArrayList<single> likedSingles = new ArrayList<single>();
  users.add(new user("theUserName", "theEmail", false, false, 13000, likedSongs, likedAlbums, likedPlaylists, likedSingles, 0));
    likedSongs.add(new song("theName", "theArtist", users));
    likedAlbums.add(new album("theName", 0, "ArtistName", users));
    likedPlaylists.add(new playlist("theName"))
  song enemy = new song("Enemy", "Imagine Dragons", users);
  }
}