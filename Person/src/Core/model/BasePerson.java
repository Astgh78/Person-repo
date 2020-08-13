package Core.model;

public class BasePerson {
    //creating fields that are common for each person
    protected String name;
    protected String lastName;
    protected String nickname;
    protected String email;
    protected String designation;
    protected String gender;
    protected int age;
    protected String type;

    //creating constructor with all arguments
    public BasePerson(String name, String lastName, String nickname, String email, String designation, String gender, int age, String type) {
        this.name = name;
        this.lastName = lastName;
        this.nickname = nickname;
        this.email = email;
        this.designation = designation;
        this.gender = gender;
        this.age = age;
        this.type = type;
    }

    // creating getters


    public String getName() {
        try {
            if (0 < name.length() && name.length() < 255 && 0 < lastName.length() && lastName.length() < 255)
                return name;
            else {
                throw new InvalidNameException();
            }
        } catch (InvalidNameException e)
        }


    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getDesignation() {
        return designation;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }
}
