package com.day02.texteditorapp;

public class TextEditorApp {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();

		System.out.println("===== TEXT EDITOR OPENED =====");
		
		editor.insert("Hello,");
		editor.insert(" I");
		editor.insert(" am");
		editor.insert(" Groot!");
		editor.display();

		System.out.println("Action: undo");
		editor.undo();
		editor.display();

		System.out.println("Action: undo");
		editor.undo();
		editor.display();

		System.out.println("Action: undo");
		editor.undo();
		editor.display();

		System.out.println("Action: redo");
		editor.redo();
		editor.display();

		System.out.println("Action: redo");
		editor.redo();
		editor.display();
		
		System.out.println("===== EDITOR CLOSED =====");
	}
}
