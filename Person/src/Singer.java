public class Singer extends Person{
    String brandName;

    public Singer(String name, String designation) {
        super(name, designation);
    }

    public Singer(String name, String designation, String brandName) {
        super(name, designation);
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    void playGuitar(){

    }
}
