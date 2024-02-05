package FinalAssignment;





class Parent {
 
    public final void display() {
        System.out.println("This is the parent's display method.");
    }
}

class Child extends Parent {

//     @Override
//     public void display() {
//         System.out.println("This is the child's display method.");
//     }
//}








public class FinalMethod {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.display(); // Output: This is the parent's display method.
        child.display();  // Output: This is the parent's display method.
    }
}
}
