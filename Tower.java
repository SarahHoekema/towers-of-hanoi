import java.util.*;

public class Tower{
  Stack<Disk> col1;
  Stack<Disk> col2;
  Stack<Disk> col3;
  Stack<Disk> currentCol;
  Stack<Disk> destCol1;
  Stack<Disk> destCol2;

  public Tower(){
    this.col1 = new Stack<Disk>();
    this.col2 = new Stack<Disk>();
    this.col3 = new Stack<Disk>();
    this.currentCol = col1;
    destCol1 = col2;
    destCol2 = col3;

    col1.push(new Disk(4));
    col1.push(new Disk(3));
    col1.push(new Disk(2));
    col1.push(new Disk(1));
  }

  public boolean checkMove(Stack<Disk> destCol){
    if(destCol.size() == 0 || destCol.peek().getDiskSize() > currentCol.peek().getDiskSize()){
      return true;
    } else{
      return false;
    }
  }

  public void place(Stack<Disk> destCol){
    destCol.push(currentCol.pop());
    Stack<Disk> temp = currentCol;
    currentCol = destCol;
    destCol = temp;
  }

  public void remove(Stack<Disk> destCol){

  }

  // public Stack<Disk> determineCol(Stack<Disk> col1, Stack<Disk> col2, Stack<Disk> col3, int num){
  //   if(num == 1){
  //     return col1;
  //   } else if(num == 2){
  //     return col2;
  //   } else{
  //     return col3;
  //   }
  // }

  public Stack<Disk> getCurrentCol(){
    return currentCol;
  }

  public Stack<Disk> getDestCol1(){
    return destCol1;
  }

  public Stack<Disk> getDestCol2(){
    return destCol2;
  }

  public Stack<Disk> getCol1(){
    return col1;
  }

  public Stack<Disk> getCol2(){
    return col2;
  }

  public Stack<Disk> getCol3(){
    return col3;
  }
}