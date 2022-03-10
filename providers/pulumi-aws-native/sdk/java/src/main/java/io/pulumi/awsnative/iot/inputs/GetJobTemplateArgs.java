// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetJobTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetJobTemplateArgs Empty = new GetJobTemplateArgs();

    @InputImport(name="jobTemplateId", required=true)
      private final String jobTemplateId;

    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public GetJobTemplateArgs(String jobTemplateId) {
        this.jobTemplateId = Objects.requireNonNull(jobTemplateId, "expected parameter 'jobTemplateId' to be non-null");
    }

    private GetJobTemplateArgs() {
        this.jobTemplateId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobTemplateId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobTemplateId = defaults.jobTemplateId;
        }

        public Builder jobTemplateId(String jobTemplateId) {
            this.jobTemplateId = Objects.requireNonNull(jobTemplateId);
            return this;
        }
        public GetJobTemplateArgs build() {
            return new GetJobTemplateArgs(jobTemplateId);
        }
    }
}
