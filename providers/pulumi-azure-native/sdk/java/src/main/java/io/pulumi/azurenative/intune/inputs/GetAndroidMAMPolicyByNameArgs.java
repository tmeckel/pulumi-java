// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.intune.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAndroidMAMPolicyByNameArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAndroidMAMPolicyByNameArgs Empty = new GetAndroidMAMPolicyByNameArgs();

    /**
     * Location hostName for the tenant
     * 
     */
    @InputImport(name="hostName", required=true)
      private final String hostName;

    public String getHostName() {
        return this.hostName;
    }

    /**
     * Unique name for the policy
     * 
     */
    @InputImport(name="policyName", required=true)
      private final String policyName;

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * select specific fields in entity.
     * 
     */
    @InputImport(name="select")
      private final @Nullable String select;

    public Optional<String> getSelect() {
        return this.select == null ? Optional.empty() : Optional.ofNullable(this.select);
    }

    public GetAndroidMAMPolicyByNameArgs(
        String hostName,
        String policyName,
        @Nullable String select) {
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
        this.select = select;
    }

    private GetAndroidMAMPolicyByNameArgs() {
        this.hostName = null;
        this.policyName = null;
        this.select = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAndroidMAMPolicyByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostName;
        private String policyName;
        private @Nullable String select;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAndroidMAMPolicyByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.policyName = defaults.policyName;
    	      this.select = defaults.select;
        }

        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }

        public Builder select(@Nullable String select) {
            this.select = select;
            return this;
        }
        public GetAndroidMAMPolicyByNameArgs build() {
            return new GetAndroidMAMPolicyByNameArgs(hostName, policyName, select);
        }
    }
}
