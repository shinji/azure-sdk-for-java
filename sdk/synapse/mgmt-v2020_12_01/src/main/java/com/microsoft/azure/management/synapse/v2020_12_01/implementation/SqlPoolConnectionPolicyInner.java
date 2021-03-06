/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A Sql pool connection policy.
 */
@JsonFlatten
public class SqlPoolConnectionPolicyInner extends ProxyResource {
    /**
     * Resource kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * The state of security access.
     */
    @JsonProperty(value = "properties.securityEnabledAccess")
    private String securityEnabledAccess;

    /**
     * The fully qualified host name of the auditing proxy.
     */
    @JsonProperty(value = "properties.proxyDnsName")
    private String proxyDnsName;

    /**
     * The port number of the auditing proxy.
     */
    @JsonProperty(value = "properties.proxyPort")
    private String proxyPort;

    /**
     * The visibility of the auditing proxy.
     */
    @JsonProperty(value = "properties.visibility")
    private String visibility;

    /**
     * Whether server default is enabled or disabled.
     */
    @JsonProperty(value = "properties.useServerDefault")
    private String useServerDefault;

    /**
     * The state of proxy redirection.
     */
    @JsonProperty(value = "properties.redirectionState")
    private String redirectionState;

    /**
     * The connection policy state.
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /**
     * Get resource kind.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the state of security access.
     *
     * @return the securityEnabledAccess value
     */
    public String securityEnabledAccess() {
        return this.securityEnabledAccess;
    }

    /**
     * Set the state of security access.
     *
     * @param securityEnabledAccess the securityEnabledAccess value to set
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withSecurityEnabledAccess(String securityEnabledAccess) {
        this.securityEnabledAccess = securityEnabledAccess;
        return this;
    }

    /**
     * Get the fully qualified host name of the auditing proxy.
     *
     * @return the proxyDnsName value
     */
    public String proxyDnsName() {
        return this.proxyDnsName;
    }

    /**
     * Set the fully qualified host name of the auditing proxy.
     *
     * @param proxyDnsName the proxyDnsName value to set
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withProxyDnsName(String proxyDnsName) {
        this.proxyDnsName = proxyDnsName;
        return this;
    }

    /**
     * Get the port number of the auditing proxy.
     *
     * @return the proxyPort value
     */
    public String proxyPort() {
        return this.proxyPort;
    }

    /**
     * Set the port number of the auditing proxy.
     *
     * @param proxyPort the proxyPort value to set
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withProxyPort(String proxyPort) {
        this.proxyPort = proxyPort;
        return this;
    }

    /**
     * Get the visibility of the auditing proxy.
     *
     * @return the visibility value
     */
    public String visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility of the auditing proxy.
     *
     * @param visibility the visibility value to set
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get whether server default is enabled or disabled.
     *
     * @return the useServerDefault value
     */
    public String useServerDefault() {
        return this.useServerDefault;
    }

    /**
     * Set whether server default is enabled or disabled.
     *
     * @param useServerDefault the useServerDefault value to set
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withUseServerDefault(String useServerDefault) {
        this.useServerDefault = useServerDefault;
        return this;
    }

    /**
     * Get the state of proxy redirection.
     *
     * @return the redirectionState value
     */
    public String redirectionState() {
        return this.redirectionState;
    }

    /**
     * Set the state of proxy redirection.
     *
     * @param redirectionState the redirectionState value to set
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withRedirectionState(String redirectionState) {
        this.redirectionState = redirectionState;
        return this;
    }

    /**
     * Get the connection policy state.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the connection policy state.
     *
     * @param state the state value to set
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withState(String state) {
        this.state = state;
        return this;
    }

}
