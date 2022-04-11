// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.BuildpackBindingPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BuildpackBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildpackBindingArgs Empty = new BuildpackBindingArgs();

    /**
     * The name of the build service resource.
     * 
     */
    @Import(name="buildServiceName", required=true)
      private final Output<String> buildServiceName;

    public Output<String> getBuildServiceName() {
        return this.buildServiceName;
    }

    /**
     * The name of the builder resource.
     * 
     */
    @Import(name="builderName", required=true)
      private final Output<String> builderName;

    public Output<String> getBuilderName() {
        return this.builderName;
    }

    /**
     * The name of the Buildpack Binding Name
     * 
     */
    @Import(name="buildpackBindingName")
      private final @Nullable Output<String> buildpackBindingName;

    public Output<String> getBuildpackBindingName() {
        return this.buildpackBindingName == null ? Codegen.empty() : this.buildpackBindingName;
    }

    /**
     * Properties of a buildpack binding
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<BuildpackBindingPropertiesArgs> properties;

    public Output<BuildpackBindingPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public BuildpackBindingArgs(
        Output<String> buildServiceName,
        Output<String> builderName,
        @Nullable Output<String> buildpackBindingName,
        @Nullable Output<BuildpackBindingPropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> serviceName) {
        this.buildServiceName = Objects.requireNonNull(buildServiceName, "expected parameter 'buildServiceName' to be non-null");
        this.builderName = Objects.requireNonNull(builderName, "expected parameter 'builderName' to be non-null");
        this.buildpackBindingName = buildpackBindingName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private BuildpackBindingArgs() {
        this.buildServiceName = Codegen.empty();
        this.builderName = Codegen.empty();
        this.buildpackBindingName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpackBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> buildServiceName;
        private Output<String> builderName;
        private @Nullable Output<String> buildpackBindingName;
        private @Nullable Output<BuildpackBindingPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpackBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildServiceName = defaults.buildServiceName;
    	      this.builderName = defaults.builderName;
    	      this.buildpackBindingName = defaults.buildpackBindingName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder buildServiceName(Output<String> buildServiceName) {
            this.buildServiceName = Objects.requireNonNull(buildServiceName);
            return this;
        }
        public Builder buildServiceName(String buildServiceName) {
            this.buildServiceName = Output.of(Objects.requireNonNull(buildServiceName));
            return this;
        }
        public Builder builderName(Output<String> builderName) {
            this.builderName = Objects.requireNonNull(builderName);
            return this;
        }
        public Builder builderName(String builderName) {
            this.builderName = Output.of(Objects.requireNonNull(builderName));
            return this;
        }
        public Builder buildpackBindingName(@Nullable Output<String> buildpackBindingName) {
            this.buildpackBindingName = buildpackBindingName;
            return this;
        }
        public Builder buildpackBindingName(@Nullable String buildpackBindingName) {
            this.buildpackBindingName = Codegen.ofNullable(buildpackBindingName);
            return this;
        }
        public Builder properties(@Nullable Output<BuildpackBindingPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable BuildpackBindingPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }        public BuildpackBindingArgs build() {
            return new BuildpackBindingArgs(buildServiceName, builderName, buildpackBindingName, properties, resourceGroupName, serviceName);
        }
    }
}
