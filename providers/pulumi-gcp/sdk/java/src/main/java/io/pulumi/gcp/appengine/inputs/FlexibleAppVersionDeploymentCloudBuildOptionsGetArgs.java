// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs Empty = new FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs();

    /**
     * Path to the yaml file used in deployment, used to determine runtime configuration details.
     * 
     */
    @InputImport(name="appYamlPath", required=true)
      private final Input<String> appYamlPath;

    public Input<String> getAppYamlPath() {
        return this.appYamlPath;
    }

    /**
     * The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="cloudBuildTimeout")
      private final @Nullable Input<String> cloudBuildTimeout;

    public Input<String> getCloudBuildTimeout() {
        return this.cloudBuildTimeout == null ? Input.empty() : this.cloudBuildTimeout;
    }

    public FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs(
        Input<String> appYamlPath,
        @Nullable Input<String> cloudBuildTimeout) {
        this.appYamlPath = Objects.requireNonNull(appYamlPath, "expected parameter 'appYamlPath' to be non-null");
        this.cloudBuildTimeout = cloudBuildTimeout;
    }

    private FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs() {
        this.appYamlPath = Input.empty();
        this.cloudBuildTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appYamlPath;
        private @Nullable Input<String> cloudBuildTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appYamlPath = defaults.appYamlPath;
    	      this.cloudBuildTimeout = defaults.cloudBuildTimeout;
        }

        public Builder appYamlPath(Input<String> appYamlPath) {
            this.appYamlPath = Objects.requireNonNull(appYamlPath);
            return this;
        }

        public Builder appYamlPath(String appYamlPath) {
            this.appYamlPath = Input.of(Objects.requireNonNull(appYamlPath));
            return this;
        }

        public Builder cloudBuildTimeout(@Nullable Input<String> cloudBuildTimeout) {
            this.cloudBuildTimeout = cloudBuildTimeout;
            return this;
        }

        public Builder cloudBuildTimeout(@Nullable String cloudBuildTimeout) {
            this.cloudBuildTimeout = Input.ofNullable(cloudBuildTimeout);
            return this;
        }
        public FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs build() {
            return new FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs(appYamlPath, cloudBuildTimeout);
        }
    }
}
