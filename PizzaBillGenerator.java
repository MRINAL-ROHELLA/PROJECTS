public class PizzaBillGenerator {
    public static void main(String[] args) {
        // Pizza basePizza = new Pizza(true);
        // basePizza.addExtraToppings();
        // basePizza.addExtraCheese();
        // basePizza.getBill();
        DeluxePizza DP = new DeluxePizza(false);
        DP.addExtraCheese();
        DP.addExtraToppings();
        DP.getBill();
    }
}
