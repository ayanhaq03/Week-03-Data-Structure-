package hashmap_and_hashFunctions.custom_hashmap;


import java.util.LinkedList;

class CustomHashmap {
    private static final int SIZE = 1000;
    private LinkedList<Entry>[] map;

    static class Entry {
        int key, value;
        Entry(int k, int v) { this.key = k; this.value = v; }
    }

    public CustomHashmap() {
        map = new LinkedList[SIZE];
    }

    private int getIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        if (map[index] == null) map[index] = new LinkedList<>();

        for (Entry entry : map[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        map[index].add(new Entry(key, value));
    }

    public Integer get(int key) {
        int index = getIndex(key);
        if (map[index] != null) {
            for (Entry entry : map[index]) {
                if (entry.key == key) return entry.value;
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = getIndex(key);
        if (map[index] != null) {
            map[index].removeIf(entry -> entry.key == key);
        }
    }

    public static void main(String[] args) {
        CustomHashmap map = new CustomHashmap();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1)); // Output: 10
        map.remove(1);
        System.out.println(map.get(1)); // Output: null
    }
}
