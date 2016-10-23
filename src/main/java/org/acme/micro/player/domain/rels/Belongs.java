package org.acme.micro.player.domain.rels;

import org.acme.micro.player.domain.nodes.Player;
import org.acme.micro.player.domain.nodes.Team;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "BELONGS")
public class Belongs {

	@GraphId
	private Long id;

	@StartNode
	private Player player;

	@EndNode
	private Team team;
}
