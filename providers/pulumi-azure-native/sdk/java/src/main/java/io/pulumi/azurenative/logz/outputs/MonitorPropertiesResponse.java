// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.LogzOrganizationPropertiesResponse;
import io.pulumi.azurenative.logz.outputs.PlanDataResponse;
import io.pulumi.azurenative.logz.outputs.UserInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MonitorPropertiesResponse {
    private final String liftrResourceCategory;
    /**
     * The priority of the resource.
     * 
     */
    private final Integer liftrResourcePreference;
    private final @Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties;
    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
     */
    private final @Nullable String marketplaceSubscriptionStatus;
    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    private final @Nullable String monitoringStatus;
    private final @Nullable PlanDataResponse planData;
    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
     */
    private final String provisioningState;
    private final @Nullable UserInfoResponse userInfo;

    @OutputCustomType.Constructor
    private MonitorPropertiesResponse(
        @OutputCustomType.Parameter("liftrResourceCategory") String liftrResourceCategory,
        @OutputCustomType.Parameter("liftrResourcePreference") Integer liftrResourcePreference,
        @OutputCustomType.Parameter("logzOrganizationProperties") @Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties,
        @OutputCustomType.Parameter("marketplaceSubscriptionStatus") @Nullable String marketplaceSubscriptionStatus,
        @OutputCustomType.Parameter("monitoringStatus") @Nullable String monitoringStatus,
        @OutputCustomType.Parameter("planData") @Nullable PlanDataResponse planData,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("userInfo") @Nullable UserInfoResponse userInfo) {
        this.liftrResourceCategory = liftrResourceCategory;
        this.liftrResourcePreference = liftrResourcePreference;
        this.logzOrganizationProperties = logzOrganizationProperties;
        this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
        this.monitoringStatus = monitoringStatus;
        this.planData = planData;
        this.provisioningState = provisioningState;
        this.userInfo = userInfo;
    }

    public String getLiftrResourceCategory() {
        return this.liftrResourceCategory;
    }
    /**
     * The priority of the resource.
     * 
    */
    public Integer getLiftrResourcePreference() {
        return this.liftrResourcePreference;
    }
    public Optional<LogzOrganizationPropertiesResponse> getLogzOrganizationProperties() {
        return Optional.ofNullable(this.logzOrganizationProperties);
    }
    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
    */
    public Optional<String> getMarketplaceSubscriptionStatus() {
        return Optional.ofNullable(this.marketplaceSubscriptionStatus);
    }
    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
    */
    public Optional<String> getMonitoringStatus() {
        return Optional.ofNullable(this.monitoringStatus);
    }
    public Optional<PlanDataResponse> getPlanData() {
        return Optional.ofNullable(this.planData);
    }
    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<UserInfoResponse> getUserInfo() {
        return Optional.ofNullable(this.userInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String liftrResourceCategory;
        private Integer liftrResourcePreference;
        private @Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties;
        private @Nullable String marketplaceSubscriptionStatus;
        private @Nullable String monitoringStatus;
        private @Nullable PlanDataResponse planData;
        private String provisioningState;
        private @Nullable UserInfoResponse userInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.liftrResourceCategory = defaults.liftrResourceCategory;
    	      this.liftrResourcePreference = defaults.liftrResourcePreference;
    	      this.logzOrganizationProperties = defaults.logzOrganizationProperties;
    	      this.marketplaceSubscriptionStatus = defaults.marketplaceSubscriptionStatus;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.planData = defaults.planData;
    	      this.provisioningState = defaults.provisioningState;
    	      this.userInfo = defaults.userInfo;
        }

        public Builder liftrResourceCategory(String liftrResourceCategory) {
            this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory);
            return this;
        }

        public Builder liftrResourcePreference(Integer liftrResourcePreference) {
            this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference);
            return this;
        }

        public Builder logzOrganizationProperties(@Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties) {
            this.logzOrganizationProperties = logzOrganizationProperties;
            return this;
        }

        public Builder marketplaceSubscriptionStatus(@Nullable String marketplaceSubscriptionStatus) {
            this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
            return this;
        }

        public Builder monitoringStatus(@Nullable String monitoringStatus) {
            this.monitoringStatus = monitoringStatus;
            return this;
        }

        public Builder planData(@Nullable PlanDataResponse planData) {
            this.planData = planData;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder userInfo(@Nullable UserInfoResponse userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public MonitorPropertiesResponse build() {
            return new MonitorPropertiesResponse(liftrResourceCategory, liftrResourcePreference, logzOrganizationProperties, marketplaceSubscriptionStatus, monitoringStatus, planData, provisioningState, userInfo);
        }
    }
}
