import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class Set {

    int size = 0;

    Object[] container = new Object[10];

    public void add(Object obj) {
        container[size] = obj;
        size++;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(container[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void remove(Object obj) {
        if (contains(obj)) {
            container[indexOf(obj)] = container[size - 1];
            container[size - 1] = null;
            size--;
        }
    }

    public int size() {
        return size;
    }

    private Set one;
    private Set many;
    private Set set;

    @Before
    public void setUp() {
        one = new Set();
        many = new Set();
        one.add("1");
        many.add("1");
        many.add("2");
        many.add("3");

    }


    @Test
    public void isEmptyTest() {
        // assertEquals(3, many.size());
        assertFalse(many.isEmpty());
    }

    @Test
    public void removeTest() {
        many.remove("2");
        assertFalse(many.contains("2"));

    }

    @Test
    public void containsTest() {

    }

    @Test
    public void addTest() {

    }

    @Test
    public void indexOfTest() {
        
    }


}
