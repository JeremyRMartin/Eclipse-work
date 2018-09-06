
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //init Vars
    	double monCollection, tuesCollection, wedCollection, dailyAverage, 
    	monthlyAverage, monthlyProfit, profitPerEgg;
    	
    	//Assign Vars
    	dailyAverage = 0;
    	monthlyAverage = 0;
    	monthlyProfit = 0;
    	profitPerEgg = .18;
    	monCollection = 100.0;
    	tuesCollection = 121.0;
    	wedCollection = 117.0;
    	
    	//Calculate using Vars
    	dailyAverage = ((monCollection + tuesCollection + wedCollection) / 3);
    	monthlyAverage = ((dailyAverage) * 30);
    	monthlyProfit = (monthlyAverage * profitPerEgg);
    	
    	//Print Outcomes
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
