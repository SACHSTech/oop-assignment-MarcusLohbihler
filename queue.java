import java.util.ArrayList;

public class queue{
  private ArrayList<song> queueList = new ArrayList<song>();
  private int queueLength = 0;

  public queue(ArrayList<song> theQueue){
    this.queueList = theQueue;
  }

  public ArrayList<song> getQueue(){
    return queueList;
  }

  public int getLength(){
    return queueLength;
  }
  
  public void addToQueue(song songName){
    queueList.add(songName);
    queueLength ++;
  }

  public void removeFromQueue(song songName){
    queueList.remove(songName);
    queueLength --;
  }

  public void replaceInQueue(song songName, int number){
    queueList.set(number, songName);
  }
}