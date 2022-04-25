// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1.enums.OsConstraintOsType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A restriction on the OS type and version of devices making requests.
 * 
 */
public final class OsConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsConstraintArgs Empty = new OsConstraintArgs();

    /**
     * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `&#34;major.minor.patch&#34;`. Examples: `&#34;10.5.301&#34;`, `&#34;9.2.1&#34;`.
     * 
     */
    @Import(name="minimumVersion")
    private @Nullable Output<String> minimumVersion;

    /**
     * @return The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `&#34;major.minor.patch&#34;`. Examples: `&#34;10.5.301&#34;`, `&#34;9.2.1&#34;`.
     * 
     */
    public Optional<Output<String>> minimumVersion() {
        return Optional.ofNullable(this.minimumVersion);
    }

    /**
     * The allowed OS type.
     * 
     */
    @Import(name="osType", required=true)
    private Output<OsConstraintOsType> osType;

    /**
     * @return The allowed OS type.
     * 
     */
    public Output<OsConstraintOsType> osType() {
        return this.osType;
    }

    /**
     * Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
     * 
     */
    @Import(name="requireVerifiedChromeOs")
    private @Nullable Output<Boolean> requireVerifiedChromeOs;

    /**
     * @return Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
     * 
     */
    public Optional<Output<Boolean>> requireVerifiedChromeOs() {
        return Optional.ofNullable(this.requireVerifiedChromeOs);
    }

    private OsConstraintArgs() {}

    private OsConstraintArgs(OsConstraintArgs $) {
        this.minimumVersion = $.minimumVersion;
        this.osType = $.osType;
        this.requireVerifiedChromeOs = $.requireVerifiedChromeOs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsConstraintArgs $;

        public Builder() {
            $ = new OsConstraintArgs();
        }

        public Builder(OsConstraintArgs defaults) {
            $ = new OsConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minimumVersion The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `&#34;major.minor.patch&#34;`. Examples: `&#34;10.5.301&#34;`, `&#34;9.2.1&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder minimumVersion(@Nullable Output<String> minimumVersion) {
            $.minimumVersion = minimumVersion;
            return this;
        }

        /**
         * @param minimumVersion The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `&#34;major.minor.patch&#34;`. Examples: `&#34;10.5.301&#34;`, `&#34;9.2.1&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder minimumVersion(String minimumVersion) {
            return minimumVersion(Output.of(minimumVersion));
        }

        /**
         * @param osType The allowed OS type.
         * 
         * @return builder
         * 
         */
        public Builder osType(Output<OsConstraintOsType> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType The allowed OS type.
         * 
         * @return builder
         * 
         */
        public Builder osType(OsConstraintOsType osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param requireVerifiedChromeOs Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
         * 
         * @return builder
         * 
         */
        public Builder requireVerifiedChromeOs(@Nullable Output<Boolean> requireVerifiedChromeOs) {
            $.requireVerifiedChromeOs = requireVerifiedChromeOs;
            return this;
        }

        /**
         * @param requireVerifiedChromeOs Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
         * 
         * @return builder
         * 
         */
        public Builder requireVerifiedChromeOs(Boolean requireVerifiedChromeOs) {
            return requireVerifiedChromeOs(Output.of(requireVerifiedChromeOs));
        }

        public OsConstraintArgs build() {
            $.osType = Objects.requireNonNull($.osType, "expected parameter 'osType' to be non-null");
            return $;
        }
    }

}
