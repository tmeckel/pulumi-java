// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.billingbudgets_v1beta1.inputs.GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleArgs;
import io.pulumi.googlenative.billingbudgets_v1beta1.inputs.GoogleCloudBillingBudgetsV1beta1BudgetAmountArgs;
import io.pulumi.googlenative.billingbudgets_v1beta1.inputs.GoogleCloudBillingBudgetsV1beta1FilterArgs;
import io.pulumi.googlenative.billingbudgets_v1beta1.inputs.GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetArgs Empty = new BudgetArgs();

    /**
     * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
     * 
     */
    @InputImport(name="allUpdatesRule")
      private final @Nullable Input<GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleArgs> allUpdatesRule;

    public Input<GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleArgs> getAllUpdatesRule() {
        return this.allUpdatesRule == null ? Input.empty() : this.allUpdatesRule;
    }

    /**
     * Budgeted amount.
     * 
     */
    @InputImport(name="amount", required=true)
      private final Input<GoogleCloudBillingBudgetsV1beta1BudgetAmountArgs> amount;

    public Input<GoogleCloudBillingBudgetsV1beta1BudgetAmountArgs> getAmount() {
        return this.amount;
    }

    @InputImport(name="billingAccountId", required=true)
      private final Input<String> billingAccountId;

    public Input<String> getBillingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget's time period, as well as other filters.
     * 
     */
    @InputImport(name="budgetFilter")
      private final @Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterArgs> budgetFilter;

    public Input<GoogleCloudBillingBudgetsV1beta1FilterArgs> getBudgetFilter() {
        return this.budgetFilter == null ? Input.empty() : this.budgetFilter;
    }

    /**
     * User data for display name in UI. Validation: <= 60 chars.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag will cause an update to overwrite other changes.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
     * 
     */
    @InputImport(name="thresholdRules")
      private final @Nullable Input<List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs>> thresholdRules;

    public Input<List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs>> getThresholdRules() {
        return this.thresholdRules == null ? Input.empty() : this.thresholdRules;
    }

    public BudgetArgs(
        @Nullable Input<GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleArgs> allUpdatesRule,
        Input<GoogleCloudBillingBudgetsV1beta1BudgetAmountArgs> amount,
        Input<String> billingAccountId,
        @Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterArgs> budgetFilter,
        @Nullable Input<String> displayName,
        @Nullable Input<String> etag,
        @Nullable Input<List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs>> thresholdRules) {
        this.allUpdatesRule = allUpdatesRule;
        this.amount = Objects.requireNonNull(amount, "expected parameter 'amount' to be non-null");
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.budgetFilter = budgetFilter;
        this.displayName = displayName;
        this.etag = etag;
        this.thresholdRules = thresholdRules;
    }

    private BudgetArgs() {
        this.allUpdatesRule = Input.empty();
        this.amount = Input.empty();
        this.billingAccountId = Input.empty();
        this.budgetFilter = Input.empty();
        this.displayName = Input.empty();
        this.etag = Input.empty();
        this.thresholdRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleArgs> allUpdatesRule;
        private Input<GoogleCloudBillingBudgetsV1beta1BudgetAmountArgs> amount;
        private Input<String> billingAccountId;
        private @Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterArgs> budgetFilter;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> etag;
        private @Nullable Input<List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs>> thresholdRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allUpdatesRule = defaults.allUpdatesRule;
    	      this.amount = defaults.amount;
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.budgetFilter = defaults.budgetFilter;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.thresholdRules = defaults.thresholdRules;
        }

        public Builder allUpdatesRule(@Nullable Input<GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleArgs> allUpdatesRule) {
            this.allUpdatesRule = allUpdatesRule;
            return this;
        }

        public Builder allUpdatesRule(@Nullable GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleArgs allUpdatesRule) {
            this.allUpdatesRule = Input.ofNullable(allUpdatesRule);
            return this;
        }

        public Builder amount(Input<GoogleCloudBillingBudgetsV1beta1BudgetAmountArgs> amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder amount(GoogleCloudBillingBudgetsV1beta1BudgetAmountArgs amount) {
            this.amount = Input.of(Objects.requireNonNull(amount));
            return this;
        }

        public Builder billingAccountId(Input<String> billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }

        public Builder billingAccountId(String billingAccountId) {
            this.billingAccountId = Input.of(Objects.requireNonNull(billingAccountId));
            return this;
        }

        public Builder budgetFilter(@Nullable Input<GoogleCloudBillingBudgetsV1beta1FilterArgs> budgetFilter) {
            this.budgetFilter = budgetFilter;
            return this;
        }

        public Builder budgetFilter(@Nullable GoogleCloudBillingBudgetsV1beta1FilterArgs budgetFilter) {
            this.budgetFilter = Input.ofNullable(budgetFilter);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
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

        public Builder thresholdRules(@Nullable Input<List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs>> thresholdRules) {
            this.thresholdRules = thresholdRules;
            return this;
        }

        public Builder thresholdRules(@Nullable List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs> thresholdRules) {
            this.thresholdRules = Input.ofNullable(thresholdRules);
            return this;
        }
        public BudgetArgs build() {
            return new BudgetArgs(allUpdatesRule, amount, billingAccountId, budgetFilter, displayName, etag, thresholdRules);
        }
    }
}
