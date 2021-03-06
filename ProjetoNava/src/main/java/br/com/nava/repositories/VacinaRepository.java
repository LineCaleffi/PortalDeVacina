package br.com.nava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nava.entity.VacinaEntity;

@Repository
public interface VacinaRepository extends JpaRepository<VacinaEntity, Integer>{

}
