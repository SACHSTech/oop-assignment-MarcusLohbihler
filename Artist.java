public class Artist{
  private boolean isVerified;
  private String name;
  private int listenerCount;

  public Artist(String theName, boolean verified, int theListenerCount){
    this.name = theName;
    this.isVerified = verified;
    this.listenerCount = theListenerCount;
  }

  public String getName(){
    return name;
  }

  public int getListenerCount(){
    return listenerCount;
  }

  public boolean checkIsVerified(){
    return isVerified;
  }

  public int gainListeners(int newListeners){
    listenerCount += newListeners;
    return listenerCount;
  }

  public int loseListeners(int newListeners){
    listenerCount -= newListeners;
    return listenerCount;
  }
  
  public boolean verify(){
    isVerified = true;
    return isVerified;
  }

  public boolean unverify(){
    isVerified = false;
    return isVerified;
  }

  public int setListenerCount(int newCount){
    listenerCount = newCount;
    return listenerCount;
  }

  public String toString(){
    return this.name + "has" + this.listenerCount + ", verified: " + this.isVerified;
  }
}