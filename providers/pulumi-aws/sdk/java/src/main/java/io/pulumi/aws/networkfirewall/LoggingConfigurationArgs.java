// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall;

import io.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class LoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationArgs Empty = new LoggingConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) of the Network Firewall firewall.
     * 
     */
    @Import(name="firewallArn", required=true)
      private final Output<String> firewallArn;

    public Output<String> getFirewallArn() {
        return this.firewallArn;
    }

    /**
     * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     * 
     */
    @Import(name="loggingConfiguration", required=true)
      private final Output<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration;

    public Output<LoggingConfigurationLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    public LoggingConfigurationArgs(
        Output<String> firewallArn,
        Output<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration) {
        this.firewallArn = Objects.requireNonNull(firewallArn, "expected parameter 'firewallArn' to be non-null");
        this.loggingConfiguration = Objects.requireNonNull(loggingConfiguration, "expected parameter 'loggingConfiguration' to be non-null");
    }

    private LoggingConfigurationArgs() {
        this.firewallArn = Codegen.empty();
        this.loggingConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> firewallArn;
        private Output<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallArn = defaults.firewallArn;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
        }

        public Builder firewallArn(Output<String> firewallArn) {
            this.firewallArn = Objects.requireNonNull(firewallArn);
            return this;
        }
        public Builder firewallArn(String firewallArn) {
            this.firewallArn = Output.of(Objects.requireNonNull(firewallArn));
            return this;
        }
        public Builder loggingConfiguration(Output<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = Objects.requireNonNull(loggingConfiguration);
            return this;
        }
        public Builder loggingConfiguration(LoggingConfigurationLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Output.of(Objects.requireNonNull(loggingConfiguration));
            return this;
        }        public LoggingConfigurationArgs build() {
            return new LoggingConfigurationArgs(firewallArn, loggingConfiguration);
        }
    }
}
