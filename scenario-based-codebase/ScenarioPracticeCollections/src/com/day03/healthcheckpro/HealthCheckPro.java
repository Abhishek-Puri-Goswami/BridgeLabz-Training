package com.day03.healthcheckpro;

import com.day03.healthcheckpro.annotation.PublicAPI;
import com.day03.healthcheckpro.annotation.RequiresAuth;
import com.day03.healthcheckpro.model.ApiEndpoint;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class HealthCheckPro {
	private List<String> warnings = new ArrayList<>();
	private List<ApiEndpoint> docs = new ArrayList<>();

	// scan controller class
	public void scanController(Class<?> clazz) {
		String className = clazz.getSimpleName();

		for (Method method : clazz.getDeclaredMethods()) {
			String methodName = method.getName();

			PublicAPI pub = method.getAnnotation(PublicAPI.class);
			RequiresAuth auth = method.getAnnotation(RequiresAuth.class);

			String visibility;
			String description;

			if (pub != null) {
				visibility = "PUBLIC";
				description = pub.description();
			} else if (auth != null) {
				visibility = "AUTH (" + auth.role() + ")";
				description = auth.description();
			} else {
				visibility = "MISSING";
				description = "No visibility defined";
				warnings.add(className + "." + methodName + " -> Missing @PublicAPI or @RequiresAuth");
			}

			String httpMethod = guessHttpMethod(methodName);
			String path = "/" + className.replace("Controller", "").toLowerCase() + "/" + methodName.toLowerCase();
			ApiEndpoint endpoint = new ApiEndpoint(className, methodName, httpMethod, path, visibility, description);
			docs.add(endpoint);
		}
	}

	// Method to get http method name
	private String guessHttpMethod(String name) {

		if (name.startsWith("get") || name.startsWith("find")) {
			return "GET";
		} else if (name.startsWith("book") || name.startsWith("add")) {
			return "POST";
		} else if (name.startsWith("delete") || name.startsWith("cancel")) {
			return "DELETE";
		}
		return "ANY";
	}

	// print warnings
	public void printWarnings() {
		if (warnings.isEmpty()) {
			System.out.println("All methods properly annotated.");

		} else {
			System.out.println("Annotation Warnings:");
			for (String w : warnings) {
				System.out.println("WARNING: " + w);
			}
		}
	}

	// print documentation
	public void printDocumentation() {
		System.out.println("\nGenerated API Documentation");
		System.out.println("---------------------------------------------------------------------");

		for (ApiEndpoint ep : docs) {
			System.out.println(ep);
		}

		System.out.println("---------------------------------------------------------------------");
		System.out.println("Total endpoints found: " + docs.size());
	}
}
