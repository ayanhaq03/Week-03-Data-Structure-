package doubly_linked_list.undo_redo_functionality;

class TextNode {
    String content;
    TextNode prev, next;

    public TextNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
