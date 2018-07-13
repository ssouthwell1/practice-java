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


}
