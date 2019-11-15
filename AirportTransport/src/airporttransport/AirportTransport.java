package airporttransport;

import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class AirportTransport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Choose strategyChooser = new Choose();
        int distanceToAirport = 20;
        System.out.println("Desde su ubicacion, la distancia al aeropuerto es: " + distanceToAirport + " km");
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuanto es su presupuesto? (pesos): ");
        int budget = scanner.nextInt();
        System.out.print("¿En cuantos minutos debe llegar?: ");
        int time = scanner.nextInt();

        if(distanceToAirport != 0){
            if (budget < 2400) {
                strategyChooser.getTranport(new BicycleStrategy(distanceToAirport), budget, time);
            } else {
                if (time < 25) {
                    strategyChooser.getTranport(new TaxiStrategy(distanceToAirport), budget, time);
                } else {
                    strategyChooser.getTranport(new BusStrategy(distanceToAirport), budget, time);
                }
            }
        }else{
            System.out.println("\nYa estas en el aeropuerto");
        }
    }
    
}
