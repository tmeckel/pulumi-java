// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyIncludeMap {
    /**
     * A list of AWS Organization member Accounts that you want to include for this AWS FMS Policy.
     * 
     */
    private final @Nullable List<String> accounts;
    /**
     * A list of AWS Organizational Units that you want to include for this AWS FMS Policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time.
     * 
     */
    private final @Nullable List<String> orgunits;

    @OutputCustomType.Constructor
    private PolicyIncludeMap(
        @OutputCustomType.Parameter("accounts") @Nullable List<String> accounts,
        @OutputCustomType.Parameter("orgunits") @Nullable List<String> orgunits) {
        this.accounts = accounts;
        this.orgunits = orgunits;
    }

    /**
     * A list of AWS Organization member Accounts that you want to include for this AWS FMS Policy.
     * 
    */
    public List<String> getAccounts() {
        return this.accounts == null ? List.of() : this.accounts;
    }
    /**
     * A list of AWS Organizational Units that you want to include for this AWS FMS Policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time.
     * 
    */
    public List<String> getOrgunits() {
        return this.orgunits == null ? List.of() : this.orgunits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyIncludeMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> accounts;
        private @Nullable List<String> orgunits;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyIncludeMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.orgunits = defaults.orgunits;
        }

        public Builder accounts(@Nullable List<String> accounts) {
            this.accounts = accounts;
            return this;
        }

        public Builder orgunits(@Nullable List<String> orgunits) {
            this.orgunits = orgunits;
            return this;
        }
        public PolicyIncludeMap build() {
            return new PolicyIncludeMap(accounts, orgunits);
        }
    }
}
