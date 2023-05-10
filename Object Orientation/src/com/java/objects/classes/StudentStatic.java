package com.java.objects.classes;

import java.util.Scanner;

public class StudentStatic {
  
  String name;
  public static String school = "MIT";
  String subject;
  int marks;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the student name:");
    name = scan.nextLine();
    System.out.println("Enter the subject:");
    subject = scan.nextLine();
    System.out.println("Enter the score:");
    marks = scan.nextInt();

    // scan.close();
  }

  public void display() {
    System.out.println("School: " + school + ", Student: " + name + ", Score is: " + marks);
  }

}
