package BasicClasses;

import java.io.Console;

public abstract class User {
    private final String name;
    private final String contactInfo;



    public User(String name,String contactInfo){
        this.name = name;
        this.contactInfo = contactInfo;
    }


    public String getName(){
        return this.name;
    }
    public String getContactInfo(){
        return this.contactInfo;
    }


    public static void main(String...args){
        Console con ;
        if ((con = System.console()) != null){
            char[] pass = con.readPassword("Enter Password:");
            System.out.println("password: " + new String(pass));
        }
        else {
            System.out.println("No console found....");
        }
    }
}

