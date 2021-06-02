package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.zensar.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("FROM User U WHERE U.id = :id")
	User findUserById(@Param("id") int id);

}
