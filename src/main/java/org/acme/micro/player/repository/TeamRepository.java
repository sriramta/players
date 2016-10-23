package org.acme.micro.player.repository;

import java.util.List;

import org.acme.micro.player.domain.nodes.Team;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "team", path = "team")
public interface TeamRepository extends PagingAndSortingRepository<Team, Long> {

	List<Team> findByName(@Param("team") String name);

}
