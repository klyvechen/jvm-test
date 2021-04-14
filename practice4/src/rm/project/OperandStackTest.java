package rm.project;

import java.util.Date;

public class OperandStackTest {


    public void testAddOperand() {
        // byte short char boolean；都以int型來保存
        byte i = 15;
        int j = 8;
        int k = i + j;
        int m = 800;
        int n = 800;
        int o = 9;
    }

    public static void main(String[] args) {
        OperandStackTest test = new OperandStackTest();
        test.testAddOperand();
    }

    public int getSum() {
        byte i = 15;
        int j = 8;
        return i + j;
    }

    public int testGetSum() {
        int i = getSum();
        int k = 10;
        i++;
        return 0;
    }

    public void add() {

        int i1 = 10;
        ++i1;

        int i2 = 10;
        i2++;

        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = 10;

        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = ++i8;

        int i9 = 10;
        i9 = i9++ + ++i9;
    }



}
