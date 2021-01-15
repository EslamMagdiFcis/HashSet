package com.datastructures;

import java.util.Arrays;
import java.util.LinkedList;

public final class HashSet<T> {
    private int initTableSize;
    private LinkedList[] hashTable;

    public HashSet(){
        this(10);
    }

    public HashSet(int initTableSize) {
        this.initTableSize = initTableSize;
        hashTable = new LinkedList[initTableSize];

        for (int i = 0; i < initTableSize; i++) {
            hashTable[i] = new LinkedList<T>();
        }
    }

    public Boolean add(T item) {
        int index = getIndex(item);

        if(hashTable[index].contains(item)) {
            return false;
        }
        else {
            hashTable[index].add(item);
            return true;
        }
    }

    public void clear() {
        for (int i = 0; i < initTableSize; i++) {
            hashTable[i].clear();
            hashTable[i] = null;
        }

        initTableSize = 0;
        hashTable = null;
    }

    public HashSet<T> clone(){
        HashSet<T> copy = new HashSet<>();

        for (int i = 0; i < initTableSize; i++) {

            for (var item: hashTable[i]) {
                copy.hashTable[i].add(item);
            }
        }

        return copy;
    }

    public Boolean isEmpty(){

        for (int i = 0; i < initTableSize; i++) {

            if(hashTable[i].size() > 0)
                return false;
        }

        return true;
    }

    public Boolean remove(T value) {
        int index = getIndex(value);
        return hashTable[index].remove(value);
    }

    public Boolean contains(T value){
        int index = getIndex(value);
        return hashTable[index].contains(value);
    }

    public int size(){
        int size = 0;

        for (int i = 0; i < initTableSize; i++) {
            size += hashTable[i].size();
        }

        return size;
    }

    private int getIndex(T value){
        return value.hashCode() % initTableSize;
    }

    @Override
    public String toString() {
        return "HashSet{" +
                "init Table Size=" + initTableSize +
                ", hash Table=" + Arrays.toString(hashTable) +
                '}';
    }
}
