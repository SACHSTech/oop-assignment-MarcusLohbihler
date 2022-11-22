import java.util.ArrayList;

public class single extends album{
  private ArrayList<user> likes = new ArrayList<user>();
  public single(String theName, ArrayList<user> theLikes, Artist theArtist, int theLength){ 
    super(theName, theLength, theArtist, theLikes);
  }

  public String getAlbumName(){
    return super.getName();
  }

  public int getLength(){
    return super.getLength();
  }

  public Artist getArtist(){
    return super.getArtist();
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

  public String toString(){
    return "The single is " + super.getAlbumName() + " by " + super.getArtist() + ". It is " + super.getLength() + " song long and has " + super.getLikeCount() + " likes";
  }
}