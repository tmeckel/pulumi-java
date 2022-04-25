// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.billing.outputs;

import com.pulumi.azurenative.billing.outputs.AzurePlanResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InvoiceSectionWithCreateSubPermissionResponse {
    /**
     * @return The name of the billing profile for the invoice section.
     * 
     */
    private final String billingProfileDisplayName;
    /**
     * @return The ID of the billing profile for the invoice section.
     * 
     */
    private final String billingProfileId;
    /**
     * @return The billing profile spending limit.
     * 
     */
    private final String billingProfileSpendingLimit;
    /**
     * @return The status of the billing profile.
     * 
     */
    private final String billingProfileStatus;
    /**
     * @return Reason for the specified billing profile status.
     * 
     */
    private final String billingProfileStatusReasonCode;
    /**
     * @return The system generated unique identifier for a billing profile.
     * 
     */
    private final String billingProfileSystemId;
    /**
     * @return Enabled azure plans for the associated billing profile.
     * 
     */
    private final @Nullable List<AzurePlanResponse> enabledAzurePlans;
    /**
     * @return The name of the invoice section.
     * 
     */
    private final String invoiceSectionDisplayName;
    /**
     * @return The ID of the invoice section.
     * 
     */
    private final String invoiceSectionId;
    /**
     * @return The system generated unique identifier for an invoice section.
     * 
     */
    private final String invoiceSectionSystemId;

    @CustomType.Constructor
    private InvoiceSectionWithCreateSubPermissionResponse(
        @CustomType.Parameter("billingProfileDisplayName") String billingProfileDisplayName,
        @CustomType.Parameter("billingProfileId") String billingProfileId,
        @CustomType.Parameter("billingProfileSpendingLimit") String billingProfileSpendingLimit,
        @CustomType.Parameter("billingProfileStatus") String billingProfileStatus,
        @CustomType.Parameter("billingProfileStatusReasonCode") String billingProfileStatusReasonCode,
        @CustomType.Parameter("billingProfileSystemId") String billingProfileSystemId,
        @CustomType.Parameter("enabledAzurePlans") @Nullable List<AzurePlanResponse> enabledAzurePlans,
        @CustomType.Parameter("invoiceSectionDisplayName") String invoiceSectionDisplayName,
        @CustomType.Parameter("invoiceSectionId") String invoiceSectionId,
        @CustomType.Parameter("invoiceSectionSystemId") String invoiceSectionSystemId) {
        this.billingProfileDisplayName = billingProfileDisplayName;
        this.billingProfileId = billingProfileId;
        this.billingProfileSpendingLimit = billingProfileSpendingLimit;
        this.billingProfileStatus = billingProfileStatus;
        this.billingProfileStatusReasonCode = billingProfileStatusReasonCode;
        this.billingProfileSystemId = billingProfileSystemId;
        this.enabledAzurePlans = enabledAzurePlans;
        this.invoiceSectionDisplayName = invoiceSectionDisplayName;
        this.invoiceSectionId = invoiceSectionId;
        this.invoiceSectionSystemId = invoiceSectionSystemId;
    }

    /**
     * @return The name of the billing profile for the invoice section.
     * 
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }
    /**
     * @return The ID of the billing profile for the invoice section.
     * 
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }
    /**
     * @return The billing profile spending limit.
     * 
     */
    public String billingProfileSpendingLimit() {
        return this.billingProfileSpendingLimit;
    }
    /**
     * @return The status of the billing profile.
     * 
     */
    public String billingProfileStatus() {
        return this.billingProfileStatus;
    }
    /**
     * @return Reason for the specified billing profile status.
     * 
     */
    public String billingProfileStatusReasonCode() {
        return this.billingProfileStatusReasonCode;
    }
    /**
     * @return The system generated unique identifier for a billing profile.
     * 
     */
    public String billingProfileSystemId() {
        return this.billingProfileSystemId;
    }
    /**
     * @return Enabled azure plans for the associated billing profile.
     * 
     */
    public List<AzurePlanResponse> enabledAzurePlans() {
        return this.enabledAzurePlans == null ? List.of() : this.enabledAzurePlans;
    }
    /**
     * @return The name of the invoice section.
     * 
     */
    public String invoiceSectionDisplayName() {
        return this.invoiceSectionDisplayName;
    }
    /**
     * @return The ID of the invoice section.
     * 
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }
    /**
     * @return The system generated unique identifier for an invoice section.
     * 
     */
    public String invoiceSectionSystemId() {
        return this.invoiceSectionSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InvoiceSectionWithCreateSubPermissionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingProfileDisplayName;
        private String billingProfileId;
        private String billingProfileSpendingLimit;
        private String billingProfileStatus;
        private String billingProfileStatusReasonCode;
        private String billingProfileSystemId;
        private @Nullable List<AzurePlanResponse> enabledAzurePlans;
        private String invoiceSectionDisplayName;
        private String invoiceSectionId;
        private String invoiceSectionSystemId;

        public Builder() {
    	      // Empty
        }

        public Builder(InvoiceSectionWithCreateSubPermissionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingProfileDisplayName = defaults.billingProfileDisplayName;
    	      this.billingProfileId = defaults.billingProfileId;
    	      this.billingProfileSpendingLimit = defaults.billingProfileSpendingLimit;
    	      this.billingProfileStatus = defaults.billingProfileStatus;
    	      this.billingProfileStatusReasonCode = defaults.billingProfileStatusReasonCode;
    	      this.billingProfileSystemId = defaults.billingProfileSystemId;
    	      this.enabledAzurePlans = defaults.enabledAzurePlans;
    	      this.invoiceSectionDisplayName = defaults.invoiceSectionDisplayName;
    	      this.invoiceSectionId = defaults.invoiceSectionId;
    	      this.invoiceSectionSystemId = defaults.invoiceSectionSystemId;
        }

        public Builder billingProfileDisplayName(String billingProfileDisplayName) {
            this.billingProfileDisplayName = Objects.requireNonNull(billingProfileDisplayName);
            return this;
        }
        public Builder billingProfileId(String billingProfileId) {
            this.billingProfileId = Objects.requireNonNull(billingProfileId);
            return this;
        }
        public Builder billingProfileSpendingLimit(String billingProfileSpendingLimit) {
            this.billingProfileSpendingLimit = Objects.requireNonNull(billingProfileSpendingLimit);
            return this;
        }
        public Builder billingProfileStatus(String billingProfileStatus) {
            this.billingProfileStatus = Objects.requireNonNull(billingProfileStatus);
            return this;
        }
        public Builder billingProfileStatusReasonCode(String billingProfileStatusReasonCode) {
            this.billingProfileStatusReasonCode = Objects.requireNonNull(billingProfileStatusReasonCode);
            return this;
        }
        public Builder billingProfileSystemId(String billingProfileSystemId) {
            this.billingProfileSystemId = Objects.requireNonNull(billingProfileSystemId);
            return this;
        }
        public Builder enabledAzurePlans(@Nullable List<AzurePlanResponse> enabledAzurePlans) {
            this.enabledAzurePlans = enabledAzurePlans;
            return this;
        }
        public Builder enabledAzurePlans(AzurePlanResponse... enabledAzurePlans) {
            return enabledAzurePlans(List.of(enabledAzurePlans));
        }
        public Builder invoiceSectionDisplayName(String invoiceSectionDisplayName) {
            this.invoiceSectionDisplayName = Objects.requireNonNull(invoiceSectionDisplayName);
            return this;
        }
        public Builder invoiceSectionId(String invoiceSectionId) {
            this.invoiceSectionId = Objects.requireNonNull(invoiceSectionId);
            return this;
        }
        public Builder invoiceSectionSystemId(String invoiceSectionSystemId) {
            this.invoiceSectionSystemId = Objects.requireNonNull(invoiceSectionSystemId);
            return this;
        }        public InvoiceSectionWithCreateSubPermissionResponse build() {
            return new InvoiceSectionWithCreateSubPermissionResponse(billingProfileDisplayName, billingProfileId, billingProfileSpendingLimit, billingProfileStatus, billingProfileStatusReasonCode, billingProfileSystemId, enabledAzurePlans, invoiceSectionDisplayName, invoiceSectionId, invoiceSectionSystemId);
        }
    }
}
