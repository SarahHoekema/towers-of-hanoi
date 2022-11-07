//Sean Chambers and Sarah Hoekema
//CS 145
//November 8, 2022
//Lab 5 - Towers of Hanoi

//TowersOfHanoi.java 
public class TowersOfHanoi {
    //initialize each peg of the tower
    private static Peg COL1 = new Peg(1);
    private static Peg COL2 = new Peg(2);
    private static Peg COL3 = new Peg(3);
    public static void main(String[] args){
        //add 4 disks of differing size to the first peg
        COL1.add(new Disk(4));
        COL1.add(new Disk(3));
        COL1.add(new Disk(2));
        COL1.add(new Disk(1));

        //this represents a a request to move 4 disks from COL1 to COL3
        solveHanoi(4,COL1,COL3,COL2); 

        //print out the contents of the 3rd peg
        System.out.println(COL3.remove());
        System.out.println(COL3.remove());
        System.out.println(COL3.remove());
        System.out.println(COL3.remove());
    }

    public static void solveHanoi(int n, Peg source, Peg destination, Peg other){
        //base case if only one disk left to move, then move to destination
        if(n==1){
            destination.add(source.remove());
            return;
        } else {
            //recursively move one less disk to open peg to allow bottom disk to move
            solveHanoi(n-1, source, other, destination); 
            //move bottom peg to destination
            destination.add(source.remove());
            //recursively move the stack of one less disk to be on top of recently moved disk.
            solveHanoi(n-1, other, destination, source);
        }
    }
}
