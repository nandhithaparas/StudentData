package com.example.Students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Students.Service.SignupService;
import com.example.Students.entity.Signup;


@RestController
@CrossOrigin
public class SignupController {
	@Autowired
	private SignupService ss;
	@GetMapping("/getsign")
   public List<Signup>getDisplaysignup()
   {
	   return ss.getsignupDetails();
   }
	
	
	
	
	 @GetMapping("/getsign1")
	   public List<Signup> getAllDetails(@RequestParam int id,@RequestParam String firstname)
	   {
		   return ss.getAll(id, firstname);
	   }
	 
	@PostMapping("/postsign")
	public void saveloginData(@RequestBody Signup se)
	{
		ss.savesignupDetails(se);
	}
	@PutMapping("/putsign")
	public void updateloginData(@RequestBody Signup se)
	{
		ss.updatesignupDetails(se);
	}
	@DeleteMapping("/deletesign/{id}")
	public void deleteloginData(@PathVariable("id") int id)
	{
		ss.deletesignupDetails(id);
	}

}
