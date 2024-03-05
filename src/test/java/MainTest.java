import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void add() {

        assertEquals(4, Main.add(2,2));
        assertEquals(22, Main.add(20,2));

    }

    @org.junit.jupiter.api.Test
    void greeting() {

        String expectedOne = "Bonjour, Emily!";
        String expectedTwo = "Bonjour, Amboise!";
        assertEquals(expectedOne, Main.greeting("Emily"));
        assertEquals(expectedTwo, Main.greeting("Amboise"));

    }

    @org.junit.jupiter.api.Test
    void testAdd() {

        assertEquals(8, Main.add(2,2,2,2));
        assertEquals(56, Main.add(18, 18, 12, 8));
    }
}