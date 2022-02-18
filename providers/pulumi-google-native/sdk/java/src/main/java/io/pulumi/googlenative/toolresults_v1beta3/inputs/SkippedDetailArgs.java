// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details for an outcome with a SKIPPED outcome summary.
 * 
 */
public final class SkippedDetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkippedDetailArgs Empty = new SkippedDetailArgs();

    /**
     * If the App doesn't support the specific API level.
     * 
     */
    @InputImport(name="incompatibleAppVersion")
    private final @Nullable Input<Boolean> incompatibleAppVersion;

    public Input<Boolean> getIncompatibleAppVersion() {
        return this.incompatibleAppVersion == null ? Input.empty() : this.incompatibleAppVersion;
    }

    /**
     * If the App doesn't run on the specific architecture, for example, x86.
     * 
     */
    @InputImport(name="incompatibleArchitecture")
    private final @Nullable Input<Boolean> incompatibleArchitecture;

    public Input<Boolean> getIncompatibleArchitecture() {
        return this.incompatibleArchitecture == null ? Input.empty() : this.incompatibleArchitecture;
    }

    /**
     * If the requested OS version doesn't run on the specific device model.
     * 
     */
    @InputImport(name="incompatibleDevice")
    private final @Nullable Input<Boolean> incompatibleDevice;

    public Input<Boolean> getIncompatibleDevice() {
        return this.incompatibleDevice == null ? Input.empty() : this.incompatibleDevice;
    }

    public SkippedDetailArgs(
        @Nullable Input<Boolean> incompatibleAppVersion,
        @Nullable Input<Boolean> incompatibleArchitecture,
        @Nullable Input<Boolean> incompatibleDevice) {
        this.incompatibleAppVersion = incompatibleAppVersion;
        this.incompatibleArchitecture = incompatibleArchitecture;
        this.incompatibleDevice = incompatibleDevice;
    }

    private SkippedDetailArgs() {
        this.incompatibleAppVersion = Input.empty();
        this.incompatibleArchitecture = Input.empty();
        this.incompatibleDevice = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkippedDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> incompatibleAppVersion;
        private @Nullable Input<Boolean> incompatibleArchitecture;
        private @Nullable Input<Boolean> incompatibleDevice;

        public Builder() {
    	      // Empty
        }

        public Builder(SkippedDetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incompatibleAppVersion = defaults.incompatibleAppVersion;
    	      this.incompatibleArchitecture = defaults.incompatibleArchitecture;
    	      this.incompatibleDevice = defaults.incompatibleDevice;
        }

        public Builder setIncompatibleAppVersion(@Nullable Input<Boolean> incompatibleAppVersion) {
            this.incompatibleAppVersion = incompatibleAppVersion;
            return this;
        }

        public Builder setIncompatibleAppVersion(@Nullable Boolean incompatibleAppVersion) {
            this.incompatibleAppVersion = Input.ofNullable(incompatibleAppVersion);
            return this;
        }

        public Builder setIncompatibleArchitecture(@Nullable Input<Boolean> incompatibleArchitecture) {
            this.incompatibleArchitecture = incompatibleArchitecture;
            return this;
        }

        public Builder setIncompatibleArchitecture(@Nullable Boolean incompatibleArchitecture) {
            this.incompatibleArchitecture = Input.ofNullable(incompatibleArchitecture);
            return this;
        }

        public Builder setIncompatibleDevice(@Nullable Input<Boolean> incompatibleDevice) {
            this.incompatibleDevice = incompatibleDevice;
            return this;
        }

        public Builder setIncompatibleDevice(@Nullable Boolean incompatibleDevice) {
            this.incompatibleDevice = Input.ofNullable(incompatibleDevice);
            return this;
        }

        public SkippedDetailArgs build() {
            return new SkippedDetailArgs(incompatibleAppVersion, incompatibleArchitecture, incompatibleDevice);
        }
    }
}
