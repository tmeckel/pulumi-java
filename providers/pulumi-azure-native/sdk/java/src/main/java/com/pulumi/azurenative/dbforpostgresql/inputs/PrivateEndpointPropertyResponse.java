// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointPropertyResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointPropertyResponse Empty = new PrivateEndpointPropertyResponse();

    /**
     * Resource id of the private endpoint.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource id of the private endpoint.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private PrivateEndpointPropertyResponse() {}

    private PrivateEndpointPropertyResponse(PrivateEndpointPropertyResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointPropertyResponse $;

        public Builder() {
            $ = new PrivateEndpointPropertyResponse();
        }

        public Builder(PrivateEndpointPropertyResponse defaults) {
            $ = new PrivateEndpointPropertyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource id of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public PrivateEndpointPropertyResponse build() {
            return $;
        }
    }

}
