// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.GoogleAutoArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identifies an account and how to log into it.
 * 
 */
public final class AccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * An automatic google login account.
     * 
     */
    @Import(name="googleAuto")
    private @Nullable Output<GoogleAutoArgs> googleAuto;

    /**
     * @return An automatic google login account.
     * 
     */
    public Optional<Output<GoogleAutoArgs>> googleAuto() {
        return Optional.ofNullable(this.googleAuto);
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.googleAuto = $.googleAuto;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param googleAuto An automatic google login account.
         * 
         * @return builder
         * 
         */
        public Builder googleAuto(@Nullable Output<GoogleAutoArgs> googleAuto) {
            $.googleAuto = googleAuto;
            return this;
        }

        /**
         * @param googleAuto An automatic google login account.
         * 
         * @return builder
         * 
         */
        public Builder googleAuto(GoogleAutoArgs googleAuto) {
            return googleAuto(Output.of(googleAuto));
        }

        public AccountArgs build() {
            return $;
        }
    }

}
