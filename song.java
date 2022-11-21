import java.util.ArrayList;

public abstract class song{
  private String name;
  private user artist;
  private ArrayList<user> likes = new ArrayList<user>();
  private int likeCount;

  public song(String theName, user theArtist, ArrayList<user> theLikes){
    this.name = theName;
    this.artist = theArtist;
    likes = theLikes;
  }

  public String getName(){
    return this.name;
  }

  public user getArtist(){
    return artist;
  }
  
  public int getLikeCount(){
    return likeCount;
  }

  public ArrayList<user> getLikes(){
    return likes;
  }

  public void addLike(user name){
    likes.add(name);
    likeCount++;
  }

  public void removeLike(user name){
    likes.remove(name);
    likeCount--;
  }

  public void play(){
    System.out.println("Playing: " + name);
  }

  public String toString(){
    String printStatement = ("The song is " + name + "by " + artist + "and has " + likeCount + "likes");
    return printStatement;
  }
}