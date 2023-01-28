
public class andersenWeek34Assignment {

	public static void main(String[] args) {
		
			//Create an array of int called ages that contains the following values: 
			// 3, 9, 23, 64, 2, 8, 28, 93.
		
		{	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
			//Programmatically subtract the value of the first element in the array from 
			//the value in the last element of the array (i.e. do not use ages[7] in your code). 
			//Print the result to the console.  
		
			int subtractElement = ages[ages.length-1] - ages[0];
			System.out.println(subtractElement); 
		
	}
		
			//Add a new age to your array and repeat the step above to ensure 
			//it is dynamic (works for arrays of different lengths).
		
		{	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 103};
			int subtractElement = ages[ages.length-1] - ages[0];
			System.out.println(subtractElement); 
	
	}
		
			//Use a loop to iterate through the array and calculate the average age. 
			//Print the result to the console.
		
		{	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			int sum = 0;
			for (int i = 0; i < ages.length; i++) {
		    sum += ages[i];
		}
			double average = (double) sum / ages.length;
			System.out.println(average);
	
	}
		
			//Create an array of String called names that contains the following values: 
			//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		{	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

			//Use a loop to iterate through the array and calculate the average number of 
			//letters per name. Print the result to the console.
		
			int sum = 0;
			for (int i = 0; i < names.length; i++) {
		    sum += names[i].length();
		}
			double average = (double) sum / names.length;
			System.out.println(average);
	
	}

			//Use a loop to iterate through the array again and concatenate all the 
			//names together, separated by spaces, and print the result to the console.
		
		{	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			String namesConc = "";
			for (int i = 0; i < names.length; i++) {
		    namesConc += names[i] + " ";
		}
			System.out.println(namesConc);
			
	}
		
			//How do you access the last element of any array?

		{	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			String lastElement = names[names.length-1];
			System.out.println(lastElement);
			
	}
		
			//How do you access the first element of any array?
		
		{	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			String firstElement = names[0];
			System.out.println(firstElement);
			
	}
		
			//Create a new array of int called nameLengths. Write a loop to iterate 
			//over the previously created names array and add the length of each name 
			//to the nameLengths array.
		
		{	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
		    nameLengths[i] = names[i].length();
		    System.out.println(names[i] + " " + nameLengths[i]);
			
			//Write a loop to iterate over the nameLengths array and calculate the sum 
			//of all the elements in the array. Print the result to the console.
			
		}	int sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
		    sum += nameLengths[i];
		}
			System.out.println(sum);
			
	}
		
			//Write a method that takes a String, word, and an int, n, as arguments and 
			//returns the word concatenated to itself n number of times. (i.e. if I pass 
			//in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		{	String word = "Ryan";
			int n = 4;
			System.out.println(repeatWord(word, n));}
			
			//Write a method that takes two Strings, firstName and lastName, and returns 
			//a full name (the full name should be the first and the last name as a String 
			//separated by a space).
			
		{	String firstName = "Michael";
		    String lastName = "Jordan";
		    System.out.println(provideFullName(firstName, lastName));
		    
	}
			
			//Write a method that takes an array of int and returns true if the sum of all the 
			//ints in the array is greater than 100.
			
		{	int[] values = {1, 5, 12, 17, 6};
		    System.out.println(isSumGreaterThanOneHundred(values));
		    
	}
			
			//Write a method that takes an array of double and returns the average of 
			//all the elements in the array.
			
		{	double[] values2 = {4.7, 18.9, 22.2, 30.4, 99.9};
		    System.out.println(getAverage(values2));
		    
	}
			
			//Write a method that takes two arrays of double and returns true if the 
			//average of the elements in the first array is greater than the average 
			//of the elements in the second array.
			
		{	double[] values3 = {77.38, 60.74, 55.62};
		    double[] values4 = {10.91, 20.57, 22.26};
		    System.out.println(isFirstArrayAverageGreater(values3, values4));
		    
	}
			
			//Write a method called willBuyDrink that takes a boolean isHotOutside, and a 
			//double moneyInPocket, and returns true if it is hot outside and if moneyInPocket 
			//is greater than 10.50.
			
		{	boolean isHotOutside = true;
		    double moneyInPocket = 8.63;
		    System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		    
	}
			
			//The method I created below produces the classes average letter grade based
			//on their overall percentages.
			
		{	double[] studentPercentages = {95.9, 87.3, 92.7, 80.2, 64.7, 88.3, 99.4, 78.8};
		    System.out.println(classAverageLetterGrade(studentPercentages));
		    
	}
			
		}
	
	public static String repeatWord(String word, int n) {
	    String repeatedWord = "";
	    for (int i = 0; i < n; i++) {
	        repeatedWord += word;
	    }
	    return repeatedWord;
	}
	
	public static String provideFullName(String firstName, String lastName) {
	    return firstName + " " + lastName;
	}
	
	public static boolean isSumGreaterThanOneHundred(int[] values) {
	    int sum = 0;
	    for (int i = 0; i < values.length; i++) {
	        sum += values[i];
	    }
	    return sum > 100;
	}
	
	public static double getAverage(double[] values2) {
	    double sum = 0;
	    for (int i = 0; i < values2.length; i++) {
	        sum += values2[i];
	    }
	    return sum / values2.length;
	}
	
	public static boolean isFirstArrayAverageGreater(double[] values3, double[] values4) {
	    double sum1 = 0;
	    for (int i = 0; i < values3.length; i++) {
	        sum1 += values3[i];
	    }
	    double average1 = sum1 / values3.length;

	    double sum2 = 0;
	    for (int i = 0; i < values4.length; i++) {
	        sum2 += values4[i];
	    }
	    double average2 = sum2 / values4.length;

	    return average1 > average2;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    return isHotOutside && moneyInPocket > 10.50;
	}
	
	public static String classAverageLetterGrade(double[] studentPercentages) {
	    double sum = 0;
	    for (int i = 0; i < studentPercentages.length; i++) {
	        sum += studentPercentages[i];
	    }
	    double avg = sum / studentPercentages.length;
	    if (avg > 90) {
	        return "A";
	    } else if (avg > 80) {
	        return "B";
	    } else if (avg > 70) {
	        return "C";
	    } else if (avg > 60) {
	        return "D";
	    } else {
	        return "F";
	    }
	}
}
