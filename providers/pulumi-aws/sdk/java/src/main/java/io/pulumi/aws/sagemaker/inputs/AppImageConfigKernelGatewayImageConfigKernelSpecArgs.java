// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigKernelGatewayImageConfigKernelSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigKernelSpecArgs Empty = new AppImageConfigKernelGatewayImageConfigKernelSpecArgs();

    /**
     * The display name of the kernel.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The name of the kernel.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public AppImageConfigKernelGatewayImageConfigKernelSpecArgs(
        @Nullable Input<String> displayName,
        Input<String> name) {
        this.displayName = displayName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private AppImageConfigKernelGatewayImageConfigKernelSpecArgs() {
        this.displayName = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigKernelSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigKernelSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public AppImageConfigKernelGatewayImageConfigKernelSpecArgs build() {
            return new AppImageConfigKernelGatewayImageConfigKernelSpecArgs(displayName, name);
        }
    }
}
