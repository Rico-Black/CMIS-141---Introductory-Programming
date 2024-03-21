package discusswk8;

 class Fridge{
	
	 // Variables of the Fridge
	private int freezerTemp = -2;
	private int fridgeTemp = 30;
	private int ice = 20;
	
	public  void setTemp(int temp1, int temp2) { // sets the tempurature of both the fridge and freezer
		
		this.freezerTemp = temp1;
		this.fridgeTemp = temp2;
		
	}
	
	public void giveIce() {// reduces Ice by one
		
		System.out.println("Here is some ice");
		this.ice--;
	}
	public void status() { // returns value of variables
		System.out.println("The temperature of the Fridge is :" + fridgeTemp);
		System.out.println("The temperature of the Freezer is :" +freezerTemp);
		System.out.println("There is " + ice +" in the freezer.");
	}
}

public class DiscussWk8 {

	public static void main(String[] args) {
		
		Fridge myFridge = new Fridge();

		myFridge.setTemp(-1, 29);
		myFridge.giveIce();
		myFridge.status();
	}
}
