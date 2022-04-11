// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.TrackSelectionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class to specify properties of content key
 * 
 */
public final class StreamingPolicyContentKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyContentKeyArgs Empty = new StreamingPolicyContentKeyArgs();

    /**
     * Label can be used to specify Content Key when creating a Streaming Locator
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Codegen.empty() : this.label;
    }

    /**
     * Policy used by Content Key
     * 
     */
    @Import(name="policyName")
      private final @Nullable Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName == null ? Codegen.empty() : this.policyName;
    }

    /**
     * Tracks which use this content key
     * 
     */
    @Import(name="tracks")
      private final @Nullable Output<List<TrackSelectionArgs>> tracks;

    public Output<List<TrackSelectionArgs>> getTracks() {
        return this.tracks == null ? Codegen.empty() : this.tracks;
    }

    public StreamingPolicyContentKeyArgs(
        @Nullable Output<String> label,
        @Nullable Output<String> policyName,
        @Nullable Output<List<TrackSelectionArgs>> tracks) {
        this.label = label;
        this.policyName = policyName;
        this.tracks = tracks;
    }

    private StreamingPolicyContentKeyArgs() {
        this.label = Codegen.empty();
        this.policyName = Codegen.empty();
        this.tracks = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyContentKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> label;
        private @Nullable Output<String> policyName;
        private @Nullable Output<List<TrackSelectionArgs>> tracks;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyContentKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.policyName = defaults.policyName;
    	      this.tracks = defaults.tracks;
        }

        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Codegen.ofNullable(label);
            return this;
        }
        public Builder policyName(@Nullable Output<String> policyName) {
            this.policyName = policyName;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = Codegen.ofNullable(policyName);
            return this;
        }
        public Builder tracks(@Nullable Output<List<TrackSelectionArgs>> tracks) {
            this.tracks = tracks;
            return this;
        }
        public Builder tracks(@Nullable List<TrackSelectionArgs> tracks) {
            this.tracks = Codegen.ofNullable(tracks);
            return this;
        }
        public Builder tracks(TrackSelectionArgs... tracks) {
            return tracks(List.of(tracks));
        }        public StreamingPolicyContentKeyArgs build() {
            return new StreamingPolicyContentKeyArgs(label, policyName, tracks);
        }
    }
}
