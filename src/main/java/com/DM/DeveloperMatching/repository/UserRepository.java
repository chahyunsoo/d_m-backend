package com.DM.DeveloperMatching.repository;

import com.DM.DeveloperMatching.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
