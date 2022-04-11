// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadGroupArgs Empty = new WorkloadGroupArgs();

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The workload group importance level.
     * 
     */
    @Import(name="importance")
      private final @Nullable Output<String> importance;

    public Output<String> getImportance() {
        return this.importance == null ? Codegen.empty() : this.importance;
    }

    /**
     * The workload group cap percentage resource.
     * 
     */
    @Import(name="maxResourcePercent", required=true)
      private final Output<Integer> maxResourcePercent;

    public Output<Integer> getMaxResourcePercent() {
        return this.maxResourcePercent;
    }

    /**
     * The workload group request maximum grant percentage.
     * 
     */
    @Import(name="maxResourcePercentPerRequest")
      private final @Nullable Output<Double> maxResourcePercentPerRequest;

    public Output<Double> getMaxResourcePercentPerRequest() {
        return this.maxResourcePercentPerRequest == null ? Codegen.empty() : this.maxResourcePercentPerRequest;
    }

    /**
     * The workload group minimum percentage resource.
     * 
     */
    @Import(name="minResourcePercent", required=true)
      private final Output<Integer> minResourcePercent;

    public Output<Integer> getMinResourcePercent() {
        return this.minResourcePercent;
    }

    /**
     * The workload group request minimum grant percentage.
     * 
     */
    @Import(name="minResourcePercentPerRequest", required=true)
      private final Output<Double> minResourcePercentPerRequest;

    public Output<Double> getMinResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
    }

    /**
     * The workload group query execution timeout.
     * 
     */
    @Import(name="queryExecutionTimeout")
      private final @Nullable Output<Integer> queryExecutionTimeout;

    public Output<Integer> getQueryExecutionTimeout() {
        return this.queryExecutionTimeout == null ? Codegen.empty() : this.queryExecutionTimeout;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * The name of the workload group.
     * 
     */
    @Import(name="workloadGroupName")
      private final @Nullable Output<String> workloadGroupName;

    public Output<String> getWorkloadGroupName() {
        return this.workloadGroupName == null ? Codegen.empty() : this.workloadGroupName;
    }

    public WorkloadGroupArgs(
        Output<String> databaseName,
        @Nullable Output<String> importance,
        Output<Integer> maxResourcePercent,
        @Nullable Output<Double> maxResourcePercentPerRequest,
        Output<Integer> minResourcePercent,
        Output<Double> minResourcePercentPerRequest,
        @Nullable Output<Integer> queryExecutionTimeout,
        Output<String> resourceGroupName,
        Output<String> serverName,
        @Nullable Output<String> workloadGroupName) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.importance = importance;
        this.maxResourcePercent = Objects.requireNonNull(maxResourcePercent, "expected parameter 'maxResourcePercent' to be non-null");
        this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
        this.minResourcePercent = Objects.requireNonNull(minResourcePercent, "expected parameter 'minResourcePercent' to be non-null");
        this.minResourcePercentPerRequest = Objects.requireNonNull(minResourcePercentPerRequest, "expected parameter 'minResourcePercentPerRequest' to be non-null");
        this.queryExecutionTimeout = queryExecutionTimeout;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.workloadGroupName = workloadGroupName;
    }

    private WorkloadGroupArgs() {
        this.databaseName = Codegen.empty();
        this.importance = Codegen.empty();
        this.maxResourcePercent = Codegen.empty();
        this.maxResourcePercentPerRequest = Codegen.empty();
        this.minResourcePercent = Codegen.empty();
        this.minResourcePercentPerRequest = Codegen.empty();
        this.queryExecutionTimeout = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverName = Codegen.empty();
        this.workloadGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> databaseName;
        private @Nullable Output<String> importance;
        private Output<Integer> maxResourcePercent;
        private @Nullable Output<Double> maxResourcePercentPerRequest;
        private Output<Integer> minResourcePercent;
        private Output<Double> minResourcePercentPerRequest;
        private @Nullable Output<Integer> queryExecutionTimeout;
        private Output<String> resourceGroupName;
        private Output<String> serverName;
        private @Nullable Output<String> workloadGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.importance = defaults.importance;
    	      this.maxResourcePercent = defaults.maxResourcePercent;
    	      this.maxResourcePercentPerRequest = defaults.maxResourcePercentPerRequest;
    	      this.minResourcePercent = defaults.minResourcePercent;
    	      this.minResourcePercentPerRequest = defaults.minResourcePercentPerRequest;
    	      this.queryExecutionTimeout = defaults.queryExecutionTimeout;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.workloadGroupName = defaults.workloadGroupName;
        }

        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder importance(@Nullable Output<String> importance) {
            this.importance = importance;
            return this;
        }
        public Builder importance(@Nullable String importance) {
            this.importance = Codegen.ofNullable(importance);
            return this;
        }
        public Builder maxResourcePercent(Output<Integer> maxResourcePercent) {
            this.maxResourcePercent = Objects.requireNonNull(maxResourcePercent);
            return this;
        }
        public Builder maxResourcePercent(Integer maxResourcePercent) {
            this.maxResourcePercent = Output.of(Objects.requireNonNull(maxResourcePercent));
            return this;
        }
        public Builder maxResourcePercentPerRequest(@Nullable Output<Double> maxResourcePercentPerRequest) {
            this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
            return this;
        }
        public Builder maxResourcePercentPerRequest(@Nullable Double maxResourcePercentPerRequest) {
            this.maxResourcePercentPerRequest = Codegen.ofNullable(maxResourcePercentPerRequest);
            return this;
        }
        public Builder minResourcePercent(Output<Integer> minResourcePercent) {
            this.minResourcePercent = Objects.requireNonNull(minResourcePercent);
            return this;
        }
        public Builder minResourcePercent(Integer minResourcePercent) {
            this.minResourcePercent = Output.of(Objects.requireNonNull(minResourcePercent));
            return this;
        }
        public Builder minResourcePercentPerRequest(Output<Double> minResourcePercentPerRequest) {
            this.minResourcePercentPerRequest = Objects.requireNonNull(minResourcePercentPerRequest);
            return this;
        }
        public Builder minResourcePercentPerRequest(Double minResourcePercentPerRequest) {
            this.minResourcePercentPerRequest = Output.of(Objects.requireNonNull(minResourcePercentPerRequest));
            return this;
        }
        public Builder queryExecutionTimeout(@Nullable Output<Integer> queryExecutionTimeout) {
            this.queryExecutionTimeout = queryExecutionTimeout;
            return this;
        }
        public Builder queryExecutionTimeout(@Nullable Integer queryExecutionTimeout) {
            this.queryExecutionTimeout = Codegen.ofNullable(queryExecutionTimeout);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }
        public Builder workloadGroupName(@Nullable Output<String> workloadGroupName) {
            this.workloadGroupName = workloadGroupName;
            return this;
        }
        public Builder workloadGroupName(@Nullable String workloadGroupName) {
            this.workloadGroupName = Codegen.ofNullable(workloadGroupName);
            return this;
        }        public WorkloadGroupArgs build() {
            return new WorkloadGroupArgs(databaseName, importance, maxResourcePercent, maxResourcePercentPerRequest, minResourcePercent, minResourcePercentPerRequest, queryExecutionTimeout, resourceGroupName, serverName, workloadGroupName);
        }
    }
}
