// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class IAMAuditConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IAMAuditConfigArgs Empty = new IAMAuditConfigArgs();

    /**
     * The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    @Import(name="auditLogConfigs", required=true)
      private final Output<List<IAMAuditConfigAuditLogConfigArgs>> auditLogConfigs;

    public Output<List<IAMAuditConfigAuditLogConfigArgs>> getAuditLogConfigs() {
        return this.auditLogConfigs;
    }

    /**
     * The project id of the target project. This is not
     * inferred from the provider.
     * 
     */
    @Import(name="project", required=true)
      private final Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    /**
     * Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> getService() {
        return this.service;
    }

    public IAMAuditConfigArgs(
        Output<List<IAMAuditConfigAuditLogConfigArgs>> auditLogConfigs,
        Output<String> project,
        Output<String> service) {
        this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs, "expected parameter 'auditLogConfigs' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private IAMAuditConfigArgs() {
        this.auditLogConfigs = Codegen.empty();
        this.project = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<IAMAuditConfigAuditLogConfigArgs>> auditLogConfigs;
        private Output<String> project;
        private Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMAuditConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.project = defaults.project;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(Output<List<IAMAuditConfigAuditLogConfigArgs>> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }
        public Builder auditLogConfigs(List<IAMAuditConfigAuditLogConfigArgs> auditLogConfigs) {
            this.auditLogConfigs = Output.of(Objects.requireNonNull(auditLogConfigs));
            return this;
        }
        public Builder auditLogConfigs(IAMAuditConfigAuditLogConfigArgs... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }
        public Builder project(Output<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder project(String project) {
            this.project = Output.of(Objects.requireNonNull(project));
            return this;
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }        public IAMAuditConfigArgs build() {
            return new IAMAuditConfigArgs(auditLogConfigs, project, service);
        }
    }
}
