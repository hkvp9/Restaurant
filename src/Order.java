import java.util.Scanner;
public class Order {
	
	//before creating the object you need to ask the questions before creating - thats why it is static 
	//final - questions will not change
	static final String menu = "what do you want to have? \n 1. HamBurger 2. CheeseBurger 3. Healthy Burger 4. DeluxBurger";
	static final String questionBread = "what kind of bread do you want?";
	static final String questionPatty = "What kind of patty do you want?";
	static final String questionMayo = "Do you want mayo on top?";
	static final String questionRanch = "Do you want ranch on top?";
	static final String questionCheese = "What kind of cheese do you want?";
	static final String questionLettuce = "Do you want Lettuce on top?";
	static final String questionSoda = "Do you want soda with that?";
	static final String questionChips = "Do you want chips with that?";
	
	
	//MENU needs static final string so your main always knows 

	public static void main(String[] args) {
		//declaring the variable outside instead of creating a new object that we have been doing this whole time
		
		Scanner keyboard = new Scanner(System.in);
		//building a counter for the customer to come order food
		//customer wants to buy a cheeseburger
		System.out.println(Order.menu);
		int order = keyboard.nextInt();
				System.out.println(questionBread);
				String bread = keyboard.next();
				System.out.println(questionPatty);
				String patty = keyboard.next();
				System.out.println(questionRanch);
				boolean ranch = keyboard.nextBoolean();
				
				HamBurger hb;

				
				
			if(order == 1){
				System.out.println(questionMayo);
				boolean mayo = keyboard.nextBoolean();
				hb = new HamBurger( bread, patty, mayo, ranch );
			}
			//	(String bunType, String patty, boolean ranch, String cheeseType) {

			else if (order ==2){
				System.out.println(questionCheese);
				String cheese = keyboard.next();
				 hb = new CheeseBurger( bread, patty, ranch, cheese);
			}
			else if(order == 3){
				//String breadType, String patty, boolean ranch, String lettuce
				System.out.println(questionLettuce);
				String lettuce = keyboard.next();
				hb = new HealthyBurger(bread, patty, ranch, lettuce);
				
			}//(String breadType, String patty, boolean ranch, String soda, String chips)
			else if(order == 4 ){
				System.out.println(questionSoda);
				String soda = keyboard.next();
				System.out.println(questionChips);
				String chips = keyboard.next();
				hb = new DeluxeBurger(bread, patty, ranch, soda, chips	);
			}
			
			else {
				hb = null; 
				
			}
			System.out.println("here's your order" + hb);
		
			
//		CheeseBurger naresh = new CheeseBurger("Italian  ", "Chicken ", true,  " Swiss " );
//		System.out.println("Hey this is your order!: ");
//		System.out.println(naresh);
//		
	}
	
}
