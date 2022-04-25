// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.ProtocolCustomSettingsFormatArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DdosCustomPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DdosCustomPolicyArgs Empty = new DdosCustomPolicyArgs();

    /**
     * The name of the DDoS custom policy.
     * 
     */
    @Import(name="ddosCustomPolicyName")
    private @Nullable Output<String> ddosCustomPolicyName;

    /**
     * @return The name of the DDoS custom policy.
     * 
     */
    public Optional<Output<String>> ddosCustomPolicyName() {
        return Optional.ofNullable(this.ddosCustomPolicyName);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The protocol-specific DDoS policy customization parameters.
     * 
     */
    @Import(name="protocolCustomSettings")
    private @Nullable Output<List<ProtocolCustomSettingsFormatArgs>> protocolCustomSettings;

    /**
     * @return The protocol-specific DDoS policy customization parameters.
     * 
     */
    public Optional<Output<List<ProtocolCustomSettingsFormatArgs>>> protocolCustomSettings() {
        return Optional.ofNullable(this.protocolCustomSettings);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DdosCustomPolicyArgs() {}

    private DdosCustomPolicyArgs(DdosCustomPolicyArgs $) {
        this.ddosCustomPolicyName = $.ddosCustomPolicyName;
        this.id = $.id;
        this.location = $.location;
        this.protocolCustomSettings = $.protocolCustomSettings;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DdosCustomPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DdosCustomPolicyArgs $;

        public Builder() {
            $ = new DdosCustomPolicyArgs();
        }

        public Builder(DdosCustomPolicyArgs defaults) {
            $ = new DdosCustomPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ddosCustomPolicyName The name of the DDoS custom policy.
         * 
         * @return builder
         * 
         */
        public Builder ddosCustomPolicyName(@Nullable Output<String> ddosCustomPolicyName) {
            $.ddosCustomPolicyName = ddosCustomPolicyName;
            return this;
        }

        /**
         * @param ddosCustomPolicyName The name of the DDoS custom policy.
         * 
         * @return builder
         * 
         */
        public Builder ddosCustomPolicyName(String ddosCustomPolicyName) {
            return ddosCustomPolicyName(Output.of(ddosCustomPolicyName));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param protocolCustomSettings The protocol-specific DDoS policy customization parameters.
         * 
         * @return builder
         * 
         */
        public Builder protocolCustomSettings(@Nullable Output<List<ProtocolCustomSettingsFormatArgs>> protocolCustomSettings) {
            $.protocolCustomSettings = protocolCustomSettings;
            return this;
        }

        /**
         * @param protocolCustomSettings The protocol-specific DDoS policy customization parameters.
         * 
         * @return builder
         * 
         */
        public Builder protocolCustomSettings(List<ProtocolCustomSettingsFormatArgs> protocolCustomSettings) {
            return protocolCustomSettings(Output.of(protocolCustomSettings));
        }

        /**
         * @param protocolCustomSettings The protocol-specific DDoS policy customization parameters.
         * 
         * @return builder
         * 
         */
        public Builder protocolCustomSettings(ProtocolCustomSettingsFormatArgs... protocolCustomSettings) {
            return protocolCustomSettings(List.of(protocolCustomSettings));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DdosCustomPolicyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
