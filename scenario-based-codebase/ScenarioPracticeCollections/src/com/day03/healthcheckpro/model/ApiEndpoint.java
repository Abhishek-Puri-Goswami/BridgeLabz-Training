package com.day03.healthcheckpro.model;

// simple model for API documentation
public class ApiEndpoint {
	private String className;
	private String methodName;
	private String httpMethod;
	private String path;
	private String visibility;
	private String description;

	// constructor
	public ApiEndpoint(String className, String methodName, String httpMethod, String path, String visibility,
			String description) {
		this.className = className;
		this.methodName = methodName;
		this.httpMethod = httpMethod;
		this.path = path;
		this.visibility = visibility;
		this.description = description;
	}

	// good string representation
	@Override
	public String toString() {
		return String.format("%-7s %-30s %-18s %-30s %s", httpMethod, path, visibility, className + "." + methodName,
				description);
	}
}
