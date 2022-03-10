// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetCoipPoolsFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCoipPoolsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCoipPoolsArgs Empty = new GetCoipPoolsArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable List<GetCoipPoolsFilter> filters;

    public List<GetCoipPoolsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired aws_ec2_coip_pools.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetCoipPoolsArgs(
        @Nullable List<GetCoipPoolsFilter> filters,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.tags = tags;
    }

    private GetCoipPoolsArgs() {
        this.filters = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoipPoolsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetCoipPoolsFilter> filters;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoipPoolsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetCoipPoolsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetCoipPoolsArgs build() {
            return new GetCoipPoolsArgs(filters, tags);
        }
    }
}
