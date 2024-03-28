package collections;

import javax.swing.*;
import java.util.Stack;

//Stack eg - Text Editor Undo History with Stack
public class TextEditor {
    private Stack<String> undoHistory;

    public TextEditor(){
        undoHistory = new Stack<>();
    }

    public void performAction(String action) {
        undoHistory.push(action);
        System.out.println("Performed action: "+ action);
    }

//    Method to undo last action
    public void undoLastAction() {
        if (!undoHistory.isEmpty()) {
            String lastAction = undoHistory.pop();
            System.out.println("Undone action: " + lastAction);
        } else {
            System.out.println("No actions to undo.");
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.performAction("Typed 'Hello'");
        editor.performAction("Deleted word");
        editor.performAction("Formatted text");

        editor.undoLastAction();
        editor.undoLastAction();
        editor.undoLastAction();
        editor.undoLastAction();
    }
}
