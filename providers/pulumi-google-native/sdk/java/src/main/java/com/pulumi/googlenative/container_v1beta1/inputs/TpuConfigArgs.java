// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for Cloud TPU.
 * 
 */
public final class TpuConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final TpuConfigArgs Empty = new TpuConfigArgs();

    /**
     * Whether Cloud TPU integration is enabled or not.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether Cloud TPU integration is enabled or not.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * 
     */
    @Import(name="ipv4CidrBlock")
    private @Nullable Output<String> ipv4CidrBlock;

    /**
     * @return IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * 
     */
    public Optional<Output<String>> ipv4CidrBlock() {
        return Optional.ofNullable(this.ipv4CidrBlock);
    }

    /**
     * Whether to use service networking for Cloud TPU or not.
     * 
     */
    @Import(name="useServiceNetworking")
    private @Nullable Output<Boolean> useServiceNetworking;

    /**
     * @return Whether to use service networking for Cloud TPU or not.
     * 
     */
    public Optional<Output<Boolean>> useServiceNetworking() {
        return Optional.ofNullable(this.useServiceNetworking);
    }

    private TpuConfigArgs() {}

    private TpuConfigArgs(TpuConfigArgs $) {
        this.enabled = $.enabled;
        this.ipv4CidrBlock = $.ipv4CidrBlock;
        this.useServiceNetworking = $.useServiceNetworking;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TpuConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TpuConfigArgs $;

        public Builder() {
            $ = new TpuConfigArgs();
        }

        public Builder(TpuConfigArgs defaults) {
            $ = new TpuConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether Cloud TPU integration is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether Cloud TPU integration is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param ipv4CidrBlock IPv4 CIDR block reserved for Cloud TPU in the VPC.
         * 
         * @return builder
         * 
         */
        public Builder ipv4CidrBlock(@Nullable Output<String> ipv4CidrBlock) {
            $.ipv4CidrBlock = ipv4CidrBlock;
            return this;
        }

        /**
         * @param ipv4CidrBlock IPv4 CIDR block reserved for Cloud TPU in the VPC.
         * 
         * @return builder
         * 
         */
        public Builder ipv4CidrBlock(String ipv4CidrBlock) {
            return ipv4CidrBlock(Output.of(ipv4CidrBlock));
        }

        /**
         * @param useServiceNetworking Whether to use service networking for Cloud TPU or not.
         * 
         * @return builder
         * 
         */
        public Builder useServiceNetworking(@Nullable Output<Boolean> useServiceNetworking) {
            $.useServiceNetworking = useServiceNetworking;
            return this;
        }

        /**
         * @param useServiceNetworking Whether to use service networking for Cloud TPU or not.
         * 
         * @return builder
         * 
         */
        public Builder useServiceNetworking(Boolean useServiceNetworking) {
            return useServiceNetworking(Output.of(useServiceNetworking));
        }

        public TpuConfigArgs build() {
            return $;
        }
    }

}
