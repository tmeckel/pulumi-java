// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CS Accounts Details.
 * 
 */
public final class RunAsAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final RunAsAccountResponse Empty = new RunAsAccountResponse();

    /**
     * The CS RunAs account Id.
     * 
     */
    @InputImport(name="accountId")
      private final @Nullable String accountId;

    public Optional<String> getAccountId() {
        return this.accountId == null ? Optional.empty() : Optional.ofNullable(this.accountId);
    }

    /**
     * The CS RunAs account name.
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable String accountName;

    public Optional<String> getAccountName() {
        return this.accountName == null ? Optional.empty() : Optional.ofNullable(this.accountName);
    }

    public RunAsAccountResponse(
        @Nullable String accountId,
        @Nullable String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    private RunAsAccountResponse() {
        this.accountId = null;
        this.accountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunAsAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable String accountName;

        public Builder() {
    	      // Empty
        }

        public Builder(RunAsAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.accountName = defaults.accountName;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }
        public RunAsAccountResponse build() {
            return new RunAsAccountResponse(accountId, accountName);
        }
    }
}
