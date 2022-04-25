// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
 * 
 */
public final class WsfcDomainCredentialsResponse extends com.pulumi.resources.InvokeArgs {

    public static final WsfcDomainCredentialsResponse Empty = new WsfcDomainCredentialsResponse();

    /**
     * Cluster bootstrap account password.
     * 
     */
    @Import(name="clusterBootstrapAccountPassword")
    private @Nullable String clusterBootstrapAccountPassword;

    /**
     * @return Cluster bootstrap account password.
     * 
     */
    public Optional<String> clusterBootstrapAccountPassword() {
        return Optional.ofNullable(this.clusterBootstrapAccountPassword);
    }

    /**
     * Cluster operator account password.
     * 
     */
    @Import(name="clusterOperatorAccountPassword")
    private @Nullable String clusterOperatorAccountPassword;

    /**
     * @return Cluster operator account password.
     * 
     */
    public Optional<String> clusterOperatorAccountPassword() {
        return Optional.ofNullable(this.clusterOperatorAccountPassword);
    }

    /**
     * SQL service account password.
     * 
     */
    @Import(name="sqlServiceAccountPassword")
    private @Nullable String sqlServiceAccountPassword;

    /**
     * @return SQL service account password.
     * 
     */
    public Optional<String> sqlServiceAccountPassword() {
        return Optional.ofNullable(this.sqlServiceAccountPassword);
    }

    private WsfcDomainCredentialsResponse() {}

    private WsfcDomainCredentialsResponse(WsfcDomainCredentialsResponse $) {
        this.clusterBootstrapAccountPassword = $.clusterBootstrapAccountPassword;
        this.clusterOperatorAccountPassword = $.clusterOperatorAccountPassword;
        this.sqlServiceAccountPassword = $.sqlServiceAccountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WsfcDomainCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WsfcDomainCredentialsResponse $;

        public Builder() {
            $ = new WsfcDomainCredentialsResponse();
        }

        public Builder(WsfcDomainCredentialsResponse defaults) {
            $ = new WsfcDomainCredentialsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterBootstrapAccountPassword Cluster bootstrap account password.
         * 
         * @return builder
         * 
         */
        public Builder clusterBootstrapAccountPassword(@Nullable String clusterBootstrapAccountPassword) {
            $.clusterBootstrapAccountPassword = clusterBootstrapAccountPassword;
            return this;
        }

        /**
         * @param clusterOperatorAccountPassword Cluster operator account password.
         * 
         * @return builder
         * 
         */
        public Builder clusterOperatorAccountPassword(@Nullable String clusterOperatorAccountPassword) {
            $.clusterOperatorAccountPassword = clusterOperatorAccountPassword;
            return this;
        }

        /**
         * @param sqlServiceAccountPassword SQL service account password.
         * 
         * @return builder
         * 
         */
        public Builder sqlServiceAccountPassword(@Nullable String sqlServiceAccountPassword) {
            $.sqlServiceAccountPassword = sqlServiceAccountPassword;
            return this;
        }

        public WsfcDomainCredentialsResponse build() {
            return $;
        }
    }

}
