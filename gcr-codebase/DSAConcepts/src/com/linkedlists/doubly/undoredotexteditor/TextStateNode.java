package com.linkedlists.doubly.undoredotexteditor;

public class TextStateNode {

    String content;
    TextStateNode prev;
    TextStateNode next;

    // constructor
    public TextStateNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
