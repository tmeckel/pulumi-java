// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPortfolioConstraintsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPortfolioConstraintsArgs Empty = new GetPortfolioConstraintsArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable String acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Optional<String> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Portfolio identifier.
     * 
     */
    @Import(name="portfolioId", required=true)
    private String portfolioId;

    /**
     * @return Portfolio identifier.
     * 
     */
    public String portfolioId() {
        return this.portfolioId;
    }

    /**
     * Product identifier.
     * 
     */
    @Import(name="productId")
    private @Nullable String productId;

    /**
     * @return Product identifier.
     * 
     */
    public Optional<String> productId() {
        return Optional.ofNullable(this.productId);
    }

    private GetPortfolioConstraintsArgs() {}

    private GetPortfolioConstraintsArgs(GetPortfolioConstraintsArgs $) {
        this.acceptLanguage = $.acceptLanguage;
        this.portfolioId = $.portfolioId;
        this.productId = $.productId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPortfolioConstraintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPortfolioConstraintsArgs $;

        public Builder() {
            $ = new GetPortfolioConstraintsArgs();
        }

        public Builder(GetPortfolioConstraintsArgs defaults) {
            $ = new GetPortfolioConstraintsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param portfolioId Portfolio identifier.
         * 
         * @return builder
         * 
         */
        public Builder portfolioId(String portfolioId) {
            $.portfolioId = portfolioId;
            return this;
        }

        /**
         * @param productId Product identifier.
         * 
         * @return builder
         * 
         */
        public Builder productId(@Nullable String productId) {
            $.productId = productId;
            return this;
        }

        public GetPortfolioConstraintsArgs build() {
            $.portfolioId = Objects.requireNonNull($.portfolioId, "expected parameter 'portfolioId' to be non-null");
            return $;
        }
    }

}
