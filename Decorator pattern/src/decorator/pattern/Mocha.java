
package decorator.pattern;

public class Mocha extends ComponentDecorator
    {
              
        public Mocha(Coffee coffee)
        {          
            super(coffee);
        }

        @Override
        public String CalculateSophistication()
        {
            return "Advanced";
        }
    }

