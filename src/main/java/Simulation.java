public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    private Bins bins;
    private Dice dice;

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        this.bins = new Bins(numberOfDice, numberOfDice*6);
    }

    public void runSimulation() {
        for (int i = 0; i<numberOfTosses; i++){
            bins.incrementBin(dice.tossAndSum());
        }
        printResults();
    }

    public void printResults() {
        System.out.println("***");
        System.out.println("Simulation of " + numberOfDice + " dice tossed for " + numberOfTosses + " times.");
        System.out.println("***");
        for (int i = numberOfDice; i <= numberOfDice*6; i++){
            StringBuilder starString = new StringBuilder();
            int results = bins.getBin(i);
            double percentage = (double) results /numberOfTosses *100;
            for (int j = 0; j <= results; j= j + 10000){
                starString.append("*");

            }
            System.out.printf("%2d : %8d: %.2f %s\n", i, results, percentage, starString.toString());
        }
        }

    public String getStars(int value){
        String starString = "";
        for (int i = 0; i<=value; i++){
            int numOfStars = value/numberOfTosses;
            for (int j = 0; j <= numOfStars; j++){
                starString += "*";
            }
        } return starString;
    }

}
