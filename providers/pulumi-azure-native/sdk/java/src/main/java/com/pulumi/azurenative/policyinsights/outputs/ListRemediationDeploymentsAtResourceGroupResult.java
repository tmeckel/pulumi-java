// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.outputs;

import com.pulumi.azurenative.policyinsights.outputs.RemediationDeploymentResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListRemediationDeploymentsAtResourceGroupResult {
    /**
     * @return The URL to get the next set of results.
     * 
     */
    private final String nextLink;
    /**
     * @return Array of deployments for the remediation.
     * 
     */
    private final List<RemediationDeploymentResponse> value;

    @CustomType.Constructor
    private ListRemediationDeploymentsAtResourceGroupResult(
        @CustomType.Parameter("nextLink") String nextLink,
        @CustomType.Parameter("value") List<RemediationDeploymentResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * @return The URL to get the next set of results.
     * 
     */
    public String nextLink() {
        return this.nextLink;
    }
    /**
     * @return Array of deployments for the remediation.
     * 
     */
    public List<RemediationDeploymentResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListRemediationDeploymentsAtResourceGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<RemediationDeploymentResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListRemediationDeploymentsAtResourceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }
        public Builder value(List<RemediationDeploymentResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(RemediationDeploymentResponse... value) {
            return value(List.of(value));
        }        public ListRemediationDeploymentsAtResourceGroupResult build() {
            return new ListRemediationDeploymentsAtResourceGroupResult(nextLink, value);
        }
    }
}
