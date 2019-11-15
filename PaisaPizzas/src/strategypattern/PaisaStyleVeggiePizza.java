package strategypattern;

public class PaisaStyleVeggiePizza extends Pizza {

	public PaisaStyleVeggiePizza() {
		name = "Cha Flor Pizza";
		dough = "Delicated Crust Dough";
		sauce = "Colombian pepper Sauce";
 
		toppings.add("Grated Paipa Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
                toppings.add("Beans");
                toppings.add("Corn");
                toppings.add("Tomatto");
		toppings.add("Mushrooms");
		toppings.add("Red paprika");
	}
}
