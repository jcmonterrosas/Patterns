
package decorator.pattern;

public class CookTime extends ComponentDecorator
    {

        public CookTime(Coffee coffee)
        {          
            super(coffee);
        }

        @Override
        public String CalculateSophistication()
        {
            return "Basic";
        }
    }

