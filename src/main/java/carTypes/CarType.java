package carTypes;

public enum CarType {
    VAUXHALLCORSA("Vauxhall Corsa", 5, 2016, 12000.5),
    TOYOTAPRIUS("Toyota Prius", 3, 2010, 120000.6),
    TESLA("Tesla", 3, 2023, 5);

    private final String name;
    private final int doors;
    private final int year;
    private final double mileage;

    CarType(String name, int doors, int year, double mileage) {
        this.name = name;
        this.doors = doors;
        this.year = year;
        this.mileage = mileage;
    }
}
