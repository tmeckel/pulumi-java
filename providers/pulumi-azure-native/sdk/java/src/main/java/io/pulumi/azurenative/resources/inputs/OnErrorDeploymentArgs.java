// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.azurenative.resources.enums.OnErrorDeploymentType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deployment on error behavior.
 * 
 */
public final class OnErrorDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnErrorDeploymentArgs Empty = new OnErrorDeploymentArgs();

    /**
     * The deployment to be used on error case.
     * 
     */
    @Import(name="deploymentName")
      private final @Nullable Output<String> deploymentName;

    public Output<String> getDeploymentName() {
        return this.deploymentName == null ? Codegen.empty() : this.deploymentName;
    }

    /**
     * The deployment on error behavior type. Possible values are LastSuccessful and SpecificDeployment.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<OnErrorDeploymentType> type;

    public Output<OnErrorDeploymentType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public OnErrorDeploymentArgs(
        @Nullable Output<String> deploymentName,
        @Nullable Output<OnErrorDeploymentType> type) {
        this.deploymentName = deploymentName;
        this.type = type;
    }

    private OnErrorDeploymentArgs() {
        this.deploymentName = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnErrorDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deploymentName;
        private @Nullable Output<OnErrorDeploymentType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OnErrorDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.type = defaults.type;
        }

        public Builder deploymentName(@Nullable Output<String> deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }
        public Builder deploymentName(@Nullable String deploymentName) {
            this.deploymentName = Codegen.ofNullable(deploymentName);
            return this;
        }
        public Builder type(@Nullable Output<OnErrorDeploymentType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable OnErrorDeploymentType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public OnErrorDeploymentArgs build() {
            return new OnErrorDeploymentArgs(deploymentName, type);
        }
    }
}
