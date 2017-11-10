package mapreduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javafx.print.Collation;

public class MapReduce {

    public static void main(String[] args) {

        CityManager cityManager = new CityManager();

        List<City> cities = cityManager.getCities();

        System.err.println("The number of cities are " + cities.size());
        
        ArrayList<String> kenya =  cities
                .stream()
                .filter(x->x.getCountry().toLowerCase() =="kenya")
                .collect(Collectors.toList());
    }

}
