
package decorator.pattern;

  public class Milk extends ComponentDecorator
    {
        
        public Milk(Coffee c)
        {          
            super(c);
        }
        
        @Override
        public String CalculateSophistication(){
            return "Elementary";
        }
    }

