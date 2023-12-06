package WrapperUndGenerics;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {

        int zahl1 = 5;
        double zahl3 = 5.5;

        Integer zahl2 = Integer.valueOf(5);
        Double zahl4 = Double.valueOf(zahl3);

        System.out.println(zahl2);

    }
}
