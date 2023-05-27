package com.example.Students.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Students.Repository.SignUpRepoInterface;
import com.example.Students.entity.Signup;

@Service
public class SignupService implements SignupServiceInterface{
	@Autowired
	private SignUpRepoInterface sr;
	@Override
	public List<Signup>getsignupDetails()
	{
		return sr.findAll();
	}
	
	@Override
	public List<Signup> getAll(int id, String firstname) 
	{
		return sr.getAll(id, firstname);
	}

	@Override
	public void savesignupDetails(Signup se) 
	{
		sr.save(se);
		
	}
    @Override
	public void updatesignupDetails(Signup se) 
	{
		
		sr.save(se);
	}

	@Override
	public void deletesignupDetails(int id) 
	{
		sr.deleteById(id);
	}

}

