// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs Empty = new ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs();

    /**
     * The size of the disk in base-2 GB.
     * 
     */
    @Import(name="diskSizeGb", required=true)
      private final Output<Integer> diskSizeGb;

    public Output<Integer> getDiskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * The disk interface to use for attaching this disk.
     * Default value is `SCSI`.
     * Possible values are `SCSI` and `NVME`.
     * 
     */
    @Import(name="interface")
      private final @Nullable Output<String> interface_;

    public Output<String> getInterface_() {
        return this.interface_ == null ? Codegen.empty() : this.interface_;
    }

    public ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs(
        Output<Integer> diskSizeGb,
        @Nullable Output<String> interface_) {
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.interface_ = interface_;
    }

    private ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs() {
        this.diskSizeGb = Codegen.empty();
        this.interface_ = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> diskSizeGb;
        private @Nullable Output<String> interface_;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.interface_ = defaults.interface_;
        }

        public Builder diskSizeGb(Output<Integer> diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Output.of(Objects.requireNonNull(diskSizeGb));
            return this;
        }
        public Builder interface_(@Nullable Output<String> interface_) {
            this.interface_ = interface_;
            return this;
        }
        public Builder interface_(@Nullable String interface_) {
            this.interface_ = Codegen.ofNullable(interface_);
            return this;
        }        public ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs build() {
            return new ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs(diskSizeGb, interface_);
        }
    }
}
