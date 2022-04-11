// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs Empty = new UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs();

    /**
     * The name of the App Image Config.
     * 
     */
    @Import(name="appImageConfigName", required=true)
      private final Output<String> appImageConfigName;

    public Output<String> getAppImageConfigName() {
        return this.appImageConfigName;
    }

    /**
     * The name of the Custom Image.
     * 
     */
    @Import(name="imageName", required=true)
      private final Output<String> imageName;

    public Output<String> getImageName() {
        return this.imageName;
    }

    /**
     * The version number of the Custom Image.
     * 
     */
    @Import(name="imageVersionNumber")
      private final @Nullable Output<Integer> imageVersionNumber;

    public Output<Integer> getImageVersionNumber() {
        return this.imageVersionNumber == null ? Codegen.empty() : this.imageVersionNumber;
    }

    public UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs(
        Output<String> appImageConfigName,
        Output<String> imageName,
        @Nullable Output<Integer> imageVersionNumber) {
        this.appImageConfigName = Objects.requireNonNull(appImageConfigName, "expected parameter 'appImageConfigName' to be non-null");
        this.imageName = Objects.requireNonNull(imageName, "expected parameter 'imageName' to be non-null");
        this.imageVersionNumber = imageVersionNumber;
    }

    private UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs() {
        this.appImageConfigName = Codegen.empty();
        this.imageName = Codegen.empty();
        this.imageVersionNumber = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appImageConfigName;
        private Output<String> imageName;
        private @Nullable Output<Integer> imageVersionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appImageConfigName = defaults.appImageConfigName;
    	      this.imageName = defaults.imageName;
    	      this.imageVersionNumber = defaults.imageVersionNumber;
        }

        public Builder appImageConfigName(Output<String> appImageConfigName) {
            this.appImageConfigName = Objects.requireNonNull(appImageConfigName);
            return this;
        }
        public Builder appImageConfigName(String appImageConfigName) {
            this.appImageConfigName = Output.of(Objects.requireNonNull(appImageConfigName));
            return this;
        }
        public Builder imageName(Output<String> imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        public Builder imageName(String imageName) {
            this.imageName = Output.of(Objects.requireNonNull(imageName));
            return this;
        }
        public Builder imageVersionNumber(@Nullable Output<Integer> imageVersionNumber) {
            this.imageVersionNumber = imageVersionNumber;
            return this;
        }
        public Builder imageVersionNumber(@Nullable Integer imageVersionNumber) {
            this.imageVersionNumber = Codegen.ofNullable(imageVersionNumber);
            return this;
        }        public UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs build() {
            return new UserProfileUserSettingsKernelGatewayAppSettingsCustomImageArgs(appImageConfigName, imageName, imageVersionNumber);
        }
    }
}
