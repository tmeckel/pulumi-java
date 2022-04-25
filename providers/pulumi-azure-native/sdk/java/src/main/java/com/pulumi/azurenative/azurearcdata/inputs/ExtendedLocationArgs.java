// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.azurenative.azurearcdata.enums.ExtendedLocationTypes;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The complex type of the extended location.
 * 
 */
public final class ExtendedLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExtendedLocationArgs Empty = new ExtendedLocationArgs();

    /**
     * The name of the extended location.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the extended location.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of the extended location.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,ExtendedLocationTypes>> type;

    /**
     * @return The type of the extended location.
     * 
     */
    public Optional<Output<Either<String,ExtendedLocationTypes>>> type() {
        return Optional.ofNullable(this.type);
    }

    private ExtendedLocationArgs() {}

    private ExtendedLocationArgs(ExtendedLocationArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtendedLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtendedLocationArgs $;

        public Builder() {
            $ = new ExtendedLocationArgs();
        }

        public Builder(ExtendedLocationArgs defaults) {
            $ = new ExtendedLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the extended location.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the extended location.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of the extended location.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,ExtendedLocationTypes>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the extended location.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ExtendedLocationTypes> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of the extended location.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of the extended location.
         * 
         * @return builder
         * 
         */
        public Builder type(ExtendedLocationTypes type) {
            return type(Either.ofRight(type));
        }

        public ExtendedLocationArgs build() {
            return $;
        }
    }

}
