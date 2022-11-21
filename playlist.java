import java.util.ArrayList;

public class playlist extends song{
  private ArrayList<song> playlistArr = new ArrayList<song>();
  private ArrayList<user> likes = new ArrayList<user>();
  private int playlistLength = 0;
  private int likeCount;
  private user owner;
  public playlist(String theName, user theOwner, ArrayList<user> theLikes){
    super(theName, theOwner, theLikes);
  }

  public String getName(){
    return super.getName();
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
    return super.getLikes();
  }

  public void addLike(user name){
    likes.add(name);
    likeCount++;
  }

  public void removeLike(user name){
    likes.remove(name);
    likeCount--;
  }
  
  public int getLikeCount(){
    return super.getLikeCount();
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
    System.out.println("Playing: " + super.getName());
  }

  public void playSong(String songName){
    System.out.println("Playing: " + songName + "from " + super.getName());
  }
}