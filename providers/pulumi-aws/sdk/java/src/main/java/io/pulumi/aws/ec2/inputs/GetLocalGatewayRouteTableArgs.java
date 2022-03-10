// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewayRouteTableArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayRouteTableArgs Empty = new GetLocalGatewayRouteTableArgs();

    @InputImport(name="filters")
      private final @Nullable List<GetLocalGatewayRouteTableFilter> filters;

    public List<GetLocalGatewayRouteTableFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The id of the specific local gateway route table to retrieve.
     * 
     */
    @InputImport(name="localGatewayId")
      private final @Nullable String localGatewayId;

    public Optional<String> getLocalGatewayId() {
        return this.localGatewayId == null ? Optional.empty() : Optional.ofNullable(this.localGatewayId);
    }

    /**
     * Local Gateway Route Table Id assigned to desired local gateway route table
     * 
     */
    @InputImport(name="localGatewayRouteTableId")
      private final @Nullable String localGatewayRouteTableId;

    public Optional<String> getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId == null ? Optional.empty() : Optional.ofNullable(this.localGatewayRouteTableId);
    }

    /**
     * The arn of the Outpost the local gateway route table is associated with.
     * 
     */
    @InputImport(name="outpostArn")
      private final @Nullable String outpostArn;

    public Optional<String> getOutpostArn() {
        return this.outpostArn == null ? Optional.empty() : Optional.ofNullable(this.outpostArn);
    }

    /**
     * The state of the local gateway route table.
     * 
     */
    @InputImport(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired local gateway route table.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetLocalGatewayRouteTableArgs(
        @Nullable List<GetLocalGatewayRouteTableFilter> filters,
        @Nullable String localGatewayId,
        @Nullable String localGatewayRouteTableId,
        @Nullable String outpostArn,
        @Nullable String state,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.localGatewayId = localGatewayId;
        this.localGatewayRouteTableId = localGatewayRouteTableId;
        this.outpostArn = outpostArn;
        this.state = state;
        this.tags = tags;
    }

    private GetLocalGatewayRouteTableArgs() {
        this.filters = List.of();
        this.localGatewayId = null;
        this.localGatewayRouteTableId = null;
        this.outpostArn = null;
        this.state = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetLocalGatewayRouteTableFilter> filters;
        private @Nullable String localGatewayId;
        private @Nullable String localGatewayRouteTableId;
        private @Nullable String outpostArn;
        private @Nullable String state;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayRouteTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.localGatewayRouteTableId = defaults.localGatewayRouteTableId;
    	      this.outpostArn = defaults.outpostArn;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetLocalGatewayRouteTableFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder localGatewayId(@Nullable String localGatewayId) {
            this.localGatewayId = localGatewayId;
            return this;
        }

        public Builder localGatewayRouteTableId(@Nullable String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = localGatewayRouteTableId;
            return this;
        }

        public Builder outpostArn(@Nullable String outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetLocalGatewayRouteTableArgs build() {
            return new GetLocalGatewayRouteTableArgs(filters, localGatewayId, localGatewayRouteTableId, outpostArn, state, tags);
        }
    }
}
