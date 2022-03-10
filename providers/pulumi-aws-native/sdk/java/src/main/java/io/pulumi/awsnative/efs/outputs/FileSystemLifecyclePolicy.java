// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FileSystemLifecyclePolicy {
    private final @Nullable String transitionToIA;
    private final @Nullable String transitionToPrimaryStorageClass;

    @OutputCustomType.Constructor
    private FileSystemLifecyclePolicy(
        @OutputCustomType.Parameter("transitionToIA") @Nullable String transitionToIA,
        @OutputCustomType.Parameter("transitionToPrimaryStorageClass") @Nullable String transitionToPrimaryStorageClass) {
        this.transitionToIA = transitionToIA;
        this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
    }

    public Optional<String> getTransitionToIA() {
        return Optional.ofNullable(this.transitionToIA);
    }
    public Optional<String> getTransitionToPrimaryStorageClass() {
        return Optional.ofNullable(this.transitionToPrimaryStorageClass);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemLifecyclePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String transitionToIA;
        private @Nullable String transitionToPrimaryStorageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemLifecyclePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transitionToIA = defaults.transitionToIA;
    	      this.transitionToPrimaryStorageClass = defaults.transitionToPrimaryStorageClass;
        }

        public Builder transitionToIA(@Nullable String transitionToIA) {
            this.transitionToIA = transitionToIA;
            return this;
        }

        public Builder transitionToPrimaryStorageClass(@Nullable String transitionToPrimaryStorageClass) {
            this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
            return this;
        }
        public FileSystemLifecyclePolicy build() {
            return new FileSystemLifecyclePolicy(transitionToIA, transitionToPrimaryStorageClass);
        }
    }
}
