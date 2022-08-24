package methods;

import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RemoveByIndex {
	public static void main(String[] args)
	{
	List<Integer> li=new LinkedList<>();     //default size 5
	li.add(12);
	li.add(13);
	li.add(14);
	li.add(3);
	li.add(4);
	li.add(5);
	System.out.println("list:" +li);
	System.out.println("size is:" +li.size());
	
	List<Integer> li1=new LinkedList<>();                        //create another list2
	li1.add(15);
	li1.add(16);
	li.addAll(li1);                                            //adds elements by index
	li.remove(4);                                              //remove by index
	
 	Iterator<Integer> itr=li.listIterator();                  //remove element by iterator.remove()
	while(itr.hasNext())
	{
		if(itr.next()>=10)
		{
			itr.remove();
		}
	}
	System.out.println(li); 
	
	for(Integer in:li) {
		//System.out.println("in :" +li);
	} 
	
	boolean k = li.removeIf(r->(r%2==0));                      //remove element by remove-if
	System.out.println(k);
	
	System.out.println(li);
	
	System.out.println("before set() method");
	ArrayList<String> str=new ArrayList<>();
	str.add("josna");
	str.add("sai");
	
	ListIterator<String> it=str.listIterator();                   //set method to update last element
	while(it.hasNext()) {
		System.out.println(it.next());
	
	 
	}
	it.set("pasala");
	System.out.println("after using the set() method:");
	for(String item:str) {
		System.out.println(item);
		
	} 
	
	List<String> s8=new LinkedList<>();                     //contains method
	s8.add("Zosna");
	s8.add("josu");
	s8.add("nithii");
	System.out.println(s8);
	Collections.sort(s8);
	System.out.println(s8);
	
      String index=s8.get(0);          // returns the data at specified position
      System.out.println(index);
      
      
      int  s1=s8.size();
      System.out.println(s1);       // returns the no.of elements in list
      
      boolean s2=s8.isEmpty();
      System.out.println(s2);       // checks list is empty and gives boolean statements
		
		
		boolean s4=s8.retainAll(s8);  //retain method returns ele in list
		System.out.println(s8);   
		
		
		List<Integer> l=new LinkedList<>();
		for(int i=0;i<100;i++)
		{
			l.add(i);
		}  
		      
		  Object[]  a1=l.toArray();      //toarray() prints ele in order
		  
		  for(int i=0;i<a1.length;i++)
		  {
			  
		  }
			  System.out.println("elements" +l);
			
			  System.out.println(li.subList(1, 10));
		  
		
		
      
      
      
      
      
  	  
    	  
    	  
    	  
    	  
      }
      
      
      
	
	
	

	
	
	}
	
	
			
	
	
	
	
	
	 
	
	
	



