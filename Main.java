public class Main {
    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        // Create Thermostat objects
        Thermostat thermostat1 = new Thermostat("1", 20.3);
        Thermostat thermostat2 = new Thermostat("2");
        System.out.println("Original temperatures");
        thermostat1.getTemp();
        thermostat2.getTemp();

        // increase temperatures
        thermostat1.increaseTemp(5.0);
        thermostat2.setCelsius(15.0);
        System.out.println("After increasing temperatures");
        thermostat1.getTemp();
        thermostat2.getTemp();

        // decrease temperatures
        thermostat1.decreaseTemp(2.0);
        thermostat2.decreaseTemp(3.0);
        System.out.println("After decreasing temperatures");
        thermostat1.getTemp();
        thermostat2.getTemp();

        // Converts celsius to fahrenheit (methods already do this)
        Double fahrenheit1 = thermostat1.toFahrenheit();
        Double fahrenheit2 = thermostat2.toFahrenheit();
        System.out.println("Converted to Fahrenheit");
        System.out.println("Thermostat 1 " + fahrenheit1 + "°F");
        System.out.println("Thermostat 2 " + fahrenheit2 + "°F");

    }
}
