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

import com.example.Students.Service.LoginService;
import com.example.Students.entity.Login;

@RestController
@CrossOrigin
public class LoginController {
	@Autowired
	private LoginService ls;
   @GetMapping("/getlogin")
   public List<Login>getloginData()
   {
	   return ls.getloginDetails();
   }
   
   @GetMapping("/getlogin1")
   public List<Login> getAllDetails(@RequestParam int id)
   {
	   return ls.getAll(id);
   }
 
	@PostMapping("/postlogin")
	public void saveloginData(@RequestBody Login le)
	{
		ls.saveloginDetails(le);
	}
	@PutMapping("/putlogin")
	public void updateloginData(@RequestBody Login le)
	{
		ls.updateloginDetails(le);
	}
//	@DeleteMapping("/delete/{id}")  
//	private void deleteloginData(@PathVariable("id") int id)   
//	{  
//	ls.deleteloginDetails(id);  
//	}  
	@DeleteMapping("/deletelogin/{id}")
	public void deleteloginData(@PathVariable("id") int id)
	{
		ls.deleteloginDetails(id);
	}
}


