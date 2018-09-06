
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int eggsPerChicken, chickenCount, totalEggs, eggsPerDay;
        totalEggs = 0;
        eggsPerChicken = 4;
        chickenCount = 8;
        eggsPerDay = chickenCount * eggsPerChicken;
        totalEggs += eggsPerDay;
        //End of Day 1
        chickenCount++;
        eggsPerDay = chickenCount * eggsPerChicken;
        totalEggs += eggsPerDay;
        //End of Day 2
        chickenCount /= 2;
        eggsPerDay = chickenCount * eggsPerChicken;
        totalEggs += eggsPerDay;
        //End of Day 3
        System.out.println(totalEggs);
    }   
}
