package decorator.pattern;

  public abstract class ComponentDecorator implements Coffee
    {
        private Coffee coffee;

        public ComponentDecorator(Coffee coffe){
            setCoffee(coffee);
        } 
        
        public Coffee getCoffee(){
            return coffee;
        }
        
        public void setCoffee(Coffee coffee){
            this.coffee=coffee;
        }
        
        public String CalculateSophistication(){
            return this.coffee.CalculateSophistication();
        }
        
    }