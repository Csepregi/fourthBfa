import java.util.ArrayList;

/**
 * Created by gabor on 2017.05.25..
 */
public class TripPlan {

    Coordinate coordinate = new Coordinate(10, 30);

    Landmark landmarks = new Landmark(coordinate, 10);

    public ArrayList<Location> getLocations() {
    ArrayList<Location> locations = new ArrayList<>();
        for (int i = 15; i < locations.size() ; i++) {
        locations.add(landmarks);
    }
        return locations;
}
}
