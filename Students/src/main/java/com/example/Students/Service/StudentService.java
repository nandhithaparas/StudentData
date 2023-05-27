package com.example.Students.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.Students.Repository.StudentRepository;
import com.example.Students.entity.Students;

@Service
public class StudentService {
	@Autowired
	StudentRepository sr;
		public Iterable<Students> getData()
		{
			return sr.findAll();
		}
		
		public Iterable<Students> getid() 
		{
			
			return sr.findAll();
		}
		

		public Iterable<Students> getAll(int id, String name) 
		{
			return sr.getAll(id, name);
		}
	   
		public void saveid(Students ee) 
		{
			
			sr.save(ee);
		}
	    
		public void updateid(Students ee) 
		{
			sr.save(ee);
			
		}
	   
		public String deleteid(int id) 
		{
			sr.deleteById(id);
			return "Deleted!";
			
		}
		 public Iterable<Students> sortStudents(String field)
	     {
	   	  return sr.findAll(Sort.by(Direction.DESC, field));
	     }
	     public Students saveStudents(Students p)
	     {
	   	  return sr.save(p);
	     }
	     public Page<Students>pagingStudents(int page,int pageSize)
	     {
	   	  Pageable paging=PageRequest.of(page, pageSize);
	   	  return sr.findAll(paging);
	     }
	     public Page<Students>pagingAndSorting(int pageNo,int pageSize,String field)
	     {
	   	  Pageable paging=PageRequest.of(pageNo, pageSize).withSort(Sort.by(Direction.DESC, field));
	   	  return sr.findAll(paging);
	     }

}
