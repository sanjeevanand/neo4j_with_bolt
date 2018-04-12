	package neo4j_with_bolt;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Driver;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "sanjeev231234" ) );

		try ( Session session = driver.session() )
		{
		    StatementResult rs = session.run( "CREATE (n:Movie { title:'The Matrix',released:1997 }) RETURN n" );
		}

		driver.close();
	}

}
