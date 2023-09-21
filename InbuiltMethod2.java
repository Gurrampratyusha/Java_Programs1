package javaPrograms;

public class InbuiltMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String text= "simplilearn java course";
        	if((text.contains("java")))	 
        	{
        		System.out.println("Text contains java");
        	}
        	else 
        	{
        		System.out.println("text does not contain java");
        	}
        	if((text.equals("simplilearn java course")))	 
        	{
        		System.out.println("Text is equal to given text");
        	}
        	else 
        	{
        		System.out.println("text does not equal to given text");
        	}
        	
        	
        String Result= text.substring(12);
        if(Result.equals("java course"))
        {
        	System.out.println("string is valid");
        }
        else 
        {
        	System.out.println("string is iinvalid");
        }
	}

}
