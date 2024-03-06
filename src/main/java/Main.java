public class Main {

    public static void main(String[] args) {
        int numOne = 17:
        int numTwo = 25:
        int resultOne = add(numOne, numTwo);
        System.out.println ("The sum of " + numOne + " and " + numTwo " = " + resultOne);
        String resultTwo = greeting("jasmine");
        System.out.println (resultTwo + "!");
        int resultThree = add(4, 7, 2, 9);
        System.out.println ("the sum is  " + resultThree);
        String printCapitalised = toBePrinted("urvi");
        // call the first add method and store the result into a variable called resultOne.

        // print resultOne.

        // call the greeting method and store the result into a variable called resultTwo.

        // print resultTwo.

        // call the second add method and store the result into a variable called resultThree.

        // print resultThree.

        // call the printCapitalised method.

    }

    public static int add(int numOne, int numTwo) {
        return (numOne + numTwo)
    }

    public static String greeting(String name) {
        return "Bonjour " + name + "!"
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return add(add(numOne , numTwo) , add(numThree , numFour));
    }
    public static String printCapitalised(String toBePrinted) {
        //String toBePrinted = ("please capitalise");
        return toBePrinted.toUpperCase();
    }
    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @return the sum of numOne and numTwo (an integer)
     */


    /**
     * greeting
     * @param name - the name of a person (a String)
     * @return a greeting in the format of "Bonjour, [name]!" (a String)
     */


    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @param numThree - an integer
     * @param numFour - an integer
     * @return the sum of numOne, numTwo, numThree, and numFour (an integer)
     */


    /**
     * printCapitalised
     * @param toBePrinted - a String that the user wishes to be printed in all caps.
     */




}
