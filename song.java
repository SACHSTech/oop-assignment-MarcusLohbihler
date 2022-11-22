import java.util.ArrayList;

public class song{
  private String name;
  private Artist artist;
  private ArrayList<user> likes = new ArrayList<user>();
  private int likeCount;

  public song(String theName, Artist theArtist, ArrayList<user> theLikes){
    this.name = theName;
    this.artist = theArtist;
    likes = theLikes;
  }

  public String getName(){
    return this.name;
  }

  public Artist getArtist(){
    return this.artist;
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
    return "The song is " + this.name + " by " + this.artist + " and has " + this.likeCount + " likes";
  }
}