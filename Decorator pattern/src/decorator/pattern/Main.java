
package decorator.pattern;


public class Main {
    
    public static void main(String[] args) {
        System.out.println("just coffee");
        Coffee coffee = new BaseCoffee();
        System.out.println(coffee.CalculateSophistication());
        
        System.out.println("\nwith milk");
        coffee = new Milk(new BaseCoffee());
        System.out.println(coffee.CalculateSophistication());
        
        System.out.println("\nwith milk and cook time > 2 minutes");
        coffee = new CookTime(new Milk(new BaseCoffee()));
        System.out.println(coffee.CalculateSophistication());
        
        System.out.println("\nwithout milk and cook time > 2 minutes");
        coffee = new CookTime(new BaseCoffee());
        System.out.println(coffee.CalculateSophistication());
        
        System.out.println("\nwith milk, mocha and a figure in the cover");
        coffee = new Mocha(new Figure(new Milk(new BaseCoffee())));
        System.out.println(coffee.CalculateSophistication());
    }
}
