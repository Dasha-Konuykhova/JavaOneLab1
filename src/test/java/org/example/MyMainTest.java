package org.example;

        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.BeforeEach;

        import static org.junit.Assert.*;

public class MyMainTest {

    MyInterface<String> list1;

    @BeforeEach
    public void prepareDate() {
        list1 = new MyMain<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
    }

    @Test
    public void testAddMethod() {
        list1.add("4");
        assertEquals("4", list1.get(3));
    }

    @Test
    public void testDeleteMethod() {
        list1.delete(1);
        assertEquals(2, list1.size());
        assertEquals("3", list1.get(1));
    }

    @Test
    public void testGetMethod() {
        assertEquals("2", list1.get(1));
    }

    @Test
    public void testSizeMethod() {
        assertEquals(3, list1.size());
    }

    @Test
    public void testUpdateMethod() {
        list1.update(2, "update");
        assertEquals("update", list1.get(2));
    }
}
