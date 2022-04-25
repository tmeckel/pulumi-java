// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.outputs;

import com.pulumi.awsnative.imagebuilder.outputs.DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionConfigurationDistributionAmiDistributionConfigurationProperties {
    /**
     * @return The tags to apply to AMIs distributed to this Region.
     * 
     */
    private final @Nullable Object amiTags;
    /**
     * @return The description of the AMI distribution configuration.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The KMS key identifier used to encrypt the distributed image.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * @return Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * 
     */
    private final @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties launchPermissionConfiguration;
    /**
     * @return The name of the AMI distribution configuration.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The ID of accounts to which you want to distribute an image.
     * 
     */
    private final @Nullable List<String> targetAccountIds;

    @CustomType.Constructor
    private DistributionConfigurationDistributionAmiDistributionConfigurationProperties(
        @CustomType.Parameter("amiTags") @Nullable Object amiTags,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("launchPermissionConfiguration") @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties launchPermissionConfiguration,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("targetAccountIds") @Nullable List<String> targetAccountIds) {
        this.amiTags = amiTags;
        this.description = description;
        this.kmsKeyId = kmsKeyId;
        this.launchPermissionConfiguration = launchPermissionConfiguration;
        this.name = name;
        this.targetAccountIds = targetAccountIds;
    }

    /**
     * @return The tags to apply to AMIs distributed to this Region.
     * 
     */
    public Optional<Object> amiTags() {
        return Optional.ofNullable(this.amiTags);
    }
    /**
     * @return The description of the AMI distribution configuration.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The KMS key identifier used to encrypt the distributed image.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * 
     */
    public Optional<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties> launchPermissionConfiguration() {
        return Optional.ofNullable(this.launchPermissionConfiguration);
    }
    /**
     * @return The name of the AMI distribution configuration.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The ID of accounts to which you want to distribute an image.
     * 
     */
    public List<String> targetAccountIds() {
        return this.targetAccountIds == null ? List.of() : this.targetAccountIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionAmiDistributionConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object amiTags;
        private @Nullable String description;
        private @Nullable String kmsKeyId;
        private @Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties launchPermissionConfiguration;
        private @Nullable String name;
        private @Nullable List<String> targetAccountIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionAmiDistributionConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiTags = defaults.amiTags;
    	      this.description = defaults.description;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.launchPermissionConfiguration = defaults.launchPermissionConfiguration;
    	      this.name = defaults.name;
    	      this.targetAccountIds = defaults.targetAccountIds;
        }

        public Builder amiTags(@Nullable Object amiTags) {
            this.amiTags = amiTags;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder launchPermissionConfiguration(@Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties launchPermissionConfiguration) {
            this.launchPermissionConfiguration = launchPermissionConfiguration;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder targetAccountIds(@Nullable List<String> targetAccountIds) {
            this.targetAccountIds = targetAccountIds;
            return this;
        }
        public Builder targetAccountIds(String... targetAccountIds) {
            return targetAccountIds(List.of(targetAccountIds));
        }        public DistributionConfigurationDistributionAmiDistributionConfigurationProperties build() {
            return new DistributionConfigurationDistributionAmiDistributionConfigurationProperties(amiTags, description, kmsKeyId, launchPermissionConfiguration, name, targetAccountIds);
        }
    }
}
