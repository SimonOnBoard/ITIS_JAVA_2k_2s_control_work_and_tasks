package avia;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlightsMain {
    public static void main(String[] args) throws IOException {
        List<Flight> flightList = new ArrayList<>();
        File file = new File("flights.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String s = bufferedReader.readLine();
        while ((s = bufferedReader.readLine()) != null){
            String[] strings = s.split("\\,");
            String number = strings[1].substring(1);
            Flight flight = new Flight(Integer.parseInt(strings[0]),Integer.parseInt(number),
                    strings[2],strings[3]);
            flightList.add(flight);
            System.out.println(flight.toString());
        }

        Set<Integer> integerSet = new HashSet<>();
        flightList.stream().forEach(x -> integerSet.add(x.getAirLine()));
        List<Integer> companies = flightList.stream().mapToInt(x -> x.getAirLine()).distinct().boxed().collect(Collectors.toList());
        System.out.println(companies.toString());
        Map<Integer, Long> flightsCount = new HashMap<>();
        companies.stream().forEach(x -> {
            long count = flightList.stream().filter(y -> y.getAirLine() == x).distinct().count();
            flightsCount.put(x,count);
        });
        companies.stream().forEach(x -> System.out.println(flightsCount.get(x) + " " + x));
    }
}
