/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tla02;

/**
 *
 * @author Student's Account
 */
import java.util.*;

public class TLA02 {

    public static void main(String[] args) {
        
        HashMap <String, Integer> student = new HashMap<>();
        
        student.put("John", 85);
        student.put("Alice", 90);
        student.put("Mark", 78);
        student.put("Sopia", 95);
        student.put("Emma", 88);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter student's name to find their score: ");
        
        String name = scan.nextLine();
        
       if (student.containsKey(name)){
           System.out.println(name + "'s score is: " + student.get(name));
       } else {
           System.out.println("Student not found.");
       }
       
        System.out.println(" ");
        
        System.out.print("Enter the student's name to update their score: ");
        name = scan.nextLine();
        
        if(student.containsKey(name)){
            System.out.print("Enter the new score: ");
            int newscore = scan.nextInt();
            student.put(name,  newscore);
            System.out.println(name + "'s" + " Score updated successfully.");
        }
        System.out.println(" ");
        
        System.out.println("List of students score:");
        for ( String students : student.keySet()){
            System.out.println(students + ": " + student.get(students));
        }
    }
}
