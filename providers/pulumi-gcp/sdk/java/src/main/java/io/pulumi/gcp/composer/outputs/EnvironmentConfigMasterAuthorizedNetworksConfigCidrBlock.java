// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock {
    private final String cidrBlock;
    private final @Nullable String displayName;

    @OutputCustomType.Constructor
    private EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock(
        @OutputCustomType.Parameter("cidrBlock") String cidrBlock,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName) {
        this.cidrBlock = cidrBlock;
        this.displayName = displayName;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrBlock;
        private @Nullable String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock build() {
            return new EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock(cidrBlock, displayName);
        }
    }
}
