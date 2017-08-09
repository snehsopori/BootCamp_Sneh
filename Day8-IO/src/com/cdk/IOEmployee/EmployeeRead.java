package com.cdk.IOEmployee;

import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeRead {
    public static void main(String[] args){


        FileInputStream fis = null;
        ObjectInputStream ois = null;
        TreeSet<Employee> tree = new TreeSet<>();
        boolean cont = true;
        try{
            fis = new FileInputStream("C:\\Java Training\\AssignmentsSubmit\\Employees.txt");
            ois = new ObjectInputStream(fis);
            while (cont) {
                try {
                    Employee emp = (Employee) ois.readObject();
                    if (emp != null) {
                        tree.add(emp);
                    } else {
                        cont = false;
                    }
                } catch (EOFException e){
                    Iterator<Employee> itr = tree.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next().toString());
                    }
                    cont = false;
                }
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(ois != null){
                    ois.close();
                }
                if(fis != null){
                    fis.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
