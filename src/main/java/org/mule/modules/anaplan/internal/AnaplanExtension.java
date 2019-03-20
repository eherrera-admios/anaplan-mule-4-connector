package org.mule.modules.anaplan.internal;

import org.mule.modules.anaplan.internal.config.BasicAuthConfiguration;
import org.mule.modules.anaplan.internal.config.CertificateAuthConfiguration;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;


/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "anaplan")
@Extension(name = "Anaplan")
@Configurations({BasicAuthConfiguration.class, CertificateAuthConfiguration.class})
public class AnaplanExtension {

}
