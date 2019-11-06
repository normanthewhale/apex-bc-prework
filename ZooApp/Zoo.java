package ZooApp;

class Zoo {

    String name;
    String street;
    String city;
    String zip;
    String phone;
    String email;
    String[] animals;

    public Zoo(String name, String street, String city, String zip, String phone, String email){
        this.name = name;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String[] getInfo(){
        String[] info = {this.name, this.street, this.city, this.zip, this.phone, this.email};
        return info;
    }

    public String[] getAnimals(){
        return this.animals;
    }

}