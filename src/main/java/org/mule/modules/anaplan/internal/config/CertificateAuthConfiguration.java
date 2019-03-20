package org.mule.modules.anaplan.internal.config;

import org.mule.modules.anaplan.internal.AnaplanOperations;
import org.mule.modules.anaplan.internal.connection.AnaplanConnectionProvider;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Password;

@Configuration(name = "certificate-auth-config")
@Operations(AnaplanOperations.class)
@ConnectionProviders(AnaplanConnectionProvider.class)
@DisplayName("Certificate Authentication Configuration")
public class CertificateAuthConfiguration extends AnaplanConfiguration {

    @Parameter
    @DisplayName("Key Store Path")
    private String keyStorePath;

    @Parameter
    @Password
    @DisplayName("Key Store Password")
    private String keyStorePassword;

    @Parameter
    @DisplayName("Key Store Alias")
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
