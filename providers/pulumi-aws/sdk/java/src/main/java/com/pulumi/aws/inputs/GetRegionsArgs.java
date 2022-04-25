// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.aws.inputs.GetRegionsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionsArgs Empty = new GetRegionsArgs();

    /**
     * If true the source will query all regions regardless of availability.
     * 
     */
    @Import(name="allRegions")
    private @Nullable Boolean allRegions;

    /**
     * @return If true the source will query all regions regardless of availability.
     * 
     */
    public Optional<Boolean> allRegions() {
        return Optional.ofNullable(this.allRegions);
    }

    /**
     * Configuration block(s) to use as filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetRegionsFilter> filters;

    /**
     * @return Configuration block(s) to use as filters. Detailed below.
     * 
     */
    public Optional<List<GetRegionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetRegionsArgs() {}

    private GetRegionsArgs(GetRegionsArgs $) {
        this.allRegions = $.allRegions;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionsArgs $;

        public Builder() {
            $ = new GetRegionsArgs();
        }

        public Builder(GetRegionsArgs defaults) {
            $ = new GetRegionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allRegions If true the source will query all regions regardless of availability.
         * 
         * @return builder
         * 
         */
        public Builder allRegions(@Nullable Boolean allRegions) {
            $.allRegions = allRegions;
            return this;
        }

        /**
         * @param filters Configuration block(s) to use as filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetRegionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) to use as filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetRegionsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetRegionsArgs build() {
            return $;
        }
    }

}
