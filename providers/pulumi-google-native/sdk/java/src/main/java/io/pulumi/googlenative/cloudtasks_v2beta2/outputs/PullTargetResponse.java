// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class PullTargetResponse {
    @OutputCustomType.Constructor({})
    private PullTargetResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PullTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(PullTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public PullTargetResponse build() {
            return new PullTargetResponse();
        }
    }
}
