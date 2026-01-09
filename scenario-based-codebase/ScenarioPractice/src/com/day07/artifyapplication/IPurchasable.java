package com.day07.artifyapplication;

// Defines purchase and licensing operations
public interface IPurchasable {
    void purchase(User user);
    void license(User user);
}
