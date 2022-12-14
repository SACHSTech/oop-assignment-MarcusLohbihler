import java.util.ArrayList;

public class user{
  private String name;
  private String email;
  private boolean hasPremium;
  
  private ArrayList<song> likedSongs = new ArrayList<song>();
  private ArrayList<album> likedAlbums = new ArrayList<album>();
  private ArrayList<playlist> likedPlaylists = new ArrayList<playlist>();
  private ArrayList<single> likedSingles = new ArrayList<single>();
  private int likedCount;

  public user(String theName, String theEmail, boolean premium, ArrayList<song> theLikedSongs, ArrayList<album> theLikedAlbums, ArrayList<playlist> theLikedPlaylists, ArrayList<single> theLikedSingles, int theLikedCount){
    this.name = theName;
    this.email = theEmail;
    this.hasPremium = premium;
    this.likedSongs = theLikedSongs;
    this.likedAlbums = theLikedAlbums;
    this.likedPlaylists = theLikedPlaylists;
    this.likedSingles = theLikedSingles;
    this.likedCount = theLikedCount;
  }

  public String getName(){
    return name;
  }

  public String getEmail(){
    return email;
  }

  public boolean getPremium(){
    return hasPremium;
  }

  public boolean unsubscribeFromPremium(){
    hasPremium = false;
    return hasPremium;
  }

  public ArrayList<song> getLikedSongs(){
    return likedSongs;
  }

  public ArrayList<album> getLikedAlbums(){
    return likedAlbums;
  }

  public ArrayList<playlist> getLikedPlaylists(){
    return likedPlaylists;
  }

  public ArrayList<single> getLikedSingles(){
    return likedSingles;  
  }

  public int getLikedCount(){
    return likedCount;
  }
  
  public String setName(String newName){
    name = newName;
    return name;
  }

  public String setEmail(String newEmail){
    email = newEmail;
    return email;
  }

  public boolean buyPremium(){
    hasPremium = true;
    return hasPremium;
  }

  public void likeSong(song name){
    likedSongs.add(name);
  }

  public void unlikeSong(song name){
    likedSongs.remove(name);
  }

  public void likeAlbum(album name){
    likedAlbums.add(name);
  }

  public void unlikeAlbum(album name){
    likedAlbums.remove(name);
  }

  public void createPlaylist(playlist name){
    likedPlaylists.add(name);
  }

  public void deletePlaylist(playlist name){
    likedPlaylists.remove(name);
  }

  public void likePlaylist(playlist name){
    likedPlaylists.add(name);
  }

  public void unlikePlaylist(playlist name){
    likedPlaylists.remove(name);
  }

  public void likeSingle(single name){
    likedSingles.add(name);
  }

  public void unlikeSingle(single name){
     likedSingles.remove(name);
  }
  
  public void follow(String name){
    System.out.println("Following " + name);
  }

  public void search(String itemName){
    System.out.println("Results for: " + itemName);
  }

  public String toString(){
    return this.name + " uses the email " + this.email + ". Has premium: " + this.hasPremium + ". " + this.name + " has liked the following items: " + this.likedSongs + this.likedAlbums + this.likedPlaylists + this.likedSingles;
  }
}