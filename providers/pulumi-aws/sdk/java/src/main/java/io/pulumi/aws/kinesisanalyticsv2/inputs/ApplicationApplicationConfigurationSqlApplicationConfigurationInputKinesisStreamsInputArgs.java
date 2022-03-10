// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs();

    /**
     * The ARN of the input Kinesis data stream to read.
     * 
     */
    @InputImport(name="resourceArn", required=true)
      private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs(Input<String> resourceArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs() {
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder resourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs(resourceArn);
        }
    }
}
