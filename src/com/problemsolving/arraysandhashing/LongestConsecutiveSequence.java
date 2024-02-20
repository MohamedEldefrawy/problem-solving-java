package src.com.problemsolving.arraysandhashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numbersSet = buidSet(nums);
        List<Integer> sequences = getSequences(numbersSet);
        return longestSequence(sequences, numbersSet);
    }

    private List<Integer> getSequences(Set<Integer> numbers) {
        List<Integer> sequences = new ArrayList<>();
        numbers.forEach(integer -> {
            if (!numbers.contains(integer - 1))
                sequences.add(integer);
        });

        return sequences;
    }

    private Set<Integer> buidSet(int[] numbers) {

        Set<Integer> numbersSet = new HashSet<>();
        for (int number : numbers) {
            numbersSet.add(number);
        }
        return numbersSet;
    }

    private int longestSequence(List<Integer> Sequences, Set<Integer> numbers) {
        if (Sequences.isEmpty() || numbers.isEmpty())
            return 0;
        int counter = 1;
        int max = 1;
        for (Integer number : Sequences) {
            boolean flag = true;
            while (flag) {
                if (numbers.contains(number + 1)) {
                    number++;
                    counter++;
                } else {
                    flag = false;
                }
            }
            if (max < counter)
                max = counter;
            counter = 1;
        }
        return max;
    }
}
