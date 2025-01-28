package doubly_linked_list.undo_redo_functionality;

class TextEditor {
    private TextNode head, current;
    private final int limit;
    private int size;

    public TextEditor(int limit) {
        this.limit = limit;
        this.size = 0;
        this.head = null;
        this.current = null;
    }

    // Add a new state
    public void addState(String content) {
        TextNode newNode = new TextNode(content);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }

        current = newNode;

        if (head == null) {
            head = newNode;
        }

        size++;
        if (size > limit) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo functionality
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo operations available.");
        }
    }

    // Redo functionality
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo operations available.");
        }
    }

    // Display current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No states available.");
        }
    }
}