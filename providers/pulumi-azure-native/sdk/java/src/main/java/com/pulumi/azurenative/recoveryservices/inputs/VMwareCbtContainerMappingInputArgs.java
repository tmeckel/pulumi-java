// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMwareCbt container mapping input.
 * 
 */
public final class VMwareCbtContainerMappingInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMwareCbtContainerMappingInputArgs Empty = new VMwareCbtContainerMappingInputArgs();

    /**
     * The class type.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The class type.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The target key vault ARM Id.
     * 
     */
    @Import(name="keyVaultId", required=true)
    private Output<String> keyVaultId;

    /**
     * @return The target key vault ARM Id.
     * 
     */
    public Output<String> keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * The target key vault URL.
     * 
     */
    @Import(name="keyVaultUri", required=true)
    private Output<String> keyVaultUri;

    /**
     * @return The target key vault URL.
     * 
     */
    public Output<String> keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * The secret name of the service bus connection string.
     * 
     */
    @Import(name="serviceBusConnectionStringSecretName", required=true)
    private Output<String> serviceBusConnectionStringSecretName;

    /**
     * @return The secret name of the service bus connection string.
     * 
     */
    public Output<String> serviceBusConnectionStringSecretName() {
        return this.serviceBusConnectionStringSecretName;
    }

    /**
     * The storage account ARM Id.
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    /**
     * @return The storage account ARM Id.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * The secret name of the storage account.
     * 
     */
    @Import(name="storageAccountSasSecretName", required=true)
    private Output<String> storageAccountSasSecretName;

    /**
     * @return The secret name of the storage account.
     * 
     */
    public Output<String> storageAccountSasSecretName() {
        return this.storageAccountSasSecretName;
    }

    /**
     * The target location.
     * 
     */
    @Import(name="targetLocation", required=true)
    private Output<String> targetLocation;

    /**
     * @return The target location.
     * 
     */
    public Output<String> targetLocation() {
        return this.targetLocation;
    }

    private VMwareCbtContainerMappingInputArgs() {}

    private VMwareCbtContainerMappingInputArgs(VMwareCbtContainerMappingInputArgs $) {
        this.instanceType = $.instanceType;
        this.keyVaultId = $.keyVaultId;
        this.keyVaultUri = $.keyVaultUri;
        this.serviceBusConnectionStringSecretName = $.serviceBusConnectionStringSecretName;
        this.storageAccountId = $.storageAccountId;
        this.storageAccountSasSecretName = $.storageAccountSasSecretName;
        this.targetLocation = $.targetLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareCbtContainerMappingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareCbtContainerMappingInputArgs $;

        public Builder() {
            $ = new VMwareCbtContainerMappingInputArgs();
        }

        public Builder(VMwareCbtContainerMappingInputArgs defaults) {
            $ = new VMwareCbtContainerMappingInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType The class type.
         * Expected value is &#39;VMwareCbt&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The class type.
         * Expected value is &#39;VMwareCbt&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param keyVaultId The target key vault ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The target key vault ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param keyVaultUri The target key vault URL.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(Output<String> keyVaultUri) {
            $.keyVaultUri = keyVaultUri;
            return this;
        }

        /**
         * @param keyVaultUri The target key vault URL.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(String keyVaultUri) {
            return keyVaultUri(Output.of(keyVaultUri));
        }

        /**
         * @param serviceBusConnectionStringSecretName The secret name of the service bus connection string.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusConnectionStringSecretName(Output<String> serviceBusConnectionStringSecretName) {
            $.serviceBusConnectionStringSecretName = serviceBusConnectionStringSecretName;
            return this;
        }

        /**
         * @param serviceBusConnectionStringSecretName The secret name of the service bus connection string.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusConnectionStringSecretName(String serviceBusConnectionStringSecretName) {
            return serviceBusConnectionStringSecretName(Output.of(serviceBusConnectionStringSecretName));
        }

        /**
         * @param storageAccountId The storage account ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The storage account ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        /**
         * @param storageAccountSasSecretName The secret name of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountSasSecretName(Output<String> storageAccountSasSecretName) {
            $.storageAccountSasSecretName = storageAccountSasSecretName;
            return this;
        }

        /**
         * @param storageAccountSasSecretName The secret name of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountSasSecretName(String storageAccountSasSecretName) {
            return storageAccountSasSecretName(Output.of(storageAccountSasSecretName));
        }

        /**
         * @param targetLocation The target location.
         * 
         * @return builder
         * 
         */
        public Builder targetLocation(Output<String> targetLocation) {
            $.targetLocation = targetLocation;
            return this;
        }

        /**
         * @param targetLocation The target location.
         * 
         * @return builder
         * 
         */
        public Builder targetLocation(String targetLocation) {
            return targetLocation(Output.of(targetLocation));
        }

        public VMwareCbtContainerMappingInputArgs build() {
            $.instanceType = Codegen.stringProp("instanceType").output().arg($.instanceType).getNullable();
            $.keyVaultId = Objects.requireNonNull($.keyVaultId, "expected parameter 'keyVaultId' to be non-null");
            $.keyVaultUri = Objects.requireNonNull($.keyVaultUri, "expected parameter 'keyVaultUri' to be non-null");
            $.serviceBusConnectionStringSecretName = Objects.requireNonNull($.serviceBusConnectionStringSecretName, "expected parameter 'serviceBusConnectionStringSecretName' to be non-null");
            $.storageAccountId = Objects.requireNonNull($.storageAccountId, "expected parameter 'storageAccountId' to be non-null");
            $.storageAccountSasSecretName = Objects.requireNonNull($.storageAccountSasSecretName, "expected parameter 'storageAccountSasSecretName' to be non-null");
            $.targetLocation = Objects.requireNonNull($.targetLocation, "expected parameter 'targetLocation' to be non-null");
            return $;
        }
    }

}
