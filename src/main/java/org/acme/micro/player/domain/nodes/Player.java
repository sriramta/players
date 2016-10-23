package org.acme.micro.player.domain.nodes;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.Data;

@NodeEntity
@Data
public class Player {

	@GraphId
	private Long id;

	private String firstName;
	private String lastName;

}
