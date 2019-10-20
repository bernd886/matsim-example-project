package or.matsim.class2019.first;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.scenario.ScenarioUtils;

public class FavouriteScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Config config = ConfigUtils.createConfig() ;
		//or... = ConfigUtils.loadConfig(filename) ;
		//now modify config if you want/need
		//---
		
		Scenario scenario = ScenarioUtils.createScenario( config ) ;
		//or ... = ScenarioUtils.loadScenario(config);
		//now modify scenario if you want/need
		//---
		
		Controler controler = new Controler( scenario ) ;
		//now modify scenario if you want/need
		//---
		
		//System.out.println( config.controler().getLastIteration() );
		config.controler().setLastIteration( 2 );
		controler.run() ;
	}

}
