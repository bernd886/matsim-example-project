package or.matsim.class2019.first;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.controler.OutputDirectoryHierarchy;
import org.matsim.core.scenario.ScenarioUtils;

public class FavouriteScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Config config = ConfigUtils.createConfig() ;

		config.controler().setOverwriteFileSetting(OutputDirectoryHierarchy.OverwriteFileSetting.deleteDirectoryIfExists) ;

		Scenario scenario = ScenarioUtils.createScenario( config ) ;

		Controler controler = new Controler( scenario ) ;

		config.controler().setLastIteration( 2 );
		controler.run() ;
	}

}
