// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionState Empty = new EventSubscriptionState();

    /**
     * The Amazon Resource Name of the RDS event notification subscription
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The AWS customer account associated with the RDS event notification subscription
     * 
     */
    @Import(name="customerAwsId")
      private final @Nullable Output<String> customerAwsId;

    public Output<String> getCustomerAwsId() {
        return this.customerAwsId == null ? Codegen.empty() : this.customerAwsId;
    }

    /**
     * A boolean flag to enable/disable the subscription. Defaults to true.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * A list of event categories for a SourceType that you want to subscribe to. See http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html or run `aws rds describe-event-categories`.
     * 
     */
    @Import(name="eventCategories")
      private final @Nullable Output<List<String>> eventCategories;

    public Output<List<String>> getEventCategories() {
        return this.eventCategories == null ? Codegen.empty() : this.eventCategories;
    }

    /**
     * The name of the DB event subscription. By default generated by this provider.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the DB event subscription. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The SNS topic to send events to.
     * 
     */
    @Import(name="snsTopic")
      private final @Nullable Output<String> snsTopic;

    public Output<String> getSnsTopic() {
        return this.snsTopic == null ? Codegen.empty() : this.snsTopic;
    }

    /**
     * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
     * 
     */
    @Import(name="sourceIds")
      private final @Nullable Output<List<String>> sourceIds;

    public Output<List<String>> getSourceIds() {
        return this.sourceIds == null ? Codegen.empty() : this.sourceIds;
    }

    /**
     * The type of source that will be generating the events. Valid options are `db-instance`, `db-security-group`, `db-parameter-group`, `db-snapshot`, `db-cluster` or `db-cluster-snapshot`. If not set, all sources will be subscribed to.
     * 
     */
    @Import(name="sourceType")
      private final @Nullable Output<String> sourceType;

    public Output<String> getSourceType() {
        return this.sourceType == null ? Codegen.empty() : this.sourceType;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public EventSubscriptionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> customerAwsId,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<String>> eventCategories,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> snsTopic,
        @Nullable Output<List<String>> sourceIds,
        @Nullable Output<String> sourceType,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.customerAwsId = customerAwsId;
        this.enabled = enabled;
        this.eventCategories = eventCategories;
        this.name = name;
        this.namePrefix = namePrefix;
        this.snsTopic = snsTopic;
        this.sourceIds = sourceIds;
        this.sourceType = sourceType;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private EventSubscriptionState() {
        this.arn = Codegen.empty();
        this.customerAwsId = Codegen.empty();
        this.enabled = Codegen.empty();
        this.eventCategories = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.snsTopic = Codegen.empty();
        this.sourceIds = Codegen.empty();
        this.sourceType = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> customerAwsId;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<String>> eventCategories;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> snsTopic;
        private @Nullable Output<List<String>> sourceIds;
        private @Nullable Output<String> sourceType;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.customerAwsId = defaults.customerAwsId;
    	      this.enabled = defaults.enabled;
    	      this.eventCategories = defaults.eventCategories;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.snsTopic = defaults.snsTopic;
    	      this.sourceIds = defaults.sourceIds;
    	      this.sourceType = defaults.sourceType;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder customerAwsId(@Nullable Output<String> customerAwsId) {
            this.customerAwsId = customerAwsId;
            return this;
        }
        public Builder customerAwsId(@Nullable String customerAwsId) {
            this.customerAwsId = Codegen.ofNullable(customerAwsId);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder eventCategories(@Nullable Output<List<String>> eventCategories) {
            this.eventCategories = eventCategories;
            return this;
        }
        public Builder eventCategories(@Nullable List<String> eventCategories) {
            this.eventCategories = Codegen.ofNullable(eventCategories);
            return this;
        }
        public Builder eventCategories(String... eventCategories) {
            return eventCategories(List.of(eventCategories));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder snsTopic(@Nullable Output<String> snsTopic) {
            this.snsTopic = snsTopic;
            return this;
        }
        public Builder snsTopic(@Nullable String snsTopic) {
            this.snsTopic = Codegen.ofNullable(snsTopic);
            return this;
        }
        public Builder sourceIds(@Nullable Output<List<String>> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public Builder sourceIds(@Nullable List<String> sourceIds) {
            this.sourceIds = Codegen.ofNullable(sourceIds);
            return this;
        }
        public Builder sourceIds(String... sourceIds) {
            return sourceIds(List.of(sourceIds));
        }
        public Builder sourceType(@Nullable Output<String> sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Builder sourceType(@Nullable String sourceType) {
            this.sourceType = Codegen.ofNullable(sourceType);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public EventSubscriptionState build() {
            return new EventSubscriptionState(arn, customerAwsId, enabled, eventCategories, name, namePrefix, snsTopic, sourceIds, sourceType, tags, tagsAll);
        }
    }
}
