package BItOperationDemo;

public class BitOperation_1 {
    byte a=2;
    byte b=6;

    public void run(){
        int bit =a&b;
        int bi =a^b;;
        System.out.println();
        System.out.println(bit);
    }
    public static void main(String[] args) {
        BitOperation_1 ob = new BitOperation_1();
        ob.run();
    }
}
