// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DistributionOriginS3OriginConfig {
    /**
     * @return The [CloudFront origin access
     * identity][5] to associate with the origin.
     * 
     */
    private final String originAccessIdentity;

    @CustomType.Constructor
    private DistributionOriginS3OriginConfig(@CustomType.Parameter("originAccessIdentity") String originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
    }

    /**
     * @return The [CloudFront origin access
     * identity][5] to associate with the origin.
     * 
     */
    public String originAccessIdentity() {
        return this.originAccessIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginS3OriginConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String originAccessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginS3OriginConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originAccessIdentity = defaults.originAccessIdentity;
        }

        public Builder originAccessIdentity(String originAccessIdentity) {
            this.originAccessIdentity = Objects.requireNonNull(originAccessIdentity);
            return this;
        }        public DistributionOriginS3OriginConfig build() {
            return new DistributionOriginS3OriginConfig(originAccessIdentity);
        }
    }
}
