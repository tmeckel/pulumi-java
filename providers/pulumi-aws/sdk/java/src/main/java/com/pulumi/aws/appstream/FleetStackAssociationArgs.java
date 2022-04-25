// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FleetStackAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetStackAssociationArgs Empty = new FleetStackAssociationArgs();

    /**
     * Name of the fleet.
     * 
     */
    @Import(name="fleetName", required=true)
    private Output<String> fleetName;

    /**
     * @return Name of the fleet.
     * 
     */
    public Output<String> fleetName() {
        return this.fleetName;
    }

    /**
     * Name of the stack.
     * 
     */
    @Import(name="stackName", required=true)
    private Output<String> stackName;

    /**
     * @return Name of the stack.
     * 
     */
    public Output<String> stackName() {
        return this.stackName;
    }

    private FleetStackAssociationArgs() {}

    private FleetStackAssociationArgs(FleetStackAssociationArgs $) {
        this.fleetName = $.fleetName;
        this.stackName = $.stackName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetStackAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetStackAssociationArgs $;

        public Builder() {
            $ = new FleetStackAssociationArgs();
        }

        public Builder(FleetStackAssociationArgs defaults) {
            $ = new FleetStackAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fleetName Name of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder fleetName(Output<String> fleetName) {
            $.fleetName = fleetName;
            return this;
        }

        /**
         * @param fleetName Name of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder fleetName(String fleetName) {
            return fleetName(Output.of(fleetName));
        }

        /**
         * @param stackName Name of the stack.
         * 
         * @return builder
         * 
         */
        public Builder stackName(Output<String> stackName) {
            $.stackName = stackName;
            return this;
        }

        /**
         * @param stackName Name of the stack.
         * 
         * @return builder
         * 
         */
        public Builder stackName(String stackName) {
            return stackName(Output.of(stackName));
        }

        public FleetStackAssociationArgs build() {
            $.fleetName = Objects.requireNonNull($.fleetName, "expected parameter 'fleetName' to be non-null");
            $.stackName = Objects.requireNonNull($.stackName, "expected parameter 'stackName' to be non-null");
            return $;
        }
    }

}
