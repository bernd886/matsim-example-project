package or.matsim.class2019.first;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.controler.OutputDirectoryHierarchy;
import org.matsim.core.scenario.ScenarioUtils;

public class FavouriteSCript2 {

    public static void main(String[] args) {

        //Config config = ConfigUtils.createConfig() ;

        Config config = ConfigUtils.loadConfig( "./scenarios/equil/config.xml" ) ;

        config.controler().setOverwriteFileSetting( OutputDirectoryHierarchy.OverwriteFileSetting.deleteDirectoryIfExists ) ;

        Scenario scenario = ScenarioUtils.createScenario( config ) ;

        Controler controler = new Controler( scenario ) ;

        config.controler().setLastIteration( 2 ) ;

        controler.run() ;




    }

}
