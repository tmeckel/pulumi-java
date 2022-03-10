// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkInsightsAccessScopeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkInsightsAccessScopeArgs Empty = new GetNetworkInsightsAccessScopeArgs();

    @InputImport(name="networkInsightsAccessScopeId", required=true)
      private final String networkInsightsAccessScopeId;

    public String getNetworkInsightsAccessScopeId() {
        return this.networkInsightsAccessScopeId;
    }

    public GetNetworkInsightsAccessScopeArgs(String networkInsightsAccessScopeId) {
        this.networkInsightsAccessScopeId = Objects.requireNonNull(networkInsightsAccessScopeId, "expected parameter 'networkInsightsAccessScopeId' to be non-null");
    }

    private GetNetworkInsightsAccessScopeArgs() {
        this.networkInsightsAccessScopeId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAccessScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkInsightsAccessScopeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInsightsAccessScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInsightsAccessScopeId = defaults.networkInsightsAccessScopeId;
        }

        public Builder networkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
            this.networkInsightsAccessScopeId = Objects.requireNonNull(networkInsightsAccessScopeId);
            return this;
        }
        public GetNetworkInsightsAccessScopeArgs build() {
            return new GetNetworkInsightsAccessScopeArgs(networkInsightsAccessScopeId);
        }
    }
}
