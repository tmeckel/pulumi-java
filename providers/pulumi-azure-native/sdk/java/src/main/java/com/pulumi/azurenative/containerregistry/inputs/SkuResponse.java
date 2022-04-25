// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The SKU of a container registry.
 * 
 */
public final class SkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * The SKU name of the container registry. Required for registry creation.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The SKU name of the container registry. Required for registry creation.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The SKU tier based on the SKU name.
     * 
     */
    @Import(name="tier", required=true)
    private String tier;

    /**
     * @return The SKU tier based on the SKU name.
     * 
     */
    public String tier() {
        return this.tier;
    }

    private SkuResponse() {}

    private SkuResponse(SkuResponse $) {
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuResponse $;

        public Builder() {
            $ = new SkuResponse();
        }

        public Builder(SkuResponse defaults) {
            $ = new SkuResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The SKU name of the container registry. Required for registry creation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tier The SKU tier based on the SKU name.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            $.tier = tier;
            return this;
        }

        public SkuResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            return $;
        }
    }

}
