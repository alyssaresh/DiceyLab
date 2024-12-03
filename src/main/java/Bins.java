
public class Bins {
    private int[] bins;

    public Bins(int minValue, int maxValue) {
        bins = new int[maxValue];
    }

    public void incrementBin(int value) {
        bins[value - 1]++;
    }

    public int getBin(int value) {
        return bins[value - 1];
    }

}
