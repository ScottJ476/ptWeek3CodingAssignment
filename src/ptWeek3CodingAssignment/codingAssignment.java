package ptWeek3CodingAssignment;

public class codingAssignment {

	public static void main(String[] args) {
		//Coding Assignment Step 1
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 300};
				int last = ages.length -1;
				int sum = 0;
				
				System.out.println("1-b (answer): " + (ages[last] - ages[0]));
				
				for (int age : ages) {
					sum += age;
				}
				
				System.out.println(("1-c (answer): " + sum / ages.length));
				
				//Coding Assignment Step 2
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				int totalLetters = 0;
				String allNames = "";
				
				for (String word : names) {
					totalLetters += word.length();
				}
				
				System.out.println("2-a (answer): " + totalLetters / names.length);
				
				for (String word : names ) {
					allNames += word + " ";
				}
				
				System.out.println("2-b (answer): " + allNames);
				
				//Coding Assignment Step 3
				System.out.println("3 (answer): names[0] = " + names[0]);
				
				//Coding Assignment Step 4
				System.out.println("4 (answer): names[names.length -1] = " + names[names.length - 1]);
				
				//Coding Assignment Step 5
				int[] nameLengths = new int[6];
				
				for (int i = 0; i < names.length; i++) {
					nameLengths[i] = names[i].length();
				}
				
				//Coding Assignment Step 6
				int totalLength = 0;
				for (int length : nameLengths) {
					totalLength += length;
				}
				
				System.out.println("5 (answer): " + totalLength);
				
				//Coding Assignment Step 7 (call the method)
				System.out.println("7 (answer): " + combineWords("Hello", 3));
				
				//Coding Assignment Step 8 (call the method)
				System.out.println("8 (answer): " + getFullName("Scott", "Johnson"));
				
				//Coding Assignment Step 9 (call the method)
				int[] numbers = {50, 30, 21};
				System.out.println("9 (answer): " + isGreater (numbers));
				
				//Coding Assignment Step 10 (call the method)
				double[] doubles = {5.6, 7.8, 9.3, 15.7};
				System.out.println("10 (answer): " + getAverage(doubles));
				
				//Coding Assignment Step 11 (call the method)
				double[] doubles2 = {4.9, 2.3, 5.5, 1.3, 6.2};
				System.out.println("11 (answer): " + isGreaterAverage(doubles, doubles2));
				
				//Coding Assignment Step 12 (call the method)
				boolean isHotOutside = true;
				double moneyInPocket = 10.51;
				
				System.out.println("12 (answer): " + willBuyDrink(isHotOutside, moneyInPocket));
				
				//Coding Assignment Step 13 (call the method)
				double[] sourcesOfIncome = {1397.00, 749.00, 1234.00, 812.00};
				double[] expenses = {1250.00, 349.92, 127.87, 82.12, 63.23};
				double taxRate = 0.25;
				
				System.out.println("13 (answer): The money available is $" + calculateMoneyAvailable(taxRate, sourcesOfIncome, expenses));
	}
	
		//Coding Assignment Step 7 (method)
		public static String combineWords (String word, int n) {
			String result = "";
			
			for (int i = 0; i < n; i++) {
				result += word;
			}
			
			return result;
		}
		
		//Coding Assignment Step 8 (method)
		public static String getFullName (String firstName, String lastName) {
			return firstName + " " + lastName;
		}

		//Coding Assignment Step 9 (method)
		public static boolean isGreater (int[] nums) {
			int sum = 0;
			
			for (int num : nums) {
				sum += num;
			}
			
			return sum > 100;
		}
		
		//Coding Assignment Step 10 (method)
		public static double getAverage (double[] dubs) {
			double sum = 0;
			
			for (double dub : dubs) {
				sum += dub;
			}
			
			return sum / dubs.length;
		}
		
		//Coding Assignment Step 11 (method)
		public static boolean isGreaterAverage (double[] dub1, double[] dub2) {
			double avgOfDub1 = getAverage(dub1);
			double avgOfDub2 = getAverage(dub2);
			
			return avgOfDub1 > avgOfDub2;
		}
		
		//Coding Assignment Step 12 (method)
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.50;
		}
		
		/*
		 * Coding Assignment Step 13 (method)
		 * I created two methods (calculateMoneyAvaible and getSum). The calculateMoneyAvailable method calculates the money
		 * available by adding up all sources of income (array), then subtracting taxes, and then subtracting all expenses (array).  
		 * The getSum method simply adds the total (which is used to get the sum of all sources of income and the sum of all 
		 * expenses). I used the Math.round method to round to the nearest penny.
		 */
		public static double calculateMoneyAvailable (double taxRate, double[] sourcesOfIncome, double[] expenses) {
			double sumOfIncome = 0;
			double sumOfExpenses = 0;
			double incomeAfterTaxes = 0;
			double moneyLeftRounded = 0;
			
			sumOfIncome = getSum(sourcesOfIncome);
			incomeAfterTaxes = sumOfIncome - (sumOfIncome * taxRate);
			sumOfExpenses = getSum(expenses);
			moneyLeftRounded = (Math.round((incomeAfterTaxes - sumOfExpenses) * 100.0)) / 100.0;
		
			return moneyLeftRounded;
		}
		
		public static double getSum (double[] dubs) {
			double sum = 0.0;
			
			for (double dub : dubs) {
				sum += dub;
			}
			
			return sum;
		}

}
