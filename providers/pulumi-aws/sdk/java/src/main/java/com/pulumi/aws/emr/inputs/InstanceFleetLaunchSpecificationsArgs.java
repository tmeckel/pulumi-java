// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs;
import com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsSpotSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFleetLaunchSpecificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFleetLaunchSpecificationsArgs Empty = new InstanceFleetLaunchSpecificationsArgs();

    /**
     * Configuration block for on demand instances launch specifications
     * 
     */
    @Import(name="onDemandSpecifications")
    private @Nullable Output<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications;

    /**
     * @return Configuration block for on demand instances launch specifications
     * 
     */
    public Optional<Output<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>>> onDemandSpecifications() {
        return Optional.ofNullable(this.onDemandSpecifications);
    }

    /**
     * Configuration block for spot instances launch specifications
     * 
     */
    @Import(name="spotSpecifications")
    private @Nullable Output<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications;

    /**
     * @return Configuration block for spot instances launch specifications
     * 
     */
    public Optional<Output<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>>> spotSpecifications() {
        return Optional.ofNullable(this.spotSpecifications);
    }

    private InstanceFleetLaunchSpecificationsArgs() {}

    private InstanceFleetLaunchSpecificationsArgs(InstanceFleetLaunchSpecificationsArgs $) {
        this.onDemandSpecifications = $.onDemandSpecifications;
        this.spotSpecifications = $.spotSpecifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFleetLaunchSpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFleetLaunchSpecificationsArgs $;

        public Builder() {
            $ = new InstanceFleetLaunchSpecificationsArgs();
        }

        public Builder(InstanceFleetLaunchSpecificationsArgs defaults) {
            $ = new InstanceFleetLaunchSpecificationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onDemandSpecifications Configuration block for on demand instances launch specifications
         * 
         * @return builder
         * 
         */
        public Builder onDemandSpecifications(@Nullable Output<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications) {
            $.onDemandSpecifications = onDemandSpecifications;
            return this;
        }

        /**
         * @param onDemandSpecifications Configuration block for on demand instances launch specifications
         * 
         * @return builder
         * 
         */
        public Builder onDemandSpecifications(List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs> onDemandSpecifications) {
            return onDemandSpecifications(Output.of(onDemandSpecifications));
        }

        /**
         * @param onDemandSpecifications Configuration block for on demand instances launch specifications
         * 
         * @return builder
         * 
         */
        public Builder onDemandSpecifications(InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs... onDemandSpecifications) {
            return onDemandSpecifications(List.of(onDemandSpecifications));
        }

        /**
         * @param spotSpecifications Configuration block for spot instances launch specifications
         * 
         * @return builder
         * 
         */
        public Builder spotSpecifications(@Nullable Output<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications) {
            $.spotSpecifications = spotSpecifications;
            return this;
        }

        /**
         * @param spotSpecifications Configuration block for spot instances launch specifications
         * 
         * @return builder
         * 
         */
        public Builder spotSpecifications(List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs> spotSpecifications) {
            return spotSpecifications(Output.of(spotSpecifications));
        }

        /**
         * @param spotSpecifications Configuration block for spot instances launch specifications
         * 
         * @return builder
         * 
         */
        public Builder spotSpecifications(InstanceFleetLaunchSpecificationsSpotSpecificationArgs... spotSpecifications) {
            return spotSpecifications(List.of(spotSpecifications));
        }

        public InstanceFleetLaunchSpecificationsArgs build() {
            return $;
        }
    }

}
