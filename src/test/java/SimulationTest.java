import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SimulationTest {

    @Test
    public void numOfDice() {
        Dice dice = new Dice(2);
        Assertions.assertEquals(2, dice.numOfDice);
    }

    @Test
    public void diceSides() {
        Dice dice = new Dice(1);
        int expected = dice.toss();
        Assertions.assertTrue(expected <= 6 && expected > 0);
    }

    @Test
    public void TossandSumTest(){
        Dice dice = new Dice(5);
        int actual = dice.tossAndSum();
        Assert.assertTrue(actual <= 30 && actual >=5 );
    }

    @Test
    public void getBinTest(){
        Bins testBin = new Bins(2,12);
        int valueAtMax = testBin.getBin(12);
        int expected = 0;
        Assertions.assertEquals(0, valueAtMax);
    }

    @Test
    public void getBinWithValues(){
        Bins testBin = new Bins(2,12);
        testBin.incrementBin(10);
        int valueAtBin = testBin.getBin(10);
        int expected = 1;
        Assertions.assertEquals(1, valueAtBin);
    }

    @Test
    public void SimulationTest2(){
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
    }

    @Test
    public void SimulationTest5(){
        Simulation simulation = new Simulation(5, 10000000);
        simulation.runSimulation();
    }

}


