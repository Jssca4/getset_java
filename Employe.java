//Object Class
public class Employe {
    String nama;
    double salary;

    
    public String getNama() {
        return this.nama;
    }

    public void setName(String name) {
        this.nama = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    /*Constructor*/
    public Employe() {
        salary = 0;
        nama = ""; 
    }

    //Constructor Parameter
    public Employe(String nama, double salary){
        this.nama = nama;
        this.salary = salary ;
    
         
    }
    
    //Method
    public void print () {
        System.out.println("Nama :"+ nama);
        System.out.println("Salary :"+ salary);
        
        }
    }
        
    


    

