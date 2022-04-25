// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRouteTableArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteTableArgs Empty = new GetRouteTableArgs();

    /**
     * The route table ID.
     * 
     */
    @Import(name="routeTableId", required=true)
    private String routeTableId;

    /**
     * @return The route table ID.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }

    private GetRouteTableArgs() {}

    private GetRouteTableArgs(GetRouteTableArgs $) {
        this.routeTableId = $.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteTableArgs $;

        public Builder() {
            $ = new GetRouteTableArgs();
        }

        public Builder(GetRouteTableArgs defaults) {
            $ = new GetRouteTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routeTableId The route table ID.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(String routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        public GetRouteTableArgs build() {
            $.routeTableId = Objects.requireNonNull($.routeTableId, "expected parameter 'routeTableId' to be non-null");
            return $;
        }
    }

}
