package Core.model;

import Core.model.Person;

public class Singer extends Person {
    public String brandName;

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


    void playGuitar(){
   

    }
}
