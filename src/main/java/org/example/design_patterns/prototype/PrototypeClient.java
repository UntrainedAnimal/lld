package org.example.design_patterns.prototype;

import java.util.List;

public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees =new Employees();
        employees.addData();

        System.out.println(employees.getEmpList());
        System.out.println(employees.hashCode());

        Employees clone = (Employees) employees.clone();
        System.out.println(clone.getEmpList());
        System.out.println(clone.hashCode());

        System.out.println(employees==clone);
        System.out.println(employees.getEmpList()==clone.getEmpList());
        System.out.println(employees.getEmpList().hashCode()==clone.getEmpList().hashCode());

        List<String> list = employees.getEmpList();
        list.add("xxx");
        System.out.println(employees.getEmpList());
        System.out.println(clone.getEmpList());
    }
}
