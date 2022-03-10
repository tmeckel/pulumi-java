// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ModelPrimaryContainerImageConfig {
    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
     * 
     */
    private final String repositoryAccessMode;

    @OutputCustomType.Constructor
    private ModelPrimaryContainerImageConfig(@OutputCustomType.Parameter("repositoryAccessMode") String repositoryAccessMode) {
        this.repositoryAccessMode = repositoryAccessMode;
    }

    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
     * 
    */
    public String getRepositoryAccessMode() {
        return this.repositoryAccessMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPrimaryContainerImageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String repositoryAccessMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelPrimaryContainerImageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryAccessMode = defaults.repositoryAccessMode;
        }

        public Builder repositoryAccessMode(String repositoryAccessMode) {
            this.repositoryAccessMode = Objects.requireNonNull(repositoryAccessMode);
            return this;
        }
        public ModelPrimaryContainerImageConfig build() {
            return new ModelPrimaryContainerImageConfig(repositoryAccessMode);
        }
    }
}
