package airporttransport;

public class BusStrategy implements Strategy {

    private int price = 2400;
    public double speed = 50;
    private int distanceToAirport;

    public BusStrategy(int distanceToAirport) {
        this.distanceToAirport = distanceToAirport;
    }

    @Override
    public void transport(int time, int budget) {
        System.out.println("\nMetodo de transporte: bus" + "\n" + "Valor a pagar: " + price + "\n" + "Tiempo de viaje: "
                + ((double) distanceToAirport / speed)*60 + " minutos"+ "\n" + "Dinero restante: " + (budget - price) + "\n");
    }
}