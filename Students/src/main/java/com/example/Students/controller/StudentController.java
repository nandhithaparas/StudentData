package com.example.Students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Students.Repository.StudentRepository;
import com.example.Students.Service.StudentService;
import com.example.Students.entity.Students;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	 @Autowired
	  StudentRepository pr;
	@GetMapping("/getid")
	   public Iterable<Students> getid()
	   {
		   return ss.getid();
	   }
		 @GetMapping("/getid1")
		   public Iterable<Students> getAllDetails(@RequestParam int id,@RequestParam String name)
		   {
			   return ss.getAll(id, name);
		   }
		
		@PostMapping("/postid")
		public void saveid(@RequestBody Students ee)
		{
			ss.saveid(ee);
		}
		@PutMapping("/putid")
		public void updateid(@RequestBody Students ee)
		{
			
			ss.updateid(ee);
		}
		@DeleteMapping("/deletes/{id}")  
		private void deleteid(@PathVariable("id") int id)   
		{  
		ss.deleteid(id);  
		}  
//		@DeleteMapping("/deleteid")
//		public void deleteid(@RequestParam int id)
//		{
//			ss.deleteid(id);
//		}
		@GetMapping("/get/{field}")
		  Iterable<Students>studentSort(@PathVariable("field") String field)
		  {
			  return ss.sortStudents(field);
		  }
		  
		  @GetMapping(value="/paging/{pageNo}/{pageSize}")
		  Page<Students>studenttPaging(@PathVariable("pageNo") int pageNo,@PathVariable("pageSize") int pageSize)
		  {
			  return ss.pagingStudents(pageNo, pageSize);
		  }
		  
		  @GetMapping(value="getps/{pageNo}/{pageSize}/{field}")
		  Page<Students>studentPagingSorting(@PathVariable("pageNo") int pageno,@PathVariable("pageSize") int pageSize,@PathVariable("field") String field)
		  {
			return ss.pagingAndSorting(pageno,pageSize,field); 
		  }
		  
		  @PostMapping("/post")
		  public Students savestudent(@RequestBody Students id)
		  {
			  return ss.saveStudents(id);
		  }
		  @PutMapping("/put")
		  public Students update(@RequestBody Students p)
		  {
			  return ss.saveStudents(p);
		  }
		  @DeleteMapping("/delete/{id}")
		  public String delete(@PathVariable("id") int id)
		  {
			 return ss.deleteid(id);
			  
		  }

}
