package mapreduce;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityManager {

    private Path FILE_PATTH = Paths.get("C:/bigdata", "city-data.txt");

    public List<City> getCities() {

        List<City> cities = new ArrayList<>();

        try {
            cities = Files.readAllLines(FILE_PATTH).parallelStream()
                    .map(x -> x.split(","))
                    .map(x -> {
                        return new City(x[0], x[1], x[2], x[3]);
                    })
                    .collect(Collectors.toList());

        } catch (Exception e) {
            System.out.println("mapreduce.MapReduce.main() " + e.getMessage());
        }

        return cities;
    }
}
