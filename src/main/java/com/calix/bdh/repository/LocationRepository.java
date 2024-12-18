package com.calix.bdh.repository;

import com.calix.bdh.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface LocationRepository extends JpaRepository<Location, UUID>, LocationRepositoryCustom {

	// Location findByOrgId(String orgId);
}