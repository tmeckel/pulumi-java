// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.outputs;

import com.pulumi.azurenative.azurearcdata.outputs.BasicLoginInformationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PostgresInstancePropertiesResponse {
    /**
     * @return The instance admin
     * 
     */
    private final @Nullable String admin;
    /**
     * @return Username and password for basic authentication.
     * 
     */
    private final @Nullable BasicLoginInformationResponse basicLoginInformation;
    /**
     * @return The data controller id
     * 
     */
    private final @Nullable String dataControllerId;
    /**
     * @return The raw kubernetes information
     * 
     */
    private final @Nullable Object k8sRaw;
    /**
     * @return Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    private final @Nullable String lastUploadedDate;
    private final String provisioningState;

    @CustomType.Constructor
    private PostgresInstancePropertiesResponse(
        @CustomType.Parameter("admin") @Nullable String admin,
        @CustomType.Parameter("basicLoginInformation") @Nullable BasicLoginInformationResponse basicLoginInformation,
        @CustomType.Parameter("dataControllerId") @Nullable String dataControllerId,
        @CustomType.Parameter("k8sRaw") @Nullable Object k8sRaw,
        @CustomType.Parameter("lastUploadedDate") @Nullable String lastUploadedDate,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.admin = admin;
        this.basicLoginInformation = basicLoginInformation;
        this.dataControllerId = dataControllerId;
        this.k8sRaw = k8sRaw;
        this.lastUploadedDate = lastUploadedDate;
        this.provisioningState = provisioningState;
    }

    /**
     * @return The instance admin
     * 
     */
    public Optional<String> admin() {
        return Optional.ofNullable(this.admin);
    }
    /**
     * @return Username and password for basic authentication.
     * 
     */
    public Optional<BasicLoginInformationResponse> basicLoginInformation() {
        return Optional.ofNullable(this.basicLoginInformation);
    }
    /**
     * @return The data controller id
     * 
     */
    public Optional<String> dataControllerId() {
        return Optional.ofNullable(this.dataControllerId);
    }
    /**
     * @return The raw kubernetes information
     * 
     */
    public Optional<Object> k8sRaw() {
        return Optional.ofNullable(this.k8sRaw);
    }
    /**
     * @return Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    public Optional<String> lastUploadedDate() {
        return Optional.ofNullable(this.lastUploadedDate);
    }
    public String provisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgresInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String admin;
        private @Nullable BasicLoginInformationResponse basicLoginInformation;
        private @Nullable String dataControllerId;
        private @Nullable Object k8sRaw;
        private @Nullable String lastUploadedDate;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgresInstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.basicLoginInformation = defaults.basicLoginInformation;
    	      this.dataControllerId = defaults.dataControllerId;
    	      this.k8sRaw = defaults.k8sRaw;
    	      this.lastUploadedDate = defaults.lastUploadedDate;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder admin(@Nullable String admin) {
            this.admin = admin;
            return this;
        }
        public Builder basicLoginInformation(@Nullable BasicLoginInformationResponse basicLoginInformation) {
            this.basicLoginInformation = basicLoginInformation;
            return this;
        }
        public Builder dataControllerId(@Nullable String dataControllerId) {
            this.dataControllerId = dataControllerId;
            return this;
        }
        public Builder k8sRaw(@Nullable Object k8sRaw) {
            this.k8sRaw = k8sRaw;
            return this;
        }
        public Builder lastUploadedDate(@Nullable String lastUploadedDate) {
            this.lastUploadedDate = lastUploadedDate;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public PostgresInstancePropertiesResponse build() {
            return new PostgresInstancePropertiesResponse(admin, basicLoginInformation, dataControllerId, k8sRaw, lastUploadedDate, provisioningState);
        }
    }
}
