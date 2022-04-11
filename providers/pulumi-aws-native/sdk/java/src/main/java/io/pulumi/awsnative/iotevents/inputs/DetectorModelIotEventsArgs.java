// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that triggered the action.
 * 
 */
public final class DetectorModelIotEventsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelIotEventsArgs Empty = new DetectorModelIotEventsArgs();

    /**
     * The name of the AWS IoT Events input where the data is sent.
     * 
     */
    @Import(name="inputName", required=true)
      private final Output<String> inputName;

    public Output<String> getInputName() {
        return this.inputName;
    }

    @Import(name="payload")
      private final @Nullable Output<DetectorModelPayloadArgs> payload;

    public Output<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Codegen.empty() : this.payload;
    }

    public DetectorModelIotEventsArgs(
        Output<String> inputName,
        @Nullable Output<DetectorModelPayloadArgs> payload) {
        this.inputName = Objects.requireNonNull(inputName, "expected parameter 'inputName' to be non-null");
        this.payload = payload;
    }

    private DetectorModelIotEventsArgs() {
        this.inputName = Codegen.empty();
        this.payload = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelIotEventsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> inputName;
        private @Nullable Output<DetectorModelPayloadArgs> payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelIotEventsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
    	      this.payload = defaults.payload;
        }

        public Builder inputName(Output<String> inputName) {
            this.inputName = Objects.requireNonNull(inputName);
            return this;
        }
        public Builder inputName(String inputName) {
            this.inputName = Output.of(Objects.requireNonNull(inputName));
            return this;
        }
        public Builder payload(@Nullable Output<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }
        public Builder payload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Codegen.ofNullable(payload);
            return this;
        }        public DetectorModelIotEventsArgs build() {
            return new DetectorModelIotEventsArgs(inputName, payload);
        }
    }
}
