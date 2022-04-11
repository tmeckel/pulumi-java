// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelConditionDevicePolicyOsConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelConditionDevicePolicyOsConstraintArgs Empty = new AccessLevelConditionDevicePolicyOsConstraintArgs();

    /**
     * The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: "major.minor.patch" such as "10.5.301", "9.2.1".
     * 
     */
    @Import(name="minimumVersion")
      private final @Nullable Output<String> minimumVersion;

    public Output<String> getMinimumVersion() {
        return this.minimumVersion == null ? Codegen.empty() : this.minimumVersion;
    }

    /**
     * The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
     */
    @Import(name="osType", required=true)
      private final Output<String> osType;

    public Output<String> getOsType() {
        return this.osType;
    }

    public AccessLevelConditionDevicePolicyOsConstraintArgs(
        @Nullable Output<String> minimumVersion,
        Output<String> osType) {
        this.minimumVersion = minimumVersion;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
    }

    private AccessLevelConditionDevicePolicyOsConstraintArgs() {
        this.minimumVersion = Codegen.empty();
        this.osType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelConditionDevicePolicyOsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> minimumVersion;
        private Output<String> osType;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelConditionDevicePolicyOsConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
        }

        public Builder minimumVersion(@Nullable Output<String> minimumVersion) {
            this.minimumVersion = minimumVersion;
            return this;
        }
        public Builder minimumVersion(@Nullable String minimumVersion) {
            this.minimumVersion = Codegen.ofNullable(minimumVersion);
            return this;
        }
        public Builder osType(Output<String> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Output.of(Objects.requireNonNull(osType));
            return this;
        }        public AccessLevelConditionDevicePolicyOsConstraintArgs build() {
            return new AccessLevelConditionDevicePolicyOsConstraintArgs(minimumVersion, osType);
        }
    }
}
