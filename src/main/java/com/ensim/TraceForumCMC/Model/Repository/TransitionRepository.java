package com.ensim.TraceForumCMC.Model.Repository;

import com.ensim.TraceForumCMC.Model.Transition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransitionRepository extends CrudRepository<Transition, String> {
}
