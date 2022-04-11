// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultServiceAccountsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultServiceAccountsArgs Empty = new DefaultServiceAccountsArgs();

    /**
     * The action to be performed in the default service accounts. Valid values are: `DEPRIVILEGE`, `DELETE`, `DISABLE`. Note that `DEPRIVILEGE` action will ignore the REVERT configuration in the restore_policy
     * 
     */
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> getAction() {
        return this.action;
    }

    /**
     * The project ID where service accounts are created.
     * 
     */
    @Import(name="project", required=true)
      private final Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    /**
     * The action to be performed in the default service accounts on the resource destroy.
     * Valid values are NONE, REVERT and REVERT_AND_IGNORE_FAILURE. It is applied for any action but in the DEPRIVILEGE.
     * If set to REVERT it attempts to restore all default SAs but the DEPRIVILEGE action.
     * If set to REVERT_AND_IGNORE_FAILURE it is the same behavior as REVERT but ignores errors returned by the API.
     * 
     */
    @Import(name="restorePolicy")
      private final @Nullable Output<String> restorePolicy;

    public Output<String> getRestorePolicy() {
        return this.restorePolicy == null ? Codegen.empty() : this.restorePolicy;
    }

    public DefaultServiceAccountsArgs(
        Output<String> action,
        Output<String> project,
        @Nullable Output<String> restorePolicy) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.restorePolicy = restorePolicy;
    }

    private DefaultServiceAccountsArgs() {
        this.action = Codegen.empty();
        this.project = Codegen.empty();
        this.restorePolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultServiceAccountsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private Output<String> project;
        private @Nullable Output<String> restorePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultServiceAccountsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.project = defaults.project;
    	      this.restorePolicy = defaults.restorePolicy;
        }

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder project(Output<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder project(String project) {
            this.project = Output.of(Objects.requireNonNull(project));
            return this;
        }
        public Builder restorePolicy(@Nullable Output<String> restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }
        public Builder restorePolicy(@Nullable String restorePolicy) {
            this.restorePolicy = Codegen.ofNullable(restorePolicy);
            return this;
        }        public DefaultServiceAccountsArgs build() {
            return new DefaultServiceAccountsArgs(action, project, restorePolicy);
        }
    }
}
