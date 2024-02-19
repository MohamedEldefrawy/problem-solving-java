package src;

import src.com.problemsolving.arraysandhashing.StringDecodeAndEncode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringDecodeAndEncode stringDecodeAndEncode = new StringDecodeAndEncode();
//        String encodedString = stringDecodeAndEncode.encode(List.of("neet.", "code.", "love.", "you."));
        String encodedString = stringDecodeAndEncode.encode(List.of(""));
//        String encodedString = stringDecodeAndEncode.encode(List.of());
//        String encodedString = stringDecodeAndEncode.encode(List.of("","   ","!@#$%^&*()_+","LongStringWithNoSpaces","Another, String With, Commas"));
//        String encodedString = stringDecodeAndEncode.encode(List.of(""));
        List<String> strings = stringDecodeAndEncode.decode(encodedString);

        strings.forEach(System.out::println);
    }
}
