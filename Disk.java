public class Disk{
  private int diskSize;

  public Disk(int diskSize){
    this.diskSize = diskSize;
  }

  public int getDiskSize(){
    return diskSize;
  }

  public String toString(){
    String s = "";
    for(int i = 0; i < diskSize; i++){
      s+= "*";
    }
    return s;
  }
}