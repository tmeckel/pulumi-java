// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetRepositoryImageScanningConfiguration {
    /**
     * @return Indicates whether images are scanned after being pushed to the repository.
     * 
     */
    private final Boolean scanOnPush;

    @CustomType.Constructor
    private GetRepositoryImageScanningConfiguration(@CustomType.Parameter("scanOnPush") Boolean scanOnPush) {
        this.scanOnPush = scanOnPush;
    }

    /**
     * @return Indicates whether images are scanned after being pushed to the repository.
     * 
     */
    public Boolean scanOnPush() {
        return this.scanOnPush;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryImageScanningConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean scanOnPush;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryImageScanningConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scanOnPush = defaults.scanOnPush;
        }

        public Builder scanOnPush(Boolean scanOnPush) {
            this.scanOnPush = Objects.requireNonNull(scanOnPush);
            return this;
        }        public GetRepositoryImageScanningConfiguration build() {
            return new GetRepositoryImageScanningConfiguration(scanOnPush);
        }
    }
}
