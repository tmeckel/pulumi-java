// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gameservices_v1.outputs.AuditLogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AuditConfigResponse {
    /**
     * The configuration for logging of each type of permission.
     * 
     */
    private final List<AuditLogConfigResponse> auditLogConfigs;
    private final List<String> exemptedMembers;
    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    private final String service;

    @OutputCustomType.Constructor({"auditLogConfigs","exemptedMembers","service"})
    private AuditConfigResponse(
        List<AuditLogConfigResponse> auditLogConfigs,
        List<String> exemptedMembers,
        String service) {
        this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
        this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
        this.service = Objects.requireNonNull(service);
    }

    /**
     * The configuration for logging of each type of permission.
     * 
     */
    public List<AuditLogConfigResponse> getAuditLogConfigs() {
        return this.auditLogConfigs;
    }
    public List<String> getExemptedMembers() {
        return this.exemptedMembers;
    }
    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AuditLogConfigResponse> auditLogConfigs;
        private List<String> exemptedMembers;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.service = defaults.service;
        }

        public Builder setAuditLogConfigs(List<AuditLogConfigResponse> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }

        public Builder setExemptedMembers(List<String> exemptedMembers) {
            this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public AuditConfigResponse build() {
            return new AuditConfigResponse(auditLogConfigs, exemptedMembers, service);
        }
    }
}
