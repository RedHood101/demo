package com.rapUp.test.demo.repository;

import com.rapUp.test.demo.models.Erole;
import com.rapUp.test.demo.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role,String> {
    Optional<Role> findByName(Erole name);
}
