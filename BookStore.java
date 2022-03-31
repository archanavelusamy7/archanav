package own;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BookStore {
            public static void main(String[]args) {
            	HashMap<Integer,String> Books=new HashMap<Integer,String>();
            if(Books.isEmpty());
            System.out.println("WELCOME TO ONLINE BOOK STORE:)");
            System.out.println("WE HAVE RANDOM COLLECTION OF BOOKS IN ONE STORE:)");
            System.out.println("SHOP BOOKS TO INCREASE YOUR KNOWLEDGE:)");
            System.out.println("CHOOSE TITLE TO EXPLORE MORE BOOKS:)");
            
            int size=Books.size();
            
            Books.put(1,"COMMIC COLLECTION");
            Books.put(2,"THRILER COLLECTION");
            Books.put(3,"ACTION STORIES");
            Books.put(4,"TRAVEL COLLECTION");
            Books.put(5,"SCIENCE FICTION");
            Books.put(6,"HISTORIC COLLECTION");
            Books.put(7,"LOVE COLLECTION");
            Books.put(8,"KNOWLEDEG COLLECTION");
            Books.put(9,"CHILDREN COLLECTION");
            Books.put(10,"INNOVATION COLLECTION");
            
            System.out.println("print size of the book:"+Books.size());
            System.out.println("print the collection of books:"+Books);
            boolean contains=Books.containsKey(1);
            if(contains) {
            	
            	System.out.println("COMMIC COLLECTION PRESENT:)");
            }
            else{
            	
            	System.out.println("NOT PRESENT IN COLLECTION:)");
            }
           
            for (Map.Entry<Integer,String> theBooks:Books.entrySet()){
                System.out.println(theBooks.getKey() +" = "+theBooks.getValue());
            }
            Books.remove(7,"LOVE COLLECTION");
           Books.remove(8,"KNOWLEDGE COLLECTION");
           System.out.println("PRINT AFTER REMOVING COLLECTION:"+Books);
           System.out.println("THE COLLECTIONS ARE REMOVED DUE TO LOW PROFIT:)");
           System.out.println("AFTER REMOVING SIZE OF BOOKS:)"+Books.size());
            
           boolean entrykey=Books.containsKey(2);
           System.out.println("YOU ARE SEARCHING MOST RATED BOOKS:)"+entrykey);
           
           boolean entryValue=Books.containsKey(10);
           System.out.println("YOU ARE SEARCHING MOST KNOWLEDGE COLLECTIONS:)"+entryValue);
           
           HashMap<Integer,String>Books2=new HashMap<Integer,String>();
           Books2.isEmpty();
           System.out.println("DISPLAY PRICE OF THE BOOK:)");
           System.out.println("DIPLAY TITLE OF THE BOOK:)");
           
           
           Books2.put(100,"WAR AND PEACE");
           Books2.put(200,"BELOVED");
           Books2.put(300,"LORD OF RINGS");
           Books2.put(400,"ADVENTURE OF HUCKLEBERRY FINN");
           Books2.put(500,"HAMLET");
           Books2.put(600,"LORD OF FILES");
           Books2.put(700,"TOY STORY");
           Books2.put(800,"HARRY POTTER");
           Books2.put(900,"BRAVE NEW WORLD");
           Books2.put(1000,"THE GREAT GATSBY");
           
          Books2.forEach((key,value)->   System.out.println(key+"   :  "+value));
          
          {
        	  int num=0;
        	  Scanner sc=new Scanner(System.in);
        	  while(true)
        	  {
        		  System.err.println("press 1:->WAR AND PEACE");
        		  System.err.println("press 2:->BELOVED");
        		  System.err.println("press 3:->LORD OF RINGS");
        		  System.err.println("press 4:->ADVENTURE OF HUCKLEBERRY FINN");
        		  System.err.println("press 5:->HAMLET");
        		  System.err.println("press 6:->LORD OF FILES");
        		  System.err.println("press 7:->TOY STORY");
        		  System.err.println("press 8:->HARRY POTTER");
        		  System.err.println("press 9:->BRAVE NEW WORLD");
        		  System.err.println("press 10:->THE GREAT GATSBY");
        		  System.err.println("press 11:->EXIT");
        		  
        		  num=sc.nextInt();
        		  switch(num) {
        		  
        		  case 1:
        			  System.out.println("<<YOU HAVE SELECTED WAR AND PEACE BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        			  
        		  case 2:
        			  System.out.println("<<YOU HAVE SELECTED BELOVED BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        			  
        		  case 3:
        			  System.out.println("<<YOU HAVE SELECTED LORD OF RINGS BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        			  
        		  case 4:
        			  System.out.println("<<YOU HAVE SELECTED ADVENTURE OF HUCKLEBERRY FINN BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        			  
        		  case 5:
        			  System.out.println("<<YOU HAVE SELECTED HAMLET BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        			  
        		  case 6:
        			  System.out.println("<<YOU HAVE SELECTED LORD OF FILES BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        			  
        		  case 7:
        			  System.out.println("<<YOU HAVE SELECTED TOY STORY BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        		  case 8:
        			  System.out.println("<<YOU HAVE SELECTED HARRY POTTER BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        		  case 9:
        			  System.out.println("<<YOU HAVE SELECTED BRAVE NEW WORLD BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        		  case 10:
        			  System.out.println("<<YOU HAVE SELECTED THE GREAT GATSBY  BOOK>>");
        			  System.out.println("YOUR CONTENT OF SEARCH IS PRESENT:)");
        			  break;
        		  case 11:
        			  System.out.println("<EXIT>>");
        			  System.out.println("THANKYOU FOR YOUR SEARCH:)");
        			  break;
        		  }
        		  
        	  }
          }
           
           
           
           
    }


         
            
            }

