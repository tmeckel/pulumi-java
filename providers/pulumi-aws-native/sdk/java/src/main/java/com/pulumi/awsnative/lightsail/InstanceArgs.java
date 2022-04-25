// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail;

import com.pulumi.awsnative.lightsail.inputs.InstanceAddOnArgs;
import com.pulumi.awsnative.lightsail.inputs.InstanceHardwareArgs;
import com.pulumi.awsnative.lightsail.inputs.InstanceLocationArgs;
import com.pulumi.awsnative.lightsail.inputs.InstanceNetworkingArgs;
import com.pulumi.awsnative.lightsail.inputs.InstanceStateArgs;
import com.pulumi.awsnative.lightsail.inputs.InstanceTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * An array of objects representing the add-ons to enable for the new instance.
     * 
     */
    @Import(name="addOns")
    private @Nullable Output<List<InstanceAddOnArgs>> addOns;

    /**
     * @return An array of objects representing the add-ons to enable for the new instance.
     * 
     */
    public Optional<Output<List<InstanceAddOnArgs>>> addOns() {
        return Optional.ofNullable(this.addOns);
    }

    /**
     * The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
     * 
     */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * The ID for a virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0 ). Use the get blueprints operation to return a list of available images (or blueprints ).
     * 
     */
    @Import(name="blueprintId", required=true)
    private Output<String> blueprintId;

    /**
     * @return The ID for a virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0 ). Use the get blueprints operation to return a list of available images (or blueprints ).
     * 
     */
    public Output<String> blueprintId() {
        return this.blueprintId;
    }

    /**
     * The bundle of specification information for your virtual private server (or instance ), including the pricing plan (e.g., micro_1_0 ).
     * 
     */
    @Import(name="bundleId", required=true)
    private Output<String> bundleId;

    /**
     * @return The bundle of specification information for your virtual private server (or instance ), including the pricing plan (e.g., micro_1_0 ).
     * 
     */
    public Output<String> bundleId() {
        return this.bundleId;
    }

    @Import(name="hardware")
    private @Nullable Output<InstanceHardwareArgs> hardware;

    public Optional<Output<InstanceHardwareArgs>> hardware() {
        return Optional.ofNullable(this.hardware);
    }

    /**
     * The names to use for your new Lightsail instance.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The names to use for your new Lightsail instance.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * The name of your key pair.
     * 
     */
    @Import(name="keyPairName")
    private @Nullable Output<String> keyPairName;

    /**
     * @return The name of your key pair.
     * 
     */
    public Optional<Output<String>> keyPairName() {
        return Optional.ofNullable(this.keyPairName);
    }

    @Import(name="location")
    private @Nullable Output<InstanceLocationArgs> location;

    public Optional<Output<InstanceLocationArgs>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="networking")
    private @Nullable Output<InstanceNetworkingArgs> networking;

    public Optional<Output<InstanceNetworkingArgs>> networking() {
        return Optional.ofNullable(this.networking);
    }

    @Import(name="state")
    private @Nullable Output<InstanceStateArgs> state;

    public Optional<Output<InstanceStateArgs>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<InstanceTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<InstanceTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A launch script you can create that configures a server with additional user data. For example, you might want to run apt-get -y update.
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return A launch script you can create that configures a server with additional user data. For example, you might want to run apt-get -y update.
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.addOns = $.addOns;
        this.availabilityZone = $.availabilityZone;
        this.blueprintId = $.blueprintId;
        this.bundleId = $.bundleId;
        this.hardware = $.hardware;
        this.instanceName = $.instanceName;
        this.keyPairName = $.keyPairName;
        this.location = $.location;
        this.networking = $.networking;
        this.state = $.state;
        this.tags = $.tags;
        this.userData = $.userData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addOns An array of objects representing the add-ons to enable for the new instance.
         * 
         * @return builder
         * 
         */
        public Builder addOns(@Nullable Output<List<InstanceAddOnArgs>> addOns) {
            $.addOns = addOns;
            return this;
        }

        /**
         * @param addOns An array of objects representing the add-ons to enable for the new instance.
         * 
         * @return builder
         * 
         */
        public Builder addOns(List<InstanceAddOnArgs> addOns) {
            return addOns(Output.of(addOns));
        }

        /**
         * @param addOns An array of objects representing the add-ons to enable for the new instance.
         * 
         * @return builder
         * 
         */
        public Builder addOns(InstanceAddOnArgs... addOns) {
            return addOns(List.of(addOns));
        }

        /**
         * @param availabilityZone The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param blueprintId The ID for a virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0 ). Use the get blueprints operation to return a list of available images (or blueprints ).
         * 
         * @return builder
         * 
         */
        public Builder blueprintId(Output<String> blueprintId) {
            $.blueprintId = blueprintId;
            return this;
        }

        /**
         * @param blueprintId The ID for a virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0 ). Use the get blueprints operation to return a list of available images (or blueprints ).
         * 
         * @return builder
         * 
         */
        public Builder blueprintId(String blueprintId) {
            return blueprintId(Output.of(blueprintId));
        }

        /**
         * @param bundleId The bundle of specification information for your virtual private server (or instance ), including the pricing plan (e.g., micro_1_0 ).
         * 
         * @return builder
         * 
         */
        public Builder bundleId(Output<String> bundleId) {
            $.bundleId = bundleId;
            return this;
        }

        /**
         * @param bundleId The bundle of specification information for your virtual private server (or instance ), including the pricing plan (e.g., micro_1_0 ).
         * 
         * @return builder
         * 
         */
        public Builder bundleId(String bundleId) {
            return bundleId(Output.of(bundleId));
        }

        public Builder hardware(@Nullable Output<InstanceHardwareArgs> hardware) {
            $.hardware = hardware;
            return this;
        }

        public Builder hardware(InstanceHardwareArgs hardware) {
            return hardware(Output.of(hardware));
        }

        /**
         * @param instanceName The names to use for your new Lightsail instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The names to use for your new Lightsail instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param keyPairName The name of your key pair.
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            $.keyPairName = keyPairName;
            return this;
        }

        /**
         * @param keyPairName The name of your key pair.
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(String keyPairName) {
            return keyPairName(Output.of(keyPairName));
        }

        public Builder location(@Nullable Output<InstanceLocationArgs> location) {
            $.location = location;
            return this;
        }

        public Builder location(InstanceLocationArgs location) {
            return location(Output.of(location));
        }

        public Builder networking(@Nullable Output<InstanceNetworkingArgs> networking) {
            $.networking = networking;
            return this;
        }

        public Builder networking(InstanceNetworkingArgs networking) {
            return networking(Output.of(networking));
        }

        public Builder state(@Nullable Output<InstanceStateArgs> state) {
            $.state = state;
            return this;
        }

        public Builder state(InstanceStateArgs state) {
            return state(Output.of(state));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<InstanceTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<InstanceTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(InstanceTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param userData A launch script you can create that configures a server with additional user data. For example, you might want to run apt-get -y update.
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData A launch script you can create that configures a server with additional user data. For example, you might want to run apt-get -y update.
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        public InstanceArgs build() {
            $.blueprintId = Objects.requireNonNull($.blueprintId, "expected parameter 'blueprintId' to be non-null");
            $.bundleId = Objects.requireNonNull($.bundleId, "expected parameter 'bundleId' to be non-null");
            return $;
        }
    }

}
