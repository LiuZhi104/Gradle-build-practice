package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int min = Math.min(left, right);
        int max = Math.max(left, right);
        throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
