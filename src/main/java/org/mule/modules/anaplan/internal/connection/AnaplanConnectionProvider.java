package org.mule.modules.anaplan.internal.connection;

import org.mule.runtime.api.connection.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This class (as it's name implies) provides connection instances and the funcionality to disconnect and validate those
 * connections.
 * <p>
 * All connection related parameters (values required in order to create a connection) must be
 * declared in the connection providers.
 * <p>
 * This particular example is a {@link PoolingConnectionProvider} which declares that connections resolved by this provider
 * will be pooled and reused. There are other implementations like {@link CachedConnectionProvider} which lazily creates and
 * caches connections or simply {@link ConnectionProvider} if you want a new connection each time something requires one.
 */
public class AnaplanConnectionProvider implements PoolingConnectionProvider<AnaplanConnection> {

    private final Logger LOGGER = LoggerFactory.getLogger(AnaplanConnectionProvider.class);



    @Override
    public AnaplanConnection connect() throws ConnectionException {
        return new AnaplanConnection("key");
    }

    @Override
    public void disconnect(AnaplanConnection connection) {
        try {
            connection.invalidate();
        } catch (Exception e) {
            LOGGER.error("Error while disconnecting [" + connection.getId() + "]: " + e.getMessage(), e);
        }
    }

    @Override
    public ConnectionValidationResult validate(AnaplanConnection connection) {
        return ConnectionValidationResult.success();
    }
}
