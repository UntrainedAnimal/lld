package org.example.design_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees(){
        this.empList = new ArrayList<>();
    }
    public Employees(List<String> empList){
        this.empList = empList;
    }

    public void addData(){
        empList.add("samarjit");
        empList.add("Sandip");
        empList.add("David");
        empList.add("Raj");
    }
    public List<String> getEmpList(){
        String x = this.toString();
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //deep cloning
//        super.clone();
//        List<String> aux = new ArrayList<>(this.getEmpList());
//        return new Employees(aux);

        return super.clone(); //this is shallow cloning
    }
}
