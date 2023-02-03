public class Student {

    //instance variables
    private String name;
    private int idNumber;

    //static variable
    public static int nextID;

    //constructor
    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        nextID++;
    }

    //toString method
    public String toString() {
        return name + " has id Number: " + idNumber;
    }

    //name change method
    public void nameChange(String newName) {
        name = newName;
    }

    //id precedence method
    public boolean precedesByID(Student student1, Student student2 ) {
        boolean result = student1.idNumber < student2.idNumber;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Student bob1 = new Student("Bob Smith", 971);
        Student bob2 = new Student("Bob Jones", 4321);

        bob1.precedesByID(bob1,bob2);

    }

}
