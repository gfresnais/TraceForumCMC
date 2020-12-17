package com.ensim.TraceForumCMC.Model.Repository;

import com.ensim.TraceForumCMC.Model.Activite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiviteRepository extends CrudRepository<Activite, String> {
}
