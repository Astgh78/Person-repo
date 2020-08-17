package Core.model;

import Core.exceptions.InvalidLastNameException;
import com.company.core.service.PersonAction;

import javax.naming.InvalidNameException;

public abstract class BasePerson implements PersonAction {
    //creating fields that are common for each person
    protected String name;
    protected String lastName;
    protected String nickName;
    protected String email;
    protected String designation;
    protected String gender;
    protected int age;

    //creating constructor with all arguments
    public BasePerson(String name, String lastName, String nickname, String email, String designation, String gender, int age) {
        this.name = name;
        this.lastName = lastName;
        this.nickName = nickName;
        this.email = email;
        this.designation = designation;
        this.gender = gender;
        this.age = age;
    }

    // creating getters

    public String setName() {
        try {
            if (0 < name.length() && name.length() < 255)
                return name;
            else {
                throw new InvalidNameException();
            }
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }


    public String setLastName() {
            try {
                if (0 < lastName.length() && lastName.length() < 255)
                    return lastName;
                else {
                    throw new InvalidLastNameException();
                }
            } catch (InvalidLastNameException e) {
                e.printStackTrace();
            }
        }

    public String setNickname() {
            try {
                if (0 < nickName.length() && nickName.length() < 255)
                    return name;
                else{

                }
        }
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


}
