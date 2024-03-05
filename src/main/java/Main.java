public class Main {

    public static void main(String[] args) {

        // call the first add method and store the result into a variable called resultOne.

        // print resultOne.

        // call the greeting method and store the result into a variable called resultTwo.

        // print resultTwo.

        // call the second add method and store the result into a variable called resultThree.

        // print resultThree.

        // call the printCapitalised method.

    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @return the sum of numOne and numTwo (an integer)
     */
    public static int add(int numOne, int numTwo) {

        return numOne + numTwo;

    }

    /**
     * greeting
     * @param name - the name of a person (a String)
     * @return a greeting in the format of "Bonjour, [name]!" (a String)
     */
    public static String greeting(String name) {

        return "Bonjour, " + name + "!";

    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @param numThree - an integer
     * @param numFour - an integer
     * @return the sum of numOne, numTwo, numThree, and numFour (an integer)
     */
    public static int add(int numOne, int numTwo, int numThree, int numFour) {

        return add(add(numOne, numTwo), add(numThree, numFour));

    }

    /**
     * printCapitalised
     * @param toBePrinted - a String that the user wishes to be printed in all caps.
     */
    public static void printCapitalised(String toBePrinted) {

        System.out.println(toBePrinted.toUpperCase());

    }



}
