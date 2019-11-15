
package decorator.pattern;

public class Figure extends ComponentDecorator
    {
  
        public Figure(Coffee coffee)
        {          
            super(coffee);
        }

        @Override
        public String CalculateSophistication()
        {
            return "Advanced";
        }
    }
