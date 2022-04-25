// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.inputs.FacebookChannelPropertiesResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Facebook channel definition
 * 
 */
public final class FacebookChannelResponse extends com.pulumi.resources.InvokeArgs {

    public static final FacebookChannelResponse Empty = new FacebookChannelResponse();

    /**
     * The channel name
     * Expected value is &#39;FacebookChannel&#39;.
     * 
     */
    @Import(name="channelName", required=true)
    private String channelName;

    /**
     * @return The channel name
     * Expected value is &#39;FacebookChannel&#39;.
     * 
     */
    public String channelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @Import(name="etag")
    private @Nullable String etag;

    /**
     * @return Entity Tag of the resource
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The set of properties specific to bot facebook channel
     * 
     */
    @Import(name="properties")
    private @Nullable FacebookChannelPropertiesResponse properties;

    /**
     * @return The set of properties specific to bot facebook channel
     * 
     */
    public Optional<FacebookChannelPropertiesResponse> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Provisioning state of the resource
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return Provisioning state of the resource
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    private FacebookChannelResponse() {}

    private FacebookChannelResponse(FacebookChannelResponse $) {
        this.channelName = $.channelName;
        this.etag = $.etag;
        this.location = $.location;
        this.properties = $.properties;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FacebookChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FacebookChannelResponse $;

        public Builder() {
            $ = new FacebookChannelResponse();
        }

        public Builder(FacebookChannelResponse defaults) {
            $ = new FacebookChannelResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelName The channel name
         * Expected value is &#39;FacebookChannel&#39;.
         * 
         * @return builder
         * 
         */
        public Builder channelName(String channelName) {
            $.channelName = channelName;
            return this;
        }

        /**
         * @param etag Entity Tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param location Specifies the location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param properties The set of properties specific to bot facebook channel
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable FacebookChannelPropertiesResponse properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param provisioningState Provisioning state of the resource
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public FacebookChannelResponse build() {
            $.channelName = Codegen.stringProp("channelName").arg($.channelName).require();
            $.location = Codegen.stringProp("location").arg($.location).def("global").getNullable();
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
