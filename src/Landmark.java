/**
 * Created by gabor on 2017.05.25..
 */
public class Landmark extends Location {

    private String name;
    private int entranceFee;


    public Landmark(Coordinate coords, int entranceFee) {
        super(coords);
        this.entranceFee = entranceFee;
    }

    public int getEntranceFee() {
        return entranceFee;
    }

    public void setEntranceFee(int entranceFee) {
        this.entranceFee = entranceFee;
    }
}
