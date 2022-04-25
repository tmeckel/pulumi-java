// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.CloudSqlSettingsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
 * 
 */
public final class CloudSqlConnectionProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudSqlConnectionProfileResponse Empty = new CloudSqlConnectionProfileResponse();

    /**
     * The Cloud SQL instance ID that this connection profile is associated with.
     * 
     */
    @Import(name="cloudSqlId", required=true)
    private String cloudSqlId;

    /**
     * @return The Cloud SQL instance ID that this connection profile is associated with.
     * 
     */
    public String cloudSqlId() {
        return this.cloudSqlId;
    }

    /**
     * The Cloud SQL database instance&#39;s private IP.
     * 
     */
    @Import(name="privateIp", required=true)
    private String privateIp;

    /**
     * @return The Cloud SQL database instance&#39;s private IP.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }

    /**
     * The Cloud SQL database instance&#39;s public IP.
     * 
     */
    @Import(name="publicIp", required=true)
    private String publicIp;

    /**
     * @return The Cloud SQL database instance&#39;s public IP.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }

    /**
     * Immutable. Metadata used to create the destination Cloud SQL database.
     * 
     */
    @Import(name="settings", required=true)
    private CloudSqlSettingsResponse settings;

    /**
     * @return Immutable. Metadata used to create the destination Cloud SQL database.
     * 
     */
    public CloudSqlSettingsResponse settings() {
        return this.settings;
    }

    private CloudSqlConnectionProfileResponse() {}

    private CloudSqlConnectionProfileResponse(CloudSqlConnectionProfileResponse $) {
        this.cloudSqlId = $.cloudSqlId;
        this.privateIp = $.privateIp;
        this.publicIp = $.publicIp;
        this.settings = $.settings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudSqlConnectionProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlConnectionProfileResponse $;

        public Builder() {
            $ = new CloudSqlConnectionProfileResponse();
        }

        public Builder(CloudSqlConnectionProfileResponse defaults) {
            $ = new CloudSqlConnectionProfileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudSqlId The Cloud SQL instance ID that this connection profile is associated with.
         * 
         * @return builder
         * 
         */
        public Builder cloudSqlId(String cloudSqlId) {
            $.cloudSqlId = cloudSqlId;
            return this;
        }

        /**
         * @param privateIp The Cloud SQL database instance&#39;s private IP.
         * 
         * @return builder
         * 
         */
        public Builder privateIp(String privateIp) {
            $.privateIp = privateIp;
            return this;
        }

        /**
         * @param publicIp The Cloud SQL database instance&#39;s public IP.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(String publicIp) {
            $.publicIp = publicIp;
            return this;
        }

        /**
         * @param settings Immutable. Metadata used to create the destination Cloud SQL database.
         * 
         * @return builder
         * 
         */
        public Builder settings(CloudSqlSettingsResponse settings) {
            $.settings = settings;
            return this;
        }

        public CloudSqlConnectionProfileResponse build() {
            $.cloudSqlId = Objects.requireNonNull($.cloudSqlId, "expected parameter 'cloudSqlId' to be non-null");
            $.privateIp = Objects.requireNonNull($.privateIp, "expected parameter 'privateIp' to be non-null");
            $.publicIp = Objects.requireNonNull($.publicIp, "expected parameter 'publicIp' to be non-null");
            $.settings = Objects.requireNonNull($.settings, "expected parameter 'settings' to be non-null");
            return $;
        }
    }

}
