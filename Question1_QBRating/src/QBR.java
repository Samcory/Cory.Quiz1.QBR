import java.util.Scanner;
public class QBR {
	

	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("QBR Generator Initiated"); 
		System.out.println("");
		System.out.println("Please Enter the following statistics and the QBR will be generated.");
		
		System.out.println("Completions");
		double completions = input.nextDouble();
		
		System.out.println("Total Passing Yards");
		double yards = input.nextInt();
		
		System.out.println("Touchdown Passes");
		double touchdowns = input.nextDouble();
		
		System.out.println("Interceptions Thrown");
		double interceptions = input.nextDouble();
		
		System.out.println("Attempted Passes");
		double attempts = input.nextDouble();
	
		//compute a,b,c, and d per the NFL QBR formula via wikipedia.org
		double a = (completions/attempts -0.3)*5;
		double b = (yards/attempts-3)*0.25;
		double c = (touchdowns/attempts)*20;
		double d = 2.375-(interceptions/attempts*25);
		
		if (a > 2.375) {
			a = 2.375;}
		if (a < 0){
			a = 0;}
		
		if (b > 2.375){
			b = 2.375;}
		if (b < 0){
			b = 0;}
		
		if (c > 2.375){
			c = 2.375;}
		if (c < 0){
			c = 0;}
		
		if (d > 2.375){
			d = 2.375;}
		if (d < 0){
			d = 0;}
		
		double Passer_Rating = ((a+b+c+d)/6)*100;
	
	System.out.print("With the statistics entered the QBR would be");
	System.out.printf("%.2f", Passer_Rating);
}}
