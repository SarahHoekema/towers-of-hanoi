//Sean Chambers and Sarah Hoekema
//CS 145
//November 8, 2022
//Lab 5 - Towers of Hanoi

//Disk.java represents a single disk in the Towers of Hanoi puzzle
public class Disk{
  //fields
  private int diskSize;

  //constructor
  public Disk(int diskSize){
    this.diskSize = diskSize;
  }

  //returns the disk size
  public int getDiskSize(){
    return diskSize;
  }

  //returns a String representation of the Disk
  public String toString(){
    String s = "";
    for(int i = 0; i < diskSize; i++){
      s+= "*";
    }
    return s;
  }
}