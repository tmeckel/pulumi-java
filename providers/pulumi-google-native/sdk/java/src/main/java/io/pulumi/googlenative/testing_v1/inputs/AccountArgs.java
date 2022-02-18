// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.GoogleAutoArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identifies an account and how to log into it.
 * 
 */
public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * An automatic google login account.
     * 
     */
    @InputImport(name="googleAuto")
    private final @Nullable Input<GoogleAutoArgs> googleAuto;

    public Input<GoogleAutoArgs> getGoogleAuto() {
        return this.googleAuto == null ? Input.empty() : this.googleAuto;
    }

    public AccountArgs(@Nullable Input<GoogleAutoArgs> googleAuto) {
        this.googleAuto = googleAuto;
    }

    private AccountArgs() {
        this.googleAuto = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleAutoArgs> googleAuto;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleAuto = defaults.googleAuto;
        }

        public Builder setGoogleAuto(@Nullable Input<GoogleAutoArgs> googleAuto) {
            this.googleAuto = googleAuto;
            return this;
        }

        public Builder setGoogleAuto(@Nullable GoogleAutoArgs googleAuto) {
            this.googleAuto = Input.ofNullable(googleAuto);
            return this;
        }

        public AccountArgs build() {
            return new AccountArgs(googleAuto);
        }
    }
}
