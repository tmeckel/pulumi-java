// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PrivateEndpoint information.
 * 
 */
public final class PrivateEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointResponse Empty = new PrivateEndpointResponse();

    /**
     * The ARM identifier for Private Endpoint.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ARM identifier for Private Endpoint.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private PrivateEndpointResponse() {}

    private PrivateEndpointResponse(PrivateEndpointResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointResponse $;

        public Builder() {
            $ = new PrivateEndpointResponse();
        }

        public Builder(PrivateEndpointResponse defaults) {
            $ = new PrivateEndpointResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ARM identifier for Private Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public PrivateEndpointResponse build() {
            return $;
        }
    }

}
