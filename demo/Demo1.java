package demo;

import java.sql.SQLClientInfoException;

class Demo1{
    public static void main(String[] args) {
        try {
            System.out.println("Error");
            throw new SQLClientInfoException();
          
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}