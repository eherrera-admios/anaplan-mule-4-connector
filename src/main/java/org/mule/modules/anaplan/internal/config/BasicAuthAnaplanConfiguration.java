package org.mule.modules.anaplan.internal.config;

import org.mule.modules.anaplan.internal.AnaplanOperations;
import org.mule.modules.anaplan.internal.connection.AnaplanConnectionProvider;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Password;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

@Configuration(name = "basic-auth-anaplan-config")
@Operations(AnaplanOperations.class)
@ConnectionProviders(AnaplanConnectionProvider.class)
@DisplayName("Anaplan: Basic Authentication")
public class BasicAuthAnaplanConfiguration extends AnaplanConfiguration {

    @Parameter
    @Optional
    @Placement(tab = "Connection")
    private String user;

    @Parameter
    @Password
    @Optional
    @Placement(tab = "Connection")
    private String password;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
