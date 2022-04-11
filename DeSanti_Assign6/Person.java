public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(){
        this("name", "address", "phone", "email");
    }

    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String name){
        this.address = name;
    }
    
    public void setPhone(String name){
        this.phone = name;
    }

    public void setEmail(String name){
        this.email = name;
    }

    public String toString(){
        return "\nName :" + name + "\nAddress: " + address + "\nPhone: " + phone + "\nEmail: " + email;
    }
}