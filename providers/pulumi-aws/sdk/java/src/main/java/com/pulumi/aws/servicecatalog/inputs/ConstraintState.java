// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConstraintState extends com.pulumi.resources.ResourceArgs {

    public static final ConstraintState Empty = new ConstraintState();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Description of the constraint.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the constraint.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Owner of the constraint.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Owner of the constraint.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Portfolio identifier.
     * 
     */
    @Import(name="portfolioId")
    private @Nullable Output<String> portfolioId;

    /**
     * @return Portfolio identifier.
     * 
     */
    public Optional<Output<String>> portfolioId() {
        return Optional.ofNullable(this.portfolioId);
    }

    /**
     * Product identifier.
     * 
     */
    @Import(name="productId")
    private @Nullable Output<String> productId;

    /**
     * @return Product identifier.
     * 
     */
    public Optional<Output<String>> productId() {
        return Optional.ofNullable(this.productId);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ConstraintState() {}

    private ConstraintState(ConstraintState $) {
        this.acceptLanguage = $.acceptLanguage;
        this.description = $.description;
        this.owner = $.owner;
        this.parameters = $.parameters;
        this.portfolioId = $.portfolioId;
        this.productId = $.productId;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConstraintState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConstraintState $;

        public Builder() {
            $ = new ConstraintState();
        }

        public Builder(ConstraintState defaults) {
            $ = new ConstraintState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        /**
         * @param description Description of the constraint.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the constraint.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param owner Owner of the constraint.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Owner of the constraint.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param parameters Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param portfolioId Portfolio identifier.
         * 
         * @return builder
         * 
         */
        public Builder portfolioId(@Nullable Output<String> portfolioId) {
            $.portfolioId = portfolioId;
            return this;
        }

        /**
         * @param portfolioId Portfolio identifier.
         * 
         * @return builder
         * 
         */
        public Builder portfolioId(String portfolioId) {
            return portfolioId(Output.of(portfolioId));
        }

        /**
         * @param productId Product identifier.
         * 
         * @return builder
         * 
         */
        public Builder productId(@Nullable Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId Product identifier.
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ConstraintState build() {
            return $;
        }
    }

}
