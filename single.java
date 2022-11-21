import java.util.ArrayList;

public class single extends album{
  private ArrayList<user> likes = new ArrayList<user>();
  public single(String theName, ArrayList<user> theLikes, user theArtist, int theLength){ 
    super(theName, theLength, theArtist, theLikes);
  }

  public String getAlbumName(){
    return super.getName();
  }

  public int getLength(){
    return super.getLength();
  }

  public ArrayList<user> getLikes(){
    return likes;
  }

  public int getLikeCount(){
    return super.getLikeCount();
  }

  public void addLike(user name){
    likes.add(name);
  }

  public void removeLike(user name){
    likes.remove(name);
  }
    
  public void play(){
    System.out.println("Playing: " + super.getName());
  }
}