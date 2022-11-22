import java.util.ArrayList;

public class playlist{
  private String name;
  private ArrayList<song> playlistArr = new ArrayList<song>();
  private ArrayList<user> likes = new ArrayList<user>();
  private int playlistLength = 0;
  private int likeCount;
  private user owner;
  public playlist(String theName, user theOwner, ArrayList<user> theLikes, ArrayList<song> thePlaylist){
    name = theName;
    owner = theOwner;
    likes = theLikes;
    playlistArr = thePlaylist;
  }

  public String getName(){
    return name;
  }

  public int getPlaylistLength(){
    return playlistLength;
  }

  public ArrayList<song> getPlaylist(){
    return playlistArr;
  }

  public user getOwner(){
    return owner;
  }

  public ArrayList<user> getLikes(){
    return likes;
  }

  public int getLikeCount(){
    return likeCount;
  }

  public void addLike(user name){
    likes.add(name);
    likeCount++;
  }

  public void removeLike(user name){
    likes.remove(name);
    likeCount--;
  }

  
  public void addSong(song songName){
    playlistArr.add(songName);
    playlistLength ++;
  }

  public void removeSong(song songName){
    playlistArr.remove(songName);
    playlistLength --;
  }
  
  public void play(){
    System.out.println("Playing: " + name);
  }

  public void playSong(String songName){
    System.out.println("Playing: " + songName + "from " + name);
  }

  public String toString(){
    return (this.name + " is owned by " + this.owner + " and contains the songs: " + this.playlistArr);
  }
}