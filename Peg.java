public class Peg {
    private int pegNum;
    private Stack<Disk> col;

    public Peg(int num){
        this.pegNum = num;
    }

    public static void add(Disk disk){
        col.push(disk);
    }

    public static void move(Peg other){
        other.col.push(this.col.pop());
    }

}
