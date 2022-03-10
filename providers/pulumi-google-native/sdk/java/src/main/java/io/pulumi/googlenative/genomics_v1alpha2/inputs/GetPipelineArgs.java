// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPipelineArgs Empty = new GetPipelineArgs();

    @InputImport(name="pipelineId", required=true)
      private final String pipelineId;

    public String getPipelineId() {
        return this.pipelineId;
    }

    public GetPipelineArgs(String pipelineId) {
        this.pipelineId = Objects.requireNonNull(pipelineId, "expected parameter 'pipelineId' to be non-null");
    }

    private GetPipelineArgs() {
        this.pipelineId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pipelineId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineId = defaults.pipelineId;
        }

        public Builder pipelineId(String pipelineId) {
            this.pipelineId = Objects.requireNonNull(pipelineId);
            return this;
        }
        public GetPipelineArgs build() {
            return new GetPipelineArgs(pipelineId);
        }
    }
}
