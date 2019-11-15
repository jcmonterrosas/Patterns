
package decorator.pattern;

public class CookTime extends ComponentDecorator
    {
        private String sophistication = "";
        
        public CookTime(Coffee coffee)
        {          
            super(coffee);
            sophistication = coffee.CalculateSophistication();
        }

        @Override
        public String CalculateSophistication()
        {   
            if(sophistication.equals("Elementary")){
                return "Sophisticated";
            }else{
                return "Basic";
            } 
        }
    }

