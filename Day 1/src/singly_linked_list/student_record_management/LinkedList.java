package singly_linked_list.student_record_management;

public class LinkedList {
    Student head;

    // Add a new student record at the beginning
    void addAtFront(int Rollno, String name, int age, char grade) {
        Student s = new Student(Rollno, name, age, grade);
        s.next = head;
        head = s;
    }

    // Add a new student record at the end
    void addAtEnd(int Rollno, String name, int age, char grade) {
        Student s = new Student(Rollno, name, age, grade);
        if (head == null) {
            head = s;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = s;
    }

    // Add a new student record at a specific position
    void addAtPosition(int Rollno, String name, int age, char grade, int position) {
        Student s = new Student(Rollno, name, age, grade);
        if (position == 1) {
            s.next = head;
            head = s;
            return;
        }
        Student temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        s.next = temp.next;
        temp.next = s;
    }

    // Delete a student record by Roll Number
    void deleteByRollno(int Rollno) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.Rollno == Rollno) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.Rollno != Rollno) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student with Roll Number " + Rollno + " not found!");
            return;
        }
        temp.next = temp.next.next;
    }

    // Search for a student record by Roll Number
    void searchByRollno(int Rollno) {
        Student temp = head;
        while (temp != null) {
            if (temp.Rollno == Rollno) {
                System.out.println("Student Found: Roll No: " + temp.Rollno + ", Name: " + temp.name +
                        ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + Rollno + " not found!");
    }

    // Update a student's grade based on their Roll Number
    void updateGrade(int Rollno, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.Rollno == Rollno) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + Rollno + " not found!");
    }

    // Display all student records
    void displayAll() {
        if (head == null) {
            System.out.println("No records to display!");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.Rollno + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}