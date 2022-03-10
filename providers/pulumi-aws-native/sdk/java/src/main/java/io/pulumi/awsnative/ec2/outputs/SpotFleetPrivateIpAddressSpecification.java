// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotFleetPrivateIpAddressSpecification {
    private final @Nullable Boolean primary;
    private final String privateIpAddress;

    @OutputCustomType.Constructor
    private SpotFleetPrivateIpAddressSpecification(
        @OutputCustomType.Parameter("primary") @Nullable Boolean primary,
        @OutputCustomType.Parameter("privateIpAddress") String privateIpAddress) {
        this.primary = primary;
        this.privateIpAddress = privateIpAddress;
    }

    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetPrivateIpAddressSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean primary;
        private String privateIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetPrivateIpAddressSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primary = defaults.primary;
    	      this.privateIpAddress = defaults.privateIpAddress;
        }

        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }

        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public SpotFleetPrivateIpAddressSpecification build() {
            return new SpotFleetPrivateIpAddressSpecification(primary, privateIpAddress);
        }
    }
}
