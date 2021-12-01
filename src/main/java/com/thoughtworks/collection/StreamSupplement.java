package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {

        return numbers.stream().sorted((a,b)-> b-a).collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int getMaxValue(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).reduce(0,(prev,curr)-> curr> prev? curr:prev);
    }

}
