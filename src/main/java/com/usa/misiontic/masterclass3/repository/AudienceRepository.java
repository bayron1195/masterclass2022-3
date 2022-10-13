package com.usa.misiontic.masterclass3.repository;

import com.usa.misiontic.masterclass3.entities.Audience;
import com.usa.misiontic.masterclass3.repository.crudRepository.LibraryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AudienceRepository {
    @Autowired
    private LibraryCrudRepository libraryCrudRepository;

    public List<Audience> getAll(){
        return (List<Audience>) libraryCrudRepository.findAll();
    }

    public Optional<Audience> getLibrary(int id){
        return libraryCrudRepository.findById(id);
    }
    public Audience save(Audience c){
        return libraryCrudRepository.save(c);
    }
    public void delete(Audience c){
        libraryCrudRepository.delete(c);
    }

}
