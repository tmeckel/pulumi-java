// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLogDeliveryCanonicalUserIdResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String region;

    @OutputCustomType.Constructor
    private GetLogDeliveryCanonicalUserIdResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("region") @Nullable String region) {
        this.id = id;
        this.region = region;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogDeliveryCanonicalUserIdResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogDeliveryCanonicalUserIdResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.region = defaults.region;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public GetLogDeliveryCanonicalUserIdResult build() {
            return new GetLogDeliveryCanonicalUserIdResult(id, region);
        }
    }
}
