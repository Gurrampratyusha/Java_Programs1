package javaPrograms;

public class StringReverse {


	    public static void main(String[] args) {
	        String original = "Hello, World!";
	        StringBuilder reversed = new StringBuilder(original).reverse();
	        String reversedString = reversed.toString();
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversedString);
	    }
	


}
