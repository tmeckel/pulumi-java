// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainEbsOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainEbsOptionsArgs Empty = new DomainEbsOptionsArgs();

    /**
     * Whether EBS volumes are attached to data nodes in the domain.
     * 
     */
    @InputImport(name="ebsEnabled", required=true)
      private final Input<Boolean> ebsEnabled;

    public Input<Boolean> getEbsEnabled() {
        return this.ebsEnabled;
    }

    /**
     * Baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
     * 
     */
    @InputImport(name="iops")
      private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    /**
     * Size of EBS volumes attached to data nodes (in GiB).
     * 
     */
    @InputImport(name="volumeSize")
      private final @Nullable Input<Integer> volumeSize;

    public Input<Integer> getVolumeSize() {
        return this.volumeSize == null ? Input.empty() : this.volumeSize;
    }

    /**
     * Type of EBS volumes attached to data nodes.
     * 
     */
    @InputImport(name="volumeType")
      private final @Nullable Input<String> volumeType;

    public Input<String> getVolumeType() {
        return this.volumeType == null ? Input.empty() : this.volumeType;
    }

    public DomainEbsOptionsArgs(
        Input<Boolean> ebsEnabled,
        @Nullable Input<Integer> iops,
        @Nullable Input<Integer> volumeSize,
        @Nullable Input<String> volumeType) {
        this.ebsEnabled = Objects.requireNonNull(ebsEnabled, "expected parameter 'ebsEnabled' to be non-null");
        this.iops = iops;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private DomainEbsOptionsArgs() {
        this.ebsEnabled = Input.empty();
        this.iops = Input.empty();
        this.volumeSize = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEbsOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> ebsEnabled;
        private @Nullable Input<Integer> iops;
        private @Nullable Input<Integer> volumeSize;
        private @Nullable Input<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEbsOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ebsEnabled = defaults.ebsEnabled;
    	      this.iops = defaults.iops;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder ebsEnabled(Input<Boolean> ebsEnabled) {
            this.ebsEnabled = Objects.requireNonNull(ebsEnabled);
            return this;
        }

        public Builder ebsEnabled(Boolean ebsEnabled) {
            this.ebsEnabled = Input.of(Objects.requireNonNull(ebsEnabled));
            return this;
        }

        public Builder iops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder iops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
            return this;
        }

        public Builder volumeSize(@Nullable Input<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Input.ofNullable(volumeSize);
            return this;
        }

        public Builder volumeType(@Nullable Input<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Input.ofNullable(volumeType);
            return this;
        }
        public DomainEbsOptionsArgs build() {
            return new DomainEbsOptionsArgs(ebsEnabled, iops, volumeSize, volumeType);
        }
    }
}
