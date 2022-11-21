import java.util.ArrayList;

public class album extends song{
  private int albumLength;
  private boolean EP;
  private ArrayList<user> likes = new ArrayList<user>();
  private int likeCount;
  public album(String theName, int theLength, user theArtist, ArrayList<user> theLikes){
    super(theName, theArtist, theLikes);
    this.albumLength = theLength;
    if(theLength <= 6){
      EP = true;
    }else if(theLength > 6){
      EP = false;
    }
  }

  public String getAlbumName(){
    return super.getName();
  }

  public int getLength(){
    return albumLength;
  }

  public user getArtist(){
    return super.getArtist();
  }

  public ArrayList<user> getLikes(){
    return likes;
  }

  public int getLikeCount(){
    return likeCount;
  }

  public void addLike(user name){
    likes.add(name);
    likeCount ++;
  }

  public void removeLike(user name){
    likes.remove(name);
    likeCount --;
  }

  public boolean isEP(){
    return EP;
  }
  
  public void play(){
    System.out.println("Playing: " + super.getName());
  }

  public void playSong(String songName){
    System.out.println("Playing: " + songName + "from " + super.getName());
  }
}