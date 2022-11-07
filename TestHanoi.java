public class TestHanoi {
    private static Peg col1 = new Peg(1);
    private static Peg col2 = new Peg(2);
    private static Peg col3 = new Peg(3);
    public static void main(String[] args){

        col1.add(new Disk(4));
        col1.add(new Disk(3));
        col1.add(new Disk(2));
        col1.add(new Disk(1));

        //this represents a a request to move 4 disks from col1 to col3
        solveHanoi(4,col1,col3,col2); 

        System.out.println(col3.remove());
        System.out.println(col3.remove());
        System.out.println(col3.remove());
        System.out.println(col3.remove());
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
