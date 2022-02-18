// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Version contains structured information about the version of a package.
 * 
 */
public final class VersionResponse extends io.pulumi.resources.InvokeArgs {

    public static final VersionResponse Empty = new VersionResponse();

    /**
     * Used to correct mistakes in the version numbering scheme.
     * 
     */
    @InputImport(name="epoch", required=true)
    private final Integer epoch;

    public Integer getEpoch() {
        return this.epoch;
    }

    /**
     * Human readable version string. This string is of the form :- and is only set when kind is NORMAL.
     * 
     */
    @InputImport(name="fullName", required=true)
    private final String fullName;

    public String getFullName() {
        return this.fullName;
    }

    /**
     * Whether this version is specifying part of an inclusive range. Grafeas does not have the capability to specify version ranges; instead we have fields that specify start version and end versions. At times this is insufficient - we also need to specify whether the version is included in the range or is excluded from the range. This boolean is expected to be set to true when the version is included in a range.
     * 
     */
    @InputImport(name="inclusive", required=true)
    private final Boolean inclusive;

    public Boolean getInclusive() {
        return this.inclusive;
    }

    /**
     * Distinguishes between sentinel MIN/MAX versions and normal versions.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Required only when version kind is NORMAL. The main part of the version name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The iteration of the package build from the above version.
     * 
     */
    @InputImport(name="revision", required=true)
    private final String revision;

    public String getRevision() {
        return this.revision;
    }

    public VersionResponse(
        Integer epoch,
        String fullName,
        Boolean inclusive,
        String kind,
        String name,
        String revision) {
        this.epoch = Objects.requireNonNull(epoch, "expected parameter 'epoch' to be non-null");
        this.fullName = Objects.requireNonNull(fullName, "expected parameter 'fullName' to be non-null");
        this.inclusive = Objects.requireNonNull(inclusive, "expected parameter 'inclusive' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
    }

    private VersionResponse() {
        this.epoch = null;
        this.fullName = null;
        this.inclusive = null;
        this.kind = null;
        this.name = null;
        this.revision = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer epoch;
        private String fullName;
        private Boolean inclusive;
        private String kind;
        private String name;
        private String revision;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epoch = defaults.epoch;
    	      this.fullName = defaults.fullName;
    	      this.inclusive = defaults.inclusive;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.revision = defaults.revision;
        }

        public Builder setEpoch(Integer epoch) {
            this.epoch = Objects.requireNonNull(epoch);
            return this;
        }

        public Builder setFullName(String fullName) {
            this.fullName = Objects.requireNonNull(fullName);
            return this;
        }

        public Builder setInclusive(Boolean inclusive) {
            this.inclusive = Objects.requireNonNull(inclusive);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRevision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public VersionResponse build() {
            return new VersionResponse(epoch, fullName, inclusive, kind, name, revision);
        }
    }
}
