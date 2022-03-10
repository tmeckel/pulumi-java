// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventRuleState extends io.pulumi.resources.ResourceArgs {

    public static final EventRuleState Empty = new EventRuleState();

    /**
     * The Amazon Resource Name (ARN) of the rule.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The description of the rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The event bus to associate with this rule. If you omit this, the `default` event bus is used.
     * 
     */
    @InputImport(name="eventBusName")
      private final @Nullable Input<String> eventBusName;

    public Input<String> getEventBusName() {
        return this.eventBusName == null ? Input.empty() : this.eventBusName;
    }

    /**
     * The event pattern described a JSON object. At least one of `schedule_expression` or `event_pattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
     * 
     */
    @InputImport(name="eventPattern")
      private final @Nullable Input<String> eventPattern;

    public Input<String> getEventPattern() {
        return this.eventPattern == null ? Input.empty() : this.eventPattern;
    }

    /**
     * Whether the rule should be enabled (defaults to `true`).
     * 
     */
    @InputImport(name="isEnabled")
      private final @Nullable Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Input.empty() : this.isEnabled;
    }

    /**
     * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * 
     */
    @InputImport(name="roleArn")
      private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `schedule_expression` or `event_pattern` is required. Can only be used on the default event bus. For more information, refer to the AWS documentation [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     * 
     */
    @InputImport(name="scheduleExpression")
      private final @Nullable Input<String> scheduleExpression;

    public Input<String> getScheduleExpression() {
        return this.scheduleExpression == null ? Input.empty() : this.scheduleExpression;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public EventRuleState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<String> eventBusName,
        @Nullable Input<String> eventPattern,
        @Nullable Input<Boolean> isEnabled,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> roleArn,
        @Nullable Input<String> scheduleExpression,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.eventBusName = eventBusName;
        this.eventPattern = eventPattern;
        this.isEnabled = isEnabled;
        this.name = name;
        this.namePrefix = namePrefix;
        this.roleArn = roleArn;
        this.scheduleExpression = scheduleExpression;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private EventRuleState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.eventBusName = Input.empty();
        this.eventPattern = Input.empty();
        this.isEnabled = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.roleArn = Input.empty();
        this.scheduleExpression = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> eventBusName;
        private @Nullable Input<String> eventPattern;
        private @Nullable Input<Boolean> isEnabled;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<String> scheduleExpression;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(EventRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.eventBusName = defaults.eventBusName;
    	      this.eventPattern = defaults.eventPattern;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.roleArn = defaults.roleArn;
    	      this.scheduleExpression = defaults.scheduleExpression;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder eventBusName(@Nullable Input<String> eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }

        public Builder eventBusName(@Nullable String eventBusName) {
            this.eventBusName = Input.ofNullable(eventBusName);
            return this;
        }

        public Builder eventPattern(@Nullable Input<String> eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }

        public Builder eventPattern(@Nullable String eventPattern) {
            this.eventPattern = Input.ofNullable(eventPattern);
            return this;
        }

        public Builder isEnabled(@Nullable Input<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Input.ofNullable(isEnabled);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder namePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder roleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder scheduleExpression(@Nullable Input<String> scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        public Builder scheduleExpression(@Nullable String scheduleExpression) {
            this.scheduleExpression = Input.ofNullable(scheduleExpression);
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
        public EventRuleState build() {
            return new EventRuleState(arn, description, eventBusName, eventPattern, isEnabled, name, namePrefix, roleArn, scheduleExpression, tags, tagsAll);
        }
    }
}
