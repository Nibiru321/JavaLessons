class Student {
    String subject;
    String name;
    int age;

    Student(){
        System.out.println("*****");
        subject = "English";
        name = "Ash";
        age = 19;
    }
    void displayDetails(){
        System.out.println(subject + " | " + name + " | " + age);
    }
}

class Main{
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();

        std1.displayDetails();
        std2.displayDetails();
        std3.displayDetails();
    }
}