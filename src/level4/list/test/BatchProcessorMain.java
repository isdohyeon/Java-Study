package level4.list.test;

import level4.list.MyArrayList;

public class BatchProcessorMain {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        //MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
