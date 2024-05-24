import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<Item> items(Item... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void EveryBranch() {
        RuntimeException exception;

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 1));
        assertTrue(exception.getMessage().contains("allItems list can't be null!"));

        assertTrue(SILab2.checkCart(new ArrayList<Item>(), 0));

        assertFalse(SILab2.checkCart(new ArrayList<Item>(), -1));

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items(new Item("", null, 200, 0.4f)), 1));
        assertTrue(exception.getMessage().contains("No barcode!"));

        assertFalse(SILab2.checkCart(items(new Item("", "012345", 350, 0.4f)), 2));

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items(new Item("Matej", "01f3456", 350, 0.4f)), 1));
        assertTrue(exception.getMessage().contains("Invalid character in item barcode!"));

        assertFalse(SILab2.checkCart(items(new Item("Matej", "123456", 200, -1)), 2));
    }

    @Test
    void MultipleConditions() {
        assertFalse(SILab2.checkCart(items(new Item("", "01234", 100, 0.5f)), 2));
        assertFalse(SILab2.checkCart(items(new Item("", "12345", 400, -2f)), 2));
        assertFalse(SILab2.checkCart(items(new Item("", "12345", 400, 0.5f)), 2));
        assertTrue(SILab2.checkCart(items(new Item("", "01234", 400, 0.5f)), 300));
    }
}