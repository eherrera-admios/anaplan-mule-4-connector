package org.mule.modules.anaplan.internal.config;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

import java.util.UUID;

public abstract class AnaplanConfiguration {

    @Parameter
    @Optional
    @Placement(tab = "Proxy Settings")
    @DisplayName("Auth Host Proxy")
    protected String authHostProxy;

    @Parameter
    @Optional
    @Placement(tab = "Proxy Settings")
    @DisplayName("API Host Proxy")
    protected String apiHostProxy;

    @Parameter
    @Optional(defaultValue = ",")
    @Placement(tab = "Import Settings")
    @DisplayName("Separator")
    protected String importSeparator;

    private final String connectionId;

    public AnaplanConfiguration() {
        connectionId = UUID.randomUUID().toString();
    }

    public final String getAuthHostProxy() {
        return authHostProxy;
    }

    public final String getApiHostProxy() {
        return apiHostProxy;
    }

    public final String getImportSeparator() {
        return importSeparator;
    }

    public final String getConnectionId() {
        return connectionId;
    }
}
