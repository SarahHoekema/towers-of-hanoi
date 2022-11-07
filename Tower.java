import java.util.*;

public class Tower{
  Peg col1;
  Peg col2;
  Peg col3;
  Peg currentCol;
  Peg destCol1;
  Peg destCol2;

  public Tower(){
    this.col1 = new Peg(1);
    this.col2 = new Peg(2);
    this.col3 = new Peg(3);
    this.currentCol = col1;
    destCol1 = col2;
    destCol2 = col3;

    col1.add(new Disk(4));
    col1.add(new Disk(3));
    col1.add(new Disk(2));
    col1.add(new Disk(1));
  }

  public boolean checkMove(Peg destCol){
    if(destCol.size() == 0){
      return true;
    } else if (destCol.checkDisk().getDiskSize() > currentCol.checkDisk().getDiskSize()){
      return true;
    } else{
      return false;
    }
  }

  public void transfer(Peg destCol){
    destCol.add(currentCol.remove());
    Peg temp = determineCol(currentCol.getPegNum());
    currentCol = determineCol(destCol.getPegNum());
    if(destCol.getPegNum() == destCol1.getPegNum()){
      destCol1 = determineCol(temp.getPegNum());
    } else{
      destCol2 = determineCol(temp.getPegNum());
    }
  }

  // public void place(Peg destCol){
    // currentCol.remove(destCol);
    // Peg temp = determineCol(currentCol.getPegNum());
    // currentCol = determineCol(destCol.getPegNum());
    // destCol = determineCol(temp.getPegNum());
  // }

  // public void remove(Peg destCol){
  //   currentCol.remove(destCol);

  // }

  public Peg determineCol(int num){
    if(num == 1){
      return col1;
    } else if(num == 2){
      return col2;
    } else{
      return col3;
    }
  }

  public Peg getCurrentCol(){
    return currentCol;
  }

  public Peg getDestCol1(){
    return destCol1;
  }

  public Peg getDestCol2(){
    return destCol2;
  }

  public Peg getCol1(){
    return col1;
  }

  public Peg getCol2(){
    return col2;
  }

  public Peg getCol3(){
    return col3;
  }
}