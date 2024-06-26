import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gshoes {
    static Scanner scanner = new Scanner(System.in);
    static double totalAmount = 0;
    static List<String> cartItems = new ArrayList<>();
    static List<Double> itemPrices = new ArrayList<>();
    static List<Double> itemSizes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("\tWELCOME TO GSHOES");
        login();
    }

    static void login() {
        String[] usernames = {"user123"}; // Username account
        String[] passwords = {"pass123"}; // Password account

        System.out.println("===============================");
        System.out.println("\t   User Login");
        System.out.println("===============================");
        System.out.print("Username: ");
        String username = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();
        scanner.nextLine(); 

        // Check if the username exists and the password matches
        boolean isValidUser = false;
        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                isValidUser = true;
                break;
            }
        }

        if (isValidUser) {
            System.out.println("Login successful!");
            browseProducts();
        } else {
            System.out.println("Invalid username or password. Please try again.");
            login(); // Prompt user to login again
        }
    }

    static void browseProducts() {
        try {
            System.out.println("===============================");
            System.out.println("Select a brand:");
            System.out.println("1. Nike\n2. Adidas\n3. New Balance\n4. Vans\n5. Asics");
            System.out.println("6. View Cart\n7. Checkout\n8. Exit");
            System.out.println("===============================");
            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    browseNikeProducts();
                    break;
                case 2:
                    browseAdidasProducts();
                    break;
                case 3:
                    browseNewBalanceProducts();
                    break;
                case 4:
                    browseVansProducts();
                    break;
                case 5:
                    browseAsicsProducts();
                    break;
                case 6:
                    viewCart();
                    break;
                case 7:
                    checkout();
                    break;
                case 8:
                    System.out.println("Thank you for shopping with GSHOES. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    browseProducts();
            }
        } catch (Exception e) {
            System.out.println("An error occurred");
            scanner.nextLine(); 
            browseProducts(); 
        }
    }

    // NIKE SECTION
    static void browseNikeProducts() {
        System.out.println("===============================");
        System.out.println("Nike Products:");
        System.out.println("1. Nike Dunks");
        System.out.println("2. Nike SB Dunks");
        System.out.println("3. Nike Cortez");
        System.out.println("4. Back to Main Menu");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                browseNikeDunks();
                break;
            case 2:
                browseNikeSBDunks();
                break;
            case 3:
                browseNikeCortez();
                break;
            case 4:
                browseProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseNikeProducts();
        }
    }

    static void browseNikeDunks() {
        System.out.println("===============================");
        System.out.println("Nike Dunks:");
        System.out.println("1. Nike Dunk Cacao Wow - P5,000");
        System.out.println("2. Nike Dunk Panda's - P5,000");
        System.out.println("3. Nike Dunk University Blue - P5,100");
        System.out.println("4. Back to Nike Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addToCart("Nike Dunk Cacao Wow", 5000);
                break;
            case 2:
                addToCart("Nike Dunk Panda's", 5000);
                break;
            case 3:
                addToCart("Nike Dunk University Blue", 5100);
                break;
            case 4:
                browseNikeProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseNikeDunks();
        }
    }

    static void browseNikeSBDunks() {
        System.out.println("===============================");
        System.out.println("Nike SB Dunks:");
        System.out.println("1. Nike SB Dunks April Skateboards - P7,400");
        System.out.println("2. Nike SB Dunks Jarritos - P7,350");
        System.out.println("3. Nike SB Dunks Ben & Jerry's - P9,000");
        System.out.println("4. Back to Nike Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addToCart("Nike SB Dunks April Skateboards", 7400);
                break;
            case 2:
                addToCart("Nike SB Dunks Jarritos", 7350);
                break;
            case 3:
                addToCart("Nike SB Dunks Ben & Jerry's", 9000);
                break;
            case 4:
                browseNikeProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseNikeSBDunks();
        }
    }


    static void browseNikeCortez() {
        System.out.println("===============================");
        System.out.println("Nike Cortez:");
        System.out.println("1. Nike Cortez Forrest Gump - P6,200");
        System.out.println("2. Nike Cortez Stranger Things - P5,000");
        System.out.println("3. Nike Cortez Basic White Black - P4,700");
        System.out.println("4. Back to Nike Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addToCart("Nike Cortez Forrest Gump", 6200);
                break;
            case 2:
                addToCart("Nike Cortez Stranger Things", 5000);
                break;
            case 3:
                addToCart("Nike Cortez Basic White Black", 4700);
                break;
            case 4:
                browseNikeProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseNikeCortez();
        }
    }

    // ADIDAS SECTION
    static void browseAdidasProducts() {
        System.out.println("===============================");
        System.out.println("Adidas Products:");
        System.out.println("1. Ultraboost");
        System.out.println("2. Superstar");
        System.out.println("3. Stan Smith");
        System.out.println("4. Back to Main Menu");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                browseAdidasUltraboost();
                break;
            case 2:
                browseAdidasSuperstar();
                break;
            case 3:
                browseAdidasStanSmith();
                break;
            case 4:
                browseProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseAdidasProducts();
        }
    }

    static void browseAdidasUltraboost() {
        System.out.println("===============================");
        System.out.println("Adidas Ultraboost:");
        System.out.println("1. Adidas Ultraboost 21 - P8,500");
        System.out.println("2. Adidas Ultraboost 5.0 - P9,200");
        System.out.println("3. Adidas Ultraboost 4.0 - P8,000");
        System.out.println("4. Back to Adidas Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
       int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addToCart("Adidas Ultraboost 21", 8500);
                break;
            case 2:
                addToCart("Adidas Ultraboost 5.0", 9200);
                break;
            case 3:
                addToCart("Adidas Ultraboost 4.0", 8000);
                break;
            case 4:
                browseAdidasProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseAdidasUltraboost();
        }
    }

    static void browseAdidasSuperstar() {
        System.out.println("===============================");
        System.out.println("Adidas Superstar:");
        System.out.println("1. Adidas Superstar Foundation - P4,500");
        System.out.println("2. Adidas Superstar Bold - P5,000");
        System.out.println("3. Adidas Superstar Originals - P4,800");
        System.out.println("4. Back to Adidas Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addToCart("Adidas Superstar Foundation", 4500);
                break;
            case 2:
                addToCart("Adidas Superstar Bold", 5000);
                break;
            case 3:
                addToCart("Adidas Superstar Originals", 4800);
                break;
            case 4:
                browseAdidasProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseAdidasSuperstar();
        }
    }

    static void browseAdidasStanSmith() {
        System.out.println("===============================");
        System.out.println("Adidas Stan Smith:");
        System.out.println("1. Adidas Stan Smith White Green - P4,200");
        System.out.println("2. Adidas Stan Smith Primeblue - P4,800");
        System.out.println("3. Adidas Stan Smith Recon - P5,500");
        System.out.println("4. Back to Adidas Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addToCart("Adidas Stan Smith White Green", 4200);
                break;
            case 2:
                addToCart("Adidas Stan Smith Primeblue", 4800);
                break;
            case 3:
                addToCart("Adidas Stan Smith Recon", 5500);
                break;
            case 4:
                browseAdidasProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseAdidasStanSmith();
        }
    }

    // NEW BALANCE SECTION
    static void browseNewBalanceProducts() {
        System.out.println("===============================");
        System.out.println("New Balance Products:");
        System.out.println("1. 990v3");
        System.out.println("2. BB550");
        System.out.println("3. 650");
        System.out.println("4. Back to Main Menu");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                browseNewBalance990v3();
                break;
            case 2:
                browseNewBalanceBB550();
                break;
            case 3:
                browseNewBalance650();
                break;
            case 4:
                browseProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseNewBalanceProducts();
        }
    }
    
    static void browseNewBalance990v3() {
        System.out.println("===============================");
        System.out.println("New Balance 990v3:");
        System.out.println("1. New Balance 990v3 MiUSA Grey Blue Olive - P9,500");
        System.out.println("2. New Balance 990v3 MiUSA Levi's Elephant Skin - P16,800");
        System.out.println("3. New Balance 990v3 MiUSA Teddy Santis Sea Salt - P9,300");
        System.out.println("4. Back to New Balance Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                addToCart("New Balance 990v3 MiUSA Grey Blue Olive", 9500);
                break;
            case 2:
                addToCart("New Balance 990v3 MiUSA Levi's Elephant Skin", 16800);
                break;
            case 3:
                addToCart("New Balance 990v3 MiUSA Teddy Santis Sea Salt", 9300);
                break;
            case 4:
                browseNewBalanceProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseNewBalance990v3();
        }
    }
    
    static void browseNewBalanceBB550() {
        System.out.println("===============================");
        System.out.println("New Balance BB550:");
        System.out.println("1. 550 Men's Sneakers Shoes - White - P6,200");
        System.out.println("2. 550 Men's Sneakers Shoes - White/Red - P10,000");
        System.out.println("3. 550 Men's Sneakers Shoes - White/Green - P7,700");
        System.out.println("4. Back to New Balance Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                addToCart("New Balance 550 Men's Sneakers Shoes - White", 6200);
                break;
            case 2:
                addToCart("New Balance 550 Men's Sneakers Shoes - White/Red", 10000);
                break;
            case 3:
                addToCart("New Balance 550 Men's Sneakers Shoes - White/Green", 7700);
                break;
            case 4:
                browseNewBalanceProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseNewBalanceBB550();
        }
    }
    
    static void browseNewBalance650() {
        System.out.println("===============================");
        System.out.println("New Balance 650:");
        System.out.println("1. New Balance 650 Men's White / Beige - P7,400");
        System.out.println("2. New Balance 650 Men's White / White - P7,400");
        System.out.println("3. New Balance 650 Men's Canyon / White - P7,400");
        System.out.println("4. Back to New Balance Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                addToCart("New Balance 650 Men's White / Beige", 7400);
                break;
            case 2:
                addToCart("New Balance 650 Men's White / White", 7400);
                break;
            case 3:
                addToCart("New Balance 650 Men's Canyon / White", 7400);
                break;
            case 4:
                browseNewBalanceProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseNewBalance650();
        }
    }

    // VANS SECTION
    static void browseVansProducts() {
        System.out.println("===============================");
        System.out.println("Vans Products:");
        System.out.println("1. Old Skool");
        System.out.println("2. Slip On");
        System.out.println("3. Sk8-Hi");
        System.out.println("4. Back to Main Menu");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                browseVansOldSkool();
                break;
            case 2:
                browseVansSlipOn();
                break;
            case 3:
                browseVansSk8Hi();
                break;
            case 4:
                browseProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseVansProducts();
        }
    }
    
    static void browseVansOldSkool() {
        System.out.println("===============================");
        System.out.println("Old Skool:");
        System.out.println("1. Old Skool Primary Check Shoe - P3,700");
        System.out.println("2. Old Skool Wide Shoe - P3,500");
        System.out.println("3. Old Skool Canvas Shoe - P3,500");
        System.out.println("4. Back to Vans Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                addToCart("Old Skool Primary Check Shoe", 3700);
                break;
            case 2:
                addToCart("Old Skool Wide Shoe", 3500);
                break;
            case 3:
                addToCart("Old Skool Canvas Shoe", 3500);
                break;
            case 4:
                browseVansProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseVansOldSkool();
        }
    }
    
    static void browseVansSlipOn() {
        System.out.println("===============================");
        System.out.println("Slip On:");
        System.out.println("1. Classic Slip-On Checkerboard Shoe - P3,000");
        System.out.println("2. Classic Slip-On Shoe - P1,700");
        System.out.println("3. Slip-On Perf Leather Shoe - P3,200");
        System.out.println("4. Back to Vans Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                addToCart("Classic Slip-On Checkerboard Shoe", 3000);
                break;
            case 2:
                addToCart("Classic Slip-On Shoe", 1700);
                break;
            case 3:
                addToCart("Slip-On Perf Leather Shoe", 3200);
                break;
            case 4:
                browseVansProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseVansSlipOn();
        }
    }
    
    static void browseVansSk8Hi() {
        System.out.println("===============================");
        System.out.println("Sk8-Hi:");
        System.out.println("1. Sk8-Hi Tapered Stackform Shoe - P4,200");
        System.out.println("2. Skate Sk8-Hi Shoe - P4,000");
        System.out.println("3. Toddler Sk8-Hi Zip Shoe - P2,200");
        System.out.println("4. Back to Vans Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                addToCart("Sk8-Hi Tapered Stackform Shoe", 4200);
                break;
            case 2:
                addToCart("Skate Sk8-Hi Shoe", 4000);
                break;
            case 3:
                addToCart("Toddler Sk8-Hi Zip Shoe", 2200);
                break;
            case 4:
                browseVansProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseVansSk8Hi();
        }
    }

    // ASICS SECTION
    static void browseAsicsProducts() {
        System.out.println("===============================");
        System.out.println("Asics Products:");
        System.out.println("1. Asics Gel-Kayano");
        System.out.println("2. Onitsuka Tiger");
        System.out.println("3. Asics Gel-Lyte III");
        System.out.println("4. Back to Main Menu");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                browseAsicsGelKayano();
                break;
            case 2:
                browseOnitsukaTiger();
                break;
            case 3:
                browseAsicsGelLyteIII();
                break;
            case 4:
                browseProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseAsicsProducts();
        }
    }
    
    static void browseAsicsGelKayano() {
        System.out.println("===============================");
        System.out.println("Asics Gel-Kayano:");
        System.out.println("1. Gel-Kayano 30 - P10,400");
        System.out.println("2. Gel-Kayano ACE 2 - P9,700");
        System.out.println("3. Gel-Kayano 30 PLATINUM - P11,900");
        System.out.println("4. Back to Asics Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                addToCart("Asics Gel-Kayano 30", 10400);
                break;
            case 2:
                addToCart("Asics Gel-Kayano ACE 2", 9700);
                break;
            case 3:
                addToCart("Asics Gel-Kayano 30 PLATINUM", 11900);
                break;
            case 4:
                browseAsicsProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseAsicsGelKayano();
        }
    }
    
    static void browseOnitsukaTiger() {
        System.out.println("===============================");
        System.out.println("Onitsuka Tiger:");
        System.out.println("1. Onitsuka Tiger Mexico 66 - P7,800");
        System.out.println("2. Onitsuka Tiger Tokuten - P10,000");
        System.out.println("3. Onitsuka Tiger Valentino - P7,500");
        System.out.println("4. Back to Asics Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                addToCart("Onitsuka Tiger Mexico 66", 7800);
                break;
            case 2:
                addToCart("Onitsuka Tiger Tokuten", 10000);
                break;
            case 3:
                addToCart("Onitsuka Tiger Valentino", 7500);
                break;
            case 4:
                browseAsicsProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseOnitsukaTiger();
        }
    }
    
    static void browseAsicsGelLyteIII() {
        System.out.println("===============================");
        System.out.println("Asics Gel-Lyte III:");
        System.out.println("1. GEL-LYTE III OG - P7,400");
        System.out.println("2. Ronnie Fieg's Kith x ASICS Gel Lyte III - P17,100");
        System.out.println("3. GEL-LYTE III Superstition” - P6,700");
        System.out.println("4. Back to Asics Products");
        System.out.println("===============================");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                addToCart("GEL-LYTE III OG", 7400);
                break;
            case 2:
                addToCart("Ronnie Fieg's Kith x ASICS Gel Lyte III", 17100);
                break;
            case 3:
                addToCart("GEL-LYTE III Superstition", 6700);
                break;
            case 4:
                browseAsicsProducts();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                browseAsicsGelLyteIII();
        }
    }
    
    static double getShoeSize() {
        double size = 0;
        boolean validInput = false;
        do {
            System.out.print("Select a size (US sizes 5 - 14, including half sizes): ");
            try {
                size = scanner.nextDouble();
                if (size < 5 || size > 14) {
                    System.out.println("Invalid size. Please select a size between US sizes 5 - 14, including half sizes.");
                } else {
                    validInput = true;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume invalid input to prevent an infinite loop
            }
        } while (!validInput);
        return size;
    }

    static void addToCart(String itemName, double price) {
        double size = getShoeSize();
        cartItems.add(itemName);
        itemPrices.add(price);
        itemSizes.add(size);
        totalAmount += price;
        System.out.println(itemName + " (Size: " + size + ") - P" + price + " added to cart.");
        browseProducts();
    }

    static void viewCart() {
        System.out.println("===============================");
        System.out.println("Your Cart:");
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println((i + 1) + ". " + cartItems.get(i) + " (Size: " + itemSizes.get(i) + ") - P" + itemPrices.get(i));
        }
        System.out.println("Total: PHP " + totalAmount);
        System.out.println("===============================");
        System.out.println("1. Remove item from cart");
        System.out.println("2. Continue shopping");
        System.out.println("3. Checkout");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                removeItem();
                break;
            case 2:
                browseProducts();
                break;
            case 3:
                checkout();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                viewCart();
        }
    }
    
    static void removeItem() {
        System.out.print("Enter the item number to remove: ");
        int itemNumber = scanner.nextInt();
        if (itemNumber >= 1 && itemNumber <= cartItems.size()) {
            String removedItem = cartItems.remove(itemNumber - 1);
            double removedPrice = itemPrices.remove(itemNumber - 1);
            double removedSize = itemSizes.remove(itemNumber - 1);
            totalAmount -= removedPrice;
            System.out.println(removedItem + " (Size: " + removedSize + ") - P" + removedPrice + " removed from cart.");
        } else {
            System.out.println("Invalid item number. Please try again.");
        }
        viewCart(); 
    }    

    static String getPaymentMethod() {
        System.out.println("Choose your payment method:");
        System.out.println("1. PayPal");
        System.out.println("2. GCash");
        System.out.println("3. Credit/Debit Card");
        System.out.print("Enter your choice: ");
        int paymentChoice = scanner.nextInt();
        scanner.nextLine(); 

        String paymentMethod;
        switch (paymentChoice) {
            case 1:
                paymentMethod = "PayPal";
                break;
            case 2:
                paymentMethod = "GCash";
                break;
            case 3:
                paymentMethod = "Credit/Debit Card";
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return getPaymentMethod(); 
        }
        return paymentMethod;
    }

    static void checkout() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty. Please add items before checking out.");
            browseProducts();
            return;
        }
    
        System.out.println("===============================");
        System.out.println("           CHECKOUT");
        System.out.println("===============================");
    
        System.out.print("Enter your full name: ");
        scanner.nextLine();
        String fullName = scanner.nextLine();
    
        System.out.print("Enter your shipping address: ");
        String shippingAddress = scanner.nextLine();
    
        String paymentMethod = getPaymentMethod();
    
        printReceipt(cartItems.toArray(new String[0]), itemPrices.stream().mapToInt(Double::intValue).toArray(), (int) totalAmount, shippingAddress, paymentMethod, fullName);
    
        System.out.print("Do you want to continue shopping? (Y/N): ");
        String continueShopping = scanner.next().toLowerCase();
        if (continueShopping.equals("y")) {
            // Reset cart after checkout
            cartItems.clear();
            itemPrices.clear();
            itemSizes.clear();
            totalAmount = 0;
            browseProducts();
        } else {
            System.out.println("Thank you for shopping with GSHOES. Goodbye!");
            System.exit(0);
        }
    }    
    
    static void printReceipt(String[] cartItems, int[] cartPrices, int total, String address, String paymentMethod, String fullName) {
        double processingFee = total * 0.05;
        double shippingFee = total * 0.15;
        double subtotal = total + processingFee + shippingFee;
        System.out.println("\n===============================");
        System.out.println("            RECEIPT");
        System.out.println("===============================");
        System.out.println("Customer: " + fullName.toUpperCase());
        System.out.println("Delivery Address: " + address.toUpperCase());
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("------------------------------");
        for (int i = 0; i < cartItems.length; i++) {
            System.out.println((i + 1) + ". " + cartItems[i] + " - P" + cartPrices[i]);
        }
        System.out.println("------------------------------");
        System.out.println("Total: P" + total);
        System.out.println("Processing Fee (5%): P" + processingFee);
        System.out.println("Shipping Fee (15%): P" + shippingFee);
        System.out.println("Subtotal: P" + subtotal);
        System.out.println("===============================");
        System.out.print("Please confirm your purchase (Y/N): ");
        String confirmation = scanner.next().toLowerCase();
        if (confirmation.equals("y")) {
            System.out.println("===============================");
            System.out.println("Thank you for your purchase!");
            System.out.println("Confirmation: Your order will be processed.");
            System.out.println("===============================");
        } else if (confirmation.equals("n")) {
            System.out.println("Purchase cancelled.");
        } else {
            System.out.println("Invalid choice. Purchase cancelled.");
        }
    }
}    