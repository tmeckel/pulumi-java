// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.redis.inputs.GetInstanceMaintenancePolicyWeeklyMaintenanceWindow;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceMaintenancePolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceMaintenancePolicy Empty = new GetInstanceMaintenancePolicy();

    @InputImport(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    @InputImport(name="updateTime", required=true)
      private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    @InputImport(name="weeklyMaintenanceWindows", required=true)
      private final List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows;

    public List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindow> getWeeklyMaintenanceWindows() {
        return this.weeklyMaintenanceWindows;
    }

    public GetInstanceMaintenancePolicy(
        String createTime,
        String description,
        String updateTime,
        List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
        this.weeklyMaintenanceWindows = Objects.requireNonNull(weeklyMaintenanceWindows, "expected parameter 'weeklyMaintenanceWindows' to be non-null");
    }

    private GetInstanceMaintenancePolicy() {
        this.createTime = null;
        this.description = null;
        this.updateTime = null;
        this.weeklyMaintenanceWindows = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceMaintenancePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String updateTime;
        private List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceMaintenancePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
    	      this.weeklyMaintenanceWindows = defaults.weeklyMaintenanceWindows;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder weeklyMaintenanceWindows(List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows) {
            this.weeklyMaintenanceWindows = Objects.requireNonNull(weeklyMaintenanceWindows);
            return this;
        }
        public GetInstanceMaintenancePolicy build() {
            return new GetInstanceMaintenancePolicy(createTime, description, updateTime, weeklyMaintenanceWindows);
        }
    }
}
