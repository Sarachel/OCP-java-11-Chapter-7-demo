import java.util.*; //Replace * met "Random" and it still works

public class RandomName
{    
  	public static void main(String[] args)    
    {        
      	var [] arr={"Alex", "Sara", "Dwain", "Joell", "Yogesh"};
      	Random r=new Random();        
      	int randomName=r.nextInt(arr.length);
      	System.out.println("Next: "+arr[randomName]);
    }
}