
package anasn.newcar;

/**
 *
 * @author 96654
 */
public class NewCar {

    
    private String maker;
    private int model ;   
     private String CarColor;
    
    


 public void setmaker(String m)
{
if (m =="Tuyota"||m=="Nissan"||m=="Honda")
            maker=m;
else 
      
      System.out.println("invalid maker");
}
 public void setmodel(int s)
 {
     if (s>2010)
         model=s;
     else 
      System.out.println("invalid model" +" ");
 }

    public void setCarColor(String CarColor) {
        if (CarColor == "RED" || CarColor == "SILVER" || CarColor == "WHITE")
        this.CarColor = CarColor;
        else 
      System.out.println("invalid CarColor");
    }
 

 public String getmaker()
 {
     return maker;
 }
 public int getmodel()
 {
     return model;
 }

    public String getCarColor() {
        return CarColor;
    }
 
}



    

