package SundayAssignment16A;
/*
 a. In main method outside the class but in same package – create object of
type Student.
b. Try to access rollno outside the class.
c. Try to access age outside the package.
d. Also try to access private methods outside the class and protected
methods outside the package.
 */



public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNo = 101; //Accessing rollNo  outside the class
         student.age = 20;  //not accessible outside the package

  
        student.doPublic(); //Accessing methods
         student.doDefault(); //is not accessible outside the package
         
         student.doProtected(); // is not accessible outside the package
         
        // student.doPrivate();  //is not accessible outside the class
        
    }
}
