// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.analysisservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The gateway details.
 * 
 */
public final class GatewayDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GatewayDetailsResponse Empty = new GatewayDetailsResponse();

    /**
     * Uri of the DMTS cluster.
     * 
     */
    @Import(name="dmtsClusterUri", required=true)
    private String dmtsClusterUri;

    /**
     * @return Uri of the DMTS cluster.
     * 
     */
    public String dmtsClusterUri() {
        return this.dmtsClusterUri;
    }

    /**
     * Gateway object id from in the DMTS cluster for the gateway resource.
     * 
     */
    @Import(name="gatewayObjectId", required=true)
    private String gatewayObjectId;

    /**
     * @return Gateway object id from in the DMTS cluster for the gateway resource.
     * 
     */
    public String gatewayObjectId() {
        return this.gatewayObjectId;
    }

    /**
     * Gateway resource to be associated with the server.
     * 
     */
    @Import(name="gatewayResourceId")
    private @Nullable String gatewayResourceId;

    /**
     * @return Gateway resource to be associated with the server.
     * 
     */
    public Optional<String> gatewayResourceId() {
        return Optional.ofNullable(this.gatewayResourceId);
    }

    private GatewayDetailsResponse() {}

    private GatewayDetailsResponse(GatewayDetailsResponse $) {
        this.dmtsClusterUri = $.dmtsClusterUri;
        this.gatewayObjectId = $.gatewayObjectId;
        this.gatewayResourceId = $.gatewayResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayDetailsResponse $;

        public Builder() {
            $ = new GatewayDetailsResponse();
        }

        public Builder(GatewayDetailsResponse defaults) {
            $ = new GatewayDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dmtsClusterUri Uri of the DMTS cluster.
         * 
         * @return builder
         * 
         */
        public Builder dmtsClusterUri(String dmtsClusterUri) {
            $.dmtsClusterUri = dmtsClusterUri;
            return this;
        }

        /**
         * @param gatewayObjectId Gateway object id from in the DMTS cluster for the gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder gatewayObjectId(String gatewayObjectId) {
            $.gatewayObjectId = gatewayObjectId;
            return this;
        }

        /**
         * @param gatewayResourceId Gateway resource to be associated with the server.
         * 
         * @return builder
         * 
         */
        public Builder gatewayResourceId(@Nullable String gatewayResourceId) {
            $.gatewayResourceId = gatewayResourceId;
            return this;
        }

        public GatewayDetailsResponse build() {
            $.dmtsClusterUri = Objects.requireNonNull($.dmtsClusterUri, "expected parameter 'dmtsClusterUri' to be non-null");
            $.gatewayObjectId = Objects.requireNonNull($.gatewayObjectId, "expected parameter 'gatewayObjectId' to be non-null");
            return $;
        }
    }

}
