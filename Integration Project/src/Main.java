import java.util.Scanner;
//Jeremy Martin
/*Project Description:
 * My project will be a simple 2D RPG game. 
 * That manages an inventory and items.
 * Eventually.
 */
public class Main {

	public static void main(String[] args) {
		//Welcome the User
		System.out.println("Welcome to my integration Project.");
		System.out.println("Are you here to watch me crash and burn, while I writhe around in confusion? (*HINT* use Y/N) ");
		
		//init vars
		String answer;
			
		//init scanner and read users response
		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();
		scan.close();
		
		
		//test response, and reply
		if(answer.equals("Y")) {
			System.out.println("You monster, How could you!");
		}else if(answer.equals("N")) {
			System.out.println("Awesome, thank goodness you're here.");
		}else {
			System.out.println("You okay buddy? The instructions were simple.");
			}
		}
	}
