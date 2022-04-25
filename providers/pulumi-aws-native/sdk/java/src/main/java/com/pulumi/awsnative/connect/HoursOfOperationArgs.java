// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect;

import com.pulumi.awsnative.connect.inputs.HoursOfOperationConfigArgs;
import com.pulumi.awsnative.connect.inputs.HoursOfOperationTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HoursOfOperationArgs extends com.pulumi.resources.ResourceArgs {

    public static final HoursOfOperationArgs Empty = new HoursOfOperationArgs();

    /**
     * Configuration information for the hours of operation: day, start time, and end time.
     * 
     */
    @Import(name="config", required=true)
    private Output<List<HoursOfOperationConfigArgs>> config;

    /**
     * @return Configuration information for the hours of operation: day, start time, and end time.
     * 
     */
    public Output<List<HoursOfOperationConfigArgs>> config() {
        return this.config;
    }

    /**
     * The description of the hours of operation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the hours of operation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    @Import(name="instanceArn", required=true)
    private Output<String> instanceArn;

    /**
     * @return The identifier of the Amazon Connect instance.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The name of the hours of operation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the hours of operation.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<HoursOfOperationTagArgs>> tags;

    /**
     * @return One or more tags.
     * 
     */
    public Optional<Output<List<HoursOfOperationTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The time zone of the hours of operation.
     * 
     */
    @Import(name="timeZone", required=true)
    private Output<String> timeZone;

    /**
     * @return The time zone of the hours of operation.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    private HoursOfOperationArgs() {}

    private HoursOfOperationArgs(HoursOfOperationArgs $) {
        this.config = $.config;
        this.description = $.description;
        this.instanceArn = $.instanceArn;
        this.name = $.name;
        this.tags = $.tags;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HoursOfOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HoursOfOperationArgs $;

        public Builder() {
            $ = new HoursOfOperationArgs();
        }

        public Builder(HoursOfOperationArgs defaults) {
            $ = new HoursOfOperationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config Configuration information for the hours of operation: day, start time, and end time.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<List<HoursOfOperationConfigArgs>> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Configuration information for the hours of operation: day, start time, and end time.
         * 
         * @return builder
         * 
         */
        public Builder config(List<HoursOfOperationConfigArgs> config) {
            return config(Output.of(config));
        }

        /**
         * @param config Configuration information for the hours of operation: day, start time, and end time.
         * 
         * @return builder
         * 
         */
        public Builder config(HoursOfOperationConfigArgs... config) {
            return config(List.of(config));
        }

        /**
         * @param description The description of the hours of operation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the hours of operation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param instanceArn The identifier of the Amazon Connect instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The identifier of the Amazon Connect instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        /**
         * @param name The name of the hours of operation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the hours of operation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags One or more tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<HoursOfOperationTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags One or more tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<HoursOfOperationTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags One or more tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(HoursOfOperationTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param timeZone The time zone of the hours of operation.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The time zone of the hours of operation.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public HoursOfOperationArgs build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            $.timeZone = Objects.requireNonNull($.timeZone, "expected parameter 'timeZone' to be non-null");
            return $;
        }
    }

}
