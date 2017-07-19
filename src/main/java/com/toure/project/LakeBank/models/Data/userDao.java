package com.toure.project.LakeBank.models.Data;

import com.toure.project.LakeBank.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface userDao extends CrudRepository<User, Integer>{
}
