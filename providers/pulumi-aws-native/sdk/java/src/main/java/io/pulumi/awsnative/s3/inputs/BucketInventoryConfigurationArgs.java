// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketInventoryConfigurationIncludedObjectVersions;
import io.pulumi.awsnative.s3.enums.BucketInventoryConfigurationOptionalFieldsItem;
import io.pulumi.awsnative.s3.enums.BucketInventoryConfigurationScheduleFrequency;
import io.pulumi.awsnative.s3.inputs.BucketDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketInventoryConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketInventoryConfigurationArgs Empty = new BucketInventoryConfigurationArgs();

    @Import(name="destination", required=true)
      private final Output<BucketDestinationArgs> destination;

    public Output<BucketDestinationArgs> getDestination() {
        return this.destination;
    }

    /**
     * Specifies whether the inventory is enabled or disabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The ID used to identify the inventory configuration.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * Object versions to include in the inventory list.
     * 
     */
    @Import(name="includedObjectVersions", required=true)
      private final Output<BucketInventoryConfigurationIncludedObjectVersions> includedObjectVersions;

    public Output<BucketInventoryConfigurationIncludedObjectVersions> getIncludedObjectVersions() {
        return this.includedObjectVersions;
    }

    /**
     * Contains the optional fields that are included in the inventory results.
     * 
     */
    @Import(name="optionalFields")
      private final @Nullable Output<List<BucketInventoryConfigurationOptionalFieldsItem>> optionalFields;

    public Output<List<BucketInventoryConfigurationOptionalFieldsItem>> getOptionalFields() {
        return this.optionalFields == null ? Codegen.empty() : this.optionalFields;
    }

    /**
     * The prefix that is prepended to all inventory results.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    /**
     * Specifies the schedule for generating inventory results.
     * 
     */
    @Import(name="scheduleFrequency", required=true)
      private final Output<BucketInventoryConfigurationScheduleFrequency> scheduleFrequency;

    public Output<BucketInventoryConfigurationScheduleFrequency> getScheduleFrequency() {
        return this.scheduleFrequency;
    }

    public BucketInventoryConfigurationArgs(
        Output<BucketDestinationArgs> destination,
        Output<Boolean> enabled,
        Output<String> id,
        Output<BucketInventoryConfigurationIncludedObjectVersions> includedObjectVersions,
        @Nullable Output<List<BucketInventoryConfigurationOptionalFieldsItem>> optionalFields,
        @Nullable Output<String> prefix,
        Output<BucketInventoryConfigurationScheduleFrequency> scheduleFrequency) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.includedObjectVersions = Objects.requireNonNull(includedObjectVersions, "expected parameter 'includedObjectVersions' to be non-null");
        this.optionalFields = optionalFields;
        this.prefix = prefix;
        this.scheduleFrequency = Objects.requireNonNull(scheduleFrequency, "expected parameter 'scheduleFrequency' to be non-null");
    }

    private BucketInventoryConfigurationArgs() {
        this.destination = Codegen.empty();
        this.enabled = Codegen.empty();
        this.id = Codegen.empty();
        this.includedObjectVersions = Codegen.empty();
        this.optionalFields = Codegen.empty();
        this.prefix = Codegen.empty();
        this.scheduleFrequency = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketInventoryConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BucketDestinationArgs> destination;
        private Output<Boolean> enabled;
        private Output<String> id;
        private Output<BucketInventoryConfigurationIncludedObjectVersions> includedObjectVersions;
        private @Nullable Output<List<BucketInventoryConfigurationOptionalFieldsItem>> optionalFields;
        private @Nullable Output<String> prefix;
        private Output<BucketInventoryConfigurationScheduleFrequency> scheduleFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketInventoryConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.includedObjectVersions = defaults.includedObjectVersions;
    	      this.optionalFields = defaults.optionalFields;
    	      this.prefix = defaults.prefix;
    	      this.scheduleFrequency = defaults.scheduleFrequency;
        }

        public Builder destination(Output<BucketDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(BucketDestinationArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
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
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder includedObjectVersions(Output<BucketInventoryConfigurationIncludedObjectVersions> includedObjectVersions) {
            this.includedObjectVersions = Objects.requireNonNull(includedObjectVersions);
            return this;
        }
        public Builder includedObjectVersions(BucketInventoryConfigurationIncludedObjectVersions includedObjectVersions) {
            this.includedObjectVersions = Output.of(Objects.requireNonNull(includedObjectVersions));
            return this;
        }
        public Builder optionalFields(@Nullable Output<List<BucketInventoryConfigurationOptionalFieldsItem>> optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }
        public Builder optionalFields(@Nullable List<BucketInventoryConfigurationOptionalFieldsItem> optionalFields) {
            this.optionalFields = Codegen.ofNullable(optionalFields);
            return this;
        }
        public Builder optionalFields(BucketInventoryConfigurationOptionalFieldsItem... optionalFields) {
            return optionalFields(List.of(optionalFields));
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }
        public Builder scheduleFrequency(Output<BucketInventoryConfigurationScheduleFrequency> scheduleFrequency) {
            this.scheduleFrequency = Objects.requireNonNull(scheduleFrequency);
            return this;
        }
        public Builder scheduleFrequency(BucketInventoryConfigurationScheduleFrequency scheduleFrequency) {
            this.scheduleFrequency = Output.of(Objects.requireNonNull(scheduleFrequency));
            return this;
        }        public BucketInventoryConfigurationArgs build() {
            return new BucketInventoryConfigurationArgs(destination, enabled, id, includedObjectVersions, optionalFields, prefix, scheduleFrequency);
        }
    }
}
