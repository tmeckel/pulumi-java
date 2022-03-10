// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices;

import io.pulumi.azurenative.cognitiveservices.inputs.CommitmentPlanPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CommitmentPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommitmentPlanArgs Empty = new CommitmentPlanArgs();

    /**
     * The name of Cognitive Services account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the commitmentPlan associated with the Cognitive Services Account
     * 
     */
    @InputImport(name="commitmentPlanName")
      private final @Nullable Input<String> commitmentPlanName;

    public Input<String> getCommitmentPlanName() {
        return this.commitmentPlanName == null ? Input.empty() : this.commitmentPlanName;
    }

    /**
     * Properties of Cognitive Services account commitment plan.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<CommitmentPlanPropertiesArgs> properties;

    public Input<CommitmentPlanPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public CommitmentPlanArgs(
        Input<String> accountName,
        @Nullable Input<String> commitmentPlanName,
        @Nullable Input<CommitmentPlanPropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.commitmentPlanName = commitmentPlanName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private CommitmentPlanArgs() {
        this.accountName = Input.empty();
        this.commitmentPlanName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> commitmentPlanName;
        private @Nullable Input<CommitmentPlanPropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.commitmentPlanName = defaults.commitmentPlanName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder commitmentPlanName(@Nullable Input<String> commitmentPlanName) {
            this.commitmentPlanName = commitmentPlanName;
            return this;
        }

        public Builder commitmentPlanName(@Nullable String commitmentPlanName) {
            this.commitmentPlanName = Input.ofNullable(commitmentPlanName);
            return this;
        }

        public Builder properties(@Nullable Input<CommitmentPlanPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable CommitmentPlanPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public CommitmentPlanArgs build() {
            return new CommitmentPlanArgs(accountName, commitmentPlanName, properties, resourceGroupName);
        }
    }
}
