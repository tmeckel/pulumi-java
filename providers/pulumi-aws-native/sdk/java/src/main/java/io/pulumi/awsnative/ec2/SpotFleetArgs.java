// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.SpotFleetRequestConfigDataArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class SpotFleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetArgs Empty = new SpotFleetArgs();

    @InputImport(name="spotFleetRequestConfigData", required=true)
      private final Input<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData;

    public Input<SpotFleetRequestConfigDataArgs> getSpotFleetRequestConfigData() {
        return this.spotFleetRequestConfigData;
    }

    public SpotFleetArgs(Input<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData) {
        this.spotFleetRequestConfigData = Objects.requireNonNull(spotFleetRequestConfigData, "expected parameter 'spotFleetRequestConfigData' to be non-null");
    }

    private SpotFleetArgs() {
        this.spotFleetRequestConfigData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spotFleetRequestConfigData = defaults.spotFleetRequestConfigData;
        }

        public Builder spotFleetRequestConfigData(Input<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData) {
            this.spotFleetRequestConfigData = Objects.requireNonNull(spotFleetRequestConfigData);
            return this;
        }

        public Builder spotFleetRequestConfigData(SpotFleetRequestConfigDataArgs spotFleetRequestConfigData) {
            this.spotFleetRequestConfigData = Input.of(Objects.requireNonNull(spotFleetRequestConfigData));
            return this;
        }
        public SpotFleetArgs build() {
            return new SpotFleetArgs(spotFleetRequestConfigData);
        }
    }
}
