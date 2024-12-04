package demo.java.collection.association;

class person{
    String name;
    int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Address{
    String street;
    String city;
    int zip;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
public class ManyToManyTest {
    public static void main(String[] args) {
        person p = new person();
        p.setName("puja");
        p.setAge(27);

        Address a = new Address();
        a.setStreet("BLR");
        a.setCity("Bangalore");
        a.setZip(1234);

        person p1 = new person();
        p1.setName("Neha");
        p1.setAge(29);

        Address a1 = new Address();
        a1.setStreet("Delhi");
        a1.setCity("dl");
        a1.setZip(1234);

        System.out.println("first person :"+p.getName()+"  Age :" + p.getAge()+" Address :"+a.getStreet()+" City :"+a.getCity()+" Zip :"+a.getZip()+a.getStreet()+a.getCity());

        System.out.println("second person :"+p1.getName()+" Age :" + p1.getAge()+" Address :"+a1.getStreet()+" City :"+a1.getCity()+" Zip :"+a1.getZip()+a1.getStreet()+a1.getCity());



    }
}
