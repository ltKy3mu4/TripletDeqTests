package ru.mpei.impl;

import ru.mpei.Containerable;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class MyTripletQueueImpl<T> implements Deque<T>, Containerable {

    private MyContainer<T> firstContainer;
    private MyContainer<T> lastContainer;

    @Override
    public Object[] getContainerByIndex(int cIndex) {
        MyContainer<T> ref = firstContainer;
        int counter = 0;
        while (cIndex!=counter){
            ref = firstContainer.next;
            counter++;
        }
        return ref.data;
    }

    private class MyContainer<T> {
        MyContainer<T> next;
        MyContainer<T> prev;
        private int capacity, iniIndex, lastIndex;
        private Object[] data;

        public MyContainer(int capacity) {
            this.capacity = capacity;
            this.data = new Object[capacity];
        }

        public MyContainer() {
            this(5);
        }

        public boolean addFirst(T obejct){
            throw new RuntimeException("not implemented");
        }

        public boolean addLast(T obejct){
            if (lastIndex == capacity){
                return false;
            } else {
                data[lastIndex] = obejct;
                lastIndex++;
                return true;
            }
        }

        public int getDataCount(){
            return lastIndex -iniIndex;
        }
    }

    @Override
    public void addFirst(T t) {

    }

    @Override
    public void addLast(T t) {
        if (lastContainer == null){
            firstContainer = new MyContainer<>();
            lastContainer = firstContainer;
        }
        boolean res = lastContainer.addLast(t);
        if (!res){
            MyContainer<T> newLastContainer = new MyContainer<>();
            newLastContainer.prev = lastContainer;
            lastContainer.next = newLastContainer;
            lastContainer = newLastContainer;
            this.addLast(t);
        }
    }

    @Override
    public boolean offerFirst(T t) {
        return false;
    }

    @Override
    public boolean offerLast(T t) {
        return false;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        Object datum = this.lastContainer.data[this.lastContainer.lastIndex - 1];
        return (T) datum;
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        lastContainer=null;
        firstContainer=null;
    }

    @Override
    public void push(T t) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public Iterator<T> descendingIterator() {
        return null;
    }
}
