// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraint {
    /**
     * The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: "major.minor.patch" such as "10.5.301", "9.2.1".
     * 
     */
    private final @Nullable String minimumVersion;
    /**
     * The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
     */
    private final String osType;

    @OutputCustomType.Constructor
    private AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraint(
        @OutputCustomType.Parameter("minimumVersion") @Nullable String minimumVersion,
        @OutputCustomType.Parameter("osType") String osType) {
        this.minimumVersion = minimumVersion;
        this.osType = osType;
    }

    /**
     * The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: "major.minor.patch" such as "10.5.301", "9.2.1".
     * 
    */
    public Optional<String> getMinimumVersion() {
        return Optional.ofNullable(this.minimumVersion);
    }
    /**
     * The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
    */
    public String getOsType() {
        return this.osType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String minimumVersion;
        private String osType;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
        }

        public Builder minimumVersion(@Nullable String minimumVersion) {
            this.minimumVersion = minimumVersion;
            return this;
        }

        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraint build() {
            return new AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraint(minimumVersion, osType);
        }
    }
}
