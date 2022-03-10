// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SqlServerAuditConfigResponse {
    /**
     * The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    private final String bucket;
    /**
     * This is always sql#sqlServerAuditConfig
     * 
     */
    private final String kind;

    @OutputCustomType.Constructor
    private SqlServerAuditConfigResponse(
        @OutputCustomType.Parameter("bucket") String bucket,
        @OutputCustomType.Parameter("kind") String kind) {
        this.bucket = bucket;
        this.kind = kind;
    }

    /**
     * The name of the destination bucket (e.g., gs://mybucket).
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * This is always sql#sqlServerAuditConfig
     * 
    */
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerAuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerAuditConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.kind = defaults.kind;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public SqlServerAuditConfigResponse build() {
            return new SqlServerAuditConfigResponse(bucket, kind);
        }
    }
}
