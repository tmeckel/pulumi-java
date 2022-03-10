// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.assuredworkloads_v1.enums.WorkloadComplianceRegime;
import io.pulumi.googlenative.assuredworkloads_v1.inputs.GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs;
import io.pulumi.googlenative.assuredworkloads_v1.inputs.GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadArgs Empty = new WorkloadArgs();

    /**
     * Optional. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    @InputImport(name="billingAccount")
      private final @Nullable Input<String> billingAccount;

    public Input<String> getBillingAccount() {
        return this.billingAccount == null ? Input.empty() : this.billingAccount;
    }

    /**
     * Immutable. Compliance Regime associated with this workload.
     * 
     */
    @InputImport(name="complianceRegime", required=true)
      private final Input<WorkloadComplianceRegime> complianceRegime;

    public Input<WorkloadComplianceRegime> getComplianceRegime() {
        return this.complianceRegime;
    }

    /**
     * The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
     * 
     */
    @InputImport(name="enableSovereignControls")
      private final @Nullable Input<Boolean> enableSovereignControls;

    public Input<Boolean> getEnableSovereignControls() {
        return this.enableSovereignControls == null ? Input.empty() : this.enableSovereignControls;
    }

    /**
     * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update & Delete operations.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="externalId")
      private final @Nullable Input<String> externalId;

    public Input<String> getExternalId() {
        return this.externalId == null ? Input.empty() : this.externalId;
    }

    /**
     * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     * 
     */
    @InputImport(name="kmsSettings")
      private final @Nullable Input<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs> kmsSettings;

    public Input<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs> getKmsSettings() {
        return this.kmsSettings == null ? Input.empty() : this.kmsSettings;
    }

    /**
     * Optional. Labels applied to the workload.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
      private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
     * 
     */
    @InputImport(name="provisionedResourcesParent")
      private final @Nullable Input<String> provisionedResourcesParent;

    public Input<String> getProvisionedResourcesParent() {
        return this.provisionedResourcesParent == null ? Input.empty() : this.provisionedResourcesParent;
    }

    /**
     * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    @InputImport(name="resourceSettings")
      private final @Nullable Input<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs>> resourceSettings;

    public Input<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs>> getResourceSettings() {
        return this.resourceSettings == null ? Input.empty() : this.resourceSettings;
    }

    public WorkloadArgs(
        @Nullable Input<String> billingAccount,
        Input<WorkloadComplianceRegime> complianceRegime,
        Input<String> displayName,
        @Nullable Input<Boolean> enableSovereignControls,
        @Nullable Input<String> etag,
        @Nullable Input<String> externalId,
        @Nullable Input<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs> kmsSettings,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> organizationId,
        @Nullable Input<String> provisionedResourcesParent,
        @Nullable Input<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs>> resourceSettings) {
        this.billingAccount = billingAccount;
        this.complianceRegime = Objects.requireNonNull(complianceRegime, "expected parameter 'complianceRegime' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableSovereignControls = enableSovereignControls;
        this.etag = etag;
        this.externalId = externalId;
        this.kmsSettings = kmsSettings;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.provisionedResourcesParent = provisionedResourcesParent;
        this.resourceSettings = resourceSettings;
    }

    private WorkloadArgs() {
        this.billingAccount = Input.empty();
        this.complianceRegime = Input.empty();
        this.displayName = Input.empty();
        this.enableSovereignControls = Input.empty();
        this.etag = Input.empty();
        this.externalId = Input.empty();
        this.kmsSettings = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
        this.provisionedResourcesParent = Input.empty();
        this.resourceSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> billingAccount;
        private Input<WorkloadComplianceRegime> complianceRegime;
        private Input<String> displayName;
        private @Nullable Input<Boolean> enableSovereignControls;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> externalId;
        private @Nullable Input<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs> kmsSettings;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> organizationId;
        private @Nullable Input<String> provisionedResourcesParent;
        private @Nullable Input<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs>> resourceSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccount = defaults.billingAccount;
    	      this.complianceRegime = defaults.complianceRegime;
    	      this.displayName = defaults.displayName;
    	      this.enableSovereignControls = defaults.enableSovereignControls;
    	      this.etag = defaults.etag;
    	      this.externalId = defaults.externalId;
    	      this.kmsSettings = defaults.kmsSettings;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.provisionedResourcesParent = defaults.provisionedResourcesParent;
    	      this.resourceSettings = defaults.resourceSettings;
        }

        public Builder billingAccount(@Nullable Input<String> billingAccount) {
            this.billingAccount = billingAccount;
            return this;
        }

        public Builder billingAccount(@Nullable String billingAccount) {
            this.billingAccount = Input.ofNullable(billingAccount);
            return this;
        }

        public Builder complianceRegime(Input<WorkloadComplianceRegime> complianceRegime) {
            this.complianceRegime = Objects.requireNonNull(complianceRegime);
            return this;
        }

        public Builder complianceRegime(WorkloadComplianceRegime complianceRegime) {
            this.complianceRegime = Input.of(Objects.requireNonNull(complianceRegime));
            return this;
        }

        public Builder displayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder enableSovereignControls(@Nullable Input<Boolean> enableSovereignControls) {
            this.enableSovereignControls = enableSovereignControls;
            return this;
        }

        public Builder enableSovereignControls(@Nullable Boolean enableSovereignControls) {
            this.enableSovereignControls = Input.ofNullable(enableSovereignControls);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder externalId(@Nullable Input<String> externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder externalId(@Nullable String externalId) {
            this.externalId = Input.ofNullable(externalId);
            return this;
        }

        public Builder kmsSettings(@Nullable Input<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs> kmsSettings) {
            this.kmsSettings = kmsSettings;
            return this;
        }

        public Builder kmsSettings(@Nullable GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs kmsSettings) {
            this.kmsSettings = Input.ofNullable(kmsSettings);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder organizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder provisionedResourcesParent(@Nullable Input<String> provisionedResourcesParent) {
            this.provisionedResourcesParent = provisionedResourcesParent;
            return this;
        }

        public Builder provisionedResourcesParent(@Nullable String provisionedResourcesParent) {
            this.provisionedResourcesParent = Input.ofNullable(provisionedResourcesParent);
            return this;
        }

        public Builder resourceSettings(@Nullable Input<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs>> resourceSettings) {
            this.resourceSettings = resourceSettings;
            return this;
        }

        public Builder resourceSettings(@Nullable List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs> resourceSettings) {
            this.resourceSettings = Input.ofNullable(resourceSettings);
            return this;
        }
        public WorkloadArgs build() {
            return new WorkloadArgs(billingAccount, complianceRegime, displayName, enableSovereignControls, etag, externalId, kmsSettings, labels, location, name, organizationId, provisionedResourcesParent, resourceSettings);
        }
    }
}
