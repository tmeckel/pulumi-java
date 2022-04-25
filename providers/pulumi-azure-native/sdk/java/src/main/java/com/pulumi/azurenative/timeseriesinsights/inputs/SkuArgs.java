// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.azurenative.timeseriesinsights.enums.SkuName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The capacity of the sku. For Gen1 environments, this value can be changed to support scale out of environments after they have been created.
     * 
     */
    @Import(name="capacity", required=true)
    private Output<Integer> capacity;

    /**
     * @return The capacity of the sku. For Gen1 environments, this value can be changed to support scale out of environments after they have been created.
     * 
     */
    public Output<Integer> capacity() {
        return this.capacity;
    }

    /**
     * The name of this SKU.
     * 
     */
    @Import(name="name", required=true)
    private Output<Either<String,SkuName>> name;

    /**
     * @return The name of this SKU.
     * 
     */
    public Output<Either<String,SkuName>> name() {
        return this.name;
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.capacity = $.capacity;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuArgs $;

        public Builder() {
            $ = new SkuArgs();
        }

        public Builder(SkuArgs defaults) {
            $ = new SkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The capacity of the sku. For Gen1 environments, this value can be changed to support scale out of environments after they have been created.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The capacity of the sku. For Gen1 environments, this value can be changed to support scale out of environments after they have been created.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param name The name of this SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<Either<String,SkuName>> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(Either<String,SkuName> name) {
            return name(Output.of(name));
        }

        /**
         * @param name The name of this SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Either.ofLeft(name));
        }

        /**
         * @param name The name of this SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(SkuName name) {
            return name(Either.ofRight(name));
        }

        public SkuArgs build() {
            $.capacity = Objects.requireNonNull($.capacity, "expected parameter 'capacity' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
