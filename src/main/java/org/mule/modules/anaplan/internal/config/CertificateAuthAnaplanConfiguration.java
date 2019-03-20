package org.mule.modules.anaplan.internal.config;

import org.mule.modules.anaplan.internal.AnaplanOperations;
import org.mule.modules.anaplan.internal.connection.AnaplanConnectionProvider;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Password;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

@Configuration(name = "certificte-auth-anaplan-config")
@Operations(AnaplanOperations.class)
@ConnectionProviders(AnaplanConnectionProvider.class)
@DisplayName("Anaplan: Certificate Authentication")
public class CertificateAuthAnaplanConfiguration extends AnaplanConfiguration {

    @Parameter
    @DisplayName("Key Store Path")
    @Placement(tab = "Connection")
    private String keyStorePath;

    @Parameter
    @Password
    @DisplayName("Key Store Password")
    @Placement(tab = "Connection")
    private String keyStorePassword;

    @Parameter
    @DisplayName("Key Store Alias")
    @Placement(tab = "Connection")
    private String keyStoreAlias;

    public String getKeyStorePath() {
        return keyStorePath;
    }

    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    public String getKeyStoreAlias() {
        return keyStoreAlias;
    }
}
