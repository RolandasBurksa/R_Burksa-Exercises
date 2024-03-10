package lt.techin.collections;

import java.sql.SQLOutput;
import java.util.*;

public class Example {

String string;
public static void main(String[] args) {
//    Collection<String> words = new ArrayList<>();

//    public static void printAll(Collection<String> words){
//        for (String word : words){
//            System.out.println();

    int initialCapacity;
    List<String> words = new ArrayList<>(10);

    Collection<String> words1 = new HashSet<>();

    words1.add("aaa");
    words1.add("bbb");
    words1.add("ccc");
    words1.add("aaa");


    Collection<String> words2 = new HashSet<>();

    words2.add("aaa");
    words2.add("bbb");
    words2.add("ccc");
    words2.add("aaa");
    Collection<String> uni = new HashSet<>(words2);
    System.out.println(words2.contains("aaa"));


    Map<String, String> map = new HashMap<>();
}

}

