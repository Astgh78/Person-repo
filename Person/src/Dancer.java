public class Dancer extends Person{
    String groupName;

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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

    void dance(){

    }
}
