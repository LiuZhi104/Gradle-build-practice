package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.IntStream;


public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int min=Math.min(leftBorder,rightBorder);
        int max=Math.max(leftBorder,rightBorder);
        return IntStream.rangeClosed(min,max).filter(number->number%2==0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        for(int i=0;i<arrayList.size();i++){
            sum+=arrayList.get(i)*3+2;
        }
        return  sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i)%2!=0) {
               arrayList.set(i,arrayList.get(i) * 3 + 2);
            }
        }
        return  arrayList;


    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int sum=0;
        int count=0;
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i)%2==0) {
               sum+= arrayList.get(i);
               count++;
            }
        }
        return (double)sum/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i)%2!=0) {
              arrayList.remove(i);
            }
        }
        return arrayList;
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
