class Student {

    int roll; 
    String name;

    Student() {
        roll = 1;
        name = "Tom";
    }

    Student(Integer r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(70, "Mudit");

        s1.display();
        s2.display();
    }
}
