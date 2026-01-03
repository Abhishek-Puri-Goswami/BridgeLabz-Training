package com.linkedlists.doubly.undoredotexteditor;

public class UndoRedoTextEditor {

    public static void main(String[] args) {

        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrentState();

        System.out.println("Undo :-");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("Undo :-");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("Redo :-");
        editor.redo();
        editor.displayCurrentState();

        System.out.println("Add State :-");
        editor.addState("Hello World!!");
        editor.displayCurrentState();

        System.out.println("Redo :-");
        editor.redo();
    }
}
