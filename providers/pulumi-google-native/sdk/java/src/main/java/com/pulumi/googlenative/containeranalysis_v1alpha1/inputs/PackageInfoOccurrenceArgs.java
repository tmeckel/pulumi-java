// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.LicenseArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PackageInfoOccurrence represents an SPDX Package Information section: https://spdx.github.io/spdx-spec/3-package-information/
 * 
 */
public final class PackageInfoOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackageInfoOccurrenceArgs Empty = new PackageInfoOccurrenceArgs();

    /**
     * A place for the SPDX file creator to record any general comments about the package being described
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return A place for the SPDX file creator to record any general comments about the package being described
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Provide the actual file name of the package, or path of the directory being treated as a package
     * 
     */
    @Import(name="filename")
    private @Nullable Output<String> filename;

    /**
     * @return Provide the actual file name of the package, or path of the directory being treated as a package
     * 
     */
    public Optional<Output<String>> filename() {
        return Optional.ofNullable(this.filename);
    }

    /**
     * Uniquely identify any element in an SPDX document which may be referenced by other elements
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Uniquely identify any element in an SPDX document which may be referenced by other elements
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * package or alternative values, if the governing license cannot be determined
     * 
     */
    @Import(name="licenseConcluded")
    private @Nullable Output<LicenseArgs> licenseConcluded;

    /**
     * @return package or alternative values, if the governing license cannot be determined
     * 
     */
    public Optional<Output<LicenseArgs>> licenseConcluded() {
        return Optional.ofNullable(this.licenseConcluded);
    }

    /**
     * Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
     * 
     */
    @Import(name="sourceInfo")
    private @Nullable Output<String> sourceInfo;

    /**
     * @return Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
     * 
     */
    public Optional<Output<String>> sourceInfo() {
        return Optional.ofNullable(this.sourceInfo);
    }

    private PackageInfoOccurrenceArgs() {}

    private PackageInfoOccurrenceArgs(PackageInfoOccurrenceArgs $) {
        this.comment = $.comment;
        this.filename = $.filename;
        this.id = $.id;
        this.licenseConcluded = $.licenseConcluded;
        this.sourceInfo = $.sourceInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackageInfoOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackageInfoOccurrenceArgs $;

        public Builder() {
            $ = new PackageInfoOccurrenceArgs();
        }

        public Builder(PackageInfoOccurrenceArgs defaults) {
            $ = new PackageInfoOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment A place for the SPDX file creator to record any general comments about the package being described
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment A place for the SPDX file creator to record any general comments about the package being described
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param filename Provide the actual file name of the package, or path of the directory being treated as a package
         * 
         * @return builder
         * 
         */
        public Builder filename(@Nullable Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename Provide the actual file name of the package, or path of the directory being treated as a package
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        /**
         * @param id Uniquely identify any element in an SPDX document which may be referenced by other elements
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Uniquely identify any element in an SPDX document which may be referenced by other elements
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param licenseConcluded package or alternative values, if the governing license cannot be determined
         * 
         * @return builder
         * 
         */
        public Builder licenseConcluded(@Nullable Output<LicenseArgs> licenseConcluded) {
            $.licenseConcluded = licenseConcluded;
            return this;
        }

        /**
         * @param licenseConcluded package or alternative values, if the governing license cannot be determined
         * 
         * @return builder
         * 
         */
        public Builder licenseConcluded(LicenseArgs licenseConcluded) {
            return licenseConcluded(Output.of(licenseConcluded));
        }

        /**
         * @param sourceInfo Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
         * 
         * @return builder
         * 
         */
        public Builder sourceInfo(@Nullable Output<String> sourceInfo) {
            $.sourceInfo = sourceInfo;
            return this;
        }

        /**
         * @param sourceInfo Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
         * 
         * @return builder
         * 
         */
        public Builder sourceInfo(String sourceInfo) {
            return sourceInfo(Output.of(sourceInfo));
        }

        public PackageInfoOccurrenceArgs build() {
            return $;
        }
    }

}
