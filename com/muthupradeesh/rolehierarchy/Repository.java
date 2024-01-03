package com.muthupradeesh.rolehierarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Repository {
	static Repository repository;
	HashMap<String, String> role = new HashMap<String, String>();
	HashMap<String, String> subrole = new HashMap<String, String>();
	HashMap<String, String> report = new HashMap<String, String>();
	public Repository()
	{
		
	}
	public static Repository getInstance() {
		try {
			if (repository == null) {
				repository = new Repository();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return repository;
	}
	public static Repository getRepository() {
		return repository;
	}
	public static void setRepository(Repository repository) {
		Repository.repository = repository;
	}
	public HashMap<String, String> getRole() {
		return role;
	}
	public void setRole(HashMap<String, String> role) {
		this.role = role;
	}
	public HashMap<String, String> getSubrole() {
		return subrole;
	}
	public void setSubrole(HashMap<String, String> subrole) {
		this.subrole = subrole;
	}
	public HashMap<String, String> getReport() {
		return report;
	}

	public void setReport(HashMap<String, String> report) {
		this.report = report;
	}

}
