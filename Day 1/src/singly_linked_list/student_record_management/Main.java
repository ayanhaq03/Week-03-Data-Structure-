package singly_linked_list.student_record_management;

public class Main {

    public static void main(String[] args) {
        LinkedList studentList = new LinkedList();

        // Add records
        studentList.addAtEnd(1, "ayan", 20, 'B');
        studentList.addAtEnd(2, "vivek", 21, 'A');
        studentList.addAtFront(3, "kanak", 19, 'A');

        // Display all records
        studentList.displayAll();

        // Search for a student
        studentList.searchByRollno(2);

        // Update a student's grade
        studentList.updateGrade(1, 'A');

        // Delete a student
        studentList.deleteByRollno(3);

        // Display all records after deletion
        studentList.displayAll();
    }
}
