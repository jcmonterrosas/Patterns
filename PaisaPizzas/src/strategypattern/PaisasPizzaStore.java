package strategypattern;

public class PaisasPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new PaisaStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new PaisaStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new PaisaStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new PaisaStylePepperoniPizza();
		} else return null;
	}
}

