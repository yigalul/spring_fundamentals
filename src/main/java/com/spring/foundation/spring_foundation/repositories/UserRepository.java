package com.spring.foundation.spring_foundation.repositories;

import com.spring.foundation.spring_foundation.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
