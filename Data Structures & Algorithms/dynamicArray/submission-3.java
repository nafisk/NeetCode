class DynamicArray {

    private int capacity;
    private int[] array; 
    private int size;

    public DynamicArray(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity cannot be negative: " + capacity);
        this.capacity = capacity;
        this.size = 0;
        this.array =  new int[capacity];
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.capacity) resize();
        this.array[this.size] = n;
        this.size += 1;
    }

    public int popback() {
        this.size -= 1;
        int poppedVal = this.array[this.size];
        return poppedVal;

    }

    private void resize() {
        this.capacity *= 2;
        int[] newArray = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
