// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionConstraintsResource;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModelQualityJobDefinitionModelQualityBaselineConfig {
    private final @Nullable String baseliningJobName;
    private final @Nullable ModelQualityJobDefinitionConstraintsResource constraintsResource;

    @OutputCustomType.Constructor
    private ModelQualityJobDefinitionModelQualityBaselineConfig(
        @OutputCustomType.Parameter("baseliningJobName") @Nullable String baseliningJobName,
        @OutputCustomType.Parameter("constraintsResource") @Nullable ModelQualityJobDefinitionConstraintsResource constraintsResource) {
        this.baseliningJobName = baseliningJobName;
        this.constraintsResource = constraintsResource;
    }

    public Optional<String> getBaseliningJobName() {
        return Optional.ofNullable(this.baseliningJobName);
    }
    public Optional<ModelQualityJobDefinitionConstraintsResource> getConstraintsResource() {
        return Optional.ofNullable(this.constraintsResource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionModelQualityBaselineConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baseliningJobName;
        private @Nullable ModelQualityJobDefinitionConstraintsResource constraintsResource;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionModelQualityBaselineConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseliningJobName = defaults.baseliningJobName;
    	      this.constraintsResource = defaults.constraintsResource;
        }

        public Builder baseliningJobName(@Nullable String baseliningJobName) {
            this.baseliningJobName = baseliningJobName;
            return this;
        }

        public Builder constraintsResource(@Nullable ModelQualityJobDefinitionConstraintsResource constraintsResource) {
            this.constraintsResource = constraintsResource;
            return this;
        }
        public ModelQualityJobDefinitionModelQualityBaselineConfig build() {
            return new ModelQualityJobDefinitionModelQualityBaselineConfig(baseliningJobName, constraintsResource);
        }
    }
}
