package com.usa.misiontic.masterclass3.repository.crudRepository;

import com.usa.misiontic.masterclass3.entities.Audience;
import org.springframework.data.repository.CrudRepository;

public interface LibraryCrudRepository extends CrudRepository<Audience,Integer> {
}
