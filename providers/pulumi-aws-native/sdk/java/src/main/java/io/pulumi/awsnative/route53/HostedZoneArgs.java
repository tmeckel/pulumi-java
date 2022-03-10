// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53;

import io.pulumi.awsnative.route53.inputs.HostedZoneConfigArgs;
import io.pulumi.awsnative.route53.inputs.HostedZoneQueryLoggingConfigArgs;
import io.pulumi.awsnative.route53.inputs.HostedZoneTagArgs;
import io.pulumi.awsnative.route53.inputs.HostedZoneVPCArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedZoneArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostedZoneArgs Empty = new HostedZoneArgs();

    @InputImport(name="hostedZoneConfig")
      private final @Nullable Input<HostedZoneConfigArgs> hostedZoneConfig;

    public Input<HostedZoneConfigArgs> getHostedZoneConfig() {
        return this.hostedZoneConfig == null ? Input.empty() : this.hostedZoneConfig;
    }

    /**
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * 
     * For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
     * 
     */
    @InputImport(name="hostedZoneTags")
      private final @Nullable Input<List<HostedZoneTagArgs>> hostedZoneTags;

    public Input<List<HostedZoneTagArgs>> getHostedZoneTags() {
        return this.hostedZoneTags == null ? Input.empty() : this.hostedZoneTags;
    }

    /**
     * The name of the domain. Specify a fully qualified domain name, for example, www.example.com. The trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats www.example.com (without a trailing dot) and www.example.com. (with a trailing dot) as identical.
     * 
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your domain name is registered with a registrar other than Route 53, change the name servers for your domain to the set of NameServers that are returned by the Fn::GetAtt intrinsic function.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="queryLoggingConfig")
      private final @Nullable Input<HostedZoneQueryLoggingConfigArgs> queryLoggingConfig;

    public Input<HostedZoneQueryLoggingConfigArgs> getQueryLoggingConfig() {
        return this.queryLoggingConfig == null ? Input.empty() : this.queryLoggingConfig;
    }

    /**
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * 
     */
    @InputImport(name="vPCs")
      private final @Nullable Input<List<HostedZoneVPCArgs>> vPCs;

    public Input<List<HostedZoneVPCArgs>> getVPCs() {
        return this.vPCs == null ? Input.empty() : this.vPCs;
    }

    public HostedZoneArgs(
        @Nullable Input<HostedZoneConfigArgs> hostedZoneConfig,
        @Nullable Input<List<HostedZoneTagArgs>> hostedZoneTags,
        @Nullable Input<String> name,
        @Nullable Input<HostedZoneQueryLoggingConfigArgs> queryLoggingConfig,
        @Nullable Input<List<HostedZoneVPCArgs>> vPCs) {
        this.hostedZoneConfig = hostedZoneConfig;
        this.hostedZoneTags = hostedZoneTags;
        this.name = name;
        this.queryLoggingConfig = queryLoggingConfig;
        this.vPCs = vPCs;
    }

    private HostedZoneArgs() {
        this.hostedZoneConfig = Input.empty();
        this.hostedZoneTags = Input.empty();
        this.name = Input.empty();
        this.queryLoggingConfig = Input.empty();
        this.vPCs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HostedZoneConfigArgs> hostedZoneConfig;
        private @Nullable Input<List<HostedZoneTagArgs>> hostedZoneTags;
        private @Nullable Input<String> name;
        private @Nullable Input<HostedZoneQueryLoggingConfigArgs> queryLoggingConfig;
        private @Nullable Input<List<HostedZoneVPCArgs>> vPCs;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneConfig = defaults.hostedZoneConfig;
    	      this.hostedZoneTags = defaults.hostedZoneTags;
    	      this.name = defaults.name;
    	      this.queryLoggingConfig = defaults.queryLoggingConfig;
    	      this.vPCs = defaults.vPCs;
        }

        public Builder hostedZoneConfig(@Nullable Input<HostedZoneConfigArgs> hostedZoneConfig) {
            this.hostedZoneConfig = hostedZoneConfig;
            return this;
        }

        public Builder hostedZoneConfig(@Nullable HostedZoneConfigArgs hostedZoneConfig) {
            this.hostedZoneConfig = Input.ofNullable(hostedZoneConfig);
            return this;
        }

        public Builder hostedZoneTags(@Nullable Input<List<HostedZoneTagArgs>> hostedZoneTags) {
            this.hostedZoneTags = hostedZoneTags;
            return this;
        }

        public Builder hostedZoneTags(@Nullable List<HostedZoneTagArgs> hostedZoneTags) {
            this.hostedZoneTags = Input.ofNullable(hostedZoneTags);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder queryLoggingConfig(@Nullable Input<HostedZoneQueryLoggingConfigArgs> queryLoggingConfig) {
            this.queryLoggingConfig = queryLoggingConfig;
            return this;
        }

        public Builder queryLoggingConfig(@Nullable HostedZoneQueryLoggingConfigArgs queryLoggingConfig) {
            this.queryLoggingConfig = Input.ofNullable(queryLoggingConfig);
            return this;
        }

        public Builder vPCs(@Nullable Input<List<HostedZoneVPCArgs>> vPCs) {
            this.vPCs = vPCs;
            return this;
        }

        public Builder vPCs(@Nullable List<HostedZoneVPCArgs> vPCs) {
            this.vPCs = Input.ofNullable(vPCs);
            return this;
        }
        public HostedZoneArgs build() {
            return new HostedZoneArgs(hostedZoneConfig, hostedZoneTags, name, queryLoggingConfig, vPCs);
        }
    }
}
