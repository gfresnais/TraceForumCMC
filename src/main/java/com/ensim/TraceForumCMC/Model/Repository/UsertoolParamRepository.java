package com.ensim.TraceForumCMC.Model.Repository;

import com.ensim.TraceForumCMC.Model.UsertoolParam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsertoolParamRepository extends CrudRepository<UsertoolParam, String> {
}
