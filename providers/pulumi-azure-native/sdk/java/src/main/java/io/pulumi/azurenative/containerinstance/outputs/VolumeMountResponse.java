// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeMountResponse {
    private final String mountPath;
    private final String name;
    private final @Nullable Boolean readOnly;

    @OutputCustomType.Constructor({"mountPath","name","readOnly"})
    private VolumeMountResponse(
        String mountPath,
        String name,
        @Nullable Boolean readOnly) {
        this.mountPath = Objects.requireNonNull(mountPath);
        this.name = Objects.requireNonNull(name);
        this.readOnly = readOnly;
    }

    public String getMountPath() {
        return this.mountPath;
    }
    public String getName() {
        return this.name;
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String name;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeMountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public VolumeMountResponse build() {
            return new VolumeMountResponse(mountPath, name, readOnly);
        }
    }
}
