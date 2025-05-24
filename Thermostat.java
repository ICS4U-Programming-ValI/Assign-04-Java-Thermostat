/**
 * This is the package for Thermostat.java
 *
 * The Thermostat.java program holds the fields and methods
 * for the Thermostat class.
 * It includes methods to set and get the temperature,
 * as well as methods to convert the temperature to fahrenheit.
 * <p>This class satisfies style checkers.</p>
 *
 * @author Val I
 * @version 1.0
 * @since 2025-05-21
 */
public class Thermostat {
    // fields
    Double celsius;
    Double fahrenheit;
    String id;

    // Constructors
    public Thermostat(String id) {
        this.id = id;
        this.celsius = 0.0;
        this.fahrenheit = 32.0;
    }

    public Thermostat(String id, Double celsius) {
        this.id = id;
        this.celsius = celsius;
        this.fahrenheit = toFahrenheit();
    }

    // methods
    // move temperature
    public void setCelsius(Double celsius) {
        this.celsius = celsius;
        this.fahrenheit = toFahrenheit();
    }

    public void increaseTemp(Double amount) {
        this.celsius += amount;
        this.fahrenheit = toFahrenheit();
    }

    public void decreaseTemp(Double amount) {
        this.celsius -= amount;
        this.fahrenheit = toFahrenheit();
    }
    // convert celsius to fahrenheit
    public Double toFahrenheit() {
        return (this.celsius * 9 / 5) + 32;
    }


    // print the temperature
    public void getTemp() {
        System.out.println("Thermostat " + this.id);
        System.out.println("Celsius: " + this.celsius + "°C");
        System.out.println("Fahrenheit: " + this.fahrenheit + "°F");
        System.out.println();
    }

}
