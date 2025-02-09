package com.project1.myproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project1.myproject.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User nguoiDung1);

}