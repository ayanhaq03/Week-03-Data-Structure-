package doubly_linked_list.undo_redo_functionality;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.addState("State 1");
        editor.addState("State 2");
        editor.addState("State 3");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();
    }
}
