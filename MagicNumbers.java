import java.util.ArrayList;

public class MagicNumbers {
    private final int BASE;

    public MagicNumbers(int x) {
        if(x < 2) throw new InvalidBaseException(x + " is not a valid base for numbers. A base should be 2 or more.");
        BASE = x;
    }
    public MagicNumbers() {
        this(10);
    }
    public ArrayList<Long> findRemainders(long n, long x) {
        ArrayList<Long> remainders = new ArrayList<>();
        while(true) {
            long index = remainders.indexOf(n);
            if(index != -1) {
                if(index == 0) {
                    return (ArrayList<Long>) remainders.clone();
                } else {
                    return null;
                }
            }
            remainders.add(n);
            n = (BASE*n)%x;
        }
    }

    public boolean isMagicNumber(long x) {
        ArrayList<Long> remainders = findRemainders(1, x);
        if(remainders == null || x <= 2) return false;
        for(long i = 2; i < x; i++) {
            if(!remainders.contains((BASE*i)%x)) return false;
        }
        return true;
    }

    public ArrayList<Long> findMagicNumbersBetween(long x, long y) {
        ArrayList<Long> magicNumbers = new ArrayList<>();
        for(long i = x; i <= y; i++) {
            System.out.print("Checking if " + i + " is a magic number... ");
            if(isMagicNumber(i)) {
                System.out.println("IT IS!");
                magicNumbers.add(i);
            } else {
                System.out.println("It is not.");
            }
        }
        return (ArrayList<Long>) magicNumbers.clone();
    }

    public long findSmallestMagicNumber() {
        for(long i = 1; i <= Long.MAX_VALUE; i++) {
            System.out.print("Checking if " + i + " is a magic number... ");
            if (isMagicNumber(i)) {
                System.out.println("IT IS!");
                return i;
            } else {
                System.out.println("It is not.");
            }
        }
        return -1;
    }

}
