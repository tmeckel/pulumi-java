// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSourceControlArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSourceControlArgs Empty = new GetSourceControlArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
      private final String automationAccountName;

    public String getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of source control.
     * 
     */
    @InputImport(name="sourceControlName", required=true)
      private final String sourceControlName;

    public String getSourceControlName() {
        return this.sourceControlName;
    }

    public GetSourceControlArgs(
        String automationAccountName,
        String resourceGroupName,
        String sourceControlName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sourceControlName = Objects.requireNonNull(sourceControlName, "expected parameter 'sourceControlName' to be non-null");
    }

    private GetSourceControlArgs() {
        this.automationAccountName = null;
        this.resourceGroupName = null;
        this.sourceControlName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String resourceGroupName;
        private String sourceControlName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceControlName = defaults.sourceControlName;
        }

        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder sourceControlName(String sourceControlName) {
            this.sourceControlName = Objects.requireNonNull(sourceControlName);
            return this;
        }
        public GetSourceControlArgs build() {
            return new GetSourceControlArgs(automationAccountName, resourceGroupName, sourceControlName);
        }
    }
}
