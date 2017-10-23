
import java.util.Scanner;
public class NameShippment  implements Container  {
	
	public String shipcost[] ={"item1" , "item2" ,"item3" , "item4"};
	public double cost=0;
	public int weight;
	@Override
	   public Iterator getIterator() {
	      return new NameIteratorShippment();
	   }

	   private class NameIteratorShippment implements Iterator {

	      int shoplist;
	  @Override
	      public boolean hasNext() {
	      
	         if(shoplist <shipcost.length){
	            return true;
	         }
	         return false;
	  }   
	  @Override
	      public Object next() {
	      
	         if(this.hasNext()){ 
	            return shipcost[shoplist++];
	         }
	         return null;
	         
	      }		
	      public Object cost() {
	    	 
	    	  @SuppressWarnings("resource")
			Scanner  in= new Scanner(System.in);
		      System.out.println("Enter weight:");
		      double weight=in.nextDouble();
		      if(weight<=5)
		      {
		    	  double cost=weight*0.75;
		    	 System.out.println("cost:"+cost);
		    	  return cost;
		      }
		      if(weight>5)
		      {
		    	  double cost=weight*0.50;
		    	  System.out.println("cost:"+cost);
		    	  return cost;
		    	  
		      }
		      return null;
	      }
	      

	   
	      
	   }
}
