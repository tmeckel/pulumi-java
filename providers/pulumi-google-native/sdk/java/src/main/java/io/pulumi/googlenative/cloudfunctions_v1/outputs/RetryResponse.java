// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class RetryResponse {
    @OutputCustomType.Constructor({})
    private RetryResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RetryResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public RetryResponse build() {
            return new RetryResponse();
        }
    }
}
