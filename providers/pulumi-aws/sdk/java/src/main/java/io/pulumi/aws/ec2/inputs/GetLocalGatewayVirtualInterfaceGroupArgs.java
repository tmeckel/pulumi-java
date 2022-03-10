// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewayVirtualInterfaceGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayVirtualInterfaceGroupArgs Empty = new GetLocalGatewayVirtualInterfaceGroupArgs();

    /**
     * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable List<GetLocalGatewayVirtualInterfaceGroupFilter> filters;

    public List<GetLocalGatewayVirtualInterfaceGroupFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * Identifier of EC2 Local Gateway Virtual Interface Group.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Identifier of EC2 Local Gateway.
     * 
     */
    @InputImport(name="localGatewayId")
      private final @Nullable String localGatewayId;

    public Optional<String> getLocalGatewayId() {
        return this.localGatewayId == null ? Optional.empty() : Optional.ofNullable(this.localGatewayId);
    }

    /**
     * Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetLocalGatewayVirtualInterfaceGroupArgs(
        @Nullable List<GetLocalGatewayVirtualInterfaceGroupFilter> filters,
        @Nullable String id,
        @Nullable String localGatewayId,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.localGatewayId = localGatewayId;
        this.tags = tags;
    }

    private GetLocalGatewayVirtualInterfaceGroupArgs() {
        this.filters = List.of();
        this.id = null;
        this.localGatewayId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayVirtualInterfaceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetLocalGatewayVirtualInterfaceGroupFilter> filters;
        private @Nullable String id;
        private @Nullable String localGatewayId;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayVirtualInterfaceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetLocalGatewayVirtualInterfaceGroupFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder localGatewayId(@Nullable String localGatewayId) {
            this.localGatewayId = localGatewayId;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetLocalGatewayVirtualInterfaceGroupArgs build() {
            return new GetLocalGatewayVirtualInterfaceGroupArgs(filters, id, localGatewayId, tags);
        }
    }
}
