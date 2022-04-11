// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters to provide to the template being launched.
 * 
 */
public final class GoogleCloudDatapipelinesV1LaunchTemplateParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatapipelinesV1LaunchTemplateParametersArgs Empty = new GoogleCloudDatapipelinesV1LaunchTemplateParametersArgs();

    /**
     * The runtime environment for the job.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs> environment;

    public Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs> getEnvironment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * The job name to use for the created job.
     * 
     */
    @Import(name="jobName", required=true)
      private final Output<String> jobName;

    public Output<String> getJobName() {
        return this.jobName;
    }

    /**
     * The runtime parameters to pass to the job.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job. Only applicable when updating a pipeline.
     * 
     */
    @Import(name="transformNameMapping")
      private final @Nullable Output<Map<String,String>> transformNameMapping;

    public Output<Map<String,String>> getTransformNameMapping() {
        return this.transformNameMapping == null ? Codegen.empty() : this.transformNameMapping;
    }

    /**
     * If set, replace the existing pipeline with the name specified by jobName with this pipeline, preserving state.
     * 
     */
    @Import(name="update")
      private final @Nullable Output<Boolean> update;

    public Output<Boolean> getUpdate() {
        return this.update == null ? Codegen.empty() : this.update;
    }

    public GoogleCloudDatapipelinesV1LaunchTemplateParametersArgs(
        @Nullable Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs> environment,
        Output<String> jobName,
        @Nullable Output<Map<String,String>> parameters,
        @Nullable Output<Map<String,String>> transformNameMapping,
        @Nullable Output<Boolean> update) {
        this.environment = environment;
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.parameters = parameters;
        this.transformNameMapping = transformNameMapping;
        this.update = update;
    }

    private GoogleCloudDatapipelinesV1LaunchTemplateParametersArgs() {
        this.environment = Codegen.empty();
        this.jobName = Codegen.empty();
        this.parameters = Codegen.empty();
        this.transformNameMapping = Codegen.empty();
        this.update = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1LaunchTemplateParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs> environment;
        private Output<String> jobName;
        private @Nullable Output<Map<String,String>> parameters;
        private @Nullable Output<Map<String,String>> transformNameMapping;
        private @Nullable Output<Boolean> update;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchTemplateParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.jobName = defaults.jobName;
    	      this.parameters = defaults.parameters;
    	      this.transformNameMapping = defaults.transformNameMapping;
    	      this.update = defaults.update;
        }

        public Builder environment(@Nullable Output<GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable GoogleCloudDatapipelinesV1RuntimeEnvironmentArgs environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder jobName(Output<String> jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }
        public Builder jobName(String jobName) {
            this.jobName = Output.of(Objects.requireNonNull(jobName));
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder transformNameMapping(@Nullable Output<Map<String,String>> transformNameMapping) {
            this.transformNameMapping = transformNameMapping;
            return this;
        }
        public Builder transformNameMapping(@Nullable Map<String,String> transformNameMapping) {
            this.transformNameMapping = Codegen.ofNullable(transformNameMapping);
            return this;
        }
        public Builder update(@Nullable Output<Boolean> update) {
            this.update = update;
            return this;
        }
        public Builder update(@Nullable Boolean update) {
            this.update = Codegen.ofNullable(update);
            return this;
        }        public GoogleCloudDatapipelinesV1LaunchTemplateParametersArgs build() {
            return new GoogleCloudDatapipelinesV1LaunchTemplateParametersArgs(environment, jobName, parameters, transformNameMapping, update);
        }
    }
}
