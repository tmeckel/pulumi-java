// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Version contains structured information about the version of the package. For a discussion of this in Debian/Ubuntu: http://serverfault.com/questions/604541/debian-packages-version-convention For a discussion of this in Redhat/Fedora/Centos: http://blog.jasonantman.com/2014/07/how-yum-and-rpm-compare-versions/
 * 
 */
public final class VersionResponse extends com.pulumi.resources.InvokeArgs {

    public static final VersionResponse Empty = new VersionResponse();

    /**
     * Used to correct mistakes in the version numbering scheme.
     * 
     */
    @Import(name="epoch", required=true)
    private Integer epoch;

    /**
     * @return Used to correct mistakes in the version numbering scheme.
     * 
     */
    public Integer epoch() {
        return this.epoch;
    }

    /**
     * Whether this version is vulnerable, when defining the version bounds. For example, if the minimum version is 2.0, inclusive=true would say 2.0 is vulnerable, while inclusive=false would say it&#39;s not
     * 
     */
    @Import(name="inclusive", required=true)
    private Boolean inclusive;

    /**
     * @return Whether this version is vulnerable, when defining the version bounds. For example, if the minimum version is 2.0, inclusive=true would say 2.0 is vulnerable, while inclusive=false would say it&#39;s not
     * 
     */
    public Boolean inclusive() {
        return this.inclusive;
    }

    /**
     * Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * The main part of the version name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The main part of the version name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The iteration of the package build from the above version.
     * 
     */
    @Import(name="revision", required=true)
    private String revision;

    /**
     * @return The iteration of the package build from the above version.
     * 
     */
    public String revision() {
        return this.revision;
    }

    private VersionResponse() {}

    private VersionResponse(VersionResponse $) {
        this.epoch = $.epoch;
        this.inclusive = $.inclusive;
        this.kind = $.kind;
        this.name = $.name;
        this.revision = $.revision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VersionResponse $;

        public Builder() {
            $ = new VersionResponse();
        }

        public Builder(VersionResponse defaults) {
            $ = new VersionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param epoch Used to correct mistakes in the version numbering scheme.
         * 
         * @return builder
         * 
         */
        public Builder epoch(Integer epoch) {
            $.epoch = epoch;
            return this;
        }

        /**
         * @param inclusive Whether this version is vulnerable, when defining the version bounds. For example, if the minimum version is 2.0, inclusive=true would say 2.0 is vulnerable, while inclusive=false would say it&#39;s not
         * 
         * @return builder
         * 
         */
        public Builder inclusive(Boolean inclusive) {
            $.inclusive = inclusive;
            return this;
        }

        /**
         * @param kind Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param name The main part of the version name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param revision The iteration of the package build from the above version.
         * 
         * @return builder
         * 
         */
        public Builder revision(String revision) {
            $.revision = revision;
            return this;
        }

        public VersionResponse build() {
            $.epoch = Objects.requireNonNull($.epoch, "expected parameter 'epoch' to be non-null");
            $.inclusive = Objects.requireNonNull($.inclusive, "expected parameter 'inclusive' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.revision = Objects.requireNonNull($.revision, "expected parameter 'revision' to be non-null");
            return $;
        }
    }

}
