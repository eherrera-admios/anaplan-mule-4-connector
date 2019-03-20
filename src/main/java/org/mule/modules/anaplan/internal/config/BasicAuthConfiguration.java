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

@Configuration(name = "basic-auth-config")
@Operations(AnaplanOperations.class)
@ConnectionProviders(AnaplanConnectionProvider.class)
@DisplayName("Basic Authentication Configuration")
public class BasicAuthConfiguration extends AnaplanConfiguration {

    @Parameter
    @Optional
    private String user;

    @Parameter
    @Password
    @Optional
    private String password;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
