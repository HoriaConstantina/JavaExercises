package run;

import org.hc.*;

public class Starter {

    public static void main(String[] args) {

        // I need to add tests

        /* Exercise 1 */
        Ex1 ex1 = new Ex1();
        ex1.sleepIn(true, false);

        /* Exercise 2 */
        Ex2 ex2 = new Ex2();
        ex2.diff21(30);

        /* Exercise 3 */
        Ex3 ex3 = new Ex3();
        ex3.parrotTrouble(false, 8);

        /* Exercise 4 */
        Ex4 ex4 = new Ex4();
        ex4.posNeg(2, 8, true);

        /* Exercise 5 */
        Ex5 ex5 = new Ex5();
        ex5.frontBack("Hello");

        /* Exercise 6 */
        Ex6 ex6 = new Ex6();
        ex6.loneTeen(8, 16);

        /* Exercise 7 */
        Ex7 ex7 = new Ex7();
        ex7.startOz("Ozymyzo");

        /* Exercise 8 */
        Ex8 ex8 = new Ex8();
        ex8.stringE("Horia");

        /* Exercise 9 */
        Ex9 ex9 = new Ex9();
        ex9.front22("World");

        /* Exercise 10 */
        Ex10 ex10 = new Ex10();
        ex10.nearHundred(280);
    }
}
