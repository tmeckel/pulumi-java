// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fms.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyIncludeMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyIncludeMapArgs Empty = new PolicyIncludeMapArgs();

    /**
     * A list of AWS Organization member Accounts that you want to include for this AWS FMS Policy.
     * 
     */
    @InputImport(name="accounts")
      private final @Nullable Input<List<String>> accounts;

    public Input<List<String>> getAccounts() {
        return this.accounts == null ? Input.empty() : this.accounts;
    }

    /**
     * A list of AWS Organizational Units that you want to include for this AWS FMS Policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time.
     * 
     */
    @InputImport(name="orgunits")
      private final @Nullable Input<List<String>> orgunits;

    public Input<List<String>> getOrgunits() {
        return this.orgunits == null ? Input.empty() : this.orgunits;
    }

    public PolicyIncludeMapArgs(
        @Nullable Input<List<String>> accounts,
        @Nullable Input<List<String>> orgunits) {
        this.accounts = accounts;
        this.orgunits = orgunits;
    }

    private PolicyIncludeMapArgs() {
        this.accounts = Input.empty();
        this.orgunits = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyIncludeMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> accounts;
        private @Nullable Input<List<String>> orgunits;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyIncludeMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.orgunits = defaults.orgunits;
        }

        public Builder accounts(@Nullable Input<List<String>> accounts) {
            this.accounts = accounts;
            return this;
        }

        public Builder accounts(@Nullable List<String> accounts) {
            this.accounts = Input.ofNullable(accounts);
            return this;
        }

        public Builder orgunits(@Nullable Input<List<String>> orgunits) {
            this.orgunits = orgunits;
            return this;
        }

        public Builder orgunits(@Nullable List<String> orgunits) {
            this.orgunits = Input.ofNullable(orgunits);
            return this;
        }
        public PolicyIncludeMapArgs build() {
            return new PolicyIncludeMapArgs(accounts, orgunits);
        }
    }
}
