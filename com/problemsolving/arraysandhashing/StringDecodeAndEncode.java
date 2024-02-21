package com.problemsolving.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDecodeAndEncode {
    public String encode(List<String> strs) {
        if (strs.isEmpty())
            return null;
        if (strs.size() == 1 && strs.getFirst().isEmpty())
            return "";
        StringBuilder encodedString = new StringBuilder();
        for (String string : strs) {
            encodedString.append(string).append(".");
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        if (str == null)
            return new ArrayList<>();
        String[] strings = str.split("\\.");
        return Arrays.asList(strings);
    }
}
