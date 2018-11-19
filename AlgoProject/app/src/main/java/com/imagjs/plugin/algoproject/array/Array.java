package com.imagjs.plugin.algoproject.array;

public class Array{
    private int data[];
    private int n;
    private int count;

    public Array(int capacity){
        data = new int[capacity];
        n = capacity;
        count = 0;
    }

    public int find(int index){
        if(index < 0 || index >= count) return -1;
        return data[index];
    }

    public boolean delete(int index){
        if(index < 0 || index >= count) return false;
        for(int i = index; i < count; i++){
            data[i] = data[i+1];
        }
        count--;
        return true;
    }

    public boolean insert(int index,int value){
        if(index < 0 || index >=n) return false;
        for(int i = count; i>index; i--){
            data[i+1] = data[i];
        }
        data[index] = value;
        count++;
        return true;
    }

    public boolean insertToTail(int value){
        if(count == n) return false;
        data[count++] = value;
        return true;
    }

    public void printAll() {
        for (int i = 0; i < count; ++i) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
  }
}