
package anasn.newcar;


public class NameCar extends NewCar {
   String name;
   
    public void setType(String name) {
        
        if (name == "Camry"|| name == "Yaris" || name == "corolla")
            this.name = name;
        else if (name == "Altima" || name == "maxima")
        this.name = name;
        else if (name == "azera" || name =="sonata" )
        this.name = name;
        else 
            System.out.println("Car is not available in my company");
    }
    public String getname() {
        return  name;
}
    
}


    
        
            
    

   

    


    

