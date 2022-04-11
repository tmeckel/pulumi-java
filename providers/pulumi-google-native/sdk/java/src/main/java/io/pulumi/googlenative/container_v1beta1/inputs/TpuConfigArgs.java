// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for Cloud TPU.
 * 
 */
public final class TpuConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final TpuConfigArgs Empty = new TpuConfigArgs();

    /**
     * Whether Cloud TPU integration is enabled or not.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * 
     */
    @Import(name="ipv4CidrBlock")
      private final @Nullable Output<String> ipv4CidrBlock;

    public Output<String> getIpv4CidrBlock() {
        return this.ipv4CidrBlock == null ? Codegen.empty() : this.ipv4CidrBlock;
    }

    /**
     * Whether to use service networking for Cloud TPU or not.
     * 
     */
    @Import(name="useServiceNetworking")
      private final @Nullable Output<Boolean> useServiceNetworking;

    public Output<Boolean> getUseServiceNetworking() {
        return this.useServiceNetworking == null ? Codegen.empty() : this.useServiceNetworking;
    }

    public TpuConfigArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> ipv4CidrBlock,
        @Nullable Output<Boolean> useServiceNetworking) {
        this.enabled = enabled;
        this.ipv4CidrBlock = ipv4CidrBlock;
        this.useServiceNetworking = useServiceNetworking;
    }

    private TpuConfigArgs() {
        this.enabled = Codegen.empty();
        this.ipv4CidrBlock = Codegen.empty();
        this.useServiceNetworking = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TpuConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> ipv4CidrBlock;
        private @Nullable Output<Boolean> useServiceNetworking;

        public Builder() {
    	      // Empty
        }

        public Builder(TpuConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.ipv4CidrBlock = defaults.ipv4CidrBlock;
    	      this.useServiceNetworking = defaults.useServiceNetworking;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder ipv4CidrBlock(@Nullable Output<String> ipv4CidrBlock) {
            this.ipv4CidrBlock = ipv4CidrBlock;
            return this;
        }
        public Builder ipv4CidrBlock(@Nullable String ipv4CidrBlock) {
            this.ipv4CidrBlock = Codegen.ofNullable(ipv4CidrBlock);
            return this;
        }
        public Builder useServiceNetworking(@Nullable Output<Boolean> useServiceNetworking) {
            this.useServiceNetworking = useServiceNetworking;
            return this;
        }
        public Builder useServiceNetworking(@Nullable Boolean useServiceNetworking) {
            this.useServiceNetworking = Codegen.ofNullable(useServiceNetworking);
            return this;
        }        public TpuConfigArgs build() {
            return new TpuConfigArgs(enabled, ipv4CidrBlock, useServiceNetworking);
        }
    }
}
