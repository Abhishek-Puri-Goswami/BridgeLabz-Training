package com.day02.callcenterapp;

public class Call {
    private String customerId;
    private String customerName;
    private boolean isVip;
    private String issue;
    
    public  Call(String customerId, String customerName, boolean isVip, String issue) {
    	this.customerId = customerId;
    	this.customerName = customerName;
    	this.isVip = isVip;
    	this.issue = issue;
    }
    
    public String getCustomerId() {
    	return customerId;
    }
    
    public String getCustomerName() {
    	return customerName;
    }
    
    public boolean isVip() {
    	return isVip;
    }
    
    public String getIssue() {
    	return issue;
    }
    
    @Override
    public String toString() {
    	return (isVip ? "[VIP]" : "") + customerName + " (" + customerId + ") - " + issue;
    }
}
