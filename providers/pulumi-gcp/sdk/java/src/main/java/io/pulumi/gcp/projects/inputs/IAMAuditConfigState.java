// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMAuditConfigState extends io.pulumi.resources.ResourceArgs {

    public static final IAMAuditConfigState Empty = new IAMAuditConfigState();

    /**
     * The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    @InputImport(name="auditLogConfigs")
      private final @Nullable Input<List<IAMAuditConfigAuditLogConfigGetArgs>> auditLogConfigs;

    public Input<List<IAMAuditConfigAuditLogConfigGetArgs>> getAuditLogConfigs() {
        return this.auditLogConfigs == null ? Input.empty() : this.auditLogConfigs;
    }

    /**
     * (Computed) The etag of the project's IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The project id of the target project. This is not
     * inferred from the provider.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    @InputImport(name="service")
      private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public IAMAuditConfigState(
        @Nullable Input<List<IAMAuditConfigAuditLogConfigGetArgs>> auditLogConfigs,
        @Nullable Input<String> etag,
        @Nullable Input<String> project,
        @Nullable Input<String> service) {
        this.auditLogConfigs = auditLogConfigs;
        this.etag = etag;
        this.project = project;
        this.service = service;
    }

    private IAMAuditConfigState() {
        this.auditLogConfigs = Input.empty();
        this.etag = Input.empty();
        this.project = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMAuditConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IAMAuditConfigAuditLogConfigGetArgs>> auditLogConfigs;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> project;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMAuditConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.etag = defaults.etag;
    	      this.project = defaults.project;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(@Nullable Input<List<IAMAuditConfigAuditLogConfigGetArgs>> auditLogConfigs) {
            this.auditLogConfigs = auditLogConfigs;
            return this;
        }

        public Builder auditLogConfigs(@Nullable List<IAMAuditConfigAuditLogConfigGetArgs> auditLogConfigs) {
            this.auditLogConfigs = Input.ofNullable(auditLogConfigs);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder service(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }
        public IAMAuditConfigState build() {
            return new IAMAuditConfigState(auditLogConfigs, etag, project, service);
        }
    }
}
