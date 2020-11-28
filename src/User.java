//import com.sun.corba.se.spi.ior.ObjectId;
//import netscape.security.Privilege;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
    private int id;
    String name;
    String phonenumber;
    String Email;
    String password;
    List<Book> bookList = new ArrayList<>();

    public User(String name,String phonenumber,String password,String Email){
        this.Email=Email;
        this.name=name;
        this.phonenumber=phonenumber;
        this.password=password;
    }

    public User(){
        Random r = new Random();
        this.id = r.nextInt(100);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){

        return name + ":" + phonenumber + ":" + password + ":" + Email ;
    }
}