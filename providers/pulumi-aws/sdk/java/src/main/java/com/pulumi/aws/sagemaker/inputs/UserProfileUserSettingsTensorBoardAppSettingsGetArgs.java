// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class UserProfileUserSettingsTensorBoardAppSettingsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsTensorBoardAppSettingsGetArgs Empty = new UserProfileUserSettingsTensorBoardAppSettingsGetArgs();

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec", required=true)
    private Output<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;

    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    public Output<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    private UserProfileUserSettingsTensorBoardAppSettingsGetArgs() {}

    private UserProfileUserSettingsTensorBoardAppSettingsGetArgs(UserProfileUserSettingsTensorBoardAppSettingsGetArgs $) {
        this.defaultResourceSpec = $.defaultResourceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserProfileUserSettingsTensorBoardAppSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserProfileUserSettingsTensorBoardAppSettingsGetArgs $;

        public Builder() {
            $ = new UserProfileUserSettingsTensorBoardAppSettingsGetArgs();
        }

        public Builder(UserProfileUserSettingsTensorBoardAppSettingsGetArgs defaults) {
            $ = new UserProfileUserSettingsTensorBoardAppSettingsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
         * 
         * @return builder
         * 
         */
        public Builder defaultResourceSpec(Output<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec) {
            $.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        /**
         * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
         * 
         * @return builder
         * 
         */
        public Builder defaultResourceSpec(UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs defaultResourceSpec) {
            return defaultResourceSpec(Output.of(defaultResourceSpec));
        }

        public UserProfileUserSettingsTensorBoardAppSettingsGetArgs build() {
            $.defaultResourceSpec = Objects.requireNonNull($.defaultResourceSpec, "expected parameter 'defaultResourceSpec' to be non-null");
            return $;
        }
    }

}
