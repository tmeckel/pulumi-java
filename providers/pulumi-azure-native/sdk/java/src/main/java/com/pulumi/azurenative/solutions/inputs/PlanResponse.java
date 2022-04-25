// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Plan for the managed application.
 * 
 */
public final class PlanResponse extends com.pulumi.resources.InvokeArgs {

    public static final PlanResponse Empty = new PlanResponse();

    /**
     * The plan name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The plan name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The product code.
     * 
     */
    @Import(name="product", required=true)
    private String product;

    /**
     * @return The product code.
     * 
     */
    public String product() {
        return this.product;
    }

    /**
     * The promotion code.
     * 
     */
    @Import(name="promotionCode")
    private @Nullable String promotionCode;

    /**
     * @return The promotion code.
     * 
     */
    public Optional<String> promotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }

    /**
     * The publisher ID.
     * 
     */
    @Import(name="publisher", required=true)
    private String publisher;

    /**
     * @return The publisher ID.
     * 
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * The plan&#39;s version.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return The plan&#39;s version.
     * 
     */
    public String version() {
        return this.version;
    }

    private PlanResponse() {}

    private PlanResponse(PlanResponse $) {
        this.name = $.name;
        this.product = $.product;
        this.promotionCode = $.promotionCode;
        this.publisher = $.publisher;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlanResponse $;

        public Builder() {
            $ = new PlanResponse();
        }

        public Builder(PlanResponse defaults) {
            $ = new PlanResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The plan name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param product The product code.
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            $.product = product;
            return this;
        }

        /**
         * @param promotionCode The promotion code.
         * 
         * @return builder
         * 
         */
        public Builder promotionCode(@Nullable String promotionCode) {
            $.promotionCode = promotionCode;
            return this;
        }

        /**
         * @param publisher The publisher ID.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param version The plan&#39;s version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public PlanResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.product = Objects.requireNonNull($.product, "expected parameter 'product' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
