package com.day02.texteditorapp;

import java.util.Stack;

class TextEditor {
	Stack<String> undoStack = new Stack<>();
	Stack<String> redoStack = new Stack<>();
	String text = "";

	// Insert text
	void insert(String newText) {
		undoStack.push(text);
		text += newText;
		redoStack.clear();
	}

	// Delete last n characters
	void delete(int n) {
		if (n > text.length())
			return;
		undoStack.push(text);
		text = text.substring(0, text.length() - n);
		redoStack.clear();
	}

	// Undo operation
	void undo() {
		if (!undoStack.isEmpty()) {
			redoStack.push(text);
			text = undoStack.pop();
		}
	}

	// Redo operation
	void redo() {
		if (!redoStack.isEmpty()) {
			undoStack.push(text);
			text = redoStack.pop();
		}
	}

	void display() {
		System.out.println(text);
	}
}
