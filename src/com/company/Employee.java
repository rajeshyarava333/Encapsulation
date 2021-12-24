package com.company;

public class Employee {
        int age;
        void setAge( int age){
            if(age<0){
                this.age=0;
            }
            else if (age>0){
                this.age=100;
            }
            else{
                this.age=0;
            }
        }
        int getAge(){
            return age;
        }
        public static void main(String args[]){
            Employee e=new Employee();
            e.setAge(200);
            int x=e.getAge();
            System.out.println(x);
        }
    }

