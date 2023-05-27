package com.example.Students.Service;
import java.util.List;

import com.example.Students.entity.Signup;

public interface SignupServiceInterface {
	public List<Signup>getsignupDetails();
    public List<Signup> getAll(int id,String firstname);
    public void savesignupDetails(Signup  se);
 	public void updatesignupDetails(Signup se);
 	public void deletesignupDetails(int id);

}
