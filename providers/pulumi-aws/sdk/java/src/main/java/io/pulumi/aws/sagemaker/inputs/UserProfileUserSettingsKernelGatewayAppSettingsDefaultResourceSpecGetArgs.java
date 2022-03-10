// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs Empty = new UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs();

    /**
     * The instance type.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * 
     */
    @InputImport(name="lifecycleConfigArn")
      private final @Nullable Input<String> lifecycleConfigArn;

    public Input<String> getLifecycleConfigArn() {
        return this.lifecycleConfigArn == null ? Input.empty() : this.lifecycleConfigArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * 
     */
    @InputImport(name="sagemakerImageArn")
      private final @Nullable Input<String> sagemakerImageArn;

    public Input<String> getSagemakerImageArn() {
        return this.sagemakerImageArn == null ? Input.empty() : this.sagemakerImageArn;
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @InputImport(name="sagemakerImageVersionArn")
      private final @Nullable Input<String> sagemakerImageVersionArn;

    public Input<String> getSagemakerImageVersionArn() {
        return this.sagemakerImageVersionArn == null ? Input.empty() : this.sagemakerImageVersionArn;
    }

    public UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs(
        @Nullable Input<String> instanceType,
        @Nullable Input<String> lifecycleConfigArn,
        @Nullable Input<String> sagemakerImageArn,
        @Nullable Input<String> sagemakerImageVersionArn) {
        this.instanceType = instanceType;
        this.lifecycleConfigArn = lifecycleConfigArn;
        this.sagemakerImageArn = sagemakerImageArn;
        this.sagemakerImageVersionArn = sagemakerImageVersionArn;
    }

    private UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs() {
        this.instanceType = Input.empty();
        this.lifecycleConfigArn = Input.empty();
        this.sagemakerImageArn = Input.empty();
        this.sagemakerImageVersionArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> lifecycleConfigArn;
        private @Nullable Input<String> sagemakerImageArn;
        private @Nullable Input<String> sagemakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.lifecycleConfigArn = defaults.lifecycleConfigArn;
    	      this.sagemakerImageArn = defaults.sagemakerImageArn;
    	      this.sagemakerImageVersionArn = defaults.sagemakerImageVersionArn;
        }

        public Builder instanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder lifecycleConfigArn(@Nullable Input<String> lifecycleConfigArn) {
            this.lifecycleConfigArn = lifecycleConfigArn;
            return this;
        }

        public Builder lifecycleConfigArn(@Nullable String lifecycleConfigArn) {
            this.lifecycleConfigArn = Input.ofNullable(lifecycleConfigArn);
            return this;
        }

        public Builder sagemakerImageArn(@Nullable Input<String> sagemakerImageArn) {
            this.sagemakerImageArn = sagemakerImageArn;
            return this;
        }

        public Builder sagemakerImageArn(@Nullable String sagemakerImageArn) {
            this.sagemakerImageArn = Input.ofNullable(sagemakerImageArn);
            return this;
        }

        public Builder sagemakerImageVersionArn(@Nullable Input<String> sagemakerImageVersionArn) {
            this.sagemakerImageVersionArn = sagemakerImageVersionArn;
            return this;
        }

        public Builder sagemakerImageVersionArn(@Nullable String sagemakerImageVersionArn) {
            this.sagemakerImageVersionArn = Input.ofNullable(sagemakerImageVersionArn);
            return this;
        }
        public UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs build() {
            return new UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs(instanceType, lifecycleConfigArn, sagemakerImageArn, sagemakerImageVersionArn);
        }
    }
}
