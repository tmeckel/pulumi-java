// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Filtering criteria to select VMs based on inventory details.
 * 
 */
public final class OSPolicyInventoryFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyInventoryFilterResponse Empty = new OSPolicyInventoryFilterResponse();

    /**
     * The OS short name
     * 
     */
    @InputImport(name="osShortName", required=true)
    private final String osShortName;

    public String getOsShortName() {
        return this.osShortName;
    }

    /**
     * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    @InputImport(name="osVersion", required=true)
    private final String osVersion;

    public String getOsVersion() {
        return this.osVersion;
    }

    public OSPolicyInventoryFilterResponse(
        String osShortName,
        String osVersion) {
        this.osShortName = Objects.requireNonNull(osShortName, "expected parameter 'osShortName' to be non-null");
        this.osVersion = Objects.requireNonNull(osVersion, "expected parameter 'osVersion' to be non-null");
    }

    private OSPolicyInventoryFilterResponse() {
        this.osShortName = null;
        this.osVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyInventoryFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osShortName;
        private String osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyInventoryFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder setOsShortName(String osShortName) {
            this.osShortName = Objects.requireNonNull(osShortName);
            return this;
        }

        public Builder setOsVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }

        public OSPolicyInventoryFilterResponse build() {
            return new OSPolicyInventoryFilterResponse(osShortName, osVersion);
        }
    }
}
