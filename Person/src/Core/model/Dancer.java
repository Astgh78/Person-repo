package Core.model;

public class Dancer extends BasePerson {
    public String groupName;

    public Dancer(String name, String lastName, String nickname, String email, String designation, String gender, int age, String type, String groupName) {
        super(name, lastName, nickname, email, designation, gender, age, type);
        this.groupName = groupName;
    }
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

   /* @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void dance(){

    }*/
}
