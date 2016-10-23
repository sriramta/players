package org.acme.micro.player.repository;

import java.util.List;

import org.acme.micro.player.domain.nodes.Player;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "player", path = "player")
public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {

	List<Player> findByFirstName(@Param("firstName") String firstName);

	List<Player> findByLastName(@Param("lastName") String lastName);
}
