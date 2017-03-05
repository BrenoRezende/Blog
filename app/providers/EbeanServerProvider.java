package providers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.google.inject.Provider;

/**
 * Created by breno on 05/03/17.
 */

public class EbeanServerProvider implements Provider<EbeanServer> {

    @Override
    public EbeanServer get() {
        return Ebean.getDefaultServer();
    }
}
