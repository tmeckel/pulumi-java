// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * SQL Server specific audit configuration.
 * 
 */
public final class SqlServerAuditConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlServerAuditConfigResponse Empty = new SqlServerAuditConfigResponse();

    /**
     * The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    @Import(name="bucket", required=true)
    private String bucket;

    /**
     * @return The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * This is always sql#sqlServerAuditConfig
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return This is always sql#sqlServerAuditConfig
     * 
     */
    public String kind() {
        return this.kind;
    }

    private SqlServerAuditConfigResponse() {}

    private SqlServerAuditConfigResponse(SqlServerAuditConfigResponse $) {
        this.bucket = $.bucket;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlServerAuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlServerAuditConfigResponse $;

        public Builder() {
            $ = new SqlServerAuditConfigResponse();
        }

        public Builder(SqlServerAuditConfigResponse defaults) {
            $ = new SqlServerAuditConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the destination bucket (e.g., gs://mybucket).
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param kind This is always sql#sqlServerAuditConfig
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public SqlServerAuditConfigResponse build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
