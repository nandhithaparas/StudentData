package com.example.Students.Service;

import java.util.List;

import com.example.Students.entity.Students;
public interface StudentServiceInterface {

	public List<Students>getenglishbookDetails();
	public List<Students> getAll(int id,String author);
	public void saveenglishbookDetails(Students  ee);
	public void updateenglishbookDetails(Students ee);
	public void deleteenglishbookDetails(int id);
}

