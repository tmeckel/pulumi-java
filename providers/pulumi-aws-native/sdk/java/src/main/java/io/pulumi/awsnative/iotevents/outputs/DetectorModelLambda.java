// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelPayload;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelLambda {
    /**
     * The ARN of the Lambda function that is executed.
     * 
     */
    private final String functionArn;
    private final @Nullable DetectorModelPayload payload;

    @OutputCustomType.Constructor
    private DetectorModelLambda(
        @OutputCustomType.Parameter("functionArn") String functionArn,
        @OutputCustomType.Parameter("payload") @Nullable DetectorModelPayload payload) {
        this.functionArn = functionArn;
        this.payload = payload;
    }

    /**
     * The ARN of the Lambda function that is executed.
     * 
    */
    public String getFunctionArn() {
        return this.functionArn;
    }
    public Optional<DetectorModelPayload> getPayload() {
        return Optional.ofNullable(this.payload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelLambda defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionArn;
        private @Nullable DetectorModelPayload payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.payload = defaults.payload;
        }

        public Builder functionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }

        public Builder payload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }
        public DetectorModelLambda build() {
            return new DetectorModelLambda(functionArn, payload);
        }
    }
}
