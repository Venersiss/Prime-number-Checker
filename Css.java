/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package css;

import java.util.Scanner;

/**
 *
 * @author Godisgood10
 */
public class Css {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        int count = 0;
        String s;
        do {
            System.out.println("I love you barbie");
            float b = a.nextFloat();

            for (int i = 1; i <= b; i++) {
                float y = b / i;

                if (b % i == 0) {
                    count = count + 1;
                }

            }
            if (count == 2) {
                System.out.println("the number is a prime number!");

            } else {
                System.out.println("unfortunately the number is not a prime number");
            }
            System.out.println("""
                               do you want to try again?
                               [yes] [no]""");
            s = a.next();
        } while (s.equals("yes"));
    }
}
