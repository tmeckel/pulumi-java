// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect.outputs;

import com.pulumi.awsnative.connect.outputs.HoursOfOperationConfig;
import com.pulumi.awsnative.connect.outputs.HoursOfOperationTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHoursOfOperationResult {
    /**
     * @return Configuration information for the hours of operation: day, start time, and end time.
     * 
     */
    private final @Nullable List<HoursOfOperationConfig> config;
    /**
     * @return The description of the hours of operation.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The Amazon Resource Name (ARN) for the hours of operation.
     * 
     */
    private final @Nullable String hoursOfOperationArn;
    /**
     * @return The identifier of the Amazon Connect instance.
     * 
     */
    private final @Nullable String instanceArn;
    /**
     * @return The name of the hours of operation.
     * 
     */
    private final @Nullable String name;
    /**
     * @return One or more tags.
     * 
     */
    private final @Nullable List<HoursOfOperationTag> tags;
    /**
     * @return The time zone of the hours of operation.
     * 
     */
    private final @Nullable String timeZone;

    @CustomType.Constructor
    private GetHoursOfOperationResult(
        @CustomType.Parameter("config") @Nullable List<HoursOfOperationConfig> config,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("hoursOfOperationArn") @Nullable String hoursOfOperationArn,
        @CustomType.Parameter("instanceArn") @Nullable String instanceArn,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") @Nullable List<HoursOfOperationTag> tags,
        @CustomType.Parameter("timeZone") @Nullable String timeZone) {
        this.config = config;
        this.description = description;
        this.hoursOfOperationArn = hoursOfOperationArn;
        this.instanceArn = instanceArn;
        this.name = name;
        this.tags = tags;
        this.timeZone = timeZone;
    }

    /**
     * @return Configuration information for the hours of operation: day, start time, and end time.
     * 
     */
    public List<HoursOfOperationConfig> config() {
        return this.config == null ? List.of() : this.config;
    }
    /**
     * @return The description of the hours of operation.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The Amazon Resource Name (ARN) for the hours of operation.
     * 
     */
    public Optional<String> hoursOfOperationArn() {
        return Optional.ofNullable(this.hoursOfOperationArn);
    }
    /**
     * @return The identifier of the Amazon Connect instance.
     * 
     */
    public Optional<String> instanceArn() {
        return Optional.ofNullable(this.instanceArn);
    }
    /**
     * @return The name of the hours of operation.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return One or more tags.
     * 
     */
    public List<HoursOfOperationTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The time zone of the hours of operation.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHoursOfOperationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HoursOfOperationConfig> config;
        private @Nullable String description;
        private @Nullable String hoursOfOperationArn;
        private @Nullable String instanceArn;
        private @Nullable String name;
        private @Nullable List<HoursOfOperationTag> tags;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHoursOfOperationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.description = defaults.description;
    	      this.hoursOfOperationArn = defaults.hoursOfOperationArn;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder config(@Nullable List<HoursOfOperationConfig> config) {
            this.config = config;
            return this;
        }
        public Builder config(HoursOfOperationConfig... config) {
            return config(List.of(config));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder hoursOfOperationArn(@Nullable String hoursOfOperationArn) {
            this.hoursOfOperationArn = hoursOfOperationArn;
            return this;
        }
        public Builder instanceArn(@Nullable String instanceArn) {
            this.instanceArn = instanceArn;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tags(@Nullable List<HoursOfOperationTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(HoursOfOperationTag... tags) {
            return tags(List.of(tags));
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }        public GetHoursOfOperationResult build() {
            return new GetHoursOfOperationResult(config, description, hoursOfOperationArn, instanceArn, name, tags, timeZone);
        }
    }
}
