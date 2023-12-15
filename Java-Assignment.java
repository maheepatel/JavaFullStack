import java.util.*;
public class Assignment{
    private ArrayList<String> cart=new ArrayList<>();
    public  void addProducttoList(String item)
    {
       cart.add(item);
    }
    public void sortProductList()
    {
        Collections.sort(cart);
    }
    public void display()
    {   
        sortProductList();
        System.out.println(cart);
    }
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        Assignment ob=new Assignment();
        while(true)
        {
             System.out.println("1.Add 2.Display 3.Exit");
             int input=sc.nextInt();
             if(input==1)
             {  
                System.out.println("enter the item to be added");
                String item=sc.next();
                ob.addProducttoList(item);
             }else if(input==2)
             {
                ob.display();
             }
             else if(input==3)
             {  
                System.out.println("Thank for Using our Apllication");
                break;
             }else{
                System.out.println("Enter a valid input");
             }
        }
        sc.close();
    }
}
