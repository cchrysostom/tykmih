package jobs;

import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;


/**
 *
 * @author Chris Chrysostom
 */
@OnApplicationStart
public class Bootstrap extends Job {
    
    public void doJob() {
        Fixtures.loadModels("data.yml");
    }
}
