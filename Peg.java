//Sean Chambers and Sarah Hoekema
//CS 145
//November 8, 2022
//Lab 5 - Towers of Hanoi

import java.util.*;

public class Peg {
    private int pegNum;
    private Stack<Disk> col;
    private int size;

    public Peg(int num){
        this.pegNum = num;
        this.col = new Stack<Disk>();
        this.size = 0;
    }

    public void add(Disk disk){
        col.push(disk);
        size++;
    }

    public Disk remove(){
        size--;
        return col.pop();
    }

    public Disk checkDisk(){
        return col.peek();
    }

    public int getPegNum(){
        return pegNum;
    }

    public int size(){
        return size;
    }
}
