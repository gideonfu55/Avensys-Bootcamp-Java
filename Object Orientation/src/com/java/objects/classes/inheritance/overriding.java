package com.java.objects.classes.inheritance;

class Teacher {
  void markAttendance() {
    System.out.println("Teacher is marking attendance.");
  }

  void teach() {
    System.out.println("Teacher is teaching");
  }
}

class PhysicsTeacher extends Teacher {
  void teach() {
    System.out.println("Physics teacher is teaching physics.");
  }

  void labExpPhy() {
    System.out.println("Physics teacher is doing a lab experiment.");
  }
}

public class overriding extends Object {
  public static void main(String[] args) {
    PhysicsTeacher pt1 = new PhysicsTeacher();
    pt1.markAttendance();
    pt1.teach();
    pt1.labExpPhy();
  }
  
}
