/**
 * Created by harvey on 10/24/16.
 */
public class NewtonRoot {
    public static double Root(int n, double precision){
        int counter = 0;
        int guess1 = n;
        int guess2 = guess1;

        while(Math.abs(n - guess1 * guess1) > precision){
            guess1 = (guess2 + n/guess2)/2;
            guess2 = guess1;
            counter ++;
        }
        System.out.println(counter);
        return guess1;
    }
    public static void main(String[] args){
        System.out.println(NewtonRoot.Root(50, 1));
    }

}
