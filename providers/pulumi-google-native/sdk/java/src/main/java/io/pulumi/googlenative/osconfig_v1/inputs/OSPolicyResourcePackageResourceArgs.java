// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.enums.OSPolicyResourcePackageResourceDesiredState;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceAPTArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceDebArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceGooGetArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceMSIArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceRPMArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceYUMArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceZypperArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A resource that manages a system package.
 * 
 */
public final class OSPolicyResourcePackageResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceArgs Empty = new OSPolicyResourcePackageResourceArgs();

    /**
     * A package managed by Apt.
     * 
     */
    @InputImport(name="apt")
      private final @Nullable Input<OSPolicyResourcePackageResourceAPTArgs> apt;

    public Input<OSPolicyResourcePackageResourceAPTArgs> getApt() {
        return this.apt == null ? Input.empty() : this.apt;
    }

    /**
     * A deb package file.
     * 
     */
    @InputImport(name="deb")
      private final @Nullable Input<OSPolicyResourcePackageResourceDebArgs> deb;

    public Input<OSPolicyResourcePackageResourceDebArgs> getDeb() {
        return this.deb == null ? Input.empty() : this.deb;
    }

    /**
     * The desired state the agent should maintain for this package.
     * 
     */
    @InputImport(name="desiredState", required=true)
      private final Input<OSPolicyResourcePackageResourceDesiredState> desiredState;

    public Input<OSPolicyResourcePackageResourceDesiredState> getDesiredState() {
        return this.desiredState;
    }

    /**
     * A package managed by GooGet.
     * 
     */
    @InputImport(name="googet")
      private final @Nullable Input<OSPolicyResourcePackageResourceGooGetArgs> googet;

    public Input<OSPolicyResourcePackageResourceGooGetArgs> getGooget() {
        return this.googet == null ? Input.empty() : this.googet;
    }

    /**
     * An MSI package.
     * 
     */
    @InputImport(name="msi")
      private final @Nullable Input<OSPolicyResourcePackageResourceMSIArgs> msi;

    public Input<OSPolicyResourcePackageResourceMSIArgs> getMsi() {
        return this.msi == null ? Input.empty() : this.msi;
    }

    /**
     * An rpm package file.
     * 
     */
    @InputImport(name="rpm")
      private final @Nullable Input<OSPolicyResourcePackageResourceRPMArgs> rpm;

    public Input<OSPolicyResourcePackageResourceRPMArgs> getRpm() {
        return this.rpm == null ? Input.empty() : this.rpm;
    }

    /**
     * A package managed by YUM.
     * 
     */
    @InputImport(name="yum")
      private final @Nullable Input<OSPolicyResourcePackageResourceYUMArgs> yum;

    public Input<OSPolicyResourcePackageResourceYUMArgs> getYum() {
        return this.yum == null ? Input.empty() : this.yum;
    }

    /**
     * A package managed by Zypper.
     * 
     */
    @InputImport(name="zypper")
      private final @Nullable Input<OSPolicyResourcePackageResourceZypperArgs> zypper;

    public Input<OSPolicyResourcePackageResourceZypperArgs> getZypper() {
        return this.zypper == null ? Input.empty() : this.zypper;
    }

    public OSPolicyResourcePackageResourceArgs(
        @Nullable Input<OSPolicyResourcePackageResourceAPTArgs> apt,
        @Nullable Input<OSPolicyResourcePackageResourceDebArgs> deb,
        Input<OSPolicyResourcePackageResourceDesiredState> desiredState,
        @Nullable Input<OSPolicyResourcePackageResourceGooGetArgs> googet,
        @Nullable Input<OSPolicyResourcePackageResourceMSIArgs> msi,
        @Nullable Input<OSPolicyResourcePackageResourceRPMArgs> rpm,
        @Nullable Input<OSPolicyResourcePackageResourceYUMArgs> yum,
        @Nullable Input<OSPolicyResourcePackageResourceZypperArgs> zypper) {
        this.apt = apt;
        this.deb = deb;
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.googet = googet;
        this.msi = msi;
        this.rpm = rpm;
        this.yum = yum;
        this.zypper = zypper;
    }

    private OSPolicyResourcePackageResourceArgs() {
        this.apt = Input.empty();
        this.deb = Input.empty();
        this.desiredState = Input.empty();
        this.googet = Input.empty();
        this.msi = Input.empty();
        this.rpm = Input.empty();
        this.yum = Input.empty();
        this.zypper = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OSPolicyResourcePackageResourceAPTArgs> apt;
        private @Nullable Input<OSPolicyResourcePackageResourceDebArgs> deb;
        private Input<OSPolicyResourcePackageResourceDesiredState> desiredState;
        private @Nullable Input<OSPolicyResourcePackageResourceGooGetArgs> googet;
        private @Nullable Input<OSPolicyResourcePackageResourceMSIArgs> msi;
        private @Nullable Input<OSPolicyResourcePackageResourceRPMArgs> rpm;
        private @Nullable Input<OSPolicyResourcePackageResourceYUMArgs> yum;
        private @Nullable Input<OSPolicyResourcePackageResourceZypperArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.deb = defaults.deb;
    	      this.desiredState = defaults.desiredState;
    	      this.googet = defaults.googet;
    	      this.msi = defaults.msi;
    	      this.rpm = defaults.rpm;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(@Nullable Input<OSPolicyResourcePackageResourceAPTArgs> apt) {
            this.apt = apt;
            return this;
        }

        public Builder apt(@Nullable OSPolicyResourcePackageResourceAPTArgs apt) {
            this.apt = Input.ofNullable(apt);
            return this;
        }

        public Builder deb(@Nullable Input<OSPolicyResourcePackageResourceDebArgs> deb) {
            this.deb = deb;
            return this;
        }

        public Builder deb(@Nullable OSPolicyResourcePackageResourceDebArgs deb) {
            this.deb = Input.ofNullable(deb);
            return this;
        }

        public Builder desiredState(Input<OSPolicyResourcePackageResourceDesiredState> desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder desiredState(OSPolicyResourcePackageResourceDesiredState desiredState) {
            this.desiredState = Input.of(Objects.requireNonNull(desiredState));
            return this;
        }

        public Builder googet(@Nullable Input<OSPolicyResourcePackageResourceGooGetArgs> googet) {
            this.googet = googet;
            return this;
        }

        public Builder googet(@Nullable OSPolicyResourcePackageResourceGooGetArgs googet) {
            this.googet = Input.ofNullable(googet);
            return this;
        }

        public Builder msi(@Nullable Input<OSPolicyResourcePackageResourceMSIArgs> msi) {
            this.msi = msi;
            return this;
        }

        public Builder msi(@Nullable OSPolicyResourcePackageResourceMSIArgs msi) {
            this.msi = Input.ofNullable(msi);
            return this;
        }

        public Builder rpm(@Nullable Input<OSPolicyResourcePackageResourceRPMArgs> rpm) {
            this.rpm = rpm;
            return this;
        }

        public Builder rpm(@Nullable OSPolicyResourcePackageResourceRPMArgs rpm) {
            this.rpm = Input.ofNullable(rpm);
            return this;
        }

        public Builder yum(@Nullable Input<OSPolicyResourcePackageResourceYUMArgs> yum) {
            this.yum = yum;
            return this;
        }

        public Builder yum(@Nullable OSPolicyResourcePackageResourceYUMArgs yum) {
            this.yum = Input.ofNullable(yum);
            return this;
        }

        public Builder zypper(@Nullable Input<OSPolicyResourcePackageResourceZypperArgs> zypper) {
            this.zypper = zypper;
            return this;
        }

        public Builder zypper(@Nullable OSPolicyResourcePackageResourceZypperArgs zypper) {
            this.zypper = Input.ofNullable(zypper);
            return this;
        }
        public OSPolicyResourcePackageResourceArgs build() {
            return new OSPolicyResourcePackageResourceArgs(apt, deb, desiredState, googet, msi, rpm, yum, zypper);
        }
    }
}
