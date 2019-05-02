
     public class Test

	{

	    String FirstName;

	   String LastName;

	   int[] TestScores;

	   double Average;

	   

	 	 public Test(String myFirstName,String myLastName,int[] myTestScores)

	   {

	   this.FirstName=myFirstName;

	      this.LastName=myLastName;

	       this.TestScores=myTestScores;

	   
      
	   }

	  

	   	  

	   //Finding Average

	   public double calculateAverage()

	   {

	       double sum=0.0;

	       for(int i=0;i<5;i++)

	        {

	           sum+=TestScores[i];

	       }

	       Average=sum/5;
	       return Average;
	   }

	  

	   public String toString()

	   {

	       String StringOutput="";

	       StringOutput+=FirstName+"\t"+LastName+"\t\t";

	       for(int i=0;i<5;i++)

	        {

	           StringOutput+=TestScores[i]+"\t";

	       }

	     StringOutput+="\t"+Average;

	       return StringOutput;

	   }

	  
}
