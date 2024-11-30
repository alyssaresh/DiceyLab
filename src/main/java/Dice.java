import java.util.HashMap;
import java.util.Random;

public class Dice {
    Random random = new Random();
    public int numOfDice;

    public Dice(int i) {
    this.numOfDice = i;
    }

    public Integer tossAndSum() {
    int sum = 0;
    for (int i = 1; i <= numOfDice; i++){
        sum += toss();
        } return sum;
    }

    public int toss() {
        return random.nextInt(6) + 1;
    }


    public static void main(String[] args){
        Dice dice = new Dice(2);
        System.out.println(dice.tossAndSum());
    }
}
