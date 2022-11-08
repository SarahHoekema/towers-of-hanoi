//Sean Chambers and Sarah Hoekema
//CS 145
//November 8, 2022
//Lab 5 - Towers of Hanoi

import java.util.*;

//Peg.java represents a single peg of the Towers of Hanoi puzzle
public class Peg {
    //fields
    private int pegNum;
    private Stack<Disk> col;

    //constructor
    public Peg(int num){
        this.pegNum = num;
        this.col = new Stack<Disk>();
    }

    //accepts a Disk as a parameter
    //adds a single disk to the peg Stack
    public void add(Disk disk){
        col.push(disk);
    }

    //removes a single Disk from the peg Stack
    //returns a Disk
    public Disk remove(){
        return col.pop();
    }

    //returns the peg number
    public int getPegNum(){
        return pegNum;
    }
}
