import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Who are you?\n1. User\n2. Admin\n3. Seller");
    int roleChoice = sc.nextInt();

    switch (roleChoice) {
      case 1:
        System.out.println("What type of weapon would you like to purchase?\n1. Rifle\n2. Shotgun\n3. Pistol");
        int weaponChoice = sc.nextInt();

        String weaponType = "";
        int weaponPrice = 0;
        switch (weaponChoice) {
          case 1:
            weaponType = "Rifle";
            weaponPrice = 500;
            break;
          case 2:
            weaponType = "Shotgun";
            weaponPrice = 400;
            break;
          case 3:
            weaponType = "Pistol";
            weaponPrice = 300;
            break;
          default:
            System.out.println("Invalid option.");
        }

        System.out.println("You have purchased a " + weaponType + " for $" + weaponPrice);
        break;
      case 2:
        System.out.println("Special question for admin: What's the capital of France?");
        System.out.print("Answer: ");
        String answer = sc.nextLine();
        if (answer.equals("Paris")) {
          System.out.println("Welcome, admin.");
        } else {
          System.out.println("Access denied.");
        }
        break;
      case 3:
        System.out.println("Enter number of weapons in stock: ");
        int stock = sc.nextInt();
        System.out.println("1. Sell\n2. Buy");
        int sellerChoice = sc.nextInt();

        switch (sellerChoice) {
          case 1:
            if (stock > 0) {
              System.out.println("What type of weapon would you like to sell?\n1. Rifle\n2. Shotgun\n3. Pistol");
              int sellWeaponChoice = sc.nextInt();

              String sellWeaponType = "";
              int sellWeaponPrice = 0;
              switch (sellWeaponChoice) {
                case 1:
                  sellWeaponType = "Rifle";
                  sellWeaponPrice = 500;
                  break;
                case 2:
                  sellWeaponType = "Shotgun";
                  sellWeaponPrice = 400;
                  break;
                case 3:
                  sellWeaponType = "Pistol";
                  sellWeaponPrice = 300;
                  break;
                default:
                  System.out.println("Invalid option.");
              }

              stock--;
              System.out.println("Weapon sold: " + sellWeaponType + " for $" + sellWeaponPrice);
            } else {
              System.out.println("No more stock available.");
            }
            break;
          case 2:
            System.out.println("What type of weapon would you like to buy?\n1. Rifle\n2. Shotgun\n3. Pistol");
            int buyWeaponChoice = sc.nextInt();

            String buyWeaponType = "";
            int buyWeaponPrice = 0;
            switch (buyWeaponChoice) {
              case 1:
                buyWeaponType = "Rifle";
                buyWeaponPrice = 500;
                break;
              case 2:
                buyWeaponType = "Shotgun";
                buyWeaponPrice = 400;
                break;
              case 3:
                buyWeaponType = "Pistol";
                buyWeaponPrice = 300;
                break;
              default:
                System.out.println("Invalid option.");
            }

            stock++;
            System.out.println("Weapon bought: " + buyWeaponType + " for $" + buyWeaponPrice);
            break;
          default:
            System.out.println("Invalid option.");
        }
        break;
      default:
        System.out.println("Invalid option.");
    }
  }
}
