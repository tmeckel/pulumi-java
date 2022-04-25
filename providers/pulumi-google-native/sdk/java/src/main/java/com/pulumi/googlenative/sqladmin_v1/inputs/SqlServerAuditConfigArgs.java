// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SQL Server specific audit configuration.
 * 
 */
public final class SqlServerAuditConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlServerAuditConfigArgs Empty = new SqlServerAuditConfigArgs();

    /**
     * The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * This is always sql#sqlServerAuditConfig
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return This is always sql#sqlServerAuditConfig
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private SqlServerAuditConfigArgs() {}

    private SqlServerAuditConfigArgs(SqlServerAuditConfigArgs $) {
        this.bucket = $.bucket;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlServerAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlServerAuditConfigArgs $;

        public Builder() {
            $ = new SqlServerAuditConfigArgs();
        }

        public Builder(SqlServerAuditConfigArgs defaults) {
            $ = new SqlServerAuditConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the destination bucket (e.g., gs://mybucket).
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the destination bucket (e.g., gs://mybucket).
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param kind This is always sql#sqlServerAuditConfig
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind This is always sql#sqlServerAuditConfig
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public SqlServerAuditConfigArgs build() {
            return $;
        }
    }

}
