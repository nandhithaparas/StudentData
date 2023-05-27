package com.example.Students.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.Students.entity.Students;

@Repository
public interface StudentRepository extends CrudRepository<Students,Integer> , PagingAndSortingRepository<Students, Integer>{
	@Query(value="select b.id,b.name from Students b")
	public Iterable<Students>getAll(int id,String name);
}
