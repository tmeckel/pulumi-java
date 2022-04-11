// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.s3.inputs.InventoryDestinationArgs;
import io.pulumi.aws.s3.inputs.InventoryFilterArgs;
import io.pulumi.aws.s3.inputs.InventoryScheduleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InventoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryArgs Empty = new InventoryArgs();

    /**
     * The name of the source bucket that inventory lists the objects for.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * Contains information about where to publish the inventory results (documented below).
     * 
     */
    @Import(name="destination", required=true)
      private final Output<InventoryDestinationArgs> destination;

    public Output<InventoryDestinationArgs> getDestination() {
        return this.destination;
    }

    /**
     * Specifies whether the inventory is enabled or disabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria (documented below).
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<InventoryFilterArgs> filter;

    public Output<InventoryFilterArgs> getFilter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * Object versions to include in the inventory list. Valid values: `All`, `Current`.
     * 
     */
    @Import(name="includedObjectVersions", required=true)
      private final Output<String> includedObjectVersions;

    public Output<String> getIncludedObjectVersions() {
        return this.includedObjectVersions;
    }

    /**
     * Unique identifier of the inventory configuration for the bucket.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * List of optional fields that are included in the inventory results. Please refer to the S3 [documentation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_InventoryConfiguration.html#AmazonS3-Type-InventoryConfiguration-OptionalFields) for more details.
     * 
     */
    @Import(name="optionalFields")
      private final @Nullable Output<List<String>> optionalFields;

    public Output<List<String>> getOptionalFields() {
        return this.optionalFields == null ? Codegen.empty() : this.optionalFields;
    }

    /**
     * Specifies the schedule for generating inventory results (documented below).
     * 
     */
    @Import(name="schedule", required=true)
      private final Output<InventoryScheduleArgs> schedule;

    public Output<InventoryScheduleArgs> getSchedule() {
        return this.schedule;
    }

    public InventoryArgs(
        Output<String> bucket,
        Output<InventoryDestinationArgs> destination,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<InventoryFilterArgs> filter,
        Output<String> includedObjectVersions,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> optionalFields,
        Output<InventoryScheduleArgs> schedule) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.enabled = enabled;
        this.filter = filter;
        this.includedObjectVersions = Objects.requireNonNull(includedObjectVersions, "expected parameter 'includedObjectVersions' to be non-null");
        this.name = name;
        this.optionalFields = optionalFields;
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private InventoryArgs() {
        this.bucket = Codegen.empty();
        this.destination = Codegen.empty();
        this.enabled = Codegen.empty();
        this.filter = Codegen.empty();
        this.includedObjectVersions = Codegen.empty();
        this.name = Codegen.empty();
        this.optionalFields = Codegen.empty();
        this.schedule = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private Output<InventoryDestinationArgs> destination;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<InventoryFilterArgs> filter;
        private Output<String> includedObjectVersions;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> optionalFields;
        private Output<InventoryScheduleArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.filter = defaults.filter;
    	      this.includedObjectVersions = defaults.includedObjectVersions;
    	      this.name = defaults.name;
    	      this.optionalFields = defaults.optionalFields;
    	      this.schedule = defaults.schedule;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder destination(Output<InventoryDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(InventoryDestinationArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
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
        public Builder filter(@Nullable Output<InventoryFilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable InventoryFilterArgs filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder includedObjectVersions(Output<String> includedObjectVersions) {
            this.includedObjectVersions = Objects.requireNonNull(includedObjectVersions);
            return this;
        }
        public Builder includedObjectVersions(String includedObjectVersions) {
            this.includedObjectVersions = Output.of(Objects.requireNonNull(includedObjectVersions));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder optionalFields(@Nullable Output<List<String>> optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }
        public Builder optionalFields(@Nullable List<String> optionalFields) {
            this.optionalFields = Codegen.ofNullable(optionalFields);
            return this;
        }
        public Builder optionalFields(String... optionalFields) {
            return optionalFields(List.of(optionalFields));
        }
        public Builder schedule(Output<InventoryScheduleArgs> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder schedule(InventoryScheduleArgs schedule) {
            this.schedule = Output.of(Objects.requireNonNull(schedule));
            return this;
        }        public InventoryArgs build() {
            return new InventoryArgs(bucket, destination, enabled, filter, includedObjectVersions, name, optionalFields, schedule);
        }
    }
}
