package com.entreprise.AuthentImpl.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entreprise.AuthentImpl.model.Account;

@Repository
public interface AccountDAO extends CrudRepository<Account,Long>{
	
}
