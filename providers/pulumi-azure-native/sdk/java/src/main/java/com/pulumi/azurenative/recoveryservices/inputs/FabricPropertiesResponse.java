// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.AzureFabricSpecificDetailsResponse;
import com.pulumi.azurenative.recoveryservices.inputs.EncryptionDetailsResponse;
import com.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import com.pulumi.azurenative.recoveryservices.inputs.HyperVSiteDetailsResponse;
import com.pulumi.azurenative.recoveryservices.inputs.InMageRcmFabricSpecificDetailsResponse;
import com.pulumi.azurenative.recoveryservices.inputs.VMwareDetailsResponse;
import com.pulumi.azurenative.recoveryservices.inputs.VMwareV2FabricSpecificDetailsResponse;
import com.pulumi.azurenative.recoveryservices.inputs.VmmDetailsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Fabric properties.
 * 
 */
public final class FabricPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final FabricPropertiesResponse Empty = new FabricPropertiesResponse();

    /**
     * BCDR state of the fabric.
     * 
     */
    @Import(name="bcdrState")
    private @Nullable String bcdrState;

    /**
     * @return BCDR state of the fabric.
     * 
     */
    public Optional<String> bcdrState() {
        return Optional.ofNullable(this.bcdrState);
    }

    /**
     * Fabric specific settings.
     * 
     */
    @Import(name="customDetails")
    private @Nullable Object customDetails;

    /**
     * @return Fabric specific settings.
     * 
     */
    public Optional<Object> customDetails() {
        return Optional.ofNullable(this.customDetails);
    }

    /**
     * Encryption details for the fabric.
     * 
     */
    @Import(name="encryptionDetails")
    private @Nullable EncryptionDetailsResponse encryptionDetails;

    /**
     * @return Encryption details for the fabric.
     * 
     */
    public Optional<EncryptionDetailsResponse> encryptionDetails() {
        return Optional.ofNullable(this.encryptionDetails);
    }

    /**
     * Friendly name of the fabric.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable String friendlyName;

    /**
     * @return Friendly name of the fabric.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Health of fabric.
     * 
     */
    @Import(name="health")
    private @Nullable String health;

    /**
     * @return Health of fabric.
     * 
     */
    public Optional<String> health() {
        return Optional.ofNullable(this.health);
    }

    /**
     * Fabric health error details.
     * 
     */
    @Import(name="healthErrorDetails")
    private @Nullable List<HealthErrorResponse> healthErrorDetails;

    /**
     * @return Fabric health error details.
     * 
     */
    public Optional<List<HealthErrorResponse>> healthErrorDetails() {
        return Optional.ofNullable(this.healthErrorDetails);
    }

    /**
     * Dra Registration Id.
     * 
     */
    @Import(name="internalIdentifier")
    private @Nullable String internalIdentifier;

    /**
     * @return Dra Registration Id.
     * 
     */
    public Optional<String> internalIdentifier() {
        return Optional.ofNullable(this.internalIdentifier);
    }

    /**
     * Rollover encryption details for the fabric.
     * 
     */
    @Import(name="rolloverEncryptionDetails")
    private @Nullable EncryptionDetailsResponse rolloverEncryptionDetails;

    /**
     * @return Rollover encryption details for the fabric.
     * 
     */
    public Optional<EncryptionDetailsResponse> rolloverEncryptionDetails() {
        return Optional.ofNullable(this.rolloverEncryptionDetails);
    }

    private FabricPropertiesResponse() {}

    private FabricPropertiesResponse(FabricPropertiesResponse $) {
        this.bcdrState = $.bcdrState;
        this.customDetails = $.customDetails;
        this.encryptionDetails = $.encryptionDetails;
        this.friendlyName = $.friendlyName;
        this.health = $.health;
        this.healthErrorDetails = $.healthErrorDetails;
        this.internalIdentifier = $.internalIdentifier;
        this.rolloverEncryptionDetails = $.rolloverEncryptionDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FabricPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FabricPropertiesResponse $;

        public Builder() {
            $ = new FabricPropertiesResponse();
        }

        public Builder(FabricPropertiesResponse defaults) {
            $ = new FabricPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param bcdrState BCDR state of the fabric.
         * 
         * @return builder
         * 
         */
        public Builder bcdrState(@Nullable String bcdrState) {
            $.bcdrState = bcdrState;
            return this;
        }

        /**
         * @param customDetails Fabric specific settings.
         * 
         * @return builder
         * 
         */
        public Builder customDetails(@Nullable Object customDetails) {
            $.customDetails = customDetails;
            return this;
        }

        /**
         * @param encryptionDetails Encryption details for the fabric.
         * 
         * @return builder
         * 
         */
        public Builder encryptionDetails(@Nullable EncryptionDetailsResponse encryptionDetails) {
            $.encryptionDetails = encryptionDetails;
            return this;
        }

        /**
         * @param friendlyName Friendly name of the fabric.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable String friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param health Health of fabric.
         * 
         * @return builder
         * 
         */
        public Builder health(@Nullable String health) {
            $.health = health;
            return this;
        }

        /**
         * @param healthErrorDetails Fabric health error details.
         * 
         * @return builder
         * 
         */
        public Builder healthErrorDetails(@Nullable List<HealthErrorResponse> healthErrorDetails) {
            $.healthErrorDetails = healthErrorDetails;
            return this;
        }

        /**
         * @param healthErrorDetails Fabric health error details.
         * 
         * @return builder
         * 
         */
        public Builder healthErrorDetails(HealthErrorResponse... healthErrorDetails) {
            return healthErrorDetails(List.of(healthErrorDetails));
        }

        /**
         * @param internalIdentifier Dra Registration Id.
         * 
         * @return builder
         * 
         */
        public Builder internalIdentifier(@Nullable String internalIdentifier) {
            $.internalIdentifier = internalIdentifier;
            return this;
        }

        /**
         * @param rolloverEncryptionDetails Rollover encryption details for the fabric.
         * 
         * @return builder
         * 
         */
        public Builder rolloverEncryptionDetails(@Nullable EncryptionDetailsResponse rolloverEncryptionDetails) {
            $.rolloverEncryptionDetails = rolloverEncryptionDetails;
            return this;
        }

        public FabricPropertiesResponse build() {
            return $;
        }
    }

}
