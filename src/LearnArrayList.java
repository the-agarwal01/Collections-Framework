package collectionsjava;
import java.util.*;
public class Array_list {
	
	/*
	 * 
	 * sysout + Ctrl +space
	 * main +Ctrl+space
	 */
	 public static void main(String[] args) throws Exception {
	ArrayList<Integer> list=new ArrayList<>();
	//Add elements to the list
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(7);
    list.add(7);
    list.add(7);
    list.add(7);
    
    System.out.println(list);
    //Retrieve elements from the list
    System.out.println(list.get(1));
    
    // Remove elements from the list
    list.remove(1); //Removes first element here 
    
    list.remove(Integer.valueOf(7)); //Removes that particular value
    System.out.println(list);
    
//    list.clear(); //This will remove all the elements from the list
    System.out.println(list);
    
    list.set(1, 1000); //Updates value at that position
    System.out.println(list);
    
    
    Collections.sort(list);//Sorts the list in increasing order
    Collections.sort(list,Comparator.reverseOrder()); //Sorts in reverse Order
    System.out.println(list);
    
    list.contains(4); //Return true or false and tells if that number is present in the list or not
    
    
    //Traversing the whole array
    for(int i=0;i<list.size();i++)
    System.out.println("the elements in the array are:-"+list.get(i));
    
    for(int i:list)
    	System.out.println(i);
    
	 }
}
