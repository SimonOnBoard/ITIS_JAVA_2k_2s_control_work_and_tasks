package avia;


@Author(name = "Ivan")
public class Flight {
    private int airLine;
    private int flightNumber;
    private String source;
    private String destination;
    public int getAirLine() {
        return airLine;
    }

    public Flight() {
    }

    public void setAirLine(int airLine) {
        this.airLine = airLine;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Flight(int airLine, int flightNumber, String source, String destination) {
        this.airLine = airLine;
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airLine=" + airLine +
                ", flightNumber=" + flightNumber +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    private void getInfo(String s1){
        System.out.println(s1);
    }
}
