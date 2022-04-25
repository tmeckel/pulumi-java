// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpec;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainDefaultUserSettingsTensorBoardAppSettings {
    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    private final @Nullable DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec;

    @CustomType.Constructor
    private DomainDefaultUserSettingsTensorBoardAppSettings(@CustomType.Parameter("defaultResourceSpec") @Nullable DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    public Optional<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpec> defaultResourceSpec() {
        return Optional.ofNullable(this.defaultResourceSpec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsTensorBoardAppSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsTensorBoardAppSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder defaultResourceSpec(@Nullable DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }        public DomainDefaultUserSettingsTensorBoardAppSettings build() {
            return new DomainDefaultUserSettingsTensorBoardAppSettings(defaultResourceSpec);
        }
    }
}
