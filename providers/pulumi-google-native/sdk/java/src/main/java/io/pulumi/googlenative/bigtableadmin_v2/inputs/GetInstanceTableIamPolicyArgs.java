// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTableIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTableIamPolicyArgs Empty = new GetInstanceTableIamPolicyArgs();

    @InputImport(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="tableId", required=true)
      private final String tableId;

    public String getTableId() {
        return this.tableId;
    }

    public GetInstanceTableIamPolicyArgs(
        String instanceId,
        @Nullable String project,
        String tableId) {
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.project = project;
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private GetInstanceTableIamPolicyArgs() {
        this.instanceId = null;
        this.project = null;
        this.tableId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTableIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private @Nullable String project;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTableIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder tableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public GetInstanceTableIamPolicyArgs build() {
            return new GetInstanceTableIamPolicyArgs(instanceId, project, tableId);
        }
    }
}
