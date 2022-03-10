// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryTimelineGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryTimelineGetArgs Empty = new CanaryTimelineGetArgs();

    /**
     * Date and time the canary was created.
     * 
     */
    @InputImport(name="created")
      private final @Nullable Input<String> created;

    public Input<String> getCreated() {
        return this.created == null ? Input.empty() : this.created;
    }

    /**
     * Date and time the canary was most recently modified.
     * 
     */
    @InputImport(name="lastModified")
      private final @Nullable Input<String> lastModified;

    public Input<String> getLastModified() {
        return this.lastModified == null ? Input.empty() : this.lastModified;
    }

    /**
     * Date and time that the canary's most recent run started.
     * 
     */
    @InputImport(name="lastStarted")
      private final @Nullable Input<String> lastStarted;

    public Input<String> getLastStarted() {
        return this.lastStarted == null ? Input.empty() : this.lastStarted;
    }

    /**
     * Date and time that the canary's most recent run ended.
     * 
     */
    @InputImport(name="lastStopped")
      private final @Nullable Input<String> lastStopped;

    public Input<String> getLastStopped() {
        return this.lastStopped == null ? Input.empty() : this.lastStopped;
    }

    public CanaryTimelineGetArgs(
        @Nullable Input<String> created,
        @Nullable Input<String> lastModified,
        @Nullable Input<String> lastStarted,
        @Nullable Input<String> lastStopped) {
        this.created = created;
        this.lastModified = lastModified;
        this.lastStarted = lastStarted;
        this.lastStopped = lastStopped;
    }

    private CanaryTimelineGetArgs() {
        this.created = Input.empty();
        this.lastModified = Input.empty();
        this.lastStarted = Input.empty();
        this.lastStopped = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryTimelineGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> created;
        private @Nullable Input<String> lastModified;
        private @Nullable Input<String> lastStarted;
        private @Nullable Input<String> lastStopped;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryTimelineGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.lastModified = defaults.lastModified;
    	      this.lastStarted = defaults.lastStarted;
    	      this.lastStopped = defaults.lastStopped;
        }

        public Builder created(@Nullable Input<String> created) {
            this.created = created;
            return this;
        }

        public Builder created(@Nullable String created) {
            this.created = Input.ofNullable(created);
            return this;
        }

        public Builder lastModified(@Nullable Input<String> lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder lastModified(@Nullable String lastModified) {
            this.lastModified = Input.ofNullable(lastModified);
            return this;
        }

        public Builder lastStarted(@Nullable Input<String> lastStarted) {
            this.lastStarted = lastStarted;
            return this;
        }

        public Builder lastStarted(@Nullable String lastStarted) {
            this.lastStarted = Input.ofNullable(lastStarted);
            return this;
        }

        public Builder lastStopped(@Nullable Input<String> lastStopped) {
            this.lastStopped = lastStopped;
            return this;
        }

        public Builder lastStopped(@Nullable String lastStopped) {
            this.lastStopped = Input.ofNullable(lastStopped);
            return this;
        }
        public CanaryTimelineGetArgs build() {
            return new CanaryTimelineGetArgs(created, lastModified, lastStarted, lastStopped);
        }
    }
}
