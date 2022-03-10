// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCommitmentPlanArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCommitmentPlanArgs Empty = new GetCommitmentPlanArgs();

    /**
     * The name of Cognitive Services account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the commitmentPlan associated with the Cognitive Services Account
     * 
     */
    @InputImport(name="commitmentPlanName", required=true)
      private final String commitmentPlanName;

    public String getCommitmentPlanName() {
        return this.commitmentPlanName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetCommitmentPlanArgs(
        String accountName,
        String commitmentPlanName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.commitmentPlanName = Objects.requireNonNull(commitmentPlanName, "expected parameter 'commitmentPlanName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCommitmentPlanArgs() {
        this.accountName = null;
        this.commitmentPlanName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCommitmentPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String commitmentPlanName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCommitmentPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.commitmentPlanName = defaults.commitmentPlanName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder commitmentPlanName(String commitmentPlanName) {
            this.commitmentPlanName = Objects.requireNonNull(commitmentPlanName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetCommitmentPlanArgs build() {
            return new GetCommitmentPlanArgs(accountName, commitmentPlanName, resourceGroupName);
        }
    }
}
