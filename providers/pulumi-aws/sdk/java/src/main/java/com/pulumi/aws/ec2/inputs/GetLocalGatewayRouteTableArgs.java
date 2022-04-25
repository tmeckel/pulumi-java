// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewayRouteTableArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayRouteTableArgs Empty = new GetLocalGatewayRouteTableArgs();

    @Import(name="filters")
    private @Nullable List<GetLocalGatewayRouteTableFilter> filters;

    public Optional<List<GetLocalGatewayRouteTableFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The id of the specific local gateway route table to retrieve.
     * 
     */
    @Import(name="localGatewayId")
    private @Nullable String localGatewayId;

    /**
     * @return The id of the specific local gateway route table to retrieve.
     * 
     */
    public Optional<String> localGatewayId() {
        return Optional.ofNullable(this.localGatewayId);
    }

    /**
     * Local Gateway Route Table Id assigned to desired local gateway route table
     * 
     */
    @Import(name="localGatewayRouteTableId")
    private @Nullable String localGatewayRouteTableId;

    /**
     * @return Local Gateway Route Table Id assigned to desired local gateway route table
     * 
     */
    public Optional<String> localGatewayRouteTableId() {
        return Optional.ofNullable(this.localGatewayRouteTableId);
    }

    /**
     * The arn of the Outpost the local gateway route table is associated with.
     * 
     */
    @Import(name="outpostArn")
    private @Nullable String outpostArn;

    /**
     * @return The arn of the Outpost the local gateway route table is associated with.
     * 
     */
    public Optional<String> outpostArn() {
        return Optional.ofNullable(this.outpostArn);
    }

    /**
     * The state of the local gateway route table.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The state of the local gateway route table.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired local gateway route table.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A mapping of tags, each pair of which must exactly match
     * a pair on the desired local gateway route table.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLocalGatewayRouteTableArgs() {}

    private GetLocalGatewayRouteTableArgs(GetLocalGatewayRouteTableArgs $) {
        this.filters = $.filters;
        this.localGatewayId = $.localGatewayId;
        this.localGatewayRouteTableId = $.localGatewayRouteTableId;
        this.outpostArn = $.outpostArn;
        this.state = $.state;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocalGatewayRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocalGatewayRouteTableArgs $;

        public Builder() {
            $ = new GetLocalGatewayRouteTableArgs();
        }

        public Builder(GetLocalGatewayRouteTableArgs defaults) {
            $ = new GetLocalGatewayRouteTableArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetLocalGatewayRouteTableFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetLocalGatewayRouteTableFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param localGatewayId The id of the specific local gateway route table to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayId(@Nullable String localGatewayId) {
            $.localGatewayId = localGatewayId;
            return this;
        }

        /**
         * @param localGatewayRouteTableId Local Gateway Route Table Id assigned to desired local gateway route table
         * 
         * @return builder
         * 
         */
        public Builder localGatewayRouteTableId(@Nullable String localGatewayRouteTableId) {
            $.localGatewayRouteTableId = localGatewayRouteTableId;
            return this;
        }

        /**
         * @param outpostArn The arn of the Outpost the local gateway route table is associated with.
         * 
         * @return builder
         * 
         */
        public Builder outpostArn(@Nullable String outpostArn) {
            $.outpostArn = outpostArn;
            return this;
        }

        /**
         * @param state The state of the local gateway route table.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param tags A mapping of tags, each pair of which must exactly match
         * a pair on the desired local gateway route table.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetLocalGatewayRouteTableArgs build() {
            return $;
        }
    }

}
