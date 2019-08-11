package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

class EnumController{
    public static void main(String[] args) {
        System.out.println(size.MEDIUM);

        System.out.println("The population of Canada is " + northAmericanCountries.CANADA.getPopulation() + " people.");
    }
}

enum size{
    EXTRASMALL, SMALL, MEDIUM, LARGE, EXTRALARGE;
}

enum northAmericanCountries{
    CANADA("37 million"),
    USA("327 million"),
    MEXICO("129 million");

    private String population;

    northAmericanCountries(String population) {
        this.population = population;
    }

    public String getPopulation() {
        return population;
    }
}
