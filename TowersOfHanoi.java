//Sean Chambers and Sarah Hoekema
//CS 145
//November 8, 2022
//Lab 5 - Towers of Hanoi

//TowerOfHanoi.java solves the Towers of Hanoi puzzle. The puzzle involves manipulating 4 disks
//of decreasing size between 3 different towers, or pegs, so that all the disks
//from the first column will eventually be stacked on the 3rd peg in decreasing order,
//with the smallest on top. Only one disk can be moved at a time and no disk may be placed
//on top of a disk smaller than it. The program utilizes a Disk and Peg class to represent
//the disks and pegs and uses recursion to solve the puzzle, then prints out the resulting
//stack on the 3rd peg.
public class TowersOfHanoi {
    public static void main(String[] args){
        Peg col1 = new Peg(1);
        Peg col2 = new Peg(2);
        Peg col3 = new Peg(3);

        //add 4 disks of differing size to the first peg
        col1.add(new Disk(4));
        col1.add(new Disk(3));
        col1.add(new Disk(2));
        col1.add(new Disk(1));

        //this represents a a request to move 4 disks from col1 to col3
        solveHanoi(4,col1,col3,col2); 

        //print out the contents of the 3rd peg
        System.out.println(col3.remove());
        System.out.println(col3.remove());
        System.out.println(col3.remove());
        System.out.println(col3.remove());
    }

    //accepts a int num and source, destination, and other Pegs as parameters
    //move disks between the pegs while following a recursive pattern in order
    //to solve the puzzle
    public static void solveHanoi(int n, Peg source, Peg destination, Peg other){
        //base case if only one disk left to move, then move to destination
        if(n==1){
            destination.add(source.remove());
            return;
        } else {
            //recursively move one less disk to open peg to allow bottom disk to move
            solveHanoi(n-1, source, other, destination); 
            //move bottom disk to destination
            destination.add(source.remove());
            //recursively move the stack of one less disk to be on top of recently moved disk.
            solveHanoi(n-1, other, destination, source);
        }
    }
}
