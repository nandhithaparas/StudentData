package com.example.Students.Service;


import java.util.List;

import com.example.Students.entity.Login;


public interface LoginServiceInterface {
	public List<Login>getloginDetails();
	 public List<Login> getAll(int id);
	public void saveloginDetails(Login le);
	public void updateloginDetails(Login le);
	public void deleteloginDetails(int id);

}

