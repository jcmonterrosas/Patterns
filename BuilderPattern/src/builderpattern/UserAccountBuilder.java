package builderpattern;

public class UserAccountBuilder implements IBuilder {
    private long accountNumber;
    private String owner;
    private String type;
    private String biography;
    private int age;

    public UserAccountBuilder(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public UserAccountBuilder withOwner(String owner){
        this.owner = owner;
        return this;  //By returning the builder each time, we can create a fluent interface.
    }

    public UserAccountBuilder withType(String type){
        this.type = type;
        return this;
    }

    public UserAccountBuilder withBiography(String biography){
        this.biography = biography;
        return this;
    }

    public UserAccountBuilder withAge(int age){
        this.age = age;
        return this;
    }

    @Override
    public UserAccount build(){
        UserAccount account = new UserAccount();
        account.setAccountNumber(this.accountNumber);
        account.setOwner(this.owner);
        account.setType(this.type);
        account.setBiography(this.biography);
        account.setAge(this.age);
        return account;
    }


}
