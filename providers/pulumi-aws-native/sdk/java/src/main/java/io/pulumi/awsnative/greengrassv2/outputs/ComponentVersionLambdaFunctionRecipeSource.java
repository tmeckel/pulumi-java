// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.outputs;

import io.pulumi.awsnative.greengrassv2.outputs.ComponentVersionComponentPlatform;
import io.pulumi.awsnative.greengrassv2.outputs.ComponentVersionLambdaExecutionParameters;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComponentVersionLambdaFunctionRecipeSource {
    private final @Nullable Object componentDependencies;
    private final @Nullable ComponentVersionLambdaExecutionParameters componentLambdaParameters;
    private final @Nullable String componentName;
    private final @Nullable List<ComponentVersionComponentPlatform> componentPlatforms;
    private final @Nullable String componentVersion;
    private final @Nullable String lambdaArn;

    @OutputCustomType.Constructor
    private ComponentVersionLambdaFunctionRecipeSource(
        @OutputCustomType.Parameter("componentDependencies") @Nullable Object componentDependencies,
        @OutputCustomType.Parameter("componentLambdaParameters") @Nullable ComponentVersionLambdaExecutionParameters componentLambdaParameters,
        @OutputCustomType.Parameter("componentName") @Nullable String componentName,
        @OutputCustomType.Parameter("componentPlatforms") @Nullable List<ComponentVersionComponentPlatform> componentPlatforms,
        @OutputCustomType.Parameter("componentVersion") @Nullable String componentVersion,
        @OutputCustomType.Parameter("lambdaArn") @Nullable String lambdaArn) {
        this.componentDependencies = componentDependencies;
        this.componentLambdaParameters = componentLambdaParameters;
        this.componentName = componentName;
        this.componentPlatforms = componentPlatforms;
        this.componentVersion = componentVersion;
        this.lambdaArn = lambdaArn;
    }

    public Optional<Object> getComponentDependencies() {
        return Optional.ofNullable(this.componentDependencies);
    }
    public Optional<ComponentVersionLambdaExecutionParameters> getComponentLambdaParameters() {
        return Optional.ofNullable(this.componentLambdaParameters);
    }
    public Optional<String> getComponentName() {
        return Optional.ofNullable(this.componentName);
    }
    public List<ComponentVersionComponentPlatform> getComponentPlatforms() {
        return this.componentPlatforms == null ? List.of() : this.componentPlatforms;
    }
    public Optional<String> getComponentVersion() {
        return Optional.ofNullable(this.componentVersion);
    }
    public Optional<String> getLambdaArn() {
        return Optional.ofNullable(this.lambdaArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaFunctionRecipeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object componentDependencies;
        private @Nullable ComponentVersionLambdaExecutionParameters componentLambdaParameters;
        private @Nullable String componentName;
        private @Nullable List<ComponentVersionComponentPlatform> componentPlatforms;
        private @Nullable String componentVersion;
        private @Nullable String lambdaArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaFunctionRecipeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentDependencies = defaults.componentDependencies;
    	      this.componentLambdaParameters = defaults.componentLambdaParameters;
    	      this.componentName = defaults.componentName;
    	      this.componentPlatforms = defaults.componentPlatforms;
    	      this.componentVersion = defaults.componentVersion;
    	      this.lambdaArn = defaults.lambdaArn;
        }

        public Builder componentDependencies(@Nullable Object componentDependencies) {
            this.componentDependencies = componentDependencies;
            return this;
        }

        public Builder componentLambdaParameters(@Nullable ComponentVersionLambdaExecutionParameters componentLambdaParameters) {
            this.componentLambdaParameters = componentLambdaParameters;
            return this;
        }

        public Builder componentName(@Nullable String componentName) {
            this.componentName = componentName;
            return this;
        }

        public Builder componentPlatforms(@Nullable List<ComponentVersionComponentPlatform> componentPlatforms) {
            this.componentPlatforms = componentPlatforms;
            return this;
        }

        public Builder componentVersion(@Nullable String componentVersion) {
            this.componentVersion = componentVersion;
            return this;
        }

        public Builder lambdaArn(@Nullable String lambdaArn) {
            this.lambdaArn = lambdaArn;
            return this;
        }
        public ComponentVersionLambdaFunctionRecipeSource build() {
            return new ComponentVersionLambdaFunctionRecipeSource(componentDependencies, componentLambdaParameters, componentName, componentPlatforms, componentVersion, lambdaArn);
        }
    }
}
