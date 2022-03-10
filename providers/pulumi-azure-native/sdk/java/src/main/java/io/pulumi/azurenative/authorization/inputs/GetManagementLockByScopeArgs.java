// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagementLockByScopeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagementLockByScopeArgs Empty = new GetManagementLockByScopeArgs();

    /**
     * The name of lock.
     * 
     */
    @InputImport(name="lockName", required=true)
      private final String lockName;

    public String getLockName() {
        return this.lockName;
    }

    /**
     * The scope for the lock.
     * 
     */
    @InputImport(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetManagementLockByScopeArgs(
        String lockName,
        String scope) {
        this.lockName = Objects.requireNonNull(lockName, "expected parameter 'lockName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetManagementLockByScopeArgs() {
        this.lockName = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementLockByScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lockName;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementLockByScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lockName = defaults.lockName;
    	      this.scope = defaults.scope;
        }

        public Builder lockName(String lockName) {
            this.lockName = Objects.requireNonNull(lockName);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetManagementLockByScopeArgs build() {
            return new GetManagementLockByScopeArgs(lockName, scope);
        }
    }
}
