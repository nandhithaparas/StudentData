package com.example.Students.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.Students.Repository.LoginRepoInterface;
import com.example.Students.entity.Login;
import com.example.Students.entity.Students;



@Service
public class LoginService implements LoginServiceInterface{
	@Autowired
	private LoginRepoInterface lr;
	@Override
    public List<Login> getloginDetails()
    {
    	return lr.findAll();
    }
	
	@Override
	public List<Login> getAll(int id) 
	{
		return lr.getAll(id);
	}

	@Override
	public void saveloginDetails(Login le) 
	{
		lr.save(le);
	}

	@Override
	public void updateloginDetails(Login le) 
	{
		lr.save(le);
	}

	@Override
	public void deleteloginDetails(int id) 
	{
		lr.deleteById(id);
		
	}
	

}
