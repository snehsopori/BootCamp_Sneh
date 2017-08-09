package com.cdk.IOEmployee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeWrite {

    public static void main(String[] args) {
        List<Employee> emp = createNameTestData();
        List<Employee> list = new ArrayList();
        Iterator<Employee> itr = emp.iterator();
        while(itr.hasNext()){
            Employee e = itr.next();
            if(e.getSalary() > 40000) {
                list.add(e);
                //System.out.println(e);
            }
        }
        Collections.sort(list, new SalaryComparator());
//        Iterator<Employee> itr2 = list.iterator();
//        while(itr2.hasNext()){
//            Employee e = itr2.next();
//                System.out.println(e);
//        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream("C:\\Java Training\\AssignmentsSubmit\\Employees.txt");
            oos = new ObjectOutputStream(fos);
            Iterator itrlist = list.iterator();
            while(itrlist.hasNext()) {
                oos.writeObject(itrlist.next());
            }
            System.out.println("Done");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(oos != null){
                    oos.close();
                }
                if(fos != null){
                    fos.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static List<Employee> createNameTestData() {
        Employee e1 = new Employee(10, 25000.90,"Rajesh");
        Employee e2 = new Employee(20, 40667.89,"Ritesh");
        Employee e3 = new Employee(30,65743.89,"Kunal");
        Employee e4 = new Employee(15,6543.89,"Sachin");
        Employee e5 = new Employee(5,35743.89,"Anmol");
        Employee e6 = new Employee(25,99743.89,"Ramesh");
        Employee e7 = new Employee(35,785743.89,"Suresh");
        Employee e8 = new Employee(8,123743.89,"Ram");
        Employee e9 = new Employee(16,90743.89,"Sham");
        Employee e10 = new Employee(13,5743.89,"Nitesh");
        Employee e11 = new Employee(27,45643.89,"Mahesh");
        Employee e12 = new Employee(2,123743.89,"Viraj");


        List<Employee> name = new ArrayList();
        name.add(e1);
        name.add(e2);
        name.add(e3);
        name.add(e4);
        name.add(e5);
        name.add(e6);
        name.add(e7);
        name.add(e8);
        name.add(e9);
        name.add(e10);
        name.add(e11);
        name.add(e12);

        return name;
    }
}
