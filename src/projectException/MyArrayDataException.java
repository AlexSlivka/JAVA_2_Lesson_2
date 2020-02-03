package projectException;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;


    public MyArrayDataException(String messege, int i,int j) {
        super(messege);
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
