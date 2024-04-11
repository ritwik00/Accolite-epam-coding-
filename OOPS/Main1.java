package OOPS;

public class Main1 {
    public static void main(String[] args) {
     Dog d = new Dog("Dinga", "Pitbull"); 
     System.out.println(d.name+" "+d.breed);
     d.setBreed("Husky");
     d.setName("Duke");  
     System.out.println(d.name+" "+d.breed);
    }
}
class  Dog {
    String name;
    String breed;
    Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
}