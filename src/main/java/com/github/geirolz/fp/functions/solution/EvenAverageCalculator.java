package com.github.geirolz.fp.functions.solution;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenAverageCalculator {
    private static Function<List<Integer>, List<Integer>> filterEvenValues = nums ->
            nums.stream().filter(n -> n%2 == 0).collect(Collectors.toList());

    private static Function<List<Integer>, Double> computeAverage = nums ->
            nums.stream().mapToDouble(v -> v).average().orElse(0);

    public static Double compute(List<Integer> nums) {
        Function<List<Integer>, Double> operation = filterEvenValues.andThen(computeAverage);

        return operation.apply(nums);
    }
}
