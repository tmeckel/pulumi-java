// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.aws.guardduty.outputs.DetectorDatasourcesS3Logs;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorDatasources {
    /**
     * @return Describes whether S3 data event logs are enabled as a data source. See S3 Logs below for more details.
     * 
     */
    private final @Nullable DetectorDatasourcesS3Logs s3Logs;

    @CustomType.Constructor
    private DetectorDatasources(@CustomType.Parameter("s3Logs") @Nullable DetectorDatasourcesS3Logs s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * @return Describes whether S3 data event logs are enabled as a data source. See S3 Logs below for more details.
     * 
     */
    public Optional<DetectorDatasourcesS3Logs> s3Logs() {
        return Optional.ofNullable(this.s3Logs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorDatasources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorDatasourcesS3Logs s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorDatasources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder s3Logs(@Nullable DetectorDatasourcesS3Logs s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }        public DetectorDatasources build() {
            return new DetectorDatasources(s3Logs);
        }
    }
}
