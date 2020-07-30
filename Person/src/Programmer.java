public class Programmer extends Person {
String companyName;
    public Programmer(String name, String designation) {
        super(name, designation);
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    void learn() {
        super.learn();
    }

    @Override
    void walk() {
        super.walk();
    }

    @Override
    void eat() {
        super.eat();
    }

    void code(){

    }
}
