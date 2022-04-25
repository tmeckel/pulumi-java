// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceAptRepositoryResponse;
import com.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceGooRepositoryResponse;
import com.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceYumRepositoryResponse;
import com.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceZypperRepositoryResponse;
import java.util.Objects;


/**
 * A resource that manages a package repository.
 * 
 */
public final class OSPolicyResourceRepositoryResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceRepositoryResourceResponse Empty = new OSPolicyResourceRepositoryResourceResponse();

    /**
     * An Apt Repository.
     * 
     */
    @Import(name="apt", required=true)
    private OSPolicyResourceRepositoryResourceAptRepositoryResponse apt;

    /**
     * @return An Apt Repository.
     * 
     */
    public OSPolicyResourceRepositoryResourceAptRepositoryResponse apt() {
        return this.apt;
    }

    /**
     * A Goo Repository.
     * 
     */
    @Import(name="goo", required=true)
    private OSPolicyResourceRepositoryResourceGooRepositoryResponse goo;

    /**
     * @return A Goo Repository.
     * 
     */
    public OSPolicyResourceRepositoryResourceGooRepositoryResponse goo() {
        return this.goo;
    }

    /**
     * A Yum Repository.
     * 
     */
    @Import(name="yum", required=true)
    private OSPolicyResourceRepositoryResourceYumRepositoryResponse yum;

    /**
     * @return A Yum Repository.
     * 
     */
    public OSPolicyResourceRepositoryResourceYumRepositoryResponse yum() {
        return this.yum;
    }

    /**
     * A Zypper Repository.
     * 
     */
    @Import(name="zypper", required=true)
    private OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper;

    /**
     * @return A Zypper Repository.
     * 
     */
    public OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper() {
        return this.zypper;
    }

    private OSPolicyResourceRepositoryResourceResponse() {}

    private OSPolicyResourceRepositoryResourceResponse(OSPolicyResourceRepositoryResourceResponse $) {
        this.apt = $.apt;
        this.goo = $.goo;
        this.yum = $.yum;
        this.zypper = $.zypper;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceRepositoryResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceRepositoryResourceResponse $;

        public Builder() {
            $ = new OSPolicyResourceRepositoryResourceResponse();
        }

        public Builder(OSPolicyResourceRepositoryResourceResponse defaults) {
            $ = new OSPolicyResourceRepositoryResourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param apt An Apt Repository.
         * 
         * @return builder
         * 
         */
        public Builder apt(OSPolicyResourceRepositoryResourceAptRepositoryResponse apt) {
            $.apt = apt;
            return this;
        }

        /**
         * @param goo A Goo Repository.
         * 
         * @return builder
         * 
         */
        public Builder goo(OSPolicyResourceRepositoryResourceGooRepositoryResponse goo) {
            $.goo = goo;
            return this;
        }

        /**
         * @param yum A Yum Repository.
         * 
         * @return builder
         * 
         */
        public Builder yum(OSPolicyResourceRepositoryResourceYumRepositoryResponse yum) {
            $.yum = yum;
            return this;
        }

        /**
         * @param zypper A Zypper Repository.
         * 
         * @return builder
         * 
         */
        public Builder zypper(OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper) {
            $.zypper = zypper;
            return this;
        }

        public OSPolicyResourceRepositoryResourceResponse build() {
            $.apt = Objects.requireNonNull($.apt, "expected parameter 'apt' to be non-null");
            $.goo = Objects.requireNonNull($.goo, "expected parameter 'goo' to be non-null");
            $.yum = Objects.requireNonNull($.yum, "expected parameter 'yum' to be non-null");
            $.zypper = Objects.requireNonNull($.zypper, "expected parameter 'zypper' to be non-null");
            return $;
        }
    }

}
