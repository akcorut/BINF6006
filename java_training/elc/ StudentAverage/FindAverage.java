public class FindAverage {
	 public static void main(String[] args)

	   {
		      int numOfStudents =10;
		      double classTotal=0.0,classAverage=0.0;

		     Test[] t=new Test[numOfStudents];

	       System.out.println("First_Name Last_name\tTest1\tTest2\tTest3\tTest4\tTest5\tAverage");

	        
	      t[0]=new Test("John", "Johnson",new int[] {85,83,100,100,100});
		      
	      t[1]=new Test("John", "That",new int[] {50,50,50,70,50});
	      t[2]=new Test("Bob", "That",new int[] {50,50,50,80,50});      
	      t[3]=new Test("Alice", "That",new int[] {50,50,50,90,50});
	      t[4]=new Test("That", "That",new int[] {50,50,50,50,50});
	      t[5]=new Test("That", "That",new int[] {50,50,50,50,50});
	      t[6]=new Test("That", "That",new int[] {50,50,50,50,50});
	      t[7]=new Test("That", "That",new int[] {50,50,50,50,50});
	      t[8]=new Test("That", "That",new int[] {50,50,50,50,50});
	      t[9]=new Test("That", "That",new int[] {50,50,50,50,50});
	      for (int i=0;i<numOfStudents;i++)
	       {
	    	    t[i].calculateAverage();

		        classTotal+=t[i].calculateAverage();
		      System.out.println(t[i].toString());
		      System.out.println(t[i].toString());
		      
	       }
		      classAverage=classTotal/numOfStudents;

	       System.out.println("Class Average = "+classAverage);

	   }
	}



