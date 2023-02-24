
package anasn.newcar;


public class newJavaFile {

    
    public static void main(String args[]) {
        NameCar c1= new NameCar();
        System.out.println("******first car is*****");
        c1.setmaker("Nissan");
        c1.setType("Altima");
        c1.setCarColor("SILVER");
        c1.setmodel(2020);
        c1.setCarColor("SILVER");
      
        System.out.println("Car marker is " + c1.getmaker());
        System.out.println("Car name is" + c1.getname());
        System.out.println("Car CarColor is" +c1.getCarColor());
        System.out.println("Car model is " + c1.getmodel());
        
        
    }
}
