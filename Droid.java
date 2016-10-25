import java.util.Scanner;
class Droid {
 int batteryLife = 100;
 int hours;
 int feet;

 public void activate() {
  System.out.println("---------------------\nThe Droid has been Activated!");
  batteryLife -= 5;
  System.out.println("The battery life is now " + batteryLife);
 }

 public void chargeBattery(int hours) {
  System.out.println("---------------------\nCharging...");
  batteryLife = batteryLife + hours;
  if (batteryLife > 100) {
   batteryLife = 100;
  }
  System.out.println("The battery life is now " + batteryLife);
 }

 public void checkBatteryLife() {
  System.out.println("---------------------\nThe current battery life is " + batteryLife);
 }

 public void hover(int feet) {
  if (feet > 2) {
   System.out.println("---------------------\nERROR: Droid can't hover more than 2 feet.\n---------------------");
  } else {
   System.out.println("---------------------\nHOVERING...");
   batteryLife = batteryLife - 20;
   System.out.println("The batter life is now " + batteryLife);
  }
 }

 public static void main(String[] args) {
  Scanner userInput = new Scanner(System.in);
  System.out.println("Would you like to access Droid.exe. y/n");
  String choice = userInput.next();
  switch (choice.charAt(0)) {
   case 'y':
    System.out.println("---------------------\nAccessing Droid.exe...\n---------------------");
    System.out.println("---------------------\n\nThe Droid can be controlled using a series of commands.\n\nactivate - Activates the Droid\n\nchargeB<# of hours> - Charges the battery\n\ncheckBLife - Shows current battery life\n\nhover<# of feet> - Makes the Droid hover\n\n---------------------");

    break;
   case 'n':
    System.out.println("Okay Goodbye");
    break;

  }

 }
}
