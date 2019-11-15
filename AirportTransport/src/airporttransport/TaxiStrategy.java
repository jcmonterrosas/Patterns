package airporttransport;

public class TaxiStrategy implements Strategy {

    private int pricePerMinute = 250;
    public double speed = 80;
    private int distanceToAirport;

    public TaxiStrategy(int distanceToAirport) {
        this.distanceToAirport = distanceToAirport;
    }

    @Override
    public void transport(int time, int budget) {
        double price = ((double) distanceToAirport / speed)* 60 * pricePerMinute;
        System.out
                .println("\nMetodo de transporte: taxi" + "\n" + "Valor a pagar: " + price + "\n" + "Tiempo de viaje : "
                        + ((double) distanceToAirport / speed)*60 + " minutos"+ "\n" + "Dinero restante: " + (budget - price) + "\n");

        if((budget - price) < 0){
            System.out.println("\nNo tiene dinero suficiente, le sugerimos el siguiente transporte: ");
            Choose strategyChooser = new Choose();
            if (budget < 2400) {
                strategyChooser.getTranport(new BicycleStrategy(distanceToAirport), budget, time);
            } else {
                strategyChooser.getTranport(new BusStrategy(distanceToAirport), budget, time);
            }
        }
    }
}