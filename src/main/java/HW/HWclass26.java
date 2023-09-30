package HW;

import java.util.Collections;
import java.util.LinkedHashMap;

/*Create a Map that will store Employee name and salary. Write a logic to retrieve
an employee who gets the highest salary. Output should be in the below format
John Smith=$100000
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
public class HWclass26 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> employees = new LinkedHashMap<>();
        employees.put("Ahmed", 120000);
        employees.put("Ehab", 150000);
        employees.put("Rihanna", 160000);
        employees.put("Hind", 190000);
        employees.put("Kofta", 2100000);

        var highestSalary= Collections.max(employees.values());
        employees.forEach((k,v)->{if (v.intValue()==highestSalary){
            System.out.println("The employee who gets the highest salary is "+k+"="+v);
        }});

  /*      for (var employeeEntry : employees.entrySet()) {
            if (employeeEntry.getValue()==highestSalary)
            {System.out.println("The employee who gets the highest salary is "+employeeEntry);}
        }*/


    }}