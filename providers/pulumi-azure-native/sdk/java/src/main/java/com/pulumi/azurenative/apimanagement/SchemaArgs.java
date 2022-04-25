// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.enums.SchemaType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    /**
     * Free-form schema entity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Free-form schema entity description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schema id identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="schemaId")
    private @Nullable Output<String> schemaId;

    /**
     * @return Schema id identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Optional<Output<String>> schemaId() {
        return Optional.ofNullable(this.schemaId);
    }

    /**
     * Schema Type. Immutable.
     * 
     */
    @Import(name="schemaType", required=true)
    private Output<Either<String,SchemaType>> schemaType;

    /**
     * @return Schema Type. Immutable.
     * 
     */
    public Output<Either<String,SchemaType>> schemaType() {
        return this.schemaType;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Json-encoded string for non json-based schema.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Json-encoded string for non json-based schema.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SchemaArgs() {}

    private SchemaArgs(SchemaArgs $) {
        this.description = $.description;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaId = $.schemaId;
        this.schemaType = $.schemaType;
        this.serviceName = $.serviceName;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaArgs $;

        public Builder() {
            $ = new SchemaArgs();
        }

        public Builder(SchemaArgs defaults) {
            $ = new SchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Free-form schema entity description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Free-form schema entity description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param schemaId Schema id identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder schemaId(@Nullable Output<String> schemaId) {
            $.schemaId = schemaId;
            return this;
        }

        /**
         * @param schemaId Schema id identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder schemaId(String schemaId) {
            return schemaId(Output.of(schemaId));
        }

        /**
         * @param schemaType Schema Type. Immutable.
         * 
         * @return builder
         * 
         */
        public Builder schemaType(Output<Either<String,SchemaType>> schemaType) {
            $.schemaType = schemaType;
            return this;
        }

        /**
         * @param schemaType Schema Type. Immutable.
         * 
         * @return builder
         * 
         */
        public Builder schemaType(Either<String,SchemaType> schemaType) {
            return schemaType(Output.of(schemaType));
        }

        /**
         * @param schemaType Schema Type. Immutable.
         * 
         * @return builder
         * 
         */
        public Builder schemaType(String schemaType) {
            return schemaType(Either.ofLeft(schemaType));
        }

        /**
         * @param schemaType Schema Type. Immutable.
         * 
         * @return builder
         * 
         */
        public Builder schemaType(SchemaType schemaType) {
            return schemaType(Either.ofRight(schemaType));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param value Json-encoded string for non json-based schema.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Json-encoded string for non json-based schema.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SchemaArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.schemaType = Objects.requireNonNull($.schemaType, "expected parameter 'schemaType' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
