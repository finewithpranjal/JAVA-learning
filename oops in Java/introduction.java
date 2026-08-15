import java.util.Arrays;

public class introduction {

  public static void main(String[] args) {
    // store five numbers
    int numbers[] = new int[5];

    // store five names
    String names[] = new String[5];

    // Data of five student : ( roll no, name , marks)
    int rno[] = new int[5];
    String name[] = new String[5];
    float marks[] = new float[5];

    // class - A class is a named group of properties and functions. it is a logical
    // construct
    // Object - physical Reality // occupies space in memory.
    // Objects are the representator of class , here student is a user data type so
    // classess helps us in defining this datatype.
    // instance of the class are objects , intance --> physical stuff of the class

    // Student students [] = new Student[5];

    // Student raghav; // declairing this refference variable, yaha par object
    // create nahi hua hai.
    // System.out.println(Arrays.toString(students)); // output --> null
    Student raghav = new Student();
    raghav.changeName("Pranjal");
    raghav.greeting();
    raghav.rno = 21;
    raghav.name = "Raghav Aarya";
    raghav.marks = 83;
    // System.out.println(raghav);
    System.out.println(raghav.rno);
    System.out.println(raghav.name);
    System.out.println(raghav.marks);
    // Student random = new Student(raghav);
    // System.out.println(random.name);

    Student random2 = new Student(); // Calling constructor via constructor .
    System.out.println(random2.name);
    System.out.println(random2.marks);
    System.out.println(random2.rno);
  }

}

class Student { // Creating a Class
  // for every single student.
  int rno;
  String name;
  float marks;

  void changeName(String newName) {
    name = newName;
  }

  void greeting() {
    System.out.println("Hello my name is " + this.name);
    // System.out.println("Hello my name is " + name);
  }

  // Student (Student other){
  //   this.name = other.name;
  //   this.rno = other.rno;
  //   this.marks = other.marks;
  // }

  // Student() {
  //   this.rno = 21;
  //   this.name = "Raghav Aarya";
  //   this.marks = 83;
  // }
  Student(){
    this(21, "Default", 88.3f);
  }

  Student(int rno, String name , float marks)
  {
       this.rno = rno;
       this.name = name;
       this.marks = marks;

  }

}