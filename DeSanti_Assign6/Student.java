public class Student extends Person{
    
    public int status;
    public final static int FRESHMAN = 0;
	public final static int SOPHOMORE = 1;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 3;

    public Student(String name, String address, String phone, String email, int status){
        super(name, address, phone, email);
        this.status = status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public String getStatus(){
        if(status==0){
            return "FRESHMAN";
        }
        else if(status==1){
            return "SOPHOMORE";
        }
        else if(status==2){
            return "JUNIOR";
        }
        else if(status==3){
            return "SENIOR";
        }
        else{
            return "Error";
        }
    }

    public String toString(){
        return super.toString()+"\nStatus: " + getStatus();
    }
}
