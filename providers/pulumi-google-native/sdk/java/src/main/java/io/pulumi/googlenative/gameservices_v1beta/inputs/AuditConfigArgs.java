// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1beta.inputs.AuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the audit configuration for a service. The configuration determines which permission types are logged, and what identities, if any, are exempted from logging. An AuditConfig must have one or more AuditLogConfigs. If there are AuditConfigs for both `allServices` and a specific service, the union of the two AuditConfigs is used for that service: the log_types specified in each AuditConfig are enabled, and the exempted_members in each AuditLogConfig are exempted. Example Policy with multiple AuditConfigs: { "audit_configs": [ { "service": "allServices", "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose@example.com" ] }, { "log_type": "DATA_WRITE" }, { "log_type": "ADMIN_READ" } ] }, { "service": "sampleservice.googleapis.com", "audit_log_configs": [ { "log_type": "DATA_READ" }, { "log_type": "DATA_WRITE", "exempted_members": [ "user:aliya@example.com" ] } ] } ] } For sampleservice, this policy enables DATA_READ, DATA_WRITE and ADMIN_READ logging. It also exempts jose@example.com from DATA_READ logging, and aliya@example.com from DATA_WRITE logging.
 * 
 */
public final class AuditConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuditConfigArgs Empty = new AuditConfigArgs();

    /**
     * The configuration for logging of each type of permission.
     * 
     */
    @InputImport(name="auditLogConfigs")
    private final @Nullable Input<List<AuditLogConfigArgs>> auditLogConfigs;

    public Input<List<AuditLogConfigArgs>> getAuditLogConfigs() {
        return this.auditLogConfigs == null ? Input.empty() : this.auditLogConfigs;
    }

    @InputImport(name="exemptedMembers")
    private final @Nullable Input<List<String>> exemptedMembers;

    public Input<List<String>> getExemptedMembers() {
        return this.exemptedMembers == null ? Input.empty() : this.exemptedMembers;
    }

    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public AuditConfigArgs(
        @Nullable Input<List<AuditLogConfigArgs>> auditLogConfigs,
        @Nullable Input<List<String>> exemptedMembers,
        @Nullable Input<String> service) {
        this.auditLogConfigs = auditLogConfigs;
        this.exemptedMembers = exemptedMembers;
        this.service = service;
    }

    private AuditConfigArgs() {
        this.auditLogConfigs = Input.empty();
        this.exemptedMembers = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AuditLogConfigArgs>> auditLogConfigs;
        private @Nullable Input<List<String>> exemptedMembers;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.service = defaults.service;
        }

        public Builder setAuditLogConfigs(@Nullable Input<List<AuditLogConfigArgs>> auditLogConfigs) {
            this.auditLogConfigs = auditLogConfigs;
            return this;
        }

        public Builder setAuditLogConfigs(@Nullable List<AuditLogConfigArgs> auditLogConfigs) {
            this.auditLogConfigs = Input.ofNullable(auditLogConfigs);
            return this;
        }

        public Builder setExemptedMembers(@Nullable Input<List<String>> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }

        public Builder setExemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = Input.ofNullable(exemptedMembers);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public AuditConfigArgs build() {
            return new AuditConfigArgs(auditLogConfigs, exemptedMembers, service);
        }
    }
}
