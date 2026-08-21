package item22;

// Constant utility class
public class PhysicalConstants {


    // Prevent instantiation
    private PhysicalConstants() {
        throw new AssertionError("Cannot instantiate PhysicalConstants");
    }

    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    public static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;
    public static final double ELECTRON_MASS = 9.109_383_56e-31;

}
