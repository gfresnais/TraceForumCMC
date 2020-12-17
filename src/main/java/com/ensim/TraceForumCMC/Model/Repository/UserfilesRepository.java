package com.ensim.TraceForumCMC.Model.Repository;

import com.ensim.TraceForumCMC.Model.Userfiles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserfilesRepository extends CrudRepository<Userfiles, String> {
}
