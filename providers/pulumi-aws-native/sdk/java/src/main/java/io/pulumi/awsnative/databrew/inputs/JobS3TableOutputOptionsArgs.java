// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobS3LocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class JobS3TableOutputOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobS3TableOutputOptionsArgs Empty = new JobS3TableOutputOptionsArgs();

    @InputImport(name="location", required=true)
      private final Input<JobS3LocationArgs> location;

    public Input<JobS3LocationArgs> getLocation() {
        return this.location;
    }

    public JobS3TableOutputOptionsArgs(Input<JobS3LocationArgs> location) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private JobS3TableOutputOptionsArgs() {
        this.location = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobS3TableOutputOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<JobS3LocationArgs> location;

        public Builder() {
    	      // Empty
        }

        public Builder(JobS3TableOutputOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder location(Input<JobS3LocationArgs> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder location(JobS3LocationArgs location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }
        public JobS3TableOutputOptionsArgs build() {
            return new JobS3TableOutputOptionsArgs(location);
        }
    }
}
