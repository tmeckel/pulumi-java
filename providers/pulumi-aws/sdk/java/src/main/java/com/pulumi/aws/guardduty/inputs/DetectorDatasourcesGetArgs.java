// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.inputs;

import com.pulumi.aws.guardduty.inputs.DetectorDatasourcesS3LogsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorDatasourcesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorDatasourcesGetArgs Empty = new DetectorDatasourcesGetArgs();

    /**
     * Describes whether S3 data event logs are enabled as a data source. See S3 Logs below for more details.
     * 
     */
    @Import(name="s3Logs")
    private @Nullable Output<DetectorDatasourcesS3LogsGetArgs> s3Logs;

    /**
     * @return Describes whether S3 data event logs are enabled as a data source. See S3 Logs below for more details.
     * 
     */
    public Optional<Output<DetectorDatasourcesS3LogsGetArgs>> s3Logs() {
        return Optional.ofNullable(this.s3Logs);
    }

    private DetectorDatasourcesGetArgs() {}

    private DetectorDatasourcesGetArgs(DetectorDatasourcesGetArgs $) {
        this.s3Logs = $.s3Logs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorDatasourcesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorDatasourcesGetArgs $;

        public Builder() {
            $ = new DetectorDatasourcesGetArgs();
        }

        public Builder(DetectorDatasourcesGetArgs defaults) {
            $ = new DetectorDatasourcesGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3Logs Describes whether S3 data event logs are enabled as a data source. See S3 Logs below for more details.
         * 
         * @return builder
         * 
         */
        public Builder s3Logs(@Nullable Output<DetectorDatasourcesS3LogsGetArgs> s3Logs) {
            $.s3Logs = s3Logs;
            return this;
        }

        /**
         * @param s3Logs Describes whether S3 data event logs are enabled as a data source. See S3 Logs below for more details.
         * 
         * @return builder
         * 
         */
        public Builder s3Logs(DetectorDatasourcesS3LogsGetArgs s3Logs) {
            return s3Logs(Output.of(s3Logs));
        }

        public DetectorDatasourcesGetArgs build() {
            return $;
        }
    }

}
