// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CompositeAlarmState extends io.pulumi.resources.ResourceArgs {

    public static final CompositeAlarmState Empty = new CompositeAlarmState();

    /**
     * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. Defaults to `true`.
     * 
     */
    @InputImport(name="actionsEnabled")
      private final @Nullable Input<Boolean> actionsEnabled;

    public Input<Boolean> getActionsEnabled() {
        return this.actionsEnabled == null ? Input.empty() : this.actionsEnabled;
    }

    /**
     * The set of actions to execute when this alarm transitions to the `ALARM` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
     * 
     */
    @InputImport(name="alarmActions")
      private final @Nullable Input<List<String>> alarmActions;

    public Input<List<String>> getAlarmActions() {
        return this.alarmActions == null ? Input.empty() : this.alarmActions;
    }

    /**
     * The description for the composite alarm.
     * 
     */
    @InputImport(name="alarmDescription")
      private final @Nullable Input<String> alarmDescription;

    public Input<String> getAlarmDescription() {
        return this.alarmDescription == null ? Input.empty() : this.alarmDescription;
    }

    /**
     * The name for the composite alarm. This name must be unique within the region.
     * 
     */
    @InputImport(name="alarmName")
      private final @Nullable Input<String> alarmName;

    public Input<String> getAlarmName() {
        return this.alarmName == null ? Input.empty() : this.alarmName;
    }

    /**
     * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For syntax, see [Creating a Composite Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Create_Composite_Alarm.html). The maximum length is 10240 characters.
     * 
     */
    @InputImport(name="alarmRule")
      private final @Nullable Input<String> alarmRule;

    public Input<String> getAlarmRule() {
        return this.alarmRule == null ? Input.empty() : this.alarmRule;
    }

    /**
     * The ARN of the composite alarm.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The set of actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
     * 
     */
    @InputImport(name="insufficientDataActions")
      private final @Nullable Input<List<String>> insufficientDataActions;

    public Input<List<String>> getInsufficientDataActions() {
        return this.insufficientDataActions == null ? Input.empty() : this.insufficientDataActions;
    }

    /**
     * The set of actions to execute when this alarm transitions to an `OK` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
     * 
     */
    @InputImport(name="okActions")
      private final @Nullable Input<List<String>> okActions;

    public Input<List<String>> getOkActions() {
        return this.okActions == null ? Input.empty() : this.okActions;
    }

    /**
     * A map of tags to associate with the alarm. Up to 50 tags are allowed. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public CompositeAlarmState(
        @Nullable Input<Boolean> actionsEnabled,
        @Nullable Input<List<String>> alarmActions,
        @Nullable Input<String> alarmDescription,
        @Nullable Input<String> alarmName,
        @Nullable Input<String> alarmRule,
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> insufficientDataActions,
        @Nullable Input<List<String>> okActions,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.actionsEnabled = actionsEnabled;
        this.alarmActions = alarmActions;
        this.alarmDescription = alarmDescription;
        this.alarmName = alarmName;
        this.alarmRule = alarmRule;
        this.arn = arn;
        this.insufficientDataActions = insufficientDataActions;
        this.okActions = okActions;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private CompositeAlarmState() {
        this.actionsEnabled = Input.empty();
        this.alarmActions = Input.empty();
        this.alarmDescription = Input.empty();
        this.alarmName = Input.empty();
        this.alarmRule = Input.empty();
        this.arn = Input.empty();
        this.insufficientDataActions = Input.empty();
        this.okActions = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompositeAlarmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> actionsEnabled;
        private @Nullable Input<List<String>> alarmActions;
        private @Nullable Input<String> alarmDescription;
        private @Nullable Input<String> alarmName;
        private @Nullable Input<String> alarmRule;
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> insufficientDataActions;
        private @Nullable Input<List<String>> okActions;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(CompositeAlarmState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsEnabled = defaults.actionsEnabled;
    	      this.alarmActions = defaults.alarmActions;
    	      this.alarmDescription = defaults.alarmDescription;
    	      this.alarmName = defaults.alarmName;
    	      this.alarmRule = defaults.alarmRule;
    	      this.arn = defaults.arn;
    	      this.insufficientDataActions = defaults.insufficientDataActions;
    	      this.okActions = defaults.okActions;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder actionsEnabled(@Nullable Input<Boolean> actionsEnabled) {
            this.actionsEnabled = actionsEnabled;
            return this;
        }

        public Builder actionsEnabled(@Nullable Boolean actionsEnabled) {
            this.actionsEnabled = Input.ofNullable(actionsEnabled);
            return this;
        }

        public Builder alarmActions(@Nullable Input<List<String>> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }

        public Builder alarmActions(@Nullable List<String> alarmActions) {
            this.alarmActions = Input.ofNullable(alarmActions);
            return this;
        }

        public Builder alarmDescription(@Nullable Input<String> alarmDescription) {
            this.alarmDescription = alarmDescription;
            return this;
        }

        public Builder alarmDescription(@Nullable String alarmDescription) {
            this.alarmDescription = Input.ofNullable(alarmDescription);
            return this;
        }

        public Builder alarmName(@Nullable Input<String> alarmName) {
            this.alarmName = alarmName;
            return this;
        }

        public Builder alarmName(@Nullable String alarmName) {
            this.alarmName = Input.ofNullable(alarmName);
            return this;
        }

        public Builder alarmRule(@Nullable Input<String> alarmRule) {
            this.alarmRule = alarmRule;
            return this;
        }

        public Builder alarmRule(@Nullable String alarmRule) {
            this.alarmRule = Input.ofNullable(alarmRule);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder insufficientDataActions(@Nullable Input<List<String>> insufficientDataActions) {
            this.insufficientDataActions = insufficientDataActions;
            return this;
        }

        public Builder insufficientDataActions(@Nullable List<String> insufficientDataActions) {
            this.insufficientDataActions = Input.ofNullable(insufficientDataActions);
            return this;
        }

        public Builder okActions(@Nullable Input<List<String>> okActions) {
            this.okActions = okActions;
            return this;
        }

        public Builder okActions(@Nullable List<String> okActions) {
            this.okActions = Input.ofNullable(okActions);
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

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public CompositeAlarmState build() {
            return new CompositeAlarmState(actionsEnabled, alarmActions, alarmDescription, alarmName, alarmRule, arn, insufficientDataActions, okActions, tags, tagsAll);
        }
    }
}
