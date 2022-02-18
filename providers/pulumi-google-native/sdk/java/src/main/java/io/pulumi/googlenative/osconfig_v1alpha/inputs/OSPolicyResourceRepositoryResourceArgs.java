// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceAptRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceGooRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceYumRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceZypperRepositoryArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A resource that manages a package repository.
 * 
 */
public final class OSPolicyResourceRepositoryResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceRepositoryResourceArgs Empty = new OSPolicyResourceRepositoryResourceArgs();

    /**
     * An Apt Repository.
     * 
     */
    @InputImport(name="apt")
    private final @Nullable Input<OSPolicyResourceRepositoryResourceAptRepositoryArgs> apt;

    public Input<OSPolicyResourceRepositoryResourceAptRepositoryArgs> getApt() {
        return this.apt == null ? Input.empty() : this.apt;
    }

    /**
     * A Goo Repository.
     * 
     */
    @InputImport(name="goo")
    private final @Nullable Input<OSPolicyResourceRepositoryResourceGooRepositoryArgs> goo;

    public Input<OSPolicyResourceRepositoryResourceGooRepositoryArgs> getGoo() {
        return this.goo == null ? Input.empty() : this.goo;
    }

    /**
     * A Yum Repository.
     * 
     */
    @InputImport(name="yum")
    private final @Nullable Input<OSPolicyResourceRepositoryResourceYumRepositoryArgs> yum;

    public Input<OSPolicyResourceRepositoryResourceYumRepositoryArgs> getYum() {
        return this.yum == null ? Input.empty() : this.yum;
    }

    /**
     * A Zypper Repository.
     * 
     */
    @InputImport(name="zypper")
    private final @Nullable Input<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> zypper;

    public Input<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> getZypper() {
        return this.zypper == null ? Input.empty() : this.zypper;
    }

    public OSPolicyResourceRepositoryResourceArgs(
        @Nullable Input<OSPolicyResourceRepositoryResourceAptRepositoryArgs> apt,
        @Nullable Input<OSPolicyResourceRepositoryResourceGooRepositoryArgs> goo,
        @Nullable Input<OSPolicyResourceRepositoryResourceYumRepositoryArgs> yum,
        @Nullable Input<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> zypper) {
        this.apt = apt;
        this.goo = goo;
        this.yum = yum;
        this.zypper = zypper;
    }

    private OSPolicyResourceRepositoryResourceArgs() {
        this.apt = Input.empty();
        this.goo = Input.empty();
        this.yum = Input.empty();
        this.zypper = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OSPolicyResourceRepositoryResourceAptRepositoryArgs> apt;
        private @Nullable Input<OSPolicyResourceRepositoryResourceGooRepositoryArgs> goo;
        private @Nullable Input<OSPolicyResourceRepositoryResourceYumRepositoryArgs> yum;
        private @Nullable Input<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder setApt(@Nullable Input<OSPolicyResourceRepositoryResourceAptRepositoryArgs> apt) {
            this.apt = apt;
            return this;
        }

        public Builder setApt(@Nullable OSPolicyResourceRepositoryResourceAptRepositoryArgs apt) {
            this.apt = Input.ofNullable(apt);
            return this;
        }

        public Builder setGoo(@Nullable Input<OSPolicyResourceRepositoryResourceGooRepositoryArgs> goo) {
            this.goo = goo;
            return this;
        }

        public Builder setGoo(@Nullable OSPolicyResourceRepositoryResourceGooRepositoryArgs goo) {
            this.goo = Input.ofNullable(goo);
            return this;
        }

        public Builder setYum(@Nullable Input<OSPolicyResourceRepositoryResourceYumRepositoryArgs> yum) {
            this.yum = yum;
            return this;
        }

        public Builder setYum(@Nullable OSPolicyResourceRepositoryResourceYumRepositoryArgs yum) {
            this.yum = Input.ofNullable(yum);
            return this;
        }

        public Builder setZypper(@Nullable Input<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> zypper) {
            this.zypper = zypper;
            return this;
        }

        public Builder setZypper(@Nullable OSPolicyResourceRepositoryResourceZypperRepositoryArgs zypper) {
            this.zypper = Input.ofNullable(zypper);
            return this;
        }

        public OSPolicyResourceRepositoryResourceArgs build() {
            return new OSPolicyResourceRepositoryResourceArgs(apt, goo, yum, zypper);
        }
    }
}
