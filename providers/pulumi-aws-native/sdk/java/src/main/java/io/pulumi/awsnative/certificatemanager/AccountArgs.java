// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.certificatemanager;

import io.pulumi.awsnative.certificatemanager.inputs.AccountExpiryEventsConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    @Import(name="expiryEventsConfiguration", required=true)
      private final Output<AccountExpiryEventsConfigurationArgs> expiryEventsConfiguration;

    public Output<AccountExpiryEventsConfigurationArgs> getExpiryEventsConfiguration() {
        return this.expiryEventsConfiguration;
    }

    public AccountArgs(Output<AccountExpiryEventsConfigurationArgs> expiryEventsConfiguration) {
        this.expiryEventsConfiguration = Objects.requireNonNull(expiryEventsConfiguration, "expected parameter 'expiryEventsConfiguration' to be non-null");
    }

    private AccountArgs() {
        this.expiryEventsConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AccountExpiryEventsConfigurationArgs> expiryEventsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryEventsConfiguration = defaults.expiryEventsConfiguration;
        }

        public Builder expiryEventsConfiguration(Output<AccountExpiryEventsConfigurationArgs> expiryEventsConfiguration) {
            this.expiryEventsConfiguration = Objects.requireNonNull(expiryEventsConfiguration);
            return this;
        }
        public Builder expiryEventsConfiguration(AccountExpiryEventsConfigurationArgs expiryEventsConfiguration) {
            this.expiryEventsConfiguration = Output.of(Objects.requireNonNull(expiryEventsConfiguration));
            return this;
        }        public AccountArgs build() {
            return new AccountArgs(expiryEventsConfiguration);
        }
    }
}
