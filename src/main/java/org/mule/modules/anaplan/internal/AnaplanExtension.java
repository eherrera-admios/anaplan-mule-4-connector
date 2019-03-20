package org.mule.modules.anaplan.internal;

import org.mule.modules.anaplan.internal.config.BasicAuthAnaplanConfiguration;
import org.mule.modules.anaplan.internal.config.CertificateAuthAnaplanConfiguration;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;


/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "anaplan-anypoint")
@Extension(name = "Anaplan Anypoint")
@Configurations({BasicAuthAnaplanConfiguration.class, CertificateAuthAnaplanConfiguration.class})
public class AnaplanExtension {

}
