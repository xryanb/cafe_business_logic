
import java.util.ArrayList;

public class CafeUtil {
    public Integer getStreakGoal(){
      int myStreak[]={1,2,3,4,5,6,7,8,9,10};
     int sum= 0;
     for (int i: myStreak)
     sum += i;
     return sum;
        
    }
    
    public Double getOrderTotal(double [] prices){
       double sum=0;
        for (double i: prices)
        sum += i;
        return sum;

    }

    public void displayMenu(ArrayList<String>menuitems){
for (int i =0; i < menuitems.size(); i++){
    String name= menuitems.get(i);
    System.out.println(i +" " + name);
        }
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName=System.console().readLine();
        System.out.println("Hello " + userName +"!");
        int line=customers.size();
        
        System.out.println("There are " + line + " people in front of you!");
      customers.add(userName);
      System.out.println(customers);
        }
        
    }



