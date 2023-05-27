package com.example.Students.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Students.entity.Login;


@Repository
public interface LoginRepoInterface extends JpaRepository<Login,Integer> {
	@Query(value="SELECT * FROM login WHERE id=:id",nativeQuery=true)
	public List<Login>getAll(int id);

}
