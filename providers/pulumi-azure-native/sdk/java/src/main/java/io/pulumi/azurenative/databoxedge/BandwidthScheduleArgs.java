// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.DayOfWeek;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BandwidthScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BandwidthScheduleArgs Empty = new BandwidthScheduleArgs();

    /**
     * The days of the week when this schedule is applicable.
     * 
     */
    @Import(name="days", required=true)
      private final Output<List<Either<String,DayOfWeek>>> days;

    public Output<List<Either<String,DayOfWeek>>> getDays() {
        return this.days;
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The bandwidth schedule name which needs to be added/updated.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The bandwidth rate in Mbps.
     * 
     */
    @Import(name="rateInMbps", required=true)
      private final Output<Integer> rateInMbps;

    public Output<Integer> getRateInMbps() {
        return this.rateInMbps;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The start time of the schedule in UTC.
     * 
     */
    @Import(name="start", required=true)
      private final Output<String> start;

    public Output<String> getStart() {
        return this.start;
    }

    /**
     * The stop time of the schedule in UTC.
     * 
     */
    @Import(name="stop", required=true)
      private final Output<String> stop;

    public Output<String> getStop() {
        return this.stop;
    }

    public BandwidthScheduleArgs(
        Output<List<Either<String,DayOfWeek>>> days,
        Output<String> deviceName,
        @Nullable Output<String> name,
        Output<Integer> rateInMbps,
        Output<String> resourceGroupName,
        Output<String> start,
        Output<String> stop) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.name = name;
        this.rateInMbps = Objects.requireNonNull(rateInMbps, "expected parameter 'rateInMbps' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
        this.stop = Objects.requireNonNull(stop, "expected parameter 'stop' to be non-null");
    }

    private BandwidthScheduleArgs() {
        this.days = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.name = Codegen.empty();
        this.rateInMbps = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.start = Codegen.empty();
        this.stop = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BandwidthScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<Either<String,DayOfWeek>>> days;
        private Output<String> deviceName;
        private @Nullable Output<String> name;
        private Output<Integer> rateInMbps;
        private Output<String> resourceGroupName;
        private Output<String> start;
        private Output<String> stop;

        public Builder() {
    	      // Empty
        }

        public Builder(BandwidthScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.deviceName = defaults.deviceName;
    	      this.name = defaults.name;
    	      this.rateInMbps = defaults.rateInMbps;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.start = defaults.start;
    	      this.stop = defaults.stop;
        }

        public Builder days(Output<List<Either<String,DayOfWeek>>> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder days(List<Either<String,DayOfWeek>> days) {
            this.days = Output.of(Objects.requireNonNull(days));
            return this;
        }
        public Builder days(Either<String,DayOfWeek>... days) {
            return days(List.of(days));
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
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
        public Builder rateInMbps(Output<Integer> rateInMbps) {
            this.rateInMbps = Objects.requireNonNull(rateInMbps);
            return this;
        }
        public Builder rateInMbps(Integer rateInMbps) {
            this.rateInMbps = Output.of(Objects.requireNonNull(rateInMbps));
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
        public Builder start(Output<String> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public Builder start(String start) {
            this.start = Output.of(Objects.requireNonNull(start));
            return this;
        }
        public Builder stop(Output<String> stop) {
            this.stop = Objects.requireNonNull(stop);
            return this;
        }
        public Builder stop(String stop) {
            this.stop = Output.of(Objects.requireNonNull(stop));
            return this;
        }        public BandwidthScheduleArgs build() {
            return new BandwidthScheduleArgs(days, deviceName, name, rateInMbps, resourceGroupName, start, stop);
        }
    }
}
