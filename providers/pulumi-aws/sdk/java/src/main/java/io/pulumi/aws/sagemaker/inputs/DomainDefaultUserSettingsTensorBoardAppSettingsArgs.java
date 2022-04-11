// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsTensorBoardAppSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsTensorBoardAppSettingsArgs Empty = new DomainDefaultUserSettingsTensorBoardAppSettingsArgs();

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec")
      private final @Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;

    public Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec == null ? Codegen.empty() : this.defaultResourceSpec;
    }

    public DomainDefaultUserSettingsTensorBoardAppSettingsArgs(@Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    private DomainDefaultUserSettingsTensorBoardAppSettingsArgs() {
        this.defaultResourceSpec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsTensorBoardAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsTensorBoardAppSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder defaultResourceSpec(@Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }
        public Builder defaultResourceSpec(@Nullable DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs defaultResourceSpec) {
            this.defaultResourceSpec = Codegen.ofNullable(defaultResourceSpec);
            return this;
        }        public DomainDefaultUserSettingsTensorBoardAppSettingsArgs build() {
            return new DomainDefaultUserSettingsTensorBoardAppSettingsArgs(defaultResourceSpec);
        }
    }
}
