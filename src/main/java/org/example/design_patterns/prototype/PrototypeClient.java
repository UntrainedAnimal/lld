package org.example.design_patterns.prototype;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Employees employees =new Employees();
//        employees.addData();
//
//        System.out.println(employees.getEmpList());
//        System.out.println(employees.hashCode());
//
//        Employees clone = (Employees) employees.clone();
//        System.out.println(clone.getEmpList());
//        System.out.println(clone.hashCode());
//
//        System.out.println(employees==clone);
//        System.out.println(employees.getEmpList()==clone.getEmpList());
//        System.out.println(employees.getEmpList().hashCode()==clone.getEmpList().hashCode());
//
//        List<String> list = employees.getEmpList();
//        list.add("xxx");
//        System.out.println(employees.getEmpList());
//        System.out.println(clone.getEmpList());



//        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//        List<Integer> collect = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                .entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).collect(Collectors.toList());
//        System.out.println(collect);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 1));
        System.out.println(collect);

        List<String> list = Arrays.asList("a", "b", "c");
        System.out.println(list.stream().collect(Collectors.joining(",")));


        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        Set<Integer> collect1 = list1.stream().filter(list2::contains).collect(Collectors.toSet());
        System.out.println(collect1             );


    }
}
