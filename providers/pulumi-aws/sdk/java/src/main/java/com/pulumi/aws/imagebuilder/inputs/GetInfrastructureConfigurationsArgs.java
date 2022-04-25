// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInfrastructureConfigurationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureConfigurationsArgs Empty = new GetInfrastructureConfigurationsArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetInfrastructureConfigurationsFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<List<GetInfrastructureConfigurationsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetInfrastructureConfigurationsArgs() {}

    private GetInfrastructureConfigurationsArgs(GetInfrastructureConfigurationsArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfrastructureConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfrastructureConfigurationsArgs $;

        public Builder() {
            $ = new GetInfrastructureConfigurationsArgs();
        }

        public Builder(GetInfrastructureConfigurationsArgs defaults) {
            $ = new GetInfrastructureConfigurationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetInfrastructureConfigurationsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetInfrastructureConfigurationsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetInfrastructureConfigurationsArgs build() {
            return $;
        }
    }

}
