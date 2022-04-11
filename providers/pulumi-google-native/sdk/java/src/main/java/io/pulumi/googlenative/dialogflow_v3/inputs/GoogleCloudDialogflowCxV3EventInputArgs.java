// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the event to trigger.
 * 
 */
public final class GoogleCloudDialogflowCxV3EventInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3EventInputArgs Empty = new GoogleCloudDialogflowCxV3EventInputArgs();

    /**
     * Name of the event.
     * 
     */
    @Import(name="event")
      private final @Nullable Output<String> event;

    public Output<String> getEvent() {
        return this.event == null ? Codegen.empty() : this.event;
    }

    public GoogleCloudDialogflowCxV3EventInputArgs(@Nullable Output<String> event) {
        this.event = event;
    }

    private GoogleCloudDialogflowCxV3EventInputArgs() {
        this.event = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3EventInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> event;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3EventInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
        }

        public Builder event(@Nullable Output<String> event) {
            this.event = event;
            return this;
        }
        public Builder event(@Nullable String event) {
            this.event = Codegen.ofNullable(event);
            return this;
        }        public GoogleCloudDialogflowCxV3EventInputArgs build() {
            return new GoogleCloudDialogflowCxV3EventInputArgs(event);
        }
    }
}
