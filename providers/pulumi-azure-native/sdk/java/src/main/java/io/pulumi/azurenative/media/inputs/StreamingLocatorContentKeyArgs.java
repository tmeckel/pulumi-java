// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class for content key in Streaming Locator
 * 
 */
public final class StreamingLocatorContentKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingLocatorContentKeyArgs Empty = new StreamingLocatorContentKeyArgs();

    /**
     * ID of Content Key
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Label of Content Key as specified in the Streaming Policy
     * 
     */
    @InputImport(name="labelReferenceInStreamingPolicy")
      private final @Nullable Input<String> labelReferenceInStreamingPolicy;

    public Input<String> getLabelReferenceInStreamingPolicy() {
        return this.labelReferenceInStreamingPolicy == null ? Input.empty() : this.labelReferenceInStreamingPolicy;
    }

    /**
     * Value of Content Key
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public StreamingLocatorContentKeyArgs(
        Input<String> id,
        @Nullable Input<String> labelReferenceInStreamingPolicy,
        @Nullable Input<String> value) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.labelReferenceInStreamingPolicy = labelReferenceInStreamingPolicy;
        this.value = value;
    }

    private StreamingLocatorContentKeyArgs() {
        this.id = Input.empty();
        this.labelReferenceInStreamingPolicy = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingLocatorContentKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private @Nullable Input<String> labelReferenceInStreamingPolicy;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingLocatorContentKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labelReferenceInStreamingPolicy = defaults.labelReferenceInStreamingPolicy;
    	      this.value = defaults.value;
        }

        public Builder id(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder labelReferenceInStreamingPolicy(@Nullable Input<String> labelReferenceInStreamingPolicy) {
            this.labelReferenceInStreamingPolicy = labelReferenceInStreamingPolicy;
            return this;
        }

        public Builder labelReferenceInStreamingPolicy(@Nullable String labelReferenceInStreamingPolicy) {
            this.labelReferenceInStreamingPolicy = Input.ofNullable(labelReferenceInStreamingPolicy);
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public StreamingLocatorContentKeyArgs build() {
            return new StreamingLocatorContentKeyArgs(id, labelReferenceInStreamingPolicy, value);
        }
    }
}
