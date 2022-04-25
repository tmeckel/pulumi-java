// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.LicenseResponse;
import java.lang.String;
import java.util.Objects;


/**
 * PackageInfoOccurrence represents an SPDX Package Information section: https://spdx.github.io/spdx-spec/3-package-information/
 * 
 */
public final class PackageInfoOccurrenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final PackageInfoOccurrenceResponse Empty = new PackageInfoOccurrenceResponse();

    /**
     * A place for the SPDX file creator to record any general comments about the package being described
     * 
     */
    @Import(name="comment", required=true)
    private String comment;

    /**
     * @return A place for the SPDX file creator to record any general comments about the package being described
     * 
     */
    public String comment() {
        return this.comment;
    }

    /**
     * Provide the actual file name of the package, or path of the directory being treated as a package
     * 
     */
    @Import(name="filename", required=true)
    private String filename;

    /**
     * @return Provide the actual file name of the package, or path of the directory being treated as a package
     * 
     */
    public String filename() {
        return this.filename;
    }

    /**
     * Provide a place for the SPDX file creator to record a web site that serves as the package&#39;s home page
     * 
     */
    @Import(name="homePage", required=true)
    private String homePage;

    /**
     * @return Provide a place for the SPDX file creator to record a web site that serves as the package&#39;s home page
     * 
     */
    public String homePage() {
        return this.homePage;
    }

    /**
     * package or alternative values, if the governing license cannot be determined
     * 
     */
    @Import(name="licenseConcluded", required=true)
    private LicenseResponse licenseConcluded;

    /**
     * @return package or alternative values, if the governing license cannot be determined
     * 
     */
    public LicenseResponse licenseConcluded() {
        return this.licenseConcluded;
    }

    /**
     * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
     */
    @Import(name="packageType", required=true)
    private String packageType;

    /**
     * @return The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
     */
    public String packageType() {
        return this.packageType;
    }

    /**
     * Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
     * 
     */
    @Import(name="sourceInfo", required=true)
    private String sourceInfo;

    /**
     * @return Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
     * 
     */
    public String sourceInfo() {
        return this.sourceInfo;
    }

    /**
     * A short description of the package
     * 
     */
    @Import(name="summaryDescription", required=true)
    private String summaryDescription;

    /**
     * @return A short description of the package
     * 
     */
    public String summaryDescription() {
        return this.summaryDescription;
    }

    /**
     * Identify the full name of the package as given by the Package Originator
     * 
     */
    @Import(name="title", required=true)
    private String title;

    /**
     * @return Identify the full name of the package as given by the Package Originator
     * 
     */
    public String title() {
        return this.title;
    }

    /**
     * Identify the version of the package
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return Identify the version of the package
     * 
     */
    public String version() {
        return this.version;
    }

    private PackageInfoOccurrenceResponse() {}

    private PackageInfoOccurrenceResponse(PackageInfoOccurrenceResponse $) {
        this.comment = $.comment;
        this.filename = $.filename;
        this.homePage = $.homePage;
        this.licenseConcluded = $.licenseConcluded;
        this.packageType = $.packageType;
        this.sourceInfo = $.sourceInfo;
        this.summaryDescription = $.summaryDescription;
        this.title = $.title;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackageInfoOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackageInfoOccurrenceResponse $;

        public Builder() {
            $ = new PackageInfoOccurrenceResponse();
        }

        public Builder(PackageInfoOccurrenceResponse defaults) {
            $ = new PackageInfoOccurrenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment A place for the SPDX file creator to record any general comments about the package being described
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param filename Provide the actual file name of the package, or path of the directory being treated as a package
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param homePage Provide a place for the SPDX file creator to record a web site that serves as the package&#39;s home page
         * 
         * @return builder
         * 
         */
        public Builder homePage(String homePage) {
            $.homePage = homePage;
            return this;
        }

        /**
         * @param licenseConcluded package or alternative values, if the governing license cannot be determined
         * 
         * @return builder
         * 
         */
        public Builder licenseConcluded(LicenseResponse licenseConcluded) {
            $.licenseConcluded = licenseConcluded;
            return this;
        }

        /**
         * @param packageType The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
         * 
         * @return builder
         * 
         */
        public Builder packageType(String packageType) {
            $.packageType = packageType;
            return this;
        }

        /**
         * @param sourceInfo Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
         * 
         * @return builder
         * 
         */
        public Builder sourceInfo(String sourceInfo) {
            $.sourceInfo = sourceInfo;
            return this;
        }

        /**
         * @param summaryDescription A short description of the package
         * 
         * @return builder
         * 
         */
        public Builder summaryDescription(String summaryDescription) {
            $.summaryDescription = summaryDescription;
            return this;
        }

        /**
         * @param title Identify the full name of the package as given by the Package Originator
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            $.title = title;
            return this;
        }

        /**
         * @param version Identify the version of the package
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public PackageInfoOccurrenceResponse build() {
            $.comment = Objects.requireNonNull($.comment, "expected parameter 'comment' to be non-null");
            $.filename = Objects.requireNonNull($.filename, "expected parameter 'filename' to be non-null");
            $.homePage = Objects.requireNonNull($.homePage, "expected parameter 'homePage' to be non-null");
            $.licenseConcluded = Objects.requireNonNull($.licenseConcluded, "expected parameter 'licenseConcluded' to be non-null");
            $.packageType = Objects.requireNonNull($.packageType, "expected parameter 'packageType' to be non-null");
            $.sourceInfo = Objects.requireNonNull($.sourceInfo, "expected parameter 'sourceInfo' to be non-null");
            $.summaryDescription = Objects.requireNonNull($.summaryDescription, "expected parameter 'summaryDescription' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
