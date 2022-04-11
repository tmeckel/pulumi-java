// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.alertsmanagement.inputs.HealthAlertActionArgs;
import io.pulumi.azurenative.alertsmanagement.inputs.HealthAlertCriteriaArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthAlertArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthAlertArgs Empty = new HealthAlertArgs();

    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    @Import(name="actions")
      private final @Nullable Output<List<HealthAlertActionArgs>> actions;

    public Output<List<HealthAlertActionArgs>> getActions() {
        return this.actions == null ? Codegen.empty() : this.actions;
    }

    /**
     * defines the specific alert criteria information.
     * 
     */
    @Import(name="criteria", required=true)
      private final Output<HealthAlertCriteriaArgs> criteria;

    public Output<HealthAlertCriteriaArgs> getCriteria() {
        return this.criteria;
    }

    /**
     * the description of the health alert that will be included in the alert email.
     * 
     */
    @Import(name="description", required=true)
      private final Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }

    /**
     * the flag that indicates whether the health alert is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="ruleName")
      private final @Nullable Output<String> ruleName;

    public Output<String> getRuleName() {
        return this.ruleName == null ? Codegen.empty() : this.ruleName;
    }

    /**
     * the list of resource id's that this health alert is scoped to.
     * 
     */
    @Import(name="scopes")
      private final @Nullable Output<List<String>> scopes;

    public Output<List<String>> getScopes() {
        return this.scopes == null ? Codegen.empty() : this.scopes;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public HealthAlertArgs(
        @Nullable Output<List<HealthAlertActionArgs>> actions,
        Output<HealthAlertCriteriaArgs> criteria,
        Output<String> description,
        Output<Boolean> enabled,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleName,
        @Nullable Output<List<String>> scopes,
        @Nullable Output<Map<String,String>> tags) {
        this.actions = actions;
        this.criteria = Objects.requireNonNull(criteria, "expected parameter 'criteria' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.scopes = scopes;
        this.tags = tags;
    }

    private HealthAlertArgs() {
        this.actions = Codegen.empty();
        this.criteria = Codegen.empty();
        this.description = Codegen.empty();
        this.enabled = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.ruleName = Codegen.empty();
        this.scopes = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<HealthAlertActionArgs>> actions;
        private Output<HealthAlertCriteriaArgs> criteria;
        private Output<String> description;
        private Output<Boolean> enabled;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleName;
        private @Nullable Output<List<String>> scopes;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthAlertArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.criteria = defaults.criteria;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.scopes = defaults.scopes;
    	      this.tags = defaults.tags;
        }

        public Builder actions(@Nullable Output<List<HealthAlertActionArgs>> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(@Nullable List<HealthAlertActionArgs> actions) {
            this.actions = Codegen.ofNullable(actions);
            return this;
        }
        public Builder actions(HealthAlertActionArgs... actions) {
            return actions(List.of(actions));
        }
        public Builder criteria(Output<HealthAlertCriteriaArgs> criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }
        public Builder criteria(HealthAlertCriteriaArgs criteria) {
            this.criteria = Output.of(Objects.requireNonNull(criteria));
            return this;
        }
        public Builder description(Output<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder description(String description) {
            this.description = Output.of(Objects.requireNonNull(description));
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder ruleName(@Nullable Output<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Codegen.ofNullable(ruleName);
            return this;
        }
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }
        public Builder scopes(@Nullable List<String> scopes) {
            this.scopes = Codegen.ofNullable(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public HealthAlertArgs build() {
            return new HealthAlertArgs(actions, criteria, description, enabled, location, resourceGroupName, ruleName, scopes, tags);
        }
    }
}
