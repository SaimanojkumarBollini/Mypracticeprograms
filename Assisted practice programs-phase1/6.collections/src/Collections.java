//types of collections 

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		//creating an arraylist
		System.out.println("ArrayList");
		ArrayList<String> friends=new ArrayList<String>();   
	      friends.add("Manoj");//
	      friends.add("lokesh");    	   
	      System.out.println(friends);  
		
		//creating an vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(20); 
	      vec.addElement(40); 
	      System.out.println(vec);
		
		//creating an  linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Manoj");  
	      names.add("lokesh");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating an hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(11);  
	       set.add(12);
	       set.add(13);
	       System.out.println(set);
	       
	       //creating an linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
	}
