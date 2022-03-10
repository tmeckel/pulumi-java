// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The api properties for special APIs.
 * 
 */
public final class CognitiveServicesAccountApiPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CognitiveServicesAccountApiPropertiesArgs Empty = new CognitiveServicesAccountApiPropertiesArgs();

    /**
     * (Metrics Advisor Only) The Azure AD Client Id (Application Id).
     * 
     */
    @InputImport(name="aadClientId")
      private final @Nullable Input<String> aadClientId;

    public Input<String> getAadClientId() {
        return this.aadClientId == null ? Input.empty() : this.aadClientId;
    }

    /**
     * (Metrics Advisor Only) The Azure AD Tenant Id.
     * 
     */
    @InputImport(name="aadTenantId")
      private final @Nullable Input<String> aadTenantId;

    public Input<String> getAadTenantId() {
        return this.aadTenantId == null ? Input.empty() : this.aadTenantId;
    }

    /**
     * (Personalization Only) The flag to enable statistics of Bing Search.
     * 
     */
    @InputImport(name="eventHubConnectionString")
      private final @Nullable Input<String> eventHubConnectionString;

    public Input<String> getEventHubConnectionString() {
        return this.eventHubConnectionString == null ? Input.empty() : this.eventHubConnectionString;
    }

    /**
     * (QnAMaker Only) The Azure Search endpoint id of QnAMaker.
     * 
     */
    @InputImport(name="qnaAzureSearchEndpointId")
      private final @Nullable Input<String> qnaAzureSearchEndpointId;

    public Input<String> getQnaAzureSearchEndpointId() {
        return this.qnaAzureSearchEndpointId == null ? Input.empty() : this.qnaAzureSearchEndpointId;
    }

    /**
     * (QnAMaker Only) The Azure Search endpoint key of QnAMaker.
     * 
     */
    @InputImport(name="qnaAzureSearchEndpointKey")
      private final @Nullable Input<String> qnaAzureSearchEndpointKey;

    public Input<String> getQnaAzureSearchEndpointKey() {
        return this.qnaAzureSearchEndpointKey == null ? Input.empty() : this.qnaAzureSearchEndpointKey;
    }

    /**
     * (QnAMaker Only) The runtime endpoint of QnAMaker.
     * 
     */
    @InputImport(name="qnaRuntimeEndpoint")
      private final @Nullable Input<String> qnaRuntimeEndpoint;

    public Input<String> getQnaRuntimeEndpoint() {
        return this.qnaRuntimeEndpoint == null ? Input.empty() : this.qnaRuntimeEndpoint;
    }

    /**
     * (Bing Search Only) The flag to enable statistics of Bing Search.
     * 
     */
    @InputImport(name="statisticsEnabled")
      private final @Nullable Input<Boolean> statisticsEnabled;

    public Input<Boolean> getStatisticsEnabled() {
        return this.statisticsEnabled == null ? Input.empty() : this.statisticsEnabled;
    }

    /**
     * (Personalization Only) The storage account connection string.
     * 
     */
    @InputImport(name="storageAccountConnectionString")
      private final @Nullable Input<String> storageAccountConnectionString;

    public Input<String> getStorageAccountConnectionString() {
        return this.storageAccountConnectionString == null ? Input.empty() : this.storageAccountConnectionString;
    }

    /**
     * (Metrics Advisor Only) The super user of Metrics Advisor.
     * 
     */
    @InputImport(name="superUser")
      private final @Nullable Input<String> superUser;

    public Input<String> getSuperUser() {
        return this.superUser == null ? Input.empty() : this.superUser;
    }

    /**
     * (Metrics Advisor Only) The website name of Metrics Advisor.
     * 
     */
    @InputImport(name="websiteName")
      private final @Nullable Input<String> websiteName;

    public Input<String> getWebsiteName() {
        return this.websiteName == null ? Input.empty() : this.websiteName;
    }

    public CognitiveServicesAccountApiPropertiesArgs(
        @Nullable Input<String> aadClientId,
        @Nullable Input<String> aadTenantId,
        @Nullable Input<String> eventHubConnectionString,
        @Nullable Input<String> qnaAzureSearchEndpointId,
        @Nullable Input<String> qnaAzureSearchEndpointKey,
        @Nullable Input<String> qnaRuntimeEndpoint,
        @Nullable Input<Boolean> statisticsEnabled,
        @Nullable Input<String> storageAccountConnectionString,
        @Nullable Input<String> superUser,
        @Nullable Input<String> websiteName) {
        this.aadClientId = aadClientId;
        this.aadTenantId = aadTenantId;
        this.eventHubConnectionString = eventHubConnectionString;
        this.qnaAzureSearchEndpointId = qnaAzureSearchEndpointId;
        this.qnaAzureSearchEndpointKey = qnaAzureSearchEndpointKey;
        this.qnaRuntimeEndpoint = qnaRuntimeEndpoint;
        this.statisticsEnabled = statisticsEnabled;
        this.storageAccountConnectionString = storageAccountConnectionString;
        this.superUser = superUser;
        this.websiteName = websiteName;
    }

    private CognitiveServicesAccountApiPropertiesArgs() {
        this.aadClientId = Input.empty();
        this.aadTenantId = Input.empty();
        this.eventHubConnectionString = Input.empty();
        this.qnaAzureSearchEndpointId = Input.empty();
        this.qnaAzureSearchEndpointKey = Input.empty();
        this.qnaRuntimeEndpoint = Input.empty();
        this.statisticsEnabled = Input.empty();
        this.storageAccountConnectionString = Input.empty();
        this.superUser = Input.empty();
        this.websiteName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountApiPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aadClientId;
        private @Nullable Input<String> aadTenantId;
        private @Nullable Input<String> eventHubConnectionString;
        private @Nullable Input<String> qnaAzureSearchEndpointId;
        private @Nullable Input<String> qnaAzureSearchEndpointKey;
        private @Nullable Input<String> qnaRuntimeEndpoint;
        private @Nullable Input<Boolean> statisticsEnabled;
        private @Nullable Input<String> storageAccountConnectionString;
        private @Nullable Input<String> superUser;
        private @Nullable Input<String> websiteName;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountApiPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.eventHubConnectionString = defaults.eventHubConnectionString;
    	      this.qnaAzureSearchEndpointId = defaults.qnaAzureSearchEndpointId;
    	      this.qnaAzureSearchEndpointKey = defaults.qnaAzureSearchEndpointKey;
    	      this.qnaRuntimeEndpoint = defaults.qnaRuntimeEndpoint;
    	      this.statisticsEnabled = defaults.statisticsEnabled;
    	      this.storageAccountConnectionString = defaults.storageAccountConnectionString;
    	      this.superUser = defaults.superUser;
    	      this.websiteName = defaults.websiteName;
        }

        public Builder aadClientId(@Nullable Input<String> aadClientId) {
            this.aadClientId = aadClientId;
            return this;
        }

        public Builder aadClientId(@Nullable String aadClientId) {
            this.aadClientId = Input.ofNullable(aadClientId);
            return this;
        }

        public Builder aadTenantId(@Nullable Input<String> aadTenantId) {
            this.aadTenantId = aadTenantId;
            return this;
        }

        public Builder aadTenantId(@Nullable String aadTenantId) {
            this.aadTenantId = Input.ofNullable(aadTenantId);
            return this;
        }

        public Builder eventHubConnectionString(@Nullable Input<String> eventHubConnectionString) {
            this.eventHubConnectionString = eventHubConnectionString;
            return this;
        }

        public Builder eventHubConnectionString(@Nullable String eventHubConnectionString) {
            this.eventHubConnectionString = Input.ofNullable(eventHubConnectionString);
            return this;
        }

        public Builder qnaAzureSearchEndpointId(@Nullable Input<String> qnaAzureSearchEndpointId) {
            this.qnaAzureSearchEndpointId = qnaAzureSearchEndpointId;
            return this;
        }

        public Builder qnaAzureSearchEndpointId(@Nullable String qnaAzureSearchEndpointId) {
            this.qnaAzureSearchEndpointId = Input.ofNullable(qnaAzureSearchEndpointId);
            return this;
        }

        public Builder qnaAzureSearchEndpointKey(@Nullable Input<String> qnaAzureSearchEndpointKey) {
            this.qnaAzureSearchEndpointKey = qnaAzureSearchEndpointKey;
            return this;
        }

        public Builder qnaAzureSearchEndpointKey(@Nullable String qnaAzureSearchEndpointKey) {
            this.qnaAzureSearchEndpointKey = Input.ofNullable(qnaAzureSearchEndpointKey);
            return this;
        }

        public Builder qnaRuntimeEndpoint(@Nullable Input<String> qnaRuntimeEndpoint) {
            this.qnaRuntimeEndpoint = qnaRuntimeEndpoint;
            return this;
        }

        public Builder qnaRuntimeEndpoint(@Nullable String qnaRuntimeEndpoint) {
            this.qnaRuntimeEndpoint = Input.ofNullable(qnaRuntimeEndpoint);
            return this;
        }

        public Builder statisticsEnabled(@Nullable Input<Boolean> statisticsEnabled) {
            this.statisticsEnabled = statisticsEnabled;
            return this;
        }

        public Builder statisticsEnabled(@Nullable Boolean statisticsEnabled) {
            this.statisticsEnabled = Input.ofNullable(statisticsEnabled);
            return this;
        }

        public Builder storageAccountConnectionString(@Nullable Input<String> storageAccountConnectionString) {
            this.storageAccountConnectionString = storageAccountConnectionString;
            return this;
        }

        public Builder storageAccountConnectionString(@Nullable String storageAccountConnectionString) {
            this.storageAccountConnectionString = Input.ofNullable(storageAccountConnectionString);
            return this;
        }

        public Builder superUser(@Nullable Input<String> superUser) {
            this.superUser = superUser;
            return this;
        }

        public Builder superUser(@Nullable String superUser) {
            this.superUser = Input.ofNullable(superUser);
            return this;
        }

        public Builder websiteName(@Nullable Input<String> websiteName) {
            this.websiteName = websiteName;
            return this;
        }

        public Builder websiteName(@Nullable String websiteName) {
            this.websiteName = Input.ofNullable(websiteName);
            return this;
        }
        public CognitiveServicesAccountApiPropertiesArgs build() {
            return new CognitiveServicesAccountApiPropertiesArgs(aadClientId, aadTenantId, eventHubConnectionString, qnaAzureSearchEndpointId, qnaAzureSearchEndpointKey, qnaRuntimeEndpoint, statisticsEnabled, storageAccountConnectionString, superUser, websiteName);
        }
    }
}
