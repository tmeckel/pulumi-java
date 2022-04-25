// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The ID of the ExpressRouteConnection.
 * 
 */
public final class ExpressRouteConnectionIdResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExpressRouteConnectionIdResponse Empty = new ExpressRouteConnectionIdResponse();

    /**
     * The ID of the ExpressRouteConnection.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the ExpressRouteConnection.
     * 
     */
    public String id() {
        return this.id;
    }

    private ExpressRouteConnectionIdResponse() {}

    private ExpressRouteConnectionIdResponse(ExpressRouteConnectionIdResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteConnectionIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteConnectionIdResponse $;

        public Builder() {
            $ = new ExpressRouteConnectionIdResponse();
        }

        public Builder(ExpressRouteConnectionIdResponse defaults) {
            $ = new ExpressRouteConnectionIdResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the ExpressRouteConnection.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public ExpressRouteConnectionIdResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
