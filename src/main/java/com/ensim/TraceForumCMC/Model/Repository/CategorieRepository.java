package com.ensim.TraceForumCMC.Model.Repository;

import com.ensim.TraceForumCMC.Model.Categorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, String> {
}
