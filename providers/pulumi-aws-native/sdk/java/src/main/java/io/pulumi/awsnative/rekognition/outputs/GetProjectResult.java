// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rekognition.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProjectResult {
    private final @Nullable String arn;

    @OutputCustomType.Constructor
    private GetProjectResult(@OutputCustomType.Parameter("arn") @Nullable String arn) {
        this.arn = arn;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public GetProjectResult build() {
            return new GetProjectResult(arn);
        }
    }
}
