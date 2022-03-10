// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRecoveryGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRecoveryGroupArgs Empty = new GetRecoveryGroupArgs();

    /**
     * The name of the recovery group to create.
     * 
     */
    @InputImport(name="recoveryGroupName", required=true)
      private final String recoveryGroupName;

    public String getRecoveryGroupName() {
        return this.recoveryGroupName;
    }

    public GetRecoveryGroupArgs(String recoveryGroupName) {
        this.recoveryGroupName = Objects.requireNonNull(recoveryGroupName, "expected parameter 'recoveryGroupName' to be non-null");
    }

    private GetRecoveryGroupArgs() {
        this.recoveryGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecoveryGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recoveryGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecoveryGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recoveryGroupName = defaults.recoveryGroupName;
        }

        public Builder recoveryGroupName(String recoveryGroupName) {
            this.recoveryGroupName = Objects.requireNonNull(recoveryGroupName);
            return this;
        }
        public GetRecoveryGroupArgs build() {
            return new GetRecoveryGroupArgs(recoveryGroupName);
        }
    }
}
