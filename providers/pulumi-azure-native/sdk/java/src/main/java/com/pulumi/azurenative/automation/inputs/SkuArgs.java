// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.enums.SkuNameEnum;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The account SKU.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * Gets or sets the SKU capacity.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return Gets or sets the SKU capacity.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Gets or sets the SKU family.
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    /**
     * @return Gets or sets the SKU family.
     * 
     */
    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * Gets or sets the SKU name of the account.
     * 
     */
    @Import(name="name", required=true)
    private Output<Either<String,SkuNameEnum>> name;

    /**
     * @return Gets or sets the SKU name of the account.
     * 
     */
    public Output<Either<String,SkuNameEnum>> name() {
        return this.name;
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.capacity = $.capacity;
        this.family = $.family;
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
         * @param capacity Gets or sets the SKU capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity Gets or sets the SKU capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param family Gets or sets the SKU family.
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family Gets or sets the SKU family.
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param name Gets or sets the SKU name of the account.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<Either<String,SkuNameEnum>> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Gets or sets the SKU name of the account.
         * 
         * @return builder
         * 
         */
        public Builder name(Either<String,SkuNameEnum> name) {
            return name(Output.of(name));
        }

        /**
         * @param name Gets or sets the SKU name of the account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Either.ofLeft(name));
        }

        /**
         * @param name Gets or sets the SKU name of the account.
         * 
         * @return builder
         * 
         */
        public Builder name(SkuNameEnum name) {
            return name(Either.ofRight(name));
        }

        public SkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
