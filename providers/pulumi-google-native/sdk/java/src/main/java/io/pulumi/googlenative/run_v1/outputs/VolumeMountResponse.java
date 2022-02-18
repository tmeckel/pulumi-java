// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VolumeMountResponse {
    /**
     * Path within the container at which the volume should be mounted. Must not contain ':'.
     * 
     */
    private final String mountPath;
    /**
     * The name of the volume. There must be a corresponding Volume with the same name.
     * 
     */
    private final String name;
    /**
     * (Optional) Only true is accepted. Defaults to true.
     * 
     */
    private final Boolean readOnly;
    /**
     * (Optional) Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
     * 
     */
    private final String subPath;

    @OutputCustomType.Constructor({"mountPath","name","readOnly","subPath"})
    private VolumeMountResponse(
        String mountPath,
        String name,
        Boolean readOnly,
        String subPath) {
        this.mountPath = Objects.requireNonNull(mountPath);
        this.name = Objects.requireNonNull(name);
        this.readOnly = Objects.requireNonNull(readOnly);
        this.subPath = Objects.requireNonNull(subPath);
    }

    /**
     * Path within the container at which the volume should be mounted. Must not contain ':'.
     * 
     */
    public String getMountPath() {
        return this.mountPath;
    }
    /**
     * The name of the volume. There must be a corresponding Volume with the same name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * (Optional) Only true is accepted. Defaults to true.
     * 
     */
    public Boolean getReadOnly() {
        return this.readOnly;
    }
    /**
     * (Optional) Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
     * 
     */
    public String getSubPath() {
        return this.subPath;
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
        private Boolean readOnly;
        private String subPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeMountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.subPath = defaults.subPath;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReadOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }

        public Builder setSubPath(String subPath) {
            this.subPath = Objects.requireNonNull(subPath);
            return this;
        }

        public VolumeMountResponse build() {
            return new VolumeMountResponse(mountPath, name, readOnly, subPath);
        }
    }
}
