// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class DetectorDatasourcesS3LogsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorDatasourcesS3LogsGetArgs Empty = new DetectorDatasourcesS3LogsGetArgs();

    /**
     * If true, enables [S3 Protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3_detection.html). Defaults to `true`.
     * 
     */
    @InputImport(name="enable", required=true)
      private final Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable;
    }

    public DetectorDatasourcesS3LogsGetArgs(Input<Boolean> enable) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
    }

    private DetectorDatasourcesS3LogsGetArgs() {
        this.enable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorDatasourcesS3LogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enable;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorDatasourcesS3LogsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder enable(Input<Boolean> enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder enable(Boolean enable) {
            this.enable = Input.of(Objects.requireNonNull(enable));
            return this;
        }
        public DetectorDatasourcesS3LogsGetArgs build() {
            return new DetectorDatasourcesS3LogsGetArgs(enable);
        }
    }
}
