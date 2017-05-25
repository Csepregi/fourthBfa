/**
 * Created by gabor on 2017.05.25..
 */
public abstract class Location {

    private Coordinate coords;

    public Location(Coordinate coords) {
        this.coords = coords;
    }

    public Coordinate getCoords() {
        return coords;
    }


    public void closestCity(Coordinate coordinate) {

    }
}
