// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CanaryTimeline {
    /**
     * Date and time the canary was created.
     * 
     */
    private final @Nullable String created;
    /**
     * Date and time the canary was most recently modified.
     * 
     */
    private final @Nullable String lastModified;
    /**
     * Date and time that the canary's most recent run started.
     * 
     */
    private final @Nullable String lastStarted;
    /**
     * Date and time that the canary's most recent run ended.
     * 
     */
    private final @Nullable String lastStopped;

    @OutputCustomType.Constructor
    private CanaryTimeline(
        @OutputCustomType.Parameter("created") @Nullable String created,
        @OutputCustomType.Parameter("lastModified") @Nullable String lastModified,
        @OutputCustomType.Parameter("lastStarted") @Nullable String lastStarted,
        @OutputCustomType.Parameter("lastStopped") @Nullable String lastStopped) {
        this.created = created;
        this.lastModified = lastModified;
        this.lastStarted = lastStarted;
        this.lastStopped = lastStopped;
    }

    /**
     * Date and time the canary was created.
     * 
    */
    public Optional<String> getCreated() {
        return Optional.ofNullable(this.created);
    }
    /**
     * Date and time the canary was most recently modified.
     * 
    */
    public Optional<String> getLastModified() {
        return Optional.ofNullable(this.lastModified);
    }
    /**
     * Date and time that the canary's most recent run started.
     * 
    */
    public Optional<String> getLastStarted() {
        return Optional.ofNullable(this.lastStarted);
    }
    /**
     * Date and time that the canary's most recent run ended.
     * 
    */
    public Optional<String> getLastStopped() {
        return Optional.ofNullable(this.lastStopped);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryTimeline defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String created;
        private @Nullable String lastModified;
        private @Nullable String lastStarted;
        private @Nullable String lastStopped;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryTimeline defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.lastModified = defaults.lastModified;
    	      this.lastStarted = defaults.lastStarted;
    	      this.lastStopped = defaults.lastStopped;
        }

        public Builder created(@Nullable String created) {
            this.created = created;
            return this;
        }

        public Builder lastModified(@Nullable String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder lastStarted(@Nullable String lastStarted) {
            this.lastStarted = lastStarted;
            return this;
        }

        public Builder lastStopped(@Nullable String lastStopped) {
            this.lastStopped = lastStopped;
            return this;
        }
        public CanaryTimeline build() {
            return new CanaryTimeline(created, lastModified, lastStarted, lastStopped);
        }
    }
}
