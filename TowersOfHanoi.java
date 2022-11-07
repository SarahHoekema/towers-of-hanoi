import java.util.*;

public class TowersOfHanoi{
  public static void main(String[] args){
    Stack<Disk> col1 = new Stack<Disk>();
    Stack<Disk> col2 = new Stack<Disk>();
    Stack<Disk> col3 = new Stack<Disk>();

    col1.push(new Disk(7));
    col1.push(new Disk(5));
    col1.push(new Disk(3));
    col1.push(new Disk(1));
  }
}