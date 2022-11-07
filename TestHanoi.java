public class TestHanoi {
    private static Peg col1 = new Peg(1);
    private static Peg col2 = new Peg(2);
    private static Peg col3 = new Peg(3);
    public static void main(String[] args){

        col1.add(new Disk(4));
        col1.add(new Disk(3));
        col1.add(new Disk(2));
        col1.add(new Disk(1));

        solveHanoi(4,col1,col3,col2); //not sure how to clean this so col3 is last

        System.out.println(col3.remove());
        System.out.println(col3.remove());
        System.out.println(col3.remove());
        System.out.println(col3.remove());
    }

    public static void solveHanoi(int n, Peg source, Peg destination, Peg other){
        if(n==1){
            destination.add(source.remove());
            return;
        } else {
            solveHanoi(n-1, source, other, destination); 
            destination.add(source.remove());
            solveHanoi(n-1, other, destination, source);
        }
    }
}
