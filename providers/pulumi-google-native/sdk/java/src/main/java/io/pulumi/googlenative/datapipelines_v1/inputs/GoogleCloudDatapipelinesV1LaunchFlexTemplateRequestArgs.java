// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A request to launch a Dataflow job from a Flex Template.
 * 
 */
public final class GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs Empty = new GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs();

    /**
     * Parameter to launch a job from a Flex Template.
     * 
     */
    @InputImport(name="launchParameter", required=true)
    private final Input<GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs> launchParameter;

    public Input<GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs> getLaunchParameter() {
        return this.launchParameter;
    }

    /**
     * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
     * 
     */
    @InputImport(name="location", required=true)
    private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    @InputImport(name="project", required=true)
    private final Input<String> project;

    public Input<String> getProject() {
        return this.project;
    }

    /**
     * If true, the request is validated but not actually executed. Defaults to false.
     * 
     */
    @InputImport(name="validateOnly")
    private final @Nullable Input<Boolean> validateOnly;

    public Input<Boolean> getValidateOnly() {
        return this.validateOnly == null ? Input.empty() : this.validateOnly;
    }

    public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs(
        Input<GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs> launchParameter,
        Input<String> location,
        Input<String> project,
        @Nullable Input<Boolean> validateOnly) {
        this.launchParameter = Objects.requireNonNull(launchParameter, "expected parameter 'launchParameter' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.validateOnly = validateOnly;
    }

    private GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs() {
        this.launchParameter = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.validateOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs> launchParameter;
        private Input<String> location;
        private Input<String> project;
        private @Nullable Input<Boolean> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchParameter = defaults.launchParameter;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder setLaunchParameter(Input<GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs> launchParameter) {
            this.launchParameter = Objects.requireNonNull(launchParameter);
            return this;
        }

        public Builder setLaunchParameter(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs launchParameter) {
            this.launchParameter = Input.of(Objects.requireNonNull(launchParameter));
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setProject(Input<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Input.of(Objects.requireNonNull(project));
            return this;
        }

        public Builder setValidateOnly(@Nullable Input<Boolean> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder setValidateOnly(@Nullable Boolean validateOnly) {
            this.validateOnly = Input.ofNullable(validateOnly);
            return this;
        }

        public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs build() {
            return new GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs(launchParameter, location, project, validateOnly);
        }
    }
}
