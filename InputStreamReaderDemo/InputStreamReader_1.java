package InputStreamReaderDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamReader_1 {
    //*********Found**********
    public static void main(String[] args) throws Exception {
        InputStreamReader ir;
        BufferedReader in;
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
        System.out.println("���������:");
        //*********Found**********
        String s = in.readLine();
        //*********Found**********
        int year = Integer.parseInt(s);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("" + year + "��������.");
        } else {
            System.out.println("" + year + "�겻������.");
        }
    }
}