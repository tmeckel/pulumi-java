// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformariadb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Billing information related properties of a server.
 * 
 */
public final class SkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * The scale up/out capacity, representing server&#39;s compute units.
     * 
     */
    @Import(name="capacity")
    private @Nullable Integer capacity;

    /**
     * @return The scale up/out capacity, representing server&#39;s compute units.
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The family of hardware.
     * 
     */
    @Import(name="family")
    private @Nullable String family;

    /**
     * @return The family of hardware.
     * 
     */
    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The size code, to be interpreted by resource as appropriate.
     * 
     */
    @Import(name="size")
    private @Nullable String size;

    /**
     * @return The size code, to be interpreted by resource as appropriate.
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The tier of the particular SKU, e.g. Basic.
     * 
     */
    @Import(name="tier")
    private @Nullable String tier;

    /**
     * @return The tier of the particular SKU, e.g. Basic.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    private SkuResponse() {}

    private SkuResponse(SkuResponse $) {
        this.capacity = $.capacity;
        this.family = $.family;
        this.name = $.name;
        this.size = $.size;
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
         * @param capacity The scale up/out capacity, representing server&#39;s compute units.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Integer capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param family The family of hardware.
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable String family) {
            $.family = family;
            return this;
        }

        /**
         * @param name The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param size The size code, to be interpreted by resource as appropriate.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable String size) {
            $.size = size;
            return this;
        }

        /**
         * @param tier The tier of the particular SKU, e.g. Basic.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable String tier) {
            $.tier = tier;
            return this;
        }

        public SkuResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
