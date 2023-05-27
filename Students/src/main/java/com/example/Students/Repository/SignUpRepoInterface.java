package com.example.Students.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Students.entity.Signup;

@Repository
public interface SignUpRepoInterface extends JpaRepository<Signup,Integer>,CrudRepository<Signup, Integer>{
	@Query(value="SELECT * FROM signup WHERE id=:id and firstname=:firstname",nativeQuery=true)
	public List<Signup>getAll(int id,String firstname);

}
