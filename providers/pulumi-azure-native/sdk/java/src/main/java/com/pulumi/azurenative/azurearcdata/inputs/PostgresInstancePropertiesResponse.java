// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.azurenative.azurearcdata.inputs.BasicLoginInformationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Postgres Instance properties.
 * 
 */
public final class PostgresInstancePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PostgresInstancePropertiesResponse Empty = new PostgresInstancePropertiesResponse();

    /**
     * The instance admin
     * 
     */
    @Import(name="admin")
    private @Nullable String admin;

    /**
     * @return The instance admin
     * 
     */
    public Optional<String> admin() {
        return Optional.ofNullable(this.admin);
    }

    /**
     * Username and password for basic authentication.
     * 
     */
    @Import(name="basicLoginInformation")
    private @Nullable BasicLoginInformationResponse basicLoginInformation;

    /**
     * @return Username and password for basic authentication.
     * 
     */
    public Optional<BasicLoginInformationResponse> basicLoginInformation() {
        return Optional.ofNullable(this.basicLoginInformation);
    }

    /**
     * The data controller id
     * 
     */
    @Import(name="dataControllerId")
    private @Nullable String dataControllerId;

    /**
     * @return The data controller id
     * 
     */
    public Optional<String> dataControllerId() {
        return Optional.ofNullable(this.dataControllerId);
    }

    /**
     * The raw kubernetes information
     * 
     */
    @Import(name="k8sRaw")
    private @Nullable Object k8sRaw;

    /**
     * @return The raw kubernetes information
     * 
     */
    public Optional<Object> k8sRaw() {
        return Optional.ofNullable(this.k8sRaw);
    }

    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    @Import(name="lastUploadedDate")
    private @Nullable String lastUploadedDate;

    /**
     * @return Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    public Optional<String> lastUploadedDate() {
        return Optional.ofNullable(this.lastUploadedDate);
    }

    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    private PostgresInstancePropertiesResponse() {}

    private PostgresInstancePropertiesResponse(PostgresInstancePropertiesResponse $) {
        this.admin = $.admin;
        this.basicLoginInformation = $.basicLoginInformation;
        this.dataControllerId = $.dataControllerId;
        this.k8sRaw = $.k8sRaw;
        this.lastUploadedDate = $.lastUploadedDate;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PostgresInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostgresInstancePropertiesResponse $;

        public Builder() {
            $ = new PostgresInstancePropertiesResponse();
        }

        public Builder(PostgresInstancePropertiesResponse defaults) {
            $ = new PostgresInstancePropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param admin The instance admin
         * 
         * @return builder
         * 
         */
        public Builder admin(@Nullable String admin) {
            $.admin = admin;
            return this;
        }

        /**
         * @param basicLoginInformation Username and password for basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder basicLoginInformation(@Nullable BasicLoginInformationResponse basicLoginInformation) {
            $.basicLoginInformation = basicLoginInformation;
            return this;
        }

        /**
         * @param dataControllerId The data controller id
         * 
         * @return builder
         * 
         */
        public Builder dataControllerId(@Nullable String dataControllerId) {
            $.dataControllerId = dataControllerId;
            return this;
        }

        /**
         * @param k8sRaw The raw kubernetes information
         * 
         * @return builder
         * 
         */
        public Builder k8sRaw(@Nullable Object k8sRaw) {
            $.k8sRaw = k8sRaw;
            return this;
        }

        /**
         * @param lastUploadedDate Last uploaded date from Kubernetes cluster. Defaults to current date time
         * 
         * @return builder
         * 
         */
        public Builder lastUploadedDate(@Nullable String lastUploadedDate) {
            $.lastUploadedDate = lastUploadedDate;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public PostgresInstancePropertiesResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
