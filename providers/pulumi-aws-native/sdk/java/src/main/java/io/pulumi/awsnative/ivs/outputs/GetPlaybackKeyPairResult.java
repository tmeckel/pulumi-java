// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs.outputs;

import io.pulumi.awsnative.ivs.outputs.PlaybackKeyPairTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPlaybackKeyPairResult {
    /**
     * Key-pair identifier.
     * 
     */
    private final @Nullable String arn;
    /**
     * Key-pair identifier.
     * 
     */
    private final @Nullable String fingerprint;
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    private final @Nullable List<PlaybackKeyPairTag> tags;

    @OutputCustomType.Constructor
    private GetPlaybackKeyPairResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("fingerprint") @Nullable String fingerprint,
        @OutputCustomType.Parameter("tags") @Nullable List<PlaybackKeyPairTag> tags) {
        this.arn = arn;
        this.fingerprint = fingerprint;
        this.tags = tags;
    }

    /**
     * Key-pair identifier.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Key-pair identifier.
     * 
    */
    public Optional<String> getFingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
    */
    public List<PlaybackKeyPairTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlaybackKeyPairResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String fingerprint;
        private @Nullable List<PlaybackKeyPairTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPlaybackKeyPairResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fingerprint = defaults.fingerprint;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder tags(@Nullable List<PlaybackKeyPairTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetPlaybackKeyPairResult build() {
            return new GetPlaybackKeyPairResult(arn, fingerprint, tags);
        }
    }
}
