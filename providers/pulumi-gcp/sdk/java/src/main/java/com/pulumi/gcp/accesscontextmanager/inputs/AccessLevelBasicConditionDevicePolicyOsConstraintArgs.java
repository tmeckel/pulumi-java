// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessLevelBasicConditionDevicePolicyOsConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessLevelBasicConditionDevicePolicyOsConstraintArgs Empty = new AccessLevelBasicConditionDevicePolicyOsConstraintArgs();

    /**
     * The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: &#34;major.minor.patch&#34; such as &#34;10.5.301&#34;, &#34;9.2.1&#34;.
     * 
     */
    @Import(name="minimumVersion")
    private @Nullable Output<String> minimumVersion;

    /**
     * @return The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: &#34;major.minor.patch&#34; such as &#34;10.5.301&#34;, &#34;9.2.1&#34;.
     * 
     */
    public Optional<Output<String>> minimumVersion() {
        return Optional.ofNullable(this.minimumVersion);
    }

    /**
     * The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
     */
    @Import(name="osType", required=true)
    private Output<String> osType;

    /**
     * @return The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
     */
    public Output<String> osType() {
        return this.osType;
    }

    /**
     * If you specify DESKTOP_CHROME_OS for osType, you can optionally include requireVerifiedChromeOs to require Chrome Verified Access.
     * 
     */
    @Import(name="requireVerifiedChromeOs")
    private @Nullable Output<Boolean> requireVerifiedChromeOs;

    /**
     * @return If you specify DESKTOP_CHROME_OS for osType, you can optionally include requireVerifiedChromeOs to require Chrome Verified Access.
     * 
     */
    public Optional<Output<Boolean>> requireVerifiedChromeOs() {
        return Optional.ofNullable(this.requireVerifiedChromeOs);
    }

    private AccessLevelBasicConditionDevicePolicyOsConstraintArgs() {}

    private AccessLevelBasicConditionDevicePolicyOsConstraintArgs(AccessLevelBasicConditionDevicePolicyOsConstraintArgs $) {
        this.minimumVersion = $.minimumVersion;
        this.osType = $.osType;
        this.requireVerifiedChromeOs = $.requireVerifiedChromeOs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelBasicConditionDevicePolicyOsConstraintArgs $;

        public Builder() {
            $ = new AccessLevelBasicConditionDevicePolicyOsConstraintArgs();
        }

        public Builder(AccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
            $ = new AccessLevelBasicConditionDevicePolicyOsConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minimumVersion The minimum allowed OS version. If not set, any version
         * of this OS satisfies the constraint.
         * Format: &#34;major.minor.patch&#34; such as &#34;10.5.301&#34;, &#34;9.2.1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minimumVersion(@Nullable Output<String> minimumVersion) {
            $.minimumVersion = minimumVersion;
            return this;
        }

        /**
         * @param minimumVersion The minimum allowed OS version. If not set, any version
         * of this OS satisfies the constraint.
         * Format: &#34;major.minor.patch&#34; such as &#34;10.5.301&#34;, &#34;9.2.1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minimumVersion(String minimumVersion) {
            return minimumVersion(Output.of(minimumVersion));
        }

        /**
         * @param osType The operating system type of the device.
         * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
         * 
         * @return builder
         * 
         */
        public Builder osType(Output<String> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType The operating system type of the device.
         * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param requireVerifiedChromeOs If you specify DESKTOP_CHROME_OS for osType, you can optionally include requireVerifiedChromeOs to require Chrome Verified Access.
         * 
         * @return builder
         * 
         */
        public Builder requireVerifiedChromeOs(@Nullable Output<Boolean> requireVerifiedChromeOs) {
            $.requireVerifiedChromeOs = requireVerifiedChromeOs;
            return this;
        }

        /**
         * @param requireVerifiedChromeOs If you specify DESKTOP_CHROME_OS for osType, you can optionally include requireVerifiedChromeOs to require Chrome Verified Access.
         * 
         * @return builder
         * 
         */
        public Builder requireVerifiedChromeOs(Boolean requireVerifiedChromeOs) {
            return requireVerifiedChromeOs(Output.of(requireVerifiedChromeOs));
        }

        public AccessLevelBasicConditionDevicePolicyOsConstraintArgs build() {
            $.osType = Objects.requireNonNull($.osType, "expected parameter 'osType' to be non-null");
            return $;
        }
    }

}
