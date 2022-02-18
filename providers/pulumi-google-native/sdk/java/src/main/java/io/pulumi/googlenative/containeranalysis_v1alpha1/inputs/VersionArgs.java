// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.VersionKind;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Version contains structured information about the version of the package. For a discussion of this in Debian/Ubuntu: http://serverfault.com/questions/604541/debian-packages-version-convention For a discussion of this in Redhat/Fedora/Centos: http://blog.jasonantman.com/2014/07/how-yum-and-rpm-compare-versions/
 * 
 */
public final class VersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VersionArgs Empty = new VersionArgs();

    /**
     * Used to correct mistakes in the version numbering scheme.
     * 
     */
    @InputImport(name="epoch")
    private final @Nullable Input<Integer> epoch;

    public Input<Integer> getEpoch() {
        return this.epoch == null ? Input.empty() : this.epoch;
    }

    /**
     * Whether this version is vulnerable, when defining the version bounds. For example, if the minimum version is 2.0, inclusive=true would say 2.0 is vulnerable, while inclusive=false would say it's not
     * 
     */
    @InputImport(name="inclusive")
    private final @Nullable Input<Boolean> inclusive;

    public Input<Boolean> getInclusive() {
        return this.inclusive == null ? Input.empty() : this.inclusive;
    }

    /**
     * Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<VersionKind> kind;

    public Input<VersionKind> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The main part of the version name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The iteration of the package build from the above version.
     * 
     */
    @InputImport(name="revision")
    private final @Nullable Input<String> revision;

    public Input<String> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    public VersionArgs(
        @Nullable Input<Integer> epoch,
        @Nullable Input<Boolean> inclusive,
        @Nullable Input<VersionKind> kind,
        @Nullable Input<String> name,
        @Nullable Input<String> revision) {
        this.epoch = epoch;
        this.inclusive = inclusive;
        this.kind = kind;
        this.name = name;
        this.revision = revision;
    }

    private VersionArgs() {
        this.epoch = Input.empty();
        this.inclusive = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.revision = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> epoch;
        private @Nullable Input<Boolean> inclusive;
        private @Nullable Input<VersionKind> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<String> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epoch = defaults.epoch;
    	      this.inclusive = defaults.inclusive;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.revision = defaults.revision;
        }

        public Builder setEpoch(@Nullable Input<Integer> epoch) {
            this.epoch = epoch;
            return this;
        }

        public Builder setEpoch(@Nullable Integer epoch) {
            this.epoch = Input.ofNullable(epoch);
            return this;
        }

        public Builder setInclusive(@Nullable Input<Boolean> inclusive) {
            this.inclusive = inclusive;
            return this;
        }

        public Builder setInclusive(@Nullable Boolean inclusive) {
            this.inclusive = Input.ofNullable(inclusive);
            return this;
        }

        public Builder setKind(@Nullable Input<VersionKind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable VersionKind kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRevision(@Nullable Input<String> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable String revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }

        public VersionArgs build() {
            return new VersionArgs(epoch, inclusive, kind, name, revision);
        }
    }
}
