package builderpattern;

/**
 *
 * @author juanc
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserAccountBuilder builder = new UserAccountBuilder(12345l);

        UserAccount userAccount = builder.withBiography("Naci en Colombia")
                .withOwner("Juli")
                .withAge(20)
                .withType("PREMIUM")
                .build();
        
        System.out.println(userAccount);
        System.out.println("Usuario " + userAccount.getOwner() + " creado con exito.");
    }
    
}
