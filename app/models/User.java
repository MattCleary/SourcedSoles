/*
Website Development CA2
Ian Daly - X00132250
Matthew Cleary - X00130277
Shane Cotter - X00131736
 */

package models;

public class User {

    //Attributes
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String passwordTwo;
    private String country;

    //Default Constructor
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.password = "";
        this.passwordTwo = "";
        this.country = "";
    }

    //Overload Constructor
    public User(String firstName, String lastName, String email, String password, String passwordTwo, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.passwordTwo = passwordTwo;
        this.country = country;
    }
}
