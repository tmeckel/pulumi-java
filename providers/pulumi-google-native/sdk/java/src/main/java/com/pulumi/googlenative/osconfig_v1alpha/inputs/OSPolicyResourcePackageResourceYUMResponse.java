// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by YUM. - install: `yum -y install package` - remove: `yum -y remove package`
 * 
 */
public final class OSPolicyResourcePackageResourceYUMResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceYUMResponse Empty = new OSPolicyResourcePackageResourceYUMResponse();

    /**
     * Package name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Package name.
     * 
     */
    public String name() {
        return this.name;
    }

    private OSPolicyResourcePackageResourceYUMResponse() {}

    private OSPolicyResourcePackageResourceYUMResponse(OSPolicyResourcePackageResourceYUMResponse $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceYUMResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceYUMResponse $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceYUMResponse();
        }

        public Builder(OSPolicyResourcePackageResourceYUMResponse defaults) {
            $ = new OSPolicyResourcePackageResourceYUMResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Package name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public OSPolicyResourcePackageResourceYUMResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
