package strategypattern;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
                PizzaStore paisaStore = new PaisasPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
                
                pizza = paisaStore.orderPizza("clam");
                System.out.println("Joel ordered a " + pizza.getName() + "\n");
                
                pizza = paisaStore.orderPizza("cheese");
                System.out.println("Joel ordered a " + pizza.getName() + "\n");
                
                pizza = paisaStore.orderPizza("pepperoni");
                System.out.println("Joel ordered a " + pizza.getName() + "\n");
                
                pizza = paisaStore.orderPizza("veggie");
                System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
