public class PizzaOrder {
    private String orderID;
    private String pizzaIngredients;
    private double orderTotal;
    private String sides;
    private String drinks;
    public final String DEF_ORDER_ID = "DEF-SOH-099";
    public final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public final double DEF_ORDER_TOTAL = 15.0;

    public PizzaOrder() {
        this.orderID = "DEF-SOH-099";
        this.pizzaIngredients = "Mozzarella Cheese";
        this.orderTotal = 15.0;
        this.sides = "";
        this.drinks = "";
    }

    public PizzaOrder(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
        this.sides = "";
        this.drinks = "";
    }

    public String getOrderID() {
        return this.orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getPizzaIngredients() {
        return this.pizzaIngredients;
    }

    public void setPizzaIngredients(String pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public double getOrderTotal() {
        return this.orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getSides() {
        return this.sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    public String getDrinks() {
        return this.drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    private void printReceipt() {
        System.out.println("Order ID: " + this.orderID);
        System.out.println("Pizza Ingredients: " + this.pizzaIngredients);
        System.out.println("Order Total: $" + this.orderTotal);
        System.out.println("Sides: " + this.sides);
        System.out.println("Drinks: " + this.drinks);
    }

    public void displayReceipt() {
        this.printReceipt();
    }

    public void processCardPayment(String cardNumber, String expiryDate, int cvv) {
        int cardLength = cardNumber.length();
        if (cardLength == 14) {
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
        }

        int firstCardDigit = Integer.parseInt(cardNumber.substring(0, 1));

        String blacklistedNumber = "12345678901234";
        if (cardNumber.equals(blacklistedNumber)) {
            System.out.println("Card is blacklisted. Please use another card");
        }

        int lastFourDigits = Integer.parseInt(cardNumber.substring(cardLength - 4));

        StringBuilder cardNumberToDisplayBuilder = new StringBuilder(cardNumber);
        for (int i = 1; i < cardLength - 4; i++) {
            cardNumberToDisplayBuilder.setCharAt(i, '*');
        }
        String cardNumberToDisplay = cardNumberToDisplayBuilder.toString();

        System.out.println("First card digit: " + firstCardDigit);
        System.out.println("Last four digits: " + lastFourDigits);
        System.out.println("Card number to display: " + cardNumberToDisplay);
    }

    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        StringBuilder specialDetails = new StringBuilder();
        specialDetails.append("Pizza of the day: ").append(pizzaOfTheDay).append("\n");
        specialDetails.append("Side of the day: ").append(sideOfTheDay).append("\n");
        specialDetails.append("Special price: ").append(specialPrice).append("\n");

        System.out.println(specialDetails.toString());
    }
}