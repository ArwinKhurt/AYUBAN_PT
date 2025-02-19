package repo.heap;

import java.util.*;

public class heap {
    private List<Integer> heap;

    public heap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int removeMax() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }

        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return max;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) <= heap.get(parent)) break;
            Collections.swap(heap, index, parent);
            index = parent;
        }
    }

    private void heapifyDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int largest = index;

        if (leftChild < heap.size() && heap.get(leftChild) > heap.get(largest)) {
            largest = leftChild;
        }

        if (rightChild < heap.size() && heap.get(rightChild) > heap.get(largest)) {
            largest = rightChild;
        }

        if (largest != index) {
            Collections.swap(heap, index, largest);
            heapifyDown(largest);
        }
    }

    public void display() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        heap heap = new heap();

        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);

        System.out.println("Heap after insertions:");
        heap.display();

        System.out.println("Max element removed: " + heap.removeMax());

        System.out.println("Heap after removal:");
        heap.display();
    }
}
