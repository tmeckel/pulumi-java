// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.azurenative.servicefabricmesh.inputs.EndpointRefResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a network reference in a service.
 * 
 */
public final class NetworkRefResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkRefResponse Empty = new NetworkRefResponse();

    /**
     * A list of endpoints that are exposed on this network.
     * 
     */
    @Import(name="endpointRefs")
    private @Nullable List<EndpointRefResponse> endpointRefs;

    /**
     * @return A list of endpoints that are exposed on this network.
     * 
     */
    public Optional<List<EndpointRefResponse>> endpointRefs() {
        return Optional.ofNullable(this.endpointRefs);
    }

    /**
     * Name of the network
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the network
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private NetworkRefResponse() {}

    private NetworkRefResponse(NetworkRefResponse $) {
        this.endpointRefs = $.endpointRefs;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkRefResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkRefResponse $;

        public Builder() {
            $ = new NetworkRefResponse();
        }

        public Builder(NetworkRefResponse defaults) {
            $ = new NetworkRefResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointRefs A list of endpoints that are exposed on this network.
         * 
         * @return builder
         * 
         */
        public Builder endpointRefs(@Nullable List<EndpointRefResponse> endpointRefs) {
            $.endpointRefs = endpointRefs;
            return this;
        }

        /**
         * @param endpointRefs A list of endpoints that are exposed on this network.
         * 
         * @return builder
         * 
         */
        public Builder endpointRefs(EndpointRefResponse... endpointRefs) {
            return endpointRefs(List.of(endpointRefs));
        }

        /**
         * @param name Name of the network
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public NetworkRefResponse build() {
            return $;
        }
    }

}
