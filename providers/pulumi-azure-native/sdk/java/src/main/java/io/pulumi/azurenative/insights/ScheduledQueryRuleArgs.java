// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.enums.Enabled;
import io.pulumi.azurenative.insights.inputs.AlertingActionArgs;
import io.pulumi.azurenative.insights.inputs.LogToMetricActionArgs;
import io.pulumi.azurenative.insights.inputs.ScheduleArgs;
import io.pulumi.azurenative.insights.inputs.SourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledQueryRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryRuleArgs Empty = new ScheduledQueryRuleArgs();

    /**
     * Action needs to be taken on rule execution.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<Either<AlertingActionArgs,LogToMetricActionArgs>> action;

    public Input<Either<AlertingActionArgs,LogToMetricActionArgs>> getAction() {
        return this.action;
    }

    /**
     * The flag that indicates whether the alert should be automatically resolved or not. The default is false.
     * 
     */
    @InputImport(name="autoMitigate")
      private final @Nullable Input<Boolean> autoMitigate;

    public Input<Boolean> getAutoMitigate() {
        return this.autoMitigate == null ? Input.empty() : this.autoMitigate;
    }

    /**
     * The description of the Log Search rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The display name of the alert rule
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The flag which indicates whether the Log Search rule is enabled. Value should be true or false
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Either<String,Enabled>> enabled;

    public Input<Either<String,Enabled>> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the rule.
     * 
     */
    @InputImport(name="ruleName")
      private final @Nullable Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName == null ? Input.empty() : this.ruleName;
    }

    /**
     * Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<ScheduleArgs> schedule;

    public Input<ScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * Data Source against which rule will Query Data
     * 
     */
    @InputImport(name="source", required=true)
      private final Input<SourceArgs> source;

    public Input<SourceArgs> getSource() {
        return this.source;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ScheduledQueryRuleArgs(
        Input<Either<AlertingActionArgs,LogToMetricActionArgs>> action,
        @Nullable Input<Boolean> autoMitigate,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Either<String,Enabled>> enabled,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleName,
        @Nullable Input<ScheduleArgs> schedule,
        Input<SourceArgs> source,
        @Nullable Input<Map<String,String>> tags) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.autoMitigate = autoMitigate == null ? Input.ofNullable(false) : autoMitigate;
        this.description = description;
        this.displayName = displayName;
        this.enabled = enabled;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.schedule = schedule;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.tags = tags;
    }

    private ScheduledQueryRuleArgs() {
        this.action = Input.empty();
        this.autoMitigate = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.enabled = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleName = Input.empty();
        this.schedule = Input.empty();
        this.source = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<AlertingActionArgs,LogToMetricActionArgs>> action;
        private @Nullable Input<Boolean> autoMitigate;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Either<String,Enabled>> enabled;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleName;
        private @Nullable Input<ScheduleArgs> schedule;
        private Input<SourceArgs> source;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.autoMitigate = defaults.autoMitigate;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.schedule = defaults.schedule;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
        }

        public Builder action(Input<Either<AlertingActionArgs,LogToMetricActionArgs>> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder action(Either<AlertingActionArgs,LogToMetricActionArgs> action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder autoMitigate(@Nullable Input<Boolean> autoMitigate) {
            this.autoMitigate = autoMitigate;
            return this;
        }

        public Builder autoMitigate(@Nullable Boolean autoMitigate) {
            this.autoMitigate = Input.ofNullable(autoMitigate);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder enabled(@Nullable Input<Either<String,Enabled>> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Either<String,Enabled> enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder ruleName(@Nullable Input<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Input.ofNullable(ruleName);
            return this;
        }

        public Builder schedule(@Nullable Input<ScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable ScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder source(Input<SourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(SourceArgs source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ScheduledQueryRuleArgs build() {
            return new ScheduledQueryRuleArgs(action, autoMitigate, description, displayName, enabled, location, resourceGroupName, ruleName, schedule, source, tags);
        }
    }
}
