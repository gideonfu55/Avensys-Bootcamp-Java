class Bank {
  public void alpha() {
    try {
      System.out.println("Connection 3 established.");
      alpha();
    } catch (Error e) {
      System.out.println("Don't keep alpha method in loop");
    }
    System.out.println("Connection 3 is Closed");
  }
}

class SketchPad {
  public static void main(String[] args) {
    
  }
}