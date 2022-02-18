// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbilling_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingAccountArgs Empty = new BillingAccountArgs();

    /**
     * The display name given to the billing account, such as `My Billing Account`. This name is displayed in the Google Cloud Console.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * If this account is a [subaccount](https://cloud.google.com/billing/docs/concepts), then this will be the resource name of the parent billing account that it is being resold through. Otherwise this will be empty.
     * 
     */
    @InputImport(name="masterBillingAccount")
    private final @Nullable Input<String> masterBillingAccount;

    public Input<String> getMasterBillingAccount() {
        return this.masterBillingAccount == null ? Input.empty() : this.masterBillingAccount;
    }

    public BillingAccountArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<String> masterBillingAccount) {
        this.displayName = displayName;
        this.masterBillingAccount = masterBillingAccount;
    }

    private BillingAccountArgs() {
        this.displayName = Input.empty();
        this.masterBillingAccount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> masterBillingAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.masterBillingAccount = defaults.masterBillingAccount;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setMasterBillingAccount(@Nullable Input<String> masterBillingAccount) {
            this.masterBillingAccount = masterBillingAccount;
            return this;
        }

        public Builder setMasterBillingAccount(@Nullable String masterBillingAccount) {
            this.masterBillingAccount = Input.ofNullable(masterBillingAccount);
            return this;
        }

        public BillingAccountArgs build() {
            return new BillingAccountArgs(displayName, masterBillingAccount);
        }
    }
}
