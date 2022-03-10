// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class BucketBillingResponse {
    /**
     * When set to true, Requester Pays is enabled for this bucket.
     * 
     */
    private final Boolean requesterPays;

    @OutputCustomType.Constructor
    private BucketBillingResponse(@OutputCustomType.Parameter("requesterPays") Boolean requesterPays) {
        this.requesterPays = requesterPays;
    }

    /**
     * When set to true, Requester Pays is enabled for this bucket.
     * 
    */
    public Boolean getRequesterPays() {
        return this.requesterPays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketBillingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean requesterPays;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketBillingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requesterPays = defaults.requesterPays;
        }

        public Builder requesterPays(Boolean requesterPays) {
            this.requesterPays = Objects.requireNonNull(requesterPays);
            return this;
        }
        public BucketBillingResponse build() {
            return new BucketBillingResponse(requesterPays);
        }
    }
}
