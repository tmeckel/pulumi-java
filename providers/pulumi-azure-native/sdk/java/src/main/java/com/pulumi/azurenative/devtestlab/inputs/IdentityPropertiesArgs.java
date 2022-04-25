// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.ManagedIdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a managed identity
 * 
 */
public final class IdentityPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityPropertiesArgs Empty = new IdentityPropertiesArgs();

    /**
     * The client secret URL of the identity.
     * 
     */
    @Import(name="clientSecretUrl")
    private @Nullable Output<String> clientSecretUrl;

    /**
     * @return The client secret URL of the identity.
     * 
     */
    public Optional<Output<String>> clientSecretUrl() {
        return Optional.ofNullable(this.clientSecretUrl);
    }

    /**
     * The principal id of resource identity.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The principal id of resource identity.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The tenant identifier of resource.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenant identifier of resource.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Managed identity.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,ManagedIdentityType>> type;

    /**
     * @return Managed identity.
     * 
     */
    public Optional<Output<Either<String,ManagedIdentityType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private IdentityPropertiesArgs() {}

    private IdentityPropertiesArgs(IdentityPropertiesArgs $) {
        this.clientSecretUrl = $.clientSecretUrl;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityPropertiesArgs $;

        public Builder() {
            $ = new IdentityPropertiesArgs();
        }

        public Builder(IdentityPropertiesArgs defaults) {
            $ = new IdentityPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientSecretUrl The client secret URL of the identity.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretUrl(@Nullable Output<String> clientSecretUrl) {
            $.clientSecretUrl = clientSecretUrl;
            return this;
        }

        /**
         * @param clientSecretUrl The client secret URL of the identity.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretUrl(String clientSecretUrl) {
            return clientSecretUrl(Output.of(clientSecretUrl));
        }

        /**
         * @param principalId The principal id of resource identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The principal id of resource identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The tenant identifier of resource.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant identifier of resource.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Managed identity.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,ManagedIdentityType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Managed identity.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ManagedIdentityType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Managed identity.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Managed identity.
         * 
         * @return builder
         * 
         */
        public Builder type(ManagedIdentityType type) {
            return type(Either.ofRight(type));
        }

        public IdentityPropertiesArgs build() {
            return $;
        }
    }

}
