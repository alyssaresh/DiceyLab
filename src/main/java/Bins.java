
public class Bins {
    private int[] bins;
    private int min;
    private int max;

    public Bins(int minValue, int maxValue) {
        bins = new int[maxValue];
        this.min = minValue;
        this.max = maxValue;
    }

    public void incrementBin(int value) {
        bins[value - 1]++;
    }

    public int getBin(int value) {
        return bins[value - 1];
    }

}
