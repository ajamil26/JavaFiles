package day63_functional_interface;

import java.util.List;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = n -> {
            if(n % 2 == 0){
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };

        evenOrOdd.apply(20);
        evenOrOdd.apply(25);

        NumberInterface cube = (number) -> {
            System.out.println(number * number * number);
        };

        //NumberInterface cube = number -> System.out.println(number * number * number);

        cube.apply(3);
        cube.apply(4);


    }
}
